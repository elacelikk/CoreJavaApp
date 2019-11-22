import java.util.Date;
public class DateComp{
    public static void main(String[] args){
        Date date1 = new Date();
        System.out.println("ilk tarih :");

        Date date2 = new Date();
        System.out.println("ikinci tarih:");



        if(date1.after(date2)){
            System.out.println("Date1 is after Date2");
        }

        if(date1.before(date2)){
            System.out.println("Date1 is before Date2");
        }

        if(date1.equals(date2)){
            System.out.println("Date1 is equal Date2");
        }
    }
}