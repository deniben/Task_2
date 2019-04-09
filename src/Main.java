import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private final static int MAX_NUMBER = 100;

    private static Random rnd = new Random();
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) { //Generating randInt
            newint();
            System.out.println("Съиграем еще раз? (y/N)");
            String line = input.readLine();
            if( !line.equalsIgnoreCase("Y") )
                break;
        }
    }

    private static void newint() {
        int rand = rnd.nextInt(MAX_NUMBER);//generate random number
        System.out.println("Загадано число от 0 до 100, угадаешь?\nВводи:");

        while(true) {
            try {
                String line = input.readLine();
                if (line.isEmpty()) {
                    continue;
                }
                int number = Integer.parseInt(line);
                if (number > rand) {
                    System.out.println("Меньше!");
                } else if (number < rand) {
                    System.out.println("Больше!");
                } else if (number == rand) {
                    System.out.println("Угадал!");
                    break;
                } else {
                    System.out.println("Число не попало в диапазон от 0 до " + MAX_NUMBER);
                }
            } catch (Exception e){
                System.out.println("Это не число, попробуй еще раз");
            }
        }
    }
}
