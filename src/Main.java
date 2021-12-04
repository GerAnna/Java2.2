public class Main {
    public static void main(String[] args) {
        int initialbalance;
        initialbalance = 50;
        int refill;
        refill = 50;
        int bonus = 0;
        int totalbill;
        totalbill = initialbalance + bonus + refill;
       if (refill > 1000) {
        bonus = refill / 10;
           System.out.println(bonus + " - Ваш бонус!");
           System.out.println(totalbill + " - Ваш баланс после пополнения счёта.");
       } else {
           bonus = 0;
           System.out.println("Вы пополнили счет на " +refill+ " рублей.");
           System.out.println(totalbill + " - Ваш баланс после пополнения счёта");

       }
    }
}
