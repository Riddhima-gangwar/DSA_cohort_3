import java.util.*;
public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world");
        int age=sc.nextInt();
        sc.nextLine(); // consume the newline character
        String s=sc.nextLine();
        char ch= sc.nextLine().charAt(0); 
        System.out.println("age: "+age);
        System.out.println("name:"+s);
        System.out.println("character:"+ch);
        //hasNextInt() method is used to check if there is an integer input available in the scanner. It returns true if there is an integer input, and false otherwise.
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        }
    }
}

