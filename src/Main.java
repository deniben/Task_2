import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        while(bool) { //Generating randInt
            Random random = new Random();
            int rand = random.nextInt(100);//generate random number
            System.out.println("Загадано число от 0 до 100, угадаешь?\nВводи:");
            Scanner scan = new Scanner(System.in);
            System.out.println("Загаданное число для проверки: "+rand); //If does'n need, commit
            int number = scan.nextInt(); //input number
            String str = check(number, rand);
            System.out.println(str+"\nЗагаданное: "+rand);
            if(str.equals("Угадал!")){ //Condition if won
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

    public static String check(int number, int rand) { //method which checked validation number according to rand
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
