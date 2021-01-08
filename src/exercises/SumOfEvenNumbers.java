package exercises;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvenNumbers {
    public static Integer evenNumbersSum(ArrayList<Integer> arrayListInt) {
        int sum = 0;
        for (int i=0; i< arrayListInt.size(); i++){
            if (arrayListInt.get(i) % 2 == 0){
                sum += arrayListInt.get(i);
            } else {
                continue;
            }
        }
        return sum;
    }
}
