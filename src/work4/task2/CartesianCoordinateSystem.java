package work4.task2;
// concrete srtategies
import java.util.function.Function;

/**
 * Клас CartesianCoordinateSystem (CONCRETE STRATEGY).
 * Реалізує відображення функції у Декартовій (прямокутній) системі координат.
 *
 * @author Журавель Богдана ІО-42
 */
public class CartesianCoordinateSystem implements CoordinateSystem {
    @Override
    public void plot(Function<Double, Double> function, double start, double end) {
        // Бізнес-логіка замінена заглушкою згідно з вимогами
        String funcName = function.toString(); // Для красивого виводу

        System.out.println(" Відображення в Декартовій системі (X, Y) ");
        System.out.println("Функція: " + funcName);
        System.out.println("Діапазон X: [" + start + ", " + end + "]");

        // Імітація обчислень і виводу кількох точок
        for (double x = start; x <= end; x += (end - start) / 5.0) {
            double y = function.apply(x);
            System.out.printf("Обчислення: X = %.2f, Y = %.2f\n", x, y);
        }
        System.out.println("Графік функції успішно відображено у Декартовій системі.");
    }
}