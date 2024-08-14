import java.util.Scanner;

public class MultipleProgram {
    public static void main(String[] args) {
        MultipleProgram obj=new MultipleProgram();
        Scanner Sc =new Scanner(System.in);

        System.out.println("1.Palindrome\n2.Armstrong\n3.Fibonacci\n4.Factorial\n5.PrimeNumber\n6.Multiplication\n7.Exit");
        System.out.println("Which program you want to Execute :");
        int num=Sc.nextInt();
        switch (num){
            case 1:
                obj.palindrome();
                break;
            case 2:
                obj.armstrong();
                break;
            case 3:
                obj.fibonacci();
                break;
            case 4:
                obj.factorial();
                break;
            case 5:
                obj.prime();
                break;
            case 6:
                obj.multiplication();
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid input");
        }

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
                sum= (int) (sum + Math.pow(digit,n));
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
    public int factorial() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public void prime(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number :");
        int n=sc.nextInt();
        int flag=0;
        if(n==1 || n==0){
            System.out.println(n+" is not prime number");
        }
        else {
            for (int i=2;i<n/2;i++){
                if(n%i==0){
                    System.out.print(n+" is not prime number");
                    flag=1;
                    break;
                }

            }

        }
        if(flag==0){
            System.out.print(n+" is prime number");
        }

    }

    void multiplication(){
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int num=Sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+num*i);
        }
    }



}
