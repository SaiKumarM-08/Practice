import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SplitListIntoTwoList {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(4, 9, 8, 5, 0, 10, 15);

        int list1Size = lst.size() / 2;
        int list2Size = lst.size() - list1Size;

        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> arrList2 = new ArrayList<>();

        for(int i = 0; i < list1Size; i ++)
            arrList1.add(lst.get(i));

        for(int i = list1Size; i < lst.size(); i++)
            arrList2.add(lst.get(i));


        System.out.println("list1 " + arrList1.toString());
        System.out.println("list2 " + arrList2.toString());
    }
}



//Output:  list1 [4, 9, 8]
//         list2 [5, 0, 10, 15]

//H Y R Tutorials - Telugu  --> YouTube Channel name
//Core Java - Assignment #9 --> video
