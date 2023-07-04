/*
2) Вывести все простые числа от 1 до 1000

*/

public class HW-JAVA-1 {
   boolean SimpleNumber(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0 )
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        st = st.append("1");
        for (int i = 2; i < 1000; i++) {
            if (SimpleNumber(i))
                st = st.append(", ").append(i);
        }
    System.out.println("All simple numbers from 1 to 1000:", st);   
     
    }
}