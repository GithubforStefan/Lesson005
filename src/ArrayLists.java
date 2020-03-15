import java.util.ArrayList;
import java.math.*;

/*
// create Integer type arraylist
ArrayList<Integer> arrayList = new ArrayList<>();

// create String type arraylist
ArrayList<String> arrayList = new ArrayList<>();

 */
//Print Reversed ArrayList
public class ArrayLists {
    /*public static void main(String[] args) {
        ArrayList<Integer> ArrayList = new ArrayList<>();
        int i;
        for (i = 1; i < 5; i++) {
            ArrayList.add(i);
        }
        System.out.println(ArrayList);
    }
}

     */


    public static void main (String [] args){
        int i;
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("A");
        string1.add("C");
        string1.add("E");
        System.out.println(string1);

        ArrayList<String> string2 =  new ArrayList<>();
        string2.add("B");
        string2.add("D");
        string2.add("F");
        System.out.println(string2);

        String [] mergedString = new String[string1.size() + string2.size()];
        //ArrayList<String> mergedString = new ArrayList<>(string1<2>);

        for(i=0;i<string1.size();i++){
            mergedString[i*2] = string1.get(i);
            mergedString[i*2+1] = string2.get(i);
        }

        for(i=0;i<mergedString.length;i++) {
            System.out.println(mergedString[i]);
        }
    }

}




