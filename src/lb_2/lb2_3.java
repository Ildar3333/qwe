package lb_2;

/**
 * Created by Ильдар on 26.03.2016.
 */
public class lb2_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            //На каждой строке добавляется по символу => вырисовывается треугольник
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }

            //Отдельно, т.к. переходим на новую строку - println()
            System.out.println(8);
        }
    }
}
