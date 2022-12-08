public class Main {
    public static void main(String[] args) {
        System.out.println("bonjour le monde");
        simplecalculator calculator = new simplecalculator();
        int result = calculator.addiction(12,25);
        boolean test;
        test = calculator.isEven(4);
        System.out.println(test);
        System.out.println(result);

    }
}
