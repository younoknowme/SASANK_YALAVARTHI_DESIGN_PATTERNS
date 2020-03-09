public class Driver {
    private Strat strat;
    public Driver(Strat strat){
        this.strat  = strat;
    }
    public double execGen(long a, long b){
        return strat.calculate(a,b);
    }
}
