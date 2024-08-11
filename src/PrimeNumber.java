import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        obj.prime();
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
}
