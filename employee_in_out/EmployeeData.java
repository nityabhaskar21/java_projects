package employee_in_out;

import java.util.Date;

enum EntryType {IN, OUT}

public class EmployeeData {
    private Date lastEntryTime;
    private long odc;
    private int noOfEntries;
    private EntryType entryType;

    public EmployeeData() {
        lastEntryTime = null;
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

