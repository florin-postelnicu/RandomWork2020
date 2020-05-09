import java.util.ArrayList;
import java.util.Scanner;

public class BananasRecursive {

    public static int load ;

    public static int val;
    public static int counter= 0;
    public static int  left_over = 0;
    public static ArrayList<Integer> memo = new ArrayList<Integer>();



    public static int Bananas(int n) {


        if ( n < memo.size()){
            return memo.get(n);
        }

        else if (n == 0) {
            val = 10*load;
        }
        else{
            if (Bananas(n - 1) % load == 0) {
                val = Bananas(n - 1) - ((Bananas(n - 1) /load) * 2 - 1);
            } else if (Bananas(n - 1) % load == 1) {
                left_over++;
                val =  Bananas(n - 1) - 1 - ( (Bananas(n - 1)/load) * 2 - 1) ;
            } else {
                val =  Bananas(n - 1) - ( (Bananas(n - 1)/load) * 2 + 1);
            }
            memo.add(val);

        }
        counter++;
     return val ;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for load  :");
        load = scan.nextInt();
        int initial_amount = 10*load;
        System.out.println(initial_amount);
        System.out.println(Bananas(load -1));
        System.out.println(counter);
        System.out.println("Leftovers  :"+ left_over);
        int k = 0;
        for(Integer integer: memo){
            k = k+1;
            if(k%11 == 0){
                System.out.println("\n");
            }
            else{
                System.out.printf("%10d", integer);
            }
        }

    }
}
