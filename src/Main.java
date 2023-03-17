public class Main {
    public static void main(String[] args)
    {
        double creditCardBalance = 5000.00;
        double interestRate = 0.17;
        double monthOne = 0;
        double monthTwo = 0;

        monthOne = creditCardBalance + 0.17 * creditCardBalance;
        monthTwo = monthOne + 0.17 * monthOne;

        System.out.println("The balance after one month is $" + monthOne + " and the balance after two months is $" +monthTwo);
    }
}