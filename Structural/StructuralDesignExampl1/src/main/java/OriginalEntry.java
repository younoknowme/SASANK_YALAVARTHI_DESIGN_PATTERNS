public class OriginalEntry implements  ClubEntry {
    private StringBuilder entryName;
    public OriginalEntry(StringBuilder entryName){
        this.entryName = entryName;
    }
    public void grantEntry() {
        System.out.println("Entry is granted for "+entryName);
    }
}
