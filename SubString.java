import java.util.*;

public class SubString {
          public static String subString(String name, int si, int ei){
                    String substr = "";
                    for(int i=si; i<ei; i++){
                              // substr += name.charAt(i);
                              substr = substr +name.charAt(i);
                              
                    }
                    return substr;
                   
          }
          public static void main(String[] args) {
                    System.out.print("Enter String : ");
                    Scanner sc = new Scanner(System.in);
                    String name;
                    name = sc.nextLine();

                    System.out.print("select starting index : ");
                    int si = sc.nextInt();

                    System.out.print("select end index : ");
                    int ei= sc.nextInt();

                    System.out.println(subString(name, 0, 3));
          }
}
