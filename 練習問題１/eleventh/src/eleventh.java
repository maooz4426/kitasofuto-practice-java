import java.util.Scanner;

public class eleventh {

    public static void main(String[] args) {

        System.out.println("xの値を入力してください");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println("xより小さい値を入力してください");
        int y = scanner.nextInt();

        scanner.close();

        int quo = x / y;
        int exs = x % y;

        System.out.println("商は" + quo);
        System.out.println("余りは" + exs);

    }

}
