import java.util.Scanner;

public class Hello {
    public static void main (String[] args)
    {
        System.out.println("Hello welcome to java world");
      //  int a = 2 , b = 3, res;
        // res = a + b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        int res = num1 + num2 ;
        System.out.println("the Result is:" +res);
    }
}
