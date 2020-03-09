public class Main {
    public static void main(String[] args) {
        Builder build = new Builder();
        PaceType paceType = build.build();
        paceType.showItem();
    }
}
