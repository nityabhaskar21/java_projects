package employee_in_out;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\java_projects\\employee_in_out\\data.txt"))) {
            String line;
            Map<String, Map<String, Object>> map = new HashMap<>();
            DateFormat formatter = new SimpleDateFormat("hh:mm:ss");

            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(",");
                String id = arr[0];
                String time = arr[1];
                String type = arr[2];

                System.out.println("id: " + id + ", time: " + time + ", type: " + type);
                Date timeDate = formatter.parse(time);

                Map<String, Object> employeeData = map.getOrDefault(id, new HashMap<>());
                long odc = (long) employeeData.getOrDefault("odc", 0L);
                int noOfEntries = (int) employeeData.getOrDefault("no_of_entries", 0);
                Date lastTime = (Date) employeeData.getOrDefault("last_time", timeDate);

                if (type.equals("OUT")) {
                    long totalOdc = timeDate.getTime() - lastTime.getTime() + odc;
                    int currTimes = noOfEntries + 1;
                    employeeData.put("odc", totalOdc);
                    employeeData.put("entry_type", type);
                    employeeData.put("last_time", timeDate);
                    employeeData.put("no_of_entries", currTimes);
                } else {
                    employeeData.put("odc", odc);
                    employeeData.put("entry_type", type);
                    employeeData.put("last_time", timeDate);
                    employeeData.put("no_of_entries", noOfEntries);
                }

                map.put(id, employeeData);
            }

            map.forEach((id, employeeData) -> {
                System.out.print("\nid: " + id + ", ");

                long odc = Math.abs((long) employeeData.get("odc"));
                int minutes = (int) (((long) odc / (1000 * 60)) % 60);
                int hours = (int) (((long) odc / (1000 * 60 * 60)) % 24);
                var lastTime=((Date)(employeeData.get("last_time"))).getTime() ;

                System.out.print("no_of_entries: " + employeeData.get("no_of_entries"));

                if (employeeData.get("entry_type").equals("IN")) {
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
