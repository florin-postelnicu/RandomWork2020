
import java.util.Scanner;

public class Bananas {
    static int load ;


    static int cons;

    static int left_over= 0;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the load  :");
        load = scan.nextInt();
        int  n = 10*load;
        int miles = 0;
        for( int i = 0; i< load; i++){
            if(n%load== 0 ){
                cons = (n/load )*2 -1;
                n = n- cons;
                System.out.println("At : "+ miles+ "   miles  there are " + n + " bananas left");
            }
            else if( n%load == 1){
                cons = (n/load)*2 -1;
                n = n-1- cons;
                left_over++;
                System.out.println("At : "+ miles + "   miles there are  " + n + " bananas left");
            }
            else{
                cons = n/load*2 + 1;
                n = n - cons;
                System.out.println("At : "+ miles + "   miles  there are  "+ n + " bananas left");
            }
            miles++;
        }
        System.out.println(" At the end of  " + miles + "  miles, there are    :" + n + "  bananas  for sale");
        System.out.println("Left_over    :" + left_over);

    }

}
