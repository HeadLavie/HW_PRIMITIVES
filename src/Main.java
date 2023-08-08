public class Main {
    public static void main(String[] args) {
        int ticket = 13676;

        int rubles = 20;

        int bonus;

        if (ticket > 20) {
            System.out.println("Количество миль:" + (bonus = ticket / 20));
        } else {
            System.out.println("Количество миль:" +(bonus = 0));
        }


    }
}