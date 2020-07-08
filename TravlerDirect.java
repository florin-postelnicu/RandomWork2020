

import java.util.Scanner;

public class TravlerDirect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of  knights ");
        int k = scan.nextInt();
        int exp = (int) (Math.log10(k)/ Math.log10(2));

        int pos =  (int) (2*( k - Math.pow(2, exp))+1);
        System.out.println("To save yourself if you are in position  "+ k);
        System.out.println("If starting at position SP = 1, it will be save  "+ pos);

        int post = k - pos + 1;

        System.out.println(" You should start the game with the knight in position  " + post);

    }
}
