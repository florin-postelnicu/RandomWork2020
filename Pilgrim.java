





import java.util.ArrayList;

import java.util.Scanner;

public class Pilgrim{

    public static ArrayList<Integer> Method(ArrayList<Integer> listCheck){

        ArrayList<Integer> listB = new ArrayList<>();

        ArrayList<Integer> lista;

        for( int k = 0; k < listCheck.size(); k ++){

            if (( k+1)%3 != 0) listB.add(listCheck.get(k));

        }

        lista = (ArrayList<Integer>) listB.clone();

        int endof = listB.size();
        int permute = listCheck.size()%3;

        for (int index = 0; index < endof ; index++) lista.set((index + permute) % endof, listB.get(index));

        return lista;

    }



    public static void main(String[] args) {

//        Scanner scan = new Scanner((System.in));
//
//        System.out.println("Enter the number of knights  ");
//
//        int knights = scan.nextInt();
        for( int knights = 3; knights <= 81; knights++) {
            System.out.println(" Knights  " + knights);

            ArrayList<Integer> listA = new ArrayList<>();

            for (int j = 1; j <= knights; j++) {

                listA.add(j);

            }

            System.out.println("listA  " + listA);

            while ((listA).size() > 2) {

                listA = (ArrayList<Integer>) Method(listA).clone();

                Method(Method(listA));

                System.out.println(listA);

            }
        }

    }

}