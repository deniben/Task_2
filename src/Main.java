import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        while(bool) {
            Random random = new Random();
            int rand = random.nextInt(100);
            System.out.println("Загадано число от 0 до 100, угадаешь?\nВводи:");
            Scanner scan = new Scanner(System.in);
            System.out.println(rand);
            int number = scan.nextInt();
            String str = check(number, rand);
            System.out.println(str+"\nЗагаданное: "+rand);
            if(str.equals("Угадал!")){
                System.out.println("Еще раз? напиши 'Yes', если нет, то 'No'");
                Scanner in = new Scanner(System.in);
                String phrase = in.nextLine();
                switch (phrase){
                    case ("Yes"):
                        bool = true;
                        continue;
                    case ("No"):
                        bool = false;
                        break;
                }
                }
                break;
        }
    }

    public static String check(int number, int rand) {
        if(number < 0 || number > 100){
            return "Число не попало в диапазон";
        } else if (number > rand){
            return "Меньше!";
        } else if (number < rand){
            return "Больше!";
        } else if (number == rand){
            return "Угадал!";
        }
        return "Nothing";
    }
}
