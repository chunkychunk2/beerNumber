import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int beer = Integer.parseInt(reader.readLine());
        while (beer > 0) {
            for (int i = 0; i < beer; i++){
                System.out.println(suffix2(beer) + " " + beer + " " + suffix(beer) + " пива, одну убрали");
                beer--;
                System.out.println(suffix3(beer) + " " + beer + " " + suffix(beer) + " пива");
            }
        }


}
        static String suffix(int num){
        int s = (num % 100);
        String word;
        if (10 < s && s < 19)
            word = "бутылок";
        else if (s % 10 == 1)
            word = "бутылка";
        else if (s % 10 == 2 || s % 10 == 3 || s % 10 == 4)
            word = "бутылки";
        else
            word = "бутылок";
        return  word;
        }

        static String suffix2(int num){
        int s = (num % 100);
        String word;
        if (s % 10 == 1)
            word = "Была";
        else if (10 < s && s < 19)
                word = "Было";
        else
            word = "Было";
        return  word;
    }
        static String suffix3(int num){
        int s = (num % 100);
        String word;
        if (s % 10 == 1)
            word = "Осталась";
        else if (10 < s && s < 19)
                word = "Осталось";
        else
            word = "Осталось";
        return  word;
    }
    }
