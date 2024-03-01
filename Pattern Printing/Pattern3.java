import java.util.Scanner;

public class Pattern3{

    public static void main(String[] args ){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        scn.close();
        int str = n*2-1;
        int sp = 0;
        for(int row=1;row<=n;row++){
            // for printing spaces
            for(int col=1;col<=sp;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=str;col++){
                System.out.print("* ");
            }
            str-=2;
            sp++;
            System.out.println();
        }

    }
}