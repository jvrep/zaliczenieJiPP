import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.println("Podaj pierwszą liczbę");
            double numberOne = scanner.nextDouble();

            System.out.println("Podaj rodzaj operacji");
            char operator = scanner.next().charAt(0);

            System.out.println("Podaj drugą liczbę");
            double numberTwo = scanner.nextDouble();

            switch (operator) {
                case '+':
                    System.out.printf("Wynik to: %f", calculator.add(numberOne, numberTwo));
                    break;

                case '-':
                    System.out.printf("Wynik to: %f", calculator.subtract(numberOne, numberTwo));
                    break;

                case '*':
                    System.out.printf("Wynik to: %f", calculator.multiply(numberOne, numberTwo));
                    break;

                case '/':
                    if (numberTwo == 0) {

                        boolean isRunning = true;

                        while (isRunning) {
                            System.out.println("Nie wolno dzielić przez 0");

                            System.out.println("Podaj inną liczbę");
                            numberTwo = scanner.nextDouble();

                            if (numberTwo != 0) {
                                isRunning = false;
                            }
                        }

                        System.out.printf("Wynik to: %f \n", calculator.divide(numberOne, numberTwo));

                    } else {
                        System.out.printf("Wynik to: %f \n", calculator.divide(numberOne, numberTwo));
                    }
                    break;

                default:
                    System.out.println("Nieprawidłowa operacja");
            }

            System.out.println("Naciśnij Enter, aby zamknąć program");

            System.in.read();
        } catch (Exception e) {
            System.out.println("Nieprawidłowa wartość");
        }
    }
}