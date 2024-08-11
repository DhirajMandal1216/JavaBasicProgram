import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber obj=new PalindromeNumber();
        obj.palindrome();
    }
    public void palindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n,temp,sum=0;
        n=sc.nextInt();
        temp=n;
        while(n>0){
            sum=sum*10 + n%10;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is Palindrome");
        }
        else {
            System.out.println(temp+" is not Palindrome");
        }
    }
}
