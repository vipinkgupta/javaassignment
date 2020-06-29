package assignment4;

import java.util.Scanner;

public class SquareStarPrint {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rows: ");
        int n = sc.nextInt();
        if(n>0) {
            int space = n - 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < space; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("  *   ");
                }
                System.out.print("\n");
                space--;
            }
            space = 1;
            for (int i = n - 1; i > 0; i--) {
                for (int j = 0; j < space; j++) {
                    System.out.print("   ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("  *   ");
                }
                System.out.print("\n");
                space++;

            }
        }
        if(n==0)
        {
            System.out.println("MyOwnZeroValueEnteredException, which is an extension of ArithmeticException");
        }
        if(n<0)
        {
            System.out.println("MyOwnNegativeValueEnteredException, which is an extension of ArithmeticException. The display of the error information should display the negative number that was entered");
        }
    }
}
