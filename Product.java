import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt();
        int product = a*b;
        System.out.println("Product of A and B is : "+ product);
        sc.close();
    }
}
