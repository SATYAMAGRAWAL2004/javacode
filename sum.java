import java.util.*;
public class sum{
public static void main(String args[])
{
    //Variables
   // int a =100;
   //int b =200;
   // int sum = a+b;
  //System.out.println(sum);
  
      try(Scanner sc = new Scanner(System.in)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a + b;
      System.out.println(sum);
    }
  }

}