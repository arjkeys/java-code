/*
Java program to Find the longest word in a text file
Note: Rename this filename as Main.java or your wish
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class ArjKeys 
{
    public static void main(String [ ] args) throws FileNotFoundException 
    {
        new ArjunPinpoint().findLongestWords();
    }
 
    public String findLongestWords() throws FileNotFoundException 
    {
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("ArjKeys.txt"));
 
        while (sc.hasNext()) 
        {
            current = sc.next();
            if (current.length() > longest_word.length()) 
            {
                longest_word = current;
            }
 
        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}
/*
OUTPUT:

*/
