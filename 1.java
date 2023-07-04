/*
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/

public class HW-JAVA-1 {
    public static void main(String[] args) {
        System.out.printf("Vvedite n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int fakt = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            fakt *= i;            
        }
        System.out.printf("Summa = ", sum);
        System.out.printf("Faktorial = ", fakt);
        num.close();
     }
}