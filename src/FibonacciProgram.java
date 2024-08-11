import java.util.Scanner;

public class FibonacciProgram {
    public static void main(String[] args) {
        FibonacciProgram obj=new FibonacciProgram();
        obj.fibonacci();

    }
    public void fibonacci(){
        int num1=0;
        int num2=1;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print(num1+" "+num2);
        for (int i=2;i<=n;i++){
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }

}
