import java.util.*;
public class PaceType{

    private List<Pack> item = new ArrayList<Pack>();
        public void add(Pack packs){
        item.add(packs);
        }
    public void getPrice(){
            for(Pack pack : item)
                pack.pace();
    }
    public void showItem(){
            for(Pack pack : item)
                System.out.println(pack.price());
    }
}
