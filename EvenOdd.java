import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=scan.nextInt();
        if(a%2==0){
            System.out.print("A is even number");
        }
        else{
            System.out.print("A is odd number");
        }
        scan.close();

    }
}