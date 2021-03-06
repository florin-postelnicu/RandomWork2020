


/*
Original Problem :
There are 3 jars. The first jar ( a)  can hold p litters, the second jar (b)
can hold q litters, and the third jar (c) contains p + q litters.
p, q are natural numbers having the greatest common divisor d.
At the beginning jars a, and b are empty(0 litters) and jar c has p + q litters.
The objective is to obtain exactly d litters by transferring watter from one jar to another.
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

Another example:
            p is
            12
            q is
            20
             gcd of 12  and  20  is 4
             Step 0  a = 0   b = 0   c = 32
             Step 1  a = 0   b = 20   c = 12
             Step 2  a = 12   b = 8   c = 12
             Step 3  a = 0   b = 8   c = 24
             Step 4  a = 8   b = 0   c = 24
             Step 5  a = 8   b = 20   c = 4


 */

import java.util.Scanner;
import java.util.ArrayList;

public class CollectOneD {
    static ArrayList<Integer>  a = new ArrayList<>();
    static ArrayList<Integer>  b = new ArrayList<>();
    static ArrayList<Integer>  c = new ArrayList<>();



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for p and q, natural numbers");
        System.out.println("p is  ");
        int p = scan.nextInt();
        System.out.println("q is ");
        int q = scan.nextInt();
        System.out.println(" gcd of " + p + "  and  "+ q + "  is "+ gcd(p,q) );
        int d = gcd(p,q);

        int difa;
        a.add(0);
        b.add(0);
        int index = 0;
        c.add(p+q);

        while( b.get(index)!= d && c.get(index)!= d){
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



    private static Integer  gcd(int x,int y){

        while(x != y) {
            if( x> y){
                x = x -y;
            }
            else {
                y = y-x;
            }
        }
        return x;
    }

}