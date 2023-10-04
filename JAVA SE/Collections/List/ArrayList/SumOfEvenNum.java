import java.util.Arrays;
import java.util.List;


public class TestThreads {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(4, 5, 0, 9, 8, 10);
        int sum = 0;

        for(int i : lst){
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}

//Output :  sum = 22


//H Y R Tutorials - Telugu  --> YouTube Channel name
//Core Java - Assignment #9 --> video
