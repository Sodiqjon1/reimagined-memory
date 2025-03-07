import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n,alp,a=0;
        String abc[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String nik="";

        a = scanner.nextInt();

        while (a==1) {
            n = random.nextInt(15)+1;

            for (int i = 1; i <= n; i++) {
                    alp = random.nextInt(26);
                    nik = nik + abc[alp];
            }
            System.out.println(nik);
            break;
        }
    }
}