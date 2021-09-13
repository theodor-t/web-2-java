package coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nominal;
        String option;
        System.out.println("==========================");
        System.out.println("1 - Coffe - 5$           |");
        System.out.println("2 - Cappucino - 5$       |");
        System.out.println("3 - Latte - 10$          |");
        System.out.println("4 - Americana - 10$      |");
        System.out.println("==========================");
        System.out.println("Please insert banknote");
        nominal = reader.readLine();
        System.out.println("Please chose option");
        option = reader.readLine();

        coffeeMachine.prepare(Integer.parseInt(nominal),
                Integer.parseInt(option));
    }
}
