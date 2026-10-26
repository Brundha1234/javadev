import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=scan.nextInt();
        int num=0;
        while(a>0){
            int rem=a%10;
            num=num*10+rem;
            a=a/10;
        }
        System.out.println("Enter the Reverse of the given number: " + num);
        scan.close();
    }
    
}
