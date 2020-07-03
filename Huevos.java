


/*
Problem:
Given two balls and a building of 100 flats,
how can you find the highest flat
from where you can drop a ball without breaking it,
using the lowest number of attempts?
The balls are identical.
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Huevos<rank> {

    public static int SolverQE(int number){
        int sol = (int) ((1 + Math.sqrt( 1+ 8* number))/2);

        return sol;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Flist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of flats  n");
        int n = scan.nextInt();
        System.out.println("Given n = " + n);
        System.out.println("The Lowest number of attempts is " +SolverQE(n));
        System.out.println("The flats you need to drop the balls, until one breaks, are :");
        int floor = SolverQE(n);
        int rank = 0;
        int attempt = 0;
        Flist.add(0);

        do {
            rank = rank + floor;
            Flist.add(rank);
            attempt ++;
            int sum =  attempt - 1 + Flist.get(attempt) - Flist.get(attempt -1);
            System.out.println("Flat " + rank + " Attempt    " + attempt + ".      If First ball breaks " + sum + " at most");
            floor = floor- 1;
        }while(floor>0 && rank < n);
     
        System.out.println(Flist);

    }
}
