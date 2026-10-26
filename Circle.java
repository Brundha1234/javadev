import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        double r;
        double pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r=sc.nextDouble();
        double area = pi*r*r;
        System.out.println("Area of the circle is: " + area);
        sc.close();
    }
}
