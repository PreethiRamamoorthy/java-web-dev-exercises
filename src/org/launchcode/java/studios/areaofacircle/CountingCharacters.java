package org.launchcode.java.studios.areaofacircle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingCharacters {

    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        //myString= myString.replaceAll("[^A-Za-z]", "");
        HashMap<Character, Integer> stringHashmap = new HashMap<>();

        char[] charactersInString = myString.toCharArray();

        for (char letters : charactersInString) {
            //System.out.println(letters);
            if (Character.isLetter(letters)) {
                if (!stringHashmap.containsKey(letters)) {
                    stringHashmap.put(letters, 1);
                } else {
                    stringHashmap.put(letters, stringHashmap.get(letters) + 1);
                }
            }
            stringHashmap.forEach((k, v) -> System.out.println(k + ":" + v));
        }
    }
}



