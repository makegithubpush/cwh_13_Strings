import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CWH_13_Strings {
    public static void main(String[] args) {
    //    String name = "Harry";
    //    System.out.print("The name is: ");
    //    System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a,b);
        System.out.format("The value of a is %d and value of b is %f", a,b);
        
        Scanner sc = new Scanner(System.in);
    //    String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);




    }
}