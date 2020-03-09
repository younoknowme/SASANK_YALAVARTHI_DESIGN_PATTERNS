import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        long a = sc.nextLong();
        System.out.println("Enter number 2");
        long b = sc.nextLong();
        Driver driver = new Driver( new Modulo());
        System.out.println(driver.execGen(a,b));

        Driver drive = new Driver(new Division());
        System.out.println(drive.execGen(a,b));
    }
}
