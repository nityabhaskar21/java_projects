package java_new_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class mapGetOrElse {
    private static int diskIndex;
    public static void main(String[] args) {
        List<Map<String, Object>> newDataDisks = List.of(
            Map.of("name", "new Disk 12 ")
        );
        // System.out.println("diskIndex: " + diskIndex);
        Pattern pattern = Pattern.compile("disk(\\s)*(\\d)+");
        newDataDisks
            .stream()
            .map(dataDisk -> {
                System.out.println("diskIndex: " + diskIndex);
                if (dataDisk.containsKey("name")) {
                    var diskName = dataDisk.getOrDefault("name", "Disk 13").toString();
                    Matcher matcher = pattern.matcher(diskName.toLowerCase());
                    if (matcher.find()) {
                        System.out.println("Full match: " + matcher.group(0));
                        diskIndex = Integer.parseInt(matcher.group(0).substring(matcher.group(0).lastIndexOf("disk")+4).trim());
                    }
                    // diskIndex = Integer.parseInt(diskName.substring(diskName.lastIndexOf("Disk")+4).trim());
                    System.out.println("diskIndex: " + diskIndex);
                }
                return Map.of();
            }).collect(Collectors.toList());

    
    }
}
