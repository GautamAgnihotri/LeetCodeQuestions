/*Star Pattern 1: for input n = 5
        |        *
        |      * * *
        |    * * * * *
        |  * * * * * * *
        |* * * * * * * * *
*/

import java.util.Scanner;

public class Pattern1 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sp = n-1;
        int str = 1;
        for(int row=0;row<n;row++){
            // for spaces
            for(int col=0;col<sp;col++){
                System.out.print(" ");
            }
            // for star
            for(int col=0;col<str;col++){
                System.out.print("*");
            }
            sp--;
            str+=2;
            System.out.println();
        }
    }
}
