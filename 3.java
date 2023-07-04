/*
3) Реализовать простой калькулятор
*/
public class HW-JAVA-1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter 1st number:");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.println("Enter 2st number:");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        System.out.println("Enter operation:");
        char operation = scanner.next().charAt(0);

        int result = 0;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            }
    System.out.println("Result operation: " + result);
    n1.close();
    n2.close();
    }
}
