public class ProxyEntry implements ClubEntry {
    private StringBuilder entryName;
    private OriginalEntry entry;

    public ProxyEntry(StringBuilder entryName){
        this.entryName = entryName;
    }
    public long actGet(StringBuilder entryName){
        return 6;
    }

    public void grantEntry() {
        if(actGet(entryName)  > 4){
            entry = new OriginalEntry(entryName);
        }else{
            System.out.println("Not Possible");
        }
    }

}
