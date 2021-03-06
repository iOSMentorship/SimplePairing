import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by adewunmisimon on 05/03/2017.
 */
public class PairingAlgorithm {
    public static void main(String [] args){
        //list for storing everybody's name
        ArrayList<String> names=new ArrayList<>();
        //names will be divided into two groups
        ArrayList<String> namesToFive=new ArrayList<>();
        ArrayList<String> namesToSix=new ArrayList<>();
        names.add("dewunmi");
        names.add("djubreel");
        names.add("judekayode");
        names.add("ollaollu");
        names.add("abayomi");
        names.add("perfectmak");
        names.add("shaggy");
        names.add("simpumind");
        names.add("tundeojediran");
        names.add("chikodi");

        //we shuffle all the names randomly
        Collections.shuffle(names);

        for (int i=0;i<names.size()/2;i++) {
            namesToFive.add(names.get(i));
        }
        for (int j =5; j <names.size(); j++) {
            namesToSix.add(names.get(j));
        }
        for (int i=0;i<names.size()/2;i++) {
            System.out.println("Group " + (i+1) + "-" + namesToFive.get(i) + "," + namesToSix.get(i));
        }

    }
}
