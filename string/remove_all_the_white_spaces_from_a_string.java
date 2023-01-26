/*
Remove all the white spaces from a string - Java
Note: Rename this filename as Main.java or your wish
*/
public class removeWhiteSpace {    
    public static void main(String[] args) {    
            
        String str1="Remove white spaces";    
            
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println(str1);    
    }    
}
/*
OUTPUT:
Removewhitespaces
*/
