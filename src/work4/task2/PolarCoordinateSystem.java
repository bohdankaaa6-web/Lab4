package work4.task2;
// concrete srtategies
import java.util.function.Function;

/**
 * Клас PolarCoordinateSystem (CONCRETE STRATEGY).
 * Реалізує відображення функції у Полярній системі координат (радіус r залежить від кута φ).
 *
 * @author Журавель Богдана ІО-42
 */
public class PolarCoordinateSystem implements CoordinateSystem {
    @Override
    public void plot(Function<Double, Double> function, double start, double end) {
        // Бізнес-логіка замінена заглушкою згідно з вимогами
        String funcName = function.toString();

        System.out.println(" Відображення в Полярній системі (φ, r) ");
        System.out.println("Функція: " + funcName + " (де вхід - кут φ, вихід - радіус r)");
        System.out.println("Діапазон Кута (φ): [" + start + ", " + end + "]");

        // Імітація обчислень і виводу кількох точок
        for (double phi = start; phi <= end; phi += (end - start) / 5.0) {
            double r = function.apply(phi);
            System.out.printf("Обчислення: Кут (φ) = %.2f, Радіус (r) = %.2f\n", phi, r);
        }
        System.out.println("Графік функції успішно відображено у Полярній системі.");
    }
}