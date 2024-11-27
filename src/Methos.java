import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Methos {
    public static void main(String[] args){
        /*String someString = new String("hello string class");
        System.out.println("Some String : " + someString);
        String anotherString = new String("another type of string");
        System.out.println("another string:" + anotherString);
        System.out.println();

        Date someDate=new Date();
        System.out.println("some date:" + someDate);
        Date anotherdate=new Date();
        System.out.println("another date:" + anotherdate);
        System.out.println();

        Random somerandom= new Random();
        System.out.println("some random:" + somerandom);
        Random anotherrandom = new Random();
        System.out.println("another random:" + anotherrandom);
        System.out.println();

        Object someobject=new Object();
        System.out.println("some object:" + someobject);
        Object anotherobject=new Object();
        System.out.println("another objectr" + anotherobject);
        System.out.println();

        Scanner octalTohexadecimal = new Scanner(System.in);
        System.out.println("enter a number:");
        String octal = octalTohexadecimal.nextLine();
        int decimal = Integer.parseInt(octal,8);
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("hexadecimal: " + hexadecimal );*/

        Main main1 = new Main();
        System.out.println("main1:" + main1.toString());
        System.out.println("main1:" + main1.getClass());

         String somestring = new String("kishan");
         Random somerandom = new Random();
         Date somedate = new Date();
         Object someobject = new Object();

        System.out.println("   :" + somestring.getClass());
        System.out.println("  :" + somerandom.getClass());
        System.out.println("  :" + somedate.getClass());
        System.out.println("  :" + someobject.getClass());

        
    }
}
