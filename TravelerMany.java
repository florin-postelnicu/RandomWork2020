

/*
java.util.Collections @NotNull
@Contract(value = "_->new", pure = true)
public static <T> List<T> synchronizedList(@NotNull List<T> list)
Returns a synchronized (thread-safe) list backed by the specified list. In order to guarantee serial access,
it is critical that all access to the backing list is accomplished through the returned list.
It is imperative that the user manually synchronize on the returned list when traversing it via Iterator, Spliterator or Stream:
        List list = Collections.synchronizedList(new ArrayList());
            ...
        synchronized (list) {
            Iterator i = list.iterator(); // Must be in synchronized block
            while (i.hasNext())
                foo(i.next());
        }

Failure to follow this advice may result in non-deterministic behavior.
The returned list will be serializable if the specified list is serializable.

Params:
list – the list to be "wrapped" in a synchronized list.
Type parameters:
<T> – the class of the objects in the list
Returns:
a synchronized view of the specified list.
External and inferred annotations:
Method synchronizedList: @org.jetbrains.annotations.NotNull @org.jetbrains.annotations.Contract(value = "_->new", pure = true)
Parameter list: @org.jetbrains.annotations.NotNull
  < openjdk-14 >
 */



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