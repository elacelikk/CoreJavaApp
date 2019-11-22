import java.util.Scanner;
public class IntegerComp{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayi : ");
        int sayi1 = scan.nextInt();

        System.out.println("ikinci sayi : ");
        int sayi2 = scan.nextInt();

        if(sayi1 > sayi2){
            System.out.println("BIRINCI SAYI BUYUK");
        }else if(sayi2 > sayi1){
            System.out.println("IKINCI SAYI BUYUK");
        }else{
            System.out.println("IKI SAYI ESIT");
        }
    }
}