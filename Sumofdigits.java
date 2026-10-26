import java.util.Scanner;
public class Sumofdigits {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        a=sc.nextInt();
        int sum=0;
        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println("Sum of Digits of given number is: " + sum);
        sc.close();
    }
}
