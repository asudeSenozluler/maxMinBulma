import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Birinci sayıyı girin:");
       int  a=scanner.nextInt();
        System.out.println("İkinci sayıyı girin: ");
         int b=scanner.nextInt();
        System.out.println("Üçüncü sayıyı girin: ");
        int c=scanner.nextInt();
        int maks=-1;
        if (a>=b && a>=c){
            maks=a;

        }
        else if (b>=a && b>=c){
            maks=b;
        }
        else {
            maks=c;
        }
        System.out.println("Maksimum sayı: "+ maks);
    }
}
