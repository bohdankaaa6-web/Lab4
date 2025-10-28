package work4.task2;

import java.util.function.Function;

/**
 * Клас Maintask2 для демонстрації роботи шаблону Strategy (Стратегія)
 *
 * @author Журавель Богдана ІО-42
 */
public class Maintask2 {

    /**
     * Головний метод для демонстрації: створення контексту, встановлення початкової стратегії, динамічна зміна стратегії.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {

        // 1. Створення об’єкта MathFunction (Context)
        MathFunction grapher = new MathFunction();

        // Функція для демонстрації: y = sin(x)
        // Використовуємо вбудований функціональний інтерфейс Java (Function)
        Function<Double, Double> sinFunction = Math::sin;

        // 2. Встановлення функції
        grapher.setFunction(sinFunction);

        //  Перша Стратегія: Декартова система

        // 3. Встановлення CartesianCoordinateSystem (Strategy)
        CoordinateSystem cartesian = new CartesianCoordinateSystem();
        grapher.setCoordinateSystem(cartesian);

        // 4. Відображення графіка в декартовій системі
        // Діапазон: [0, 2*PI]
        System.out.println("\n 1. Відображення у Декартовій системі ");
        grapher.displayGraph(0.0, 2 * Math.PI);

        //  Динамічна Зміна Стратегії: Полярна система

        // 5. Зміна стратегії на PolarCoordinateSystem
        CoordinateSystem polar = new PolarCoordinateSystem();
        grapher.setCoordinateSystem(polar);

        // 6. Повторне відображення (використовується вже нова стратегія)
        // Діапазон для полярних: [0, 4*PI]
        System.out.println("\n 2. Відображення у Полярній системі ");
        grapher.displayGraph(0.0, 4 * Math.PI);

        //  Демонстрація гнучкості: нова функція

        // Встановлення нової функції: y = cos(x)
        Function<Double, Double> cosFunction = Math::cos;
        grapher.setFunction(cosFunction);

        // 7. Повторне відображення зі старою стратегією (Polar)
        System.out.println("\n 3. Відображення нової функції у Полярній системі ");
        grapher.displayGraph(0.0, 4 * Math.PI);

        // 8. Повернення до Cartesian
        grapher.setCoordinateSystem(cartesian);
        System.out.println("\n 4. Відображення нової функції у Декартовій системі ");
        grapher.displayGraph(0.0, 2 * Math.PI);
    }
}