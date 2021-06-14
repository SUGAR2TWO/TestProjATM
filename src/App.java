import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("%.2f", withdraw(sc.nextInt(), sc.nextFloat())));
        sc.close();
    }
    public static double withdraw(int sum, Float bank){
        if((sum % 5 == 0) && (sum <= bank - 0.5))
            return bank - sum - 0.5;
        return bank;
    }
}
