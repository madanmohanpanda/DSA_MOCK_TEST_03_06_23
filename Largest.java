import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+ " is largest no.");
            }
            else{
                System.out.println(num3+" is largest no.");
            }
        }else if(num2>num3){
            System.out.println(num2 + " is largest no.");
        }
        else   {
            System.out.println(num3+" is largest no");
        }

        sc.close();

    }
}
