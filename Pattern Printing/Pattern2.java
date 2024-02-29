/*Star Pattern 2: for input n = 5
        |        1
        |      1 2 1
        |    1 2 3 2 1
        |  1 2 3 4 3 2 1
        |1 2 3 4 5 4 3 2 1
*/

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int row =1;row<=n;row++){
            int num =1;
            // for printing spaces
            for(int col=1;col<=n-row;col++){
                System.out.print(" ");
            }
            // for printing stars 
            for(int col=1;col<=2*row-1;col++){
                System.out.print(num);
                if(col<=(2*row-1)/2){
                    num++;
                } else{
                    num--;
                }
            }
            System.out.println();
        }

    }
}
