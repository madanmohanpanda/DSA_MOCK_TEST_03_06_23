import java.util.Scanner;
class NoCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();


        if(n==0)
        {
            System.out.println("No is zero");
        }
        else if(n<0)
        {
            System.out.println(n+" is a negative no");
        }
        else{
            System.out.println(n+" is a positive no.");
        }

        sc.close();

    }
}