/*
Original Problem :
There are 3 jars. The first jar ( a)  can hold p litters, the second jar (b)
can hold q litters, and the third jar (c) contains p + q litters.
p, q are relatively prime numbers.
At the beginning jars a, and b are empty(0 litters) and jar c has p + q litters.
The objective is to obtain exactly 1 litter by transferring watter from one jar to another.
You are not allowed to discharge any watter.
For example : a = 5 litters capacity
              b = 7 litters capacity
              c = 12 litters capacity.
              At step 0
              a = 0, b = 0 , c = 12
              At step1
              a = 0, b = 7, c = 5
              At step 3
              a = 5 , b = 2 , c = 5
              etc.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class CollectOne {
   static ArrayList<Integer>  a = new ArrayList<>();
   static ArrayList<Integer>  b = new ArrayList<>();
   static ArrayList<Integer>  c = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for p and q, p < q");
        System.out.println("p is  ");
        int p = scan.nextInt();
        System.out.println("q is ");
        int q = scan.nextInt();


        int difa;
        a.add(0);
        b.add(0);
        int index = 0;
        c.add(p+q);

        while( b.get(index)!=1 && c.get(index)!=1){
            System.out.println(" Step " + index + "  a = " + a.get(index) + "   b = " + b.get(index) + "   c = " + c.get(index));

        if (b.get(index)!=0){
            if( a.get(index)< p){
                difa = p - a.get(index);
                if ( b.get(index) < difa){

                    a.add(a.get(index) + b.get(index));
                    b.add(0);
                    c.add(c.get(index));
                    index++;
                }
                else{
                    a.add(p);
                    b.add(b.get(index) -difa);
                    c.add(c.get(index));
                    index++;
                }
            }
            else{
                a.add(0);
                b.add(b.get(index));
                c.add(c.get(index)+ p);
                index++;
            }
        }
        else{
            a.add(a.get(index));
            b.add(q);
            c.add(c.get(index)-q);
            index++;
        }
            }
        System.out.println(" Step " + index + "  a = " + a.get(index) + "   b = " + b.get(index) + "   c = " + c.get(index));
    }
}
