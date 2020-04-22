

/*
the text for trial
A Bottm u linneragee e altteraaashhh o hhurricaneet
 */
import java.util.Scanner;

public class RemelemS {

    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Enter your statement");
        String stateOrig = scan.nextLine();
        // Convert to lower case
        String stateCon = stateOrig.toLowerCase();

        //Create an char array
        char[] statechar = stateCon.toCharArray();
        int len = statechar.length;

        if(len <= 10){
            // do nothing to statechar
            System.out.println(statechar);
        }
        else {
            System.out.println("Gime a sign !");


            char[] norepaets = new char[len+1];
            norepaets[len]=' ';

            // generate the index for the new array
            int index = 0;
            for( int i = 0; i < len-1; i++){
                if(statechar[i] == statechar[i+1] ){
                    continue;
                }
                else{
                    norepaets[index]= statechar[i];
                    index++;
                }
                norepaets[index]= statechar[len-1];
            }

            //eliminate the vowels inside the words, but leave the singletons

            int lens = index +1;
            char[] novoelsing = new char[lens];
            int indnov = 1;
//            novoelsing[0]= singles[0];
            novoelsing[0] = norepaets[0];
            novoelsing[index]= ' ';

//            novoelsing[lens]=' ';

            for(int k = 1; k <= index; k++){
                if(norepaets[k-1] == norepaets[k+1] && norepaets[k+1] ==' '){
                    novoelsing[indnov] = norepaets[k];
                    indnov ++;
                }

                else if (norepaets[k]!='a'&& norepaets[k]!='e'&& norepaets[k]!='i' && norepaets[k]!='o' && norepaets[k]!='u'){
                    novoelsing[indnov]= norepaets[k];
                    indnov++;
                }
                else{
                    novoelsing[indnov]= norepaets[k];
                }
            }
            char[] novelnorep = new char[indnov];
            System.arraycopy(novoelsing, 0, novelnorep, 0, indnov);
            System.out.println(novelnorep);
        }
    }
}