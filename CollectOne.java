

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
