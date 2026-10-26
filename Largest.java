import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt();
        System.out.print("Enter c: ");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is the largest ");
        }
        else if (b>a && b>c){
            System.out.println("B is the largest ");
        }
        else{
            System.out.println("C is the largest ");
        }
        sc.close();
    }
}
