public class Bananas {

    static int  n = 400;
    static int load = 17;
    static int cons;
    static int miles = 1;
    static int left_over= 0;

    public static void main(String[] args) {
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
