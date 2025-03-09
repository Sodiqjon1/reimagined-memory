import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n,alp,a=0;
        String numb[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String rand="";

        a = scanner.nextInt();

        while (a==1) {
            n = random.nextInt(15)+1;

            for (int i = 1; i <= n; i++) {
                    alp = random.nextInt(10);
                    rand = rand + numb[alp];
            }
            System.out.println(rand);
            break;
        }
    }
}