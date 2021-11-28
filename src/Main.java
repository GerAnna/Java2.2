public class Main {
    public static void main(String[] args) {
        int InitialBalance;
        InitialBalance = 5000;
        int refill;
        refill = 2550;
        int bonus;
        int totalBill;
       if (refill > 1000) {
        bonus = refill / 10;
           totalBill = InitialBalance + bonus + refill;
           System.out.println(bonus + " - Ваш бонус!");
           System.out.println(totalBill + " - Ваш баланс после пополнения счёта.");
       } else {
           bonus = 0;
           totalBill = InitialBalance + refill;
           System.out.println("Вы пополнили счет на " +refill+ " рублей.");
           System.out.println(totalBill + " - Ваш баланс после пополнения счёта");

       }
    }
}
