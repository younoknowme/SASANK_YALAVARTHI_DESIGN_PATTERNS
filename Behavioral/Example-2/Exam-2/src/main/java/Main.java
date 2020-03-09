public class Main {
    public static void main(String[] args) {
        Collection collects = new Collection();

        for(Iterator iterator = collects.getObjectOfIterator();iterator.hasNext();){
            int ans = (Integer) iterator.next();
            System.out.println("Value = "+ans);
        }
    }

}

