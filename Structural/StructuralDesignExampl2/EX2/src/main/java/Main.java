import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice 1.KajuBarfi or 2. AllMix");
        int selected = sc.nextInt();
        ShopGuy shop  = new ShopGuy();
        switch (selected){
            case 1:
                shop.kajuSale();
                break;
            case 2:
                shop.allMixSale();
                break;
            default:
                System.out.println("choose 1 or 2");
        }
    }
}
