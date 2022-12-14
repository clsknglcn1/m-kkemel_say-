import java.util.Scanner;
public class mukemelsayii {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Bir sayı giriniz:");
        int sayi= num.nextInt();
        for (int i=1 ; i<=sayi; i++){
            if (sayi%i==0){
                toplam +=i;
            }
        }
        if (toplam/2== sayi){
            System.out.println(sayi+"sayı mükemmel sayıdır ");

        }else {
            System.out.println(sayi+"sayı mükemmel sayı değildir");
        }
    }
}
