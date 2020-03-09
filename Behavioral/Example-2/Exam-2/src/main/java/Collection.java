public class Collection {
    public int collect[] = {1,2,3,4,5,6,67};

    public Iterator getObjectOfIterator(){
        return new CollectionIterate();
    }
    private class CollectionIterate implements Iterator{
        int length;
        public boolean hasNext(){
            if(length < collect.length)
                return true;
            else
                return false;
        }

        public Object next() {
            if(this.hasNext())
                return collect[length++];
            return null;
        }
    }
}
