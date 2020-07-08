
import java.util.Scanner;
public class TravelerPosNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of knights");
        int k = scan.nextInt();
        int exp = (int) (Math.log10(k)/ Math.log10(2));
        System.out.println("Enter your Position  ");
        int mypos = scan.nextInt();

        int save1 =  (int) (2*( k - Math.pow(2, exp))+1);
        System.out.println(save1);
//        int post = k - save1 + 1;
//        System.out.println(post);
        int StartP = (int)(k -save1 + mypos)%k +1;
        System.out.println("You should start at " + StartP);

    }
}
