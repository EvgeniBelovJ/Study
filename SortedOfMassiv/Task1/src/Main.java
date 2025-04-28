import java.io.BufferedReader;
import java.io.InputStreamReader;
// Сортировка массива и выведение на консоль числа из середины

public class Main {
    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(reader);
        String[] mas = buff.readLine().split(" ");
        buff.close();
        int[] masInt = new int[mas.length];
        for (int i = 0; i < masInt.length; i++) {
            masInt[i] = Integer.parseInt(mas[i]);
        }
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < masInt.length - 1; i++) {
                if (masInt[i] > masInt[i + 1]) {
                    temp = masInt[i];
                    masInt[i] = masInt[i + 1];
                    masInt[i + 1] = temp;
                    sorted = false;
                }
            }
        }


            System.out.print(masInt[mas.length/2]);



    }
}


