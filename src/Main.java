import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  ;
        double temp= 0;
        System.out.println("Bir sayı giriniz:");
        n = sc.nextInt();

        for(double i = 1.0; i<= n; i++){
            temp = temp + (1/i);
        }
        System.out.println(temp);

    }
}
