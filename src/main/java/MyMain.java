import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch += 32;
            
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println("ch is already lowercase");
        }
        else{
            System.out.println("ch is not a letter");
        }
        
        System.out.println("ch is now a lowercase letter " + ch);   
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        int length = str.length();
        char [] ch = str.toCharArray();
        String str2 = "";
        for (int i = 0; i < length; i++){
            if (ch[i] >= 'A' && ch [i] <='Z'){
                ch[i] += 32; 
                str2 += ch[i];
            }
            else{
                str2 += ch[i];
            }
        }
        System.out.println("Here is your sting in lowercase: " + str2);
        return str2;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            ch -= 32;
            
        }
        else if (ch >= 'A' && ch <='Z'){
            System.out.println("ch is already an uppercase letter");
        }
        else{
            System.out.println("ch is not a letter");
        }
        
        System.out.println("ch is now an uppercase letter " + ch);   
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        int lengthh = str.length();
        char[] ch2 = str.toCharArray();
        String str3 = "";
        for (int i = 0; i < lengthh; i++){
            if (ch2[i] >= 'a' && ch2 [i] <='z'){
                ch2[i] -= 32; 
                str3 += ch2[i];
            }
            else{
                str3 += ch2[i];
            }
        }
        System.out.println("Here is your sting uppercase: " + str3);
        return str3;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.nextLine(); 
        System.out.println("What would you like to make the string uppercase or lowercase?");
        String cases = scan.nextLine();
        if (cases == "uppercase"){
            myToUpperCase(str);
        } else if (cases == "lowercase"){
            myToLowerCase(str);
        }
        else{
            System.out.println("Please enter uppercase or lowercase");
        }  
        scan.close();
        
    }
}
