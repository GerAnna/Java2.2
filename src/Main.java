public class Main {
    public static void main(String[] args) {
        int initialbalance;
        initialbalance = 50;
        int refill;
        refill = 5000;
        int bonus;
        int totalbill;

        if (refill > 1000) {
            bonus = refill / 10;

        } else {
            bonus = 0;
        }
        totalbill = initialbalance + bonus + refill;

        System.out.println("Вы пополнили счет на " + refill + " рублей.");
        System.out.println(bonus + " - Ваш бонус!");
        System.out.println(totalbill + " - Ваш баланс после пополнения счёта");
    }
}
