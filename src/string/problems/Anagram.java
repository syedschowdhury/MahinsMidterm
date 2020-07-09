package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

      //  checkAnagram("")

    }

    public static void checkAnagram(String firstWord, String anagram){
        if(isAnagram(firstWord, anagram) == true){
            System.out.println(anagram+" is an Anagram "+firstWord);
        }else {
            System.out.println(" not an anagram");
        }
    }

    public static boolean isAnagram(String firstWord, String anagram){
        if(firstWord.length() != anagram.length()){
            return false;
        }
        char[] text = firstWord.toCharArray();
        for (char c:text) {
            int index = anagram.indexOf(c);
            if(index !=1){
                anagram = anagram.substring(0, index)+ anagram.substring(index+1, anagram.length());
            }else {
                return false;
            }

        }return anagram.isEmpty();
    }
}
