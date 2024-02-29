/*Star Pattern 1: for input n = 5
        |    *
        |   ***
        |  *****
        | *******
        |*********
*/

import java.util.Scanner;

public class pattern1 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sp = n-1;
        int str = 1;
        for(int i=0;i<n;i++){
            // for spaces
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            // for star
            for(int j=0;j<str;j++){
                System.out.print("*");
            }
            sp--;
            str+=2;
            System.out.println();
        }
    }
}
