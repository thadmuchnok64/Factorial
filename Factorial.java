import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.IOException;

public class Factorial {

    public static Long pureRecursive(int n){

        if( n > 1) {
            return (long)n*pureRecursive(n-1);
        } else if ( n == 1){

            return (long)1;

        } else{

            throw new IllegalArgumentException("Can not use a negative number.");

        }

    }

    public static Long tailRecursive(int n){

        return tail(n);

    }

    private static Long tail(int n){

        if (n == 0){

                throw new IllegalArgumentException();


        } else if ( n == 1){
            return (long)1;
        }
        return n*tail(n-1);

    }

    public static Long iterative(int n){

        long product = 1;
        for(int x = n;x>0;x--){

            product *= x;

        }

        return product;

    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to the factorial calculator!");
        System.out.println("Type a positive number to calculate, or a letter to exit");
        System.out.println("////////////////////////////////////////////////////////");
        System.out.println();

        int x;

        while(true) {

            try {
                x = input.nextInt();
                System.out.println("Result: "+pureRecursive(x));

            } catch ( InputMismatchException a){
                System.out.println();
                System.out.println("Letter detected. Goodbye!");
                System.out.println("////////////////////////////////////////////////////////");

                break;
            }

        }
    }

}
