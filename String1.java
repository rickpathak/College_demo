import java.util.Scanner;

/**
 * String1
 */
public class String1 {

    public static void main(String[] args) {
        
    String a = "SUBHAM";
    System.out.println(a);

    String b = new String("pathak");
    System.out.println(b);

    Scanner sc = new Scanner(System.in);
    System.out.println("enter String : ");
    String d = sc.nextLine();
    System.out.println(d);
    String c = new String(d);
    System.out.println("the string which is written is " + c);
    }
}