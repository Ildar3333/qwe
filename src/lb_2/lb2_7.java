package lb_2;

import java.io.*;

/**
 * Created by Ильдар on 27.03.2016.
 */
public class lb2_7 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите координаты точки, не лежащей на осях OX OY (два числа через Enter):");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String x_str = in.readLine();
        String y_str = in.readLine();

        //Проверка на ввод чисел
        try {
            Integer.parseInt(x_str);
            Integer.parseInt(y_str);
        } catch (Exception e) {
            System.out.println("Ошибка, введены не числа");
            return;
        }

        int x = Integer.parseInt(x_str);
        int y = Integer.parseInt(y_str);

        if ((x == 0) || (y == 0)) {
            System.out.println("Ошибка: введен 0 либо неверное значение");
        } else {
            if (x > 0)
                if (y > 0)
                    System.out.println("1 четверть");
                else
                    System.out.println("4 четверь");
            else if (y > 0)
                System.out.println("2 четверть");
            else
                System.out.println("3 четверть");
        }
    }
}
