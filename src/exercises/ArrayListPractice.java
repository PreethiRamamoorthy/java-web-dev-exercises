package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(1);
        arrayListInt.add(2);
        arrayListInt.add(3);
        arrayListInt.add(4);
        arrayListInt.add(5);
        arrayListInt.add(6);
        arrayListInt.add(7);
        arrayListInt.add(8);
        arrayListInt.add(9);
        arrayListInt.add(10);
        System.out.println("Initial array is: " + arrayListInt);



        //Integer totalSum = SumOfEvenNumbers.evenNumbersSum(arrayListInt);
        Integer totalSum = evenNumbersSum(arrayListInt);
        System.out.println("Sum of all the even numbers is: " + totalSum);
        }

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



