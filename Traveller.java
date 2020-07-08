

/*
A very intelligent and kind Traveller was trapped by a King, King wants to check his intelligence and kindness at the same time.

So he sets up a scenario where he asks traveller to play the “Sword Killing” game.

In this game ’N’ number of people have to stand in a circle in an order 1 to ’N’ and someone of them has a Sword,
so when the game starts the person with the sword kills the left adjacent person and passes the sword to the next person,
 next person do the same again and this keeps on going until only one person survives at the end.
For example: – At starting, Person at 18th position have the sword, and the game starts,
then the 18th position person kills 19th position person and passes sword to 20th position person,
20th person kills 21st person and passes sword to 22nd person and so on till only one person survives.

The twist King makes is that, he makes the traveller stand at 489th position in the circle,
and asks traveller to choose any number of people he wants to make stand in the circle,
where traveller’s position will be fixed (489th) and also gave him option for starting this game from any position
(Sword Initially with this position) . The basic rules for the game still remains same.

Given:
==>> SP (Starting Position): – Position of person the game starts from.
e.g. if SP=103 >> At starting Person at 103th position have the sword,
and the game starts in a way that he kills 104 and passes it to 105 and so on till only one survives,
which in this case should be 489th position person.
==>> N :- Total no. of people standing in the circle at the starting. N includes traveller as well.
For e.g. if N=500, it includes person standing at 489(or the traveller himself).
It is also understandable that N>=489
==>> Traveller is very Kind and wants to kill least no. of people as possible. Although he is kind but he prioritises his life over others.
i.e. he wants to save himself, but by killing minimum no. of people.

So you need to determine what would be value of N and SP, if Traveller wants to prove his kindness and intelligence.

Solution for N = 18, and SP = 1:


listA  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
[1, 3, 5, 7, 9, 11, 13, 15, 17]
[17, 1, 5, 9, 13]
[13, 17, 5]
[5, 13]
[5]


 */



import java.util.ArrayList;
import java.util.Scanner;
public class Traveller{
    public static ArrayList<Integer> Method(ArrayList<Integer> listCheck){
        ArrayList<Integer> listB = new ArrayList<>();
        ArrayList<Integer> lista;
        for( int k = 0; k < listCheck.size(); k ++){
            if ( k%2 == 0){
                listB.add(listCheck.get(k));
            }
        }
        lista = (ArrayList<Integer>) listB.clone();
        int endof = listB.size();
        if ( listCheck.size() %2 ==1) {
            for (int index = 0; index < endof - 1; index++) {
                lista.set(index + 1, listB.get(index));
            }
            lista.set(0, listB.get(endof - 1));
        }
        return lista;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter the number of knights  ");
        int knights = scan.nextInt();
        ArrayList<Integer> listA = new ArrayList<>();
        for(int j = 1; j <=knights; j++){
            listA.add(j);
        }
        System.out.println("listA  "+ listA );
        while((listA).size() >1)
        {
            listA = (ArrayList<Integer>) Method(listA).clone();
            Method(Method(listA));
            System.out.println(listA);
        }
    }
}
