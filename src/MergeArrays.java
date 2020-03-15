public class MergeArrays {

    public static void main (String [] args){
        int i;
        String [] string1 = {"A", "C", "E", "G","I"};
        String [] string2 = {"B", "D", "F", "H", "J"};
        String [] mergedString = new String[string1.length + string2.length];

        for(i=0;i<string1.length;i++){
            mergedString[i*2] = string1[i];
            mergedString[i*2+1] = string2[i];
        }

        for(i=0;i<mergedString.length;i++) {
            System.out.println(mergedString[i]);
        }
    }

}
