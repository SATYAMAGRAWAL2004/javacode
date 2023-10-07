import java.util.*;

public class Stringfunction {
    public static void main (String args[]){

    Scanner sc  = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    System.out.println("The length of the string :" + str1 + " is: " +str1.length());


    if(str1.equals(str2))
    System.out.println(str1 + " & " + str2 + " are same.");

    else

        System.out.println(str1 + " & " + str2 + " are not same.");

        if(str1.equalsIgnoreCase(str2))
        System.out.println(str1 + " & " + str2 + "are same (ignoring case)");
        else
        System.out.println(str1 + " & " + str2 + "are not same(Ignoring case)");

        //find the character at the given index.

        System.out.println("The character at position 2 is : " + str1.charAt(2));


        System.out.println("Comparing" + str1 + " & " + str2 + "Distance: " + str1.compareTo(str2));

        str1 ="AABBCABBAA";


    
    
    
    
}
}
