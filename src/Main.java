import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        Random random = new Random();
        int rand = random.nextInt(100);//generate random number
        System.out.println("Загадано число от 0 до 100, угадаешь?\nВводи:");
        while (bool) { //Generating randInt
            Scanner scc = new Scanner(System.in);
            int number;
            if(!(scc.hasNextInt())){
                System.out.println("That not a number!");
                scc.next(); // this is important!
                continue;
            }
            number = scc.nextInt();
            String str = check(number, rand);
            System.out.println(str);
            if (str.equals("Угадал!")) { //Condition if won
                System.out.println(str + "\nЗагаданное: " + rand);
                System.out.println("Еще раз? напиши 'Yes', если нет, то 'No'");
                Scanner in = new Scanner(System.in);
                String phrase = in.nextLine();
                switch (phrase) {
                    case ("Yes"):
                        bool = true;
                        System.out.println("Вводи:");
                        continue;
                    case ("No"):
                        bool = false;
                        break;
                }
            }
        }
    }

    public static String check(int number, int rand) { //method which checked validation number according to rand
        if (number < 0 || number > 100) {
            return "Число не попало в диапазон";
        } else if (number > rand) {
            return "Меньше!";
        } else if (number < rand) {
            return "Больше!";
        } else if (number == rand) {
            return "Угадал!";
        }
        return "Nothing";
    }
}
