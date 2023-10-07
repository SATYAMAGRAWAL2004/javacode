import java.util.*;

public class String1 {
    public static void main(String args[]){
        char[]charString = {'S','t','r','i','n','g'};//array of a characters

        Scanner sc = new Scanner(System.in);;//define scanner class object

        String str = new String(charString);//make String from the character array
        System.out.println("The value of str is:" + str);

        System.out.print("Enter string: ");
        str = sc.next();
        System.out.println("The value of str is: " +str);

        str = "JAVA Strings"; //direct assign string to the String type object str
        System.out.println("The value of str is: " + str);

        str = "String" + " " + "Concatenate";//concatenate three string into single String
        System.out.println("The value of str is:" + str);
        sc.close(); 
    }
    
}
