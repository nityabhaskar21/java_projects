package employee_in_out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
