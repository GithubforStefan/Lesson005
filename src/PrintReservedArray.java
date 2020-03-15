public class PrintReservedArray {

    static int [] onetwothree = {1,2,3,4,5};
    public static void main (String [] args) {

        for (int i=onetwothree.length;i>0;i--)
        System.out.println(onetwothree[i-1]);


    }
}
