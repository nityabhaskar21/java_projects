package employee_in_out;
import java.util.*;
import java.io.*;
import java.text.*;

public class Test {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\java_projects\\employee_in_out\\data.txt");
            BufferedReader br= new BufferedReader(new FileReader(file));
            String st="";
            String id="";
            String time="";
            String type="";
            Map<String,Map<String,Object>> map=new HashMap<>();
            while ((st = br.readLine()) != null)
            {
                id=st.split(",")[0];
                time=st.split(",")[1];
                type=st.split(",")[2];

                DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                System.out.println("id: "+id+"time "+time+"type: "+type);
                Date time_date = formatter.parse(time);

                // convert time in a standard format
                if(!map.containsKey(id)){
                    map.put(id, Map.of("last_time",time_date,"entry_type","IN", "odc",0.0, "no_of_entries", 0));
                } else {
                    if (type.equals("OUT")) {
                        var totalOdc=time_date.getTime()-((Date)(map.get(id).get("last_entry_time"))).getTime() +((Date) map.get(id).get("odc")).getTime();
                        int currTimes=(int)map.get(id).get("no_of_entries")+1;
                        map.get(id).put("odc", totalOdc);
                        map.get(id).put("entry_type",type);
                        map.get(id).put("last_time", time_date);
                        map.get(id).put("no_of_entries", currTimes);
                    } else {
                        map.get(id).put("entry_type",type);
                        map.get(id).put("last_time", time_date);
                    }
                }   
            }
            br.close();
            
            map.forEach((k, v) -> {
                System.out.print(k+", ");
                if (v.get("entry_type").equals("IN")) {
                System.out.print(v.get("no_of_entries"+"+"+", "));
                } else {
                System.out.print(v.get("no_of_entries"+", "));
                }
                System.out.println(v.get("odc"));
            });
            
        } catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }
}