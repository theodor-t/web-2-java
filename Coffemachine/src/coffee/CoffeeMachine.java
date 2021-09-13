package coffee;

public class CoffeeMachine {
    private Boolean pay(Integer banknoteNominal) {
        return banknoteNominal == 5 || banknoteNominal == 10;
    }

    private String choose(Integer option) {
        if (option == 1) {
            return "Coffee";
        }

        if (option == 2) {
            return "Cappuccino";
        }
        if (option == 3) {
            return "Latte";
        }
        if (option == 4) {
            return "Americana";
        }

        return "Incorrect option";
    }

    private void showInfo(String message) {
        System.out.println(message);
    }

    private String done(String coffeeType) {
        return coffeeType;
    }

    public void prepare(Integer nominal, Integer option) {
        String coffeeType = "";

        if (this.pay(nominal)) {

            coffeeType = this.choose(option);
            if (this.choose(option).contains("Incorrect")){
                System.out.println(coffeeType);
                return;
            }
            this.showInfo(
                    "You choose is: " + coffeeType
            );
            this.showInfo("Preparing...");
            this.showInfo(
                    "Done: " + this.done(coffeeType)
            );
        } else {
            this.showInfo("Please insert correct banknote");
        }
    }
}
