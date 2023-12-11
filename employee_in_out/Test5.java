package employee_in_out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



public class Test5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\java_projects\\employee_in_out\\data.txt"))) {
            String line;
            Map<String,  EmployeeData> map = new HashMap<>();
            DateFormat formatter = new SimpleDateFormat("hh:mm:ss");

            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                String id = arr[0];
                String time = arr[1];
                String type = arr[2];

                System.out.println("id: " + id + ", time: " + time + ", type: " + type);
                Date timeDate = formatter.parse(time);

                EmployeeData employeeData = new EmployeeData();
                long odc = employeeData.getOdc();
                int noOfEntries = employeeData.getNoOfEntries();
                Date lastTime = employeeData.getLastEntryTime();
                
                if (type.equals("OUT")) {
                    long totalOdc = timeDate.getTime() - lastTime.getTime() + odc;
                    int currTimes = noOfEntries + 1;
                    employeeData.setOdc(totalOdc);
                    employeeData.setEntryType(EntryType.valueOf("OUT"));
                    employeeData.setLastEntryTime(timeDate);
                    employeeData.setNoOfEntries(currTimes);
                } else {
                    employeeData.setOdc(odc);
                    employeeData.setEntryType(EntryType.valueOf("IN"));
                    employeeData.setLastEntryTime(timeDate);
                    employeeData.setNoOfEntries(noOfEntries);
                }

                map.put(id, employeeData);
            }

            map.forEach((id, employeeData) -> {
                System.out.print("\nid: " + id + ", ");

                long odc =  employeeData.getOdc();
                int minutes = (int) (((long) odc / (1000 * 60)) % 60);
                int hours = (int) (((long) odc / (1000 * 60 * 60)) % 24);
                var lastTime=employeeData.getLastEntryTime().getTime();
                var entry_type = employeeData.getEntryType();
                var no_of_entries = employeeData.getNoOfEntries();

                System.out.print("no_of_entries: " + no_of_entries);

                if (entry_type.equals(EntryType.IN)) {
                    Date defaultTime = new Date();
                    try {
                        defaultTime = formatter.parse("24:00:00");
                    } catch (ParseException e) {
                        System.out.println("Wrong time format");
                    }
                    var totalOdc = defaultTime.getTime()-lastTime + odc;
                    odc=Math.abs(totalOdc);
                    minutes = (int) (((long)odc / (1000*60)) % 60);
                    hours   = (int) (((long)odc / (1000*60*60)) % 24);
                    System.out.println(", hours:" + hours+" minutes:" + minutes);
                } else {
                    System.out.println(", hours: " + hours + " minutes: " + minutes);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

enum EntryType {IN, OUT}

class EmployeeData {
    private Date lastEntryTime;
    private long odc;
    private int noOfEntries;
    private EntryType entryType;

    public EmployeeData() {
        lastEntryTime =  new Date();
        odc = 0;
        noOfEntries = 0;
        entryType = EntryType.IN;
    }

    public Date getLastEntryTime() {
        return lastEntryTime;
    }

    public void setLastEntryTime(Date lastEntryTime) {
        this.lastEntryTime = lastEntryTime;
    }

    public long getOdc() {
        return odc;
    }

    public void setOdc(long odc) {
        this.odc = odc;
    }

    public int getNoOfEntries() {
        return noOfEntries;
    }

    public void setNoOfEntries(int noOfEntries) {
        this.noOfEntries = noOfEntries;
    }

    public EntryType getEntryType() {
        return entryType;
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }
}
