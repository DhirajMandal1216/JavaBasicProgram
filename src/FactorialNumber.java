import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        FactorialNumber obj=new FactorialNumber();
        System.out.println(obj.factorial());
    }
    public int factorial() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
