import java.util.ArrayList;

public class BananasRecursive {

    public static int load = 1000;
    public static int initial_amount = 1000000000;
    public static int val;
    public static ArrayList<Integer> memo = new ArrayList<Integer>();


    public static int Bananas(int n) {
        if ( n < memo.size()){
            return memo.get(n);
        }

        else if (n == 0) {
            val = initial_amount;
        }
        else{
            if (Bananas(n - 1) % load == 0) {
                val = Bananas(n - 1) - ((Bananas(n - 1) /load) * 2 - 1);
            } else if (Bananas(n - 1) % load == 1) {
                val =  Bananas(n - 1) - 1 - ( (Bananas(n - 1)/load) * 2 - 1) ;
            } else {
                val =  Bananas(n - 1) - ( (Bananas(n - 1)/load) * 2 + 1);
            }
            memo.add(val);

        }
     return val ;
    }



    public static void main(String[] args) {
        System.out.println(initial_amount);
        System.out.println(Bananas(1000));
        System.out.println(memo);

    }
}
