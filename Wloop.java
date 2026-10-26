import java.util.Scanner;
public class Wloop {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 10: ");
        a=sc.nextInt();
        while(a<=10){
            System.out.println(a);
            a++;
        }
        sc.close();

    }
}
