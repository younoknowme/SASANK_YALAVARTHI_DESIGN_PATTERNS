public class ShopGuy {
    private SweetShop kaju;
    private SweetShop all;

    public ShopGuy(){
        kaju = new KajuBarfi();
        all = new AllMix();
    }
    public void kajuSale(){
        kaju.cost();
        kaju.taste();
    }
    public  void allMixSale(){
        all.taste();
        all.cost();
    }
}
