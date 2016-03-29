package lb_2;

/**
 * Created by Ильдар on 26.03.2016.
 */

import java.io.*;

public class lb2_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два числа m и n (через Enter):");

        //Необходимо в объект BufferedReader передать объект System.in для считывания, т.к. System.in считывает только
        //коды символов; следует учесть, что System.in и BufferedReader несовместимы,
        //поэтому используем InputStreamReader
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

        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(8);    //Печать линии без последней 8
            }
            System.out.println(8);  //Печать последней 8 и переход на новую строку
        }
    }
}
