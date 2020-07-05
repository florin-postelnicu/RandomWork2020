


/*
Problem:
Given two balls and a building of 100 flats,
 how can you find the highest flat
from where you can drop a ball without breaking it
using the lowest number of attempts?
The balls are identical.

Solution:
Let's assume the flats are labeled 1 through n,in  ascending order, starting with 1 on the ground, and ending
with 100 at the top of the building.
Now, let's assume that the first ball is dropped from flat k, and it breaks.
It means that the second ball should cover for all the flats bellow flat k,
that is flat 1, flat 2, ..., flat k-1, since any one of them could represent
a flat from where the second ball if dropped could break as well.
The sum of all these attempts it is equal to k.
Let us also assume that k is the lowest number of attempts one need to perform using both balls,
such that the flat 's rank from where a b second ball doesn't break  can be found.
If the first ball doesn't break if dropped from flat k,
than,
the next flat from where the first ball should be dropped such that preserve the lowest number of attempts
it will be flat at rank k + (k-1)= 2k -1.
If the first ball breaks, than there will be a total number of attempts,
sum = 1 ( The first ball dropped at flat k) + 1 ( the first ball dropped at flat k + k-1) + k-2( the number
of flats between flat k and flat 2k-1).
The sum = k.
If the first ball doesn't break after the second drop from flat k + (k-1), then tha
next attempt for the first ball should be from flat k + (k -1) + (k-2).
Continuing the reasoning , and assuming that the first ball doesn't break for anyone of the subsequent drops,
the flats from where the first ball should be  dropped are :
k, k + (k-1), k + (k-1) + (k-2), ...,[ k + (k-1) +(k-2) +...+ 3 + 3 +1]

Since the last flat should be at least n, one can write an equation:
k + (k-1) + (k-2) + ...+  3 + 2 + 1 >= n.
Or the equivalent form:
k(k+1) / 2 >= n
This is a quadratic equation :
(*) k^2 + k - 2n >= 0.
Solving the above equation, the solution for the best value k that will minimize
the number of attempts to answer the problem is:

k = ( sqrt(1 + 8*n))/2
This solution guaranties the lowest value of k such that (*).




Given n = 100
The Lowest number of attempts is 14
The flats you need to drop the balls, until one breaks, are :
Flat 14 Attempt    1      If First ball breaks 14   trials  at most
Flat 27 Attempt    2      If First ball breaks 14   trials  at most
Flat 39 Attempt    3      If First ball breaks 14   trials  at most
Flat 50 Attempt    4      If First ball breaks 14   trials  at most
Flat 60 Attempt    5      If First ball breaks 14   trials  at most
Flat 69 Attempt    6      If First ball breaks 14   trials  at most
Flat 77 Attempt    7      If First ball breaks 14   trials  at most
Flat 84 Attempt    8      If First ball breaks 14   trials  at most
Flat 90 Attempt    9      If First ball breaks 14   trials  at most
Flat 95 Attempt    10      If First ball breaks 14   trials  at most
Flat 99 Attempt    11      If First ball breaks 14   trials  at most
Flat 102 Attempt    12      If First ball breaks 14   trials  at most
[0, 14, 27, 39, 50, 60, 69, 77, 84, 90, 95, 99, 102]

Process finished with exit code 0


 */

import java.util.Scanner;
import java.util.ArrayList;
public class Huevos {

    public static int SolverQE(int number){
        int sol = (int) ( Math.sqrt( 1+ 8* number)/2);

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
            System.out.println("Flat " + Flist.get(attempt) + " Attempt    " + attempt + "      If First ball breaks " + sum + "   trials  at most");
            floor = floor- 1;
        }while(floor>0 && rank < n);
        System.out.println(Flist);

    }
}
