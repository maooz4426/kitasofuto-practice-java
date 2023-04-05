package 北ソフトjava.練習問題１;

public class tehth {

    public static int powerPrint(int number, int op){

        int ans = 1;

        if(op == 0){

            ans = 0;
            System.out.println(ans);

        }else{

            for(int i = 0; i < op ; i++){

                ans = ans * number;

                System.out.println(ans);
            
            }
        }
        return ans;
    }
    public static void main(String[] args){

        int x = 2;

        powerPrint(x, 0);

    }
    
}
