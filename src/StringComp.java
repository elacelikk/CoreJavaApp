import java.util.Scanner;
public class StringComp {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("metin giriniz:");
        String str1 = scan.nextLine();
        System.out.println(str1);

        System.out.println("metin giriniz:");
        String str2 = scan.nextLine();
        System.out.println(str2);

        if(str1.equals(str2)){
            System.out.println("METİNLER ESİTTİR");
        }else{
            System.out.println("METİNLER ESİT DEGİLDİR");
        }


    }

}
