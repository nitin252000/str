import java.util.Scanner;

public class PRAC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(i) == 'a')
                System.out.println("prsent");
            else
                System.out.println("not present");
        }
    }
}
