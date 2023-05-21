package employee_in_out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeInOutSystem {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("F:\\coding\\java_projects\\employee_in_out\\data.txt"))) {
            Map<String, EmployeeData> employeeMap = new HashMap<>();
            DateFormat formatter = new SimpleDateFormat("HH:mm:ss");

            String line;
            while ((line = reader.readLine()) != null) {
                String[] entry = line.split(",");
                String id = entry[0];
                String timeString = entry[1];
                String type = entry[2];

                Date time = formatter.parse(timeString);

                EmployeeData employeeData = employeeMap.get(id);
                if (employeeData == null) {
                    employeeData = new EmployeeData();
                    employeeMap.put(id, employeeData);
                }

                if (type.equals("IN")) {
                    employeeData.addEntry(time, true);
                } else if (type.equals("OUT")) {
                    employeeData.addEntry(time, false);
                }
            }

            // Print employee data
            for (Map.Entry<String, EmployeeData> entry : employeeMap.entrySet()) {
                String id = entry.getKey();
                EmployeeData employeeData = entry.getValue();
                long odc = employeeData.calculateODC();
                int noOfEntries = employeeData.getNoOfEntries();
                System.out.println("Employee ID: " + id);
                System.out.println("ODC: " + odc + " ms");
                System.out.println("Number of Entries: " + noOfEntries);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class EmployeeData {
    private Date lastEntryTime;
    private long odc;
    private int noOfEntries;

    public EmployeeData() {
        lastEntryTime = null;
        odc = 0;
        noOfEntries = 0;
    }

    public void addEntry(Date currentTime, boolean isIn) {
        if (isIn) {
            if (lastEntryTime != null) {
                odc += currentTime.getTime() - lastEntryTime.getTime();
            }
            lastEntryTime = currentTime;
            noOfEntries++;
        } else {
            if (lastEntryTime != null) {
                odc += currentTime.getTime() - lastEntryTime.getTime();
                lastEntryTime = null;
            }
        }
    }

    public long calculateODC() {
        return odc;
    }

    public int getNoOfEntries() {
        return noOfEntries;
    }
}
