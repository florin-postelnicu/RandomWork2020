




import java.util.ArrayList;

import java.util.Scanner;

public class TravelerMany{



    public static ArrayList<Integer> MethodA(ArrayList<Integer> listCheck, int NumSurv){

        ArrayList<Integer> listB = new ArrayList<>();

        for( int k = 0; k < listCheck.size(); k ++){

            if( ( k + 1)%(NumSurv + 1) != 0){

                listB.add(listCheck.get(k));
            }
        }

        ArrayList<Integer> lista = (ArrayList<Integer>) listB.clone();

        int endof = listB.size();
        int rot = listCheck.size()%(NumSurv +1);

        for (int index = 0; index < endof; index++) {

            lista.set((index + rot) % endof, listB.get(index));
        }
        return lista;

    }
    

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        System.out.println("Enter the number of knights in the Surviving Team  ");

        int numsurv = scan.nextInt();

        System.out.println(" Enter the total number of knights  ");
        int knights = scan.nextInt();


        System.out.println(" Knights Total " + knights);

        ArrayList<Integer> listA = new ArrayList<>();

        for (int j = 1; j <= knights; j++) {

            listA.add(j);

        }

        System.out.println("listA Original " + listA);


        do {
            listA =  (ArrayList<Integer>) MethodA(listA, numsurv ).clone();

            System.out.println("New "  +listA);

        }while (listA.size() > numsurv );
    }
}
