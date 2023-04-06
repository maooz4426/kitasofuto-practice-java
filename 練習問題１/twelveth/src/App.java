import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("入力してください");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        x++;
        System.out.println("インクリメント演算子は" + x);
        x--;
        x--;
        System.out.println("デクリメント演算子は" + x);

    }
}
