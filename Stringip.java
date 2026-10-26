import java.util.Scanner;
public class Stringip {
    public static void main(String[] args){
        String a;
        Scanner sc = new Scanner(System.in);
         System.out.print("enter your destination : " );
        a=sc.nextLine();
        System.out.print("Your destination " + a + " has arrived");
        sc.close();
    }
}
