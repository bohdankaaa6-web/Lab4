package work4.task2;
 // strategy
import java.util.function.Function;

/**
 * Інтерфейс CoordinateSystem (STRATEGY у шаблоні Strategy).
 * Визначає спільний інтерфейс для всіх алгоритмів (систем координат),
 * які можуть бути використані класом MathFunction.
 *
 * @author Журавель Богдана ІО-42
 */
public interface CoordinateSystem {

    /**
     * Відображає графік заданої математичної функції в конкретній системі координат.
     *
     * @param function Математична функція (наприклад, y = sin(x)).
     * @param start Початкове значення діапазону x (або кута).
     * @param end Кінцеве значення діапазону x (або кута).
     */
    void plot(Function<Double, Double> function, double start, double end);
}