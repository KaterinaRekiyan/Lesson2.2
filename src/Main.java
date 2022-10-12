public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int replenishment = 7000;
        int bonus = replenishment > 1000 ? replenishment/100 : 0;
        int total = startingScore + replenishment + bonus;
        System.out.println("итоговый счет, включая бонусы: " + total);
    }
}