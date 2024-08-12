import java.util.Scanner;
import java.math.*;

public class AramstrongNumber {
    public static void main(String[] args) {
        AramstrongNumber obj=new AramstrongNumber();
        obj.armstrong();
    }

    public void armstrong(){
        Scanner sc=new Scanner(System.in);
        int sum=0,temp,num;

        System.out.print("How many digit number you Enter :");
        int n=sc.nextInt();
        if(n==2){
            System.out.println(" There is no two-digit Armstrong number.");
        }
        else {
            System.out.print("Enter Three Digit number :");
            num=sc.nextInt();
            temp=num;
            while(temp>0){
                int digit=temp%10;
                sum= (int) (sum+Math.pow(digit,n));
                temp=temp/10;
            }
            if(num==sum){
                System.out.println(num+" is Armstrong Number");
            }
            else {
                System.out.println(num+" is not Armstrong Number");
            }
        }

    }
}
