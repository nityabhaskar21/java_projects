package employee_in_out;
import java.util.*;
import java.io.*;
import java.text.*;

public class Test2 {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("E:\\java_projects\\employee_in_out\\data.txt"));
			String st = reader.readLine();
            String id="";
            String time="";
            String type="";
            Map<String,Map<String,Object>> map=new HashMap<>();
            DateFormat formatter = new SimpleDateFormat("hh:mm:ss");

            while (st != null)
            {
                id=st.split(",")[0];
                time=st.split(",")[1];
                type=st.split(",")[2];

                System.out.println("id:"+id+", time:"+time+", type:"+type);
                Date time_date = formatter.parse(time);

                // convert time in a standard format
                if(!map.containsKey(id)){
                    map.put(id, Map.of("last_time",time_date,"entry_type","IN", "odc",0l, "no_of_entries", 0));
                } else {
                    if (type.equals("OUT")) {
                        HashMap<String, Object> tmpMap =new HashMap<>();
                        tmpMap.putAll(map.get(id));
                        var totalOdc=time_date.getTime()-((Date)(map.get(id).get("last_time"))).getTime() + (long)map.get(id).get("odc");
                        int currTimes=(int)map.get(id).get("no_of_entries")+1;
                        tmpMap.put("odc", totalOdc);
                        tmpMap.put("entry_type",type);
                        tmpMap.put("last_time", time_date);
                        tmpMap.put("no_of_entries", currTimes);
                        map.put(id, tmpMap);
                    } else {
                        HashMap<String, Object> tmpMap =new HashMap<>();
                        tmpMap.putAll(map.get(id));
                        tmpMap.put("entry_type",type);
                        tmpMap.put("last_time", time_date);
                        map.put(id, tmpMap);
                    }
                }   
                st = reader.readLine();
            }

            map.forEach((k, v) -> {
                System.out.print("\nid:"+k+", ");

                long odc = 0l;
                int minutes = 0;
                int hours   = 0;
                
                if (v.get("entry_type").equals("IN")) {
                    System.out.print("no_of_entries:"+v.get("no_of_entries")+"+");

                    Date defaultTime = new Date();
                    try {
                        defaultTime = formatter.parse("24:00:00");
                    } catch (ParseException e) {
                        System.out.println("Wrong time format");
                    }
                    var totalOdc = defaultTime.getTime()-((Date)(v.get("last_time"))).getTime() + (long)v.get("odc");
                    odc=Math.abs(totalOdc);
                    minutes = (int) (((long)odc / (1000*60)) % 60);
                    hours   = (int) (((long)odc / (1000*60*60)) % 24);
                    System.out.println(", hours:" + hours+" minutes:" + minutes);
                } else {
                    System.out.print("no_of_entries:"+v.get("no_of_entries"));
                    odc=Math.abs((long)v.get("odc"));
                    minutes = (int) (((long)odc / (1000*60)) % 60);
                    hours   = (int) (((long)odc / (1000*60*60)) % 24);
                    System.out.println(", hours:" + hours+" minutes:" + minutes);
                }
                
            });
            
        } catch(Exception e) {
            e.printStackTrace();
                System.out.println(e.getMessage());
            }
    }
}