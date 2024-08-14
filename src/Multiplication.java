import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
       Multiplication mul=new Multiplication();
       mul.multiplication();
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
