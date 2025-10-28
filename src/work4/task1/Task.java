package work4.task1;
// клас-учасник
import java.util.ArrayList;
import java.util.List;

/**
 * Клас Task (SUBJECT/Observable у шаблоні Observer).
 * Центральний об'єкт, який керує своїм станом та списком підписників.
 * Сповіщає всіх зареєстрованих підписників (TaskObserver) при зміні свого статусу.
 *
 * @author Журавель Богдана ІО-42
 */
public class Task {
    private String name;
    private String status;
    private List<TaskObserver> observers = new ArrayList<>();

    /**
     * Конструктор для створення нового завдання.
     *
     * @param name Назва завдання.
     * @param initialStatus Початковий стан завдання (наприклад, "нове").
     */
    public Task(String name, String initialStatus) {
        this.name = name;
        this.status = initialStatus;
    }

    /**
     * Додає підписника до списку. Цей підписник буде отримувати сповіщення.
     *
     * @param observer Об'єкт, що реалізує інтерфейс TaskObserver.
     */
    public void addObserver(TaskObserver observer) {
        this.observers.add(observer);
        System.out.println(" Підписник " + observer.getClass().getSimpleName() + " зареєстрований на завдання '" + name + "'");
    }

    /**
     * Видаляє підписника зі списку. Він перестане отримувати сповіщення.
     *
     * @param observer Об'єкт, що реалізує інтерфейс TaskObserver.
     */
    public void removeObserver(TaskObserver observer) {
        this.observers.remove(observer);
        System.out.println(" Підписник " + observer.getClass().getSimpleName() + " видалений з завдання '" + name + "'");
    }

    /**
     * Змінює стан завдання. Після зміни автоматично викликає метод сповіщення.
     * Це головний тригер для шаблону Observer.
     *
     * @param newStatus Новий стан завдання (наприклад, "в процесі", "виконано").
     */
    public void setStatus(String newStatus) {
        System.out.println("\n Зміна статусу завдання '" + this.name + "': " + this.status + " -> " + newStatus + " ");
        this.status = newStatus;
        notifyObservers(); // Сповіщення підписників
    }

    /**
     * Сповіщає всіх зареєстрованих підписників, викликаючи їхній метод update().
     */
    private void notifyObservers() {
        System.out.println("Початок сповіщення " + observers.size() + " підписників...");
        for (TaskObserver observer : observers) {
            observer.update(this.name, this.status);
        }
    }
}