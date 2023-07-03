import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        int n;
        Scanner sc  = new Scanner(System.in);

        n = sc.nextInt();
        int num1 =0;
        int num2 = 1;
        System.out.print(num1 +" " +num2+" ");
        for(int i=0;i<n-2;i++)
        {
            int num3 = num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");
            
        }

        sc.close();
    }
}
