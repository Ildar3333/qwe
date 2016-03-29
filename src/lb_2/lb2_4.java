package lb_2;

/**
 * Created by Ильдар on 26.03.2016.
 */

import java.io.*;

public class lb2_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два числа (через Enter):");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String m_str = in.readLine();
        String n_str = in.readLine();

        //Проверка на ввод чисел
        try {
            Integer.parseInt(m_str);
            Integer.parseInt(n_str);
        } catch (Exception e) {
            System.out.println("Ошибка, введены не числа");
            return;
        }

        int m = Integer.parseInt(m_str);
        int n = Integer.parseInt(n_str);

        System.out.println("Минимум двух чисел - " + Min(m, n));
    }

    public static int Min(int m, int n) {
        if (m < n) {
            return m;
        } else {
            return n;
        }
    }
}
