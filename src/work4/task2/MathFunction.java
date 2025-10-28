package work4.task2;
// context
import java.util.function.Function;

/**
 * Клас MathFunction (CONTEXT у шаблоні Strategy).
 * Зберігає посилання на об'єкт CoordinateSystem (Strategy).
 * Делегує виконання операції відображення обраній стратегії, забезпечуючи слабку зв'язаність та гнучкість.
 *
 * @author Журавель Богдана
 */
public class MathFunction {

    /** Математична функція, яку потрібно відобразити (y = f(x)). */
    private Function<Double, Double> function;

    /** Поточна стратегія відображення (система координат). */
    private CoordinateSystem coordinateSystem;

    /**
     * Встановлює нову систему координат (нову Стратегію).
     *
     * @param coordinateSystem Об'єкт, що реалізує інтерфейс CoordinateSystem.
     */
    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
        System.out.println("\n Систему координат змінено на: " + coordinateSystem.getClass().getSimpleName() + " ");
    }

    /**
     * Встановлює нову математичну функцію.
     *
     * @param function Нова функція (Function<Double, Double>).
     */
    public void setFunction(Function<Double, Double> function) {
        this.function = function;
        System.out.println(" Математичну функцію встановлено: " + function.toString());
    }

    /**
     * Викликає відображення графіка. Операція делегується поточній стратегії.
     *
     * @param start Початкове значення діапазону.
     * @param end Кінцеве значення діапазону.
     */
    public void displayGraph(double start, double end) {
        if (function == null || coordinateSystem == null) {
            System.err.println("Помилка: Функція або система координат не встановлені.");
            return;
        }

        // Виклик методу стратегії (plot)
        coordinateSystem.plot(this.function, start, end);
    }
}
