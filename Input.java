import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = sc.nextInt();
        System.out.print(a+10);
        sc.close();
    
    }
}
