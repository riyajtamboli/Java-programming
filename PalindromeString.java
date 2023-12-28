import java.util.*;

public class PalindromeString {
          public static boolean CheckPalindrome(String name){
                    for(int i=0; i<name.length()/2; i++){
                              int n = name.length();
                              if(name.charAt(i)!=name.charAt(n-1-i)){
                                        System.out.println("Name is not palindrome");
                                        return false;
                              }
                    }
                     System.out.println("name is palindrome");
                    return true;
                   
          }
          
          
          public static void main(String[] args) {
          
                    Scanner sc = new Scanner (System.in);
                    System.out.print("Enter name : ");
                    String name;
                    name = sc.nextLine();

                    CheckPalindrome(name);
          }
}
