import java.util.Scanner;

public class Drinks {
    public static final int COFFEE_PRICE = 5;
    public static final int TEA_PRICE = 4;
    public static final int LEMONADE_PRICE = 8;
    public static final int MOJITO_PRICE = 15;
    public static final int SODA_PRICE = 3;
    public static final int COLA_PRICE = 10;

    public void coffeeMaker() {
        System.out.printf("Ваша кава готова, з вас %d$\n", COFFEE_PRICE);
    }
    public void teaMaker() {
        System.out.printf("Ваш чай готовий, з вас %d$\n", TEA_PRICE);
    }
    public void lemonadeMaker() {
        System.out.printf("Ваша лемонад готовий, з вас %d$\n", LEMONADE_PRICE);
    }
    public void mojitoMaker() {
        System.out.printf("Ваше мохіто готовий, з вас %d$\n", MOJITO_PRICE);
    }
    public void sodaMaker() {
        System.out.printf("Ваша мінеральна вода, з вас %d$\n", SODA_PRICE);
    }
    public void colaMaker() {
        System.out.printf("Ваша кока-кола, з вас %d$\n", COLA_PRICE);
    }
}
