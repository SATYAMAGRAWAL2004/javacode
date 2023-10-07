import java.util.*;

public class array1 {
    public static void main(String args[]){
        // int[] marks = new int[3];
        // marks[0] = 100;
        // marks[1] = 100;
        // marks[2] = 100;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
           }
            int x = sc.nextInt(); 
        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index: " + i);

            }
        }
    }
    
}
