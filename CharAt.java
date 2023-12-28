import java.util.*;

public class CharAt {
          public static void printString(String name ){
                    for(int i=0; i<name.length(); i++){
                              System.out.print(name.charAt(i) + " ");
                    }
                    System.out.println();
          }
 
          public static void main(String[] args) {
                    Scanner sc= new Scanner(System.in);
                    System.out.print("Enter name : ");

                    String name;
                    name = sc.nextLine();

                    printString(name);
                    
          }
          
}
