package Pattern_program;

public class PatternProgram {
    public static void main(String[] args) {
        PatternProgram obj=new PatternProgram();
        obj.pattern1(5);
        obj.pattern2(5);
        obj.pattern3(5);
    }
    void pattern1(int n){
        for (int row=1;row<n;row++){
            for (int col=1;col<n;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern2(int n){
        for (int row=1;row<n;row++){
            for (int col=1;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void pattern3(int n){
        for (int row=1;row<n;row++){
            for (int col=1;col<n;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}