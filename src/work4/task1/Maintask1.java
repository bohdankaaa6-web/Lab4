package work4.task1;
/**
 * Клас Maintask1 для демонстрації роботи шаблону Observer (Спостерігач)
 *
 * @author Журавель Богдана ІО-42
 */
public class Maintask1 {
    /**
     * Головний метод для демонстрації: створення завдань, підписників, реєстрація підписок та зміна станів.
     *
     * @param args Аргументи командного рядка.
     */
    public static void main(String[] args) {
        // 1. Створення завдань
        Task task1 = new Task("Зробити дизайн сайту", "нове");
        Task task2 = new Task("Написати Unit-тести", "нове");

        // 2. Створення підписників різних типів
        TaskObserver dev1 = new Developer();
        TaskObserver mgr1 = new Manager();
        TaskObserver client1 = new Client();
        TaskObserver dev2 = new Developer();

        // 3. Підписка користувачів на певні завдання
        task1.addObserver(dev1);
        task1.addObserver(mgr1);
        task1.addObserver(client1);

        // Підписник на інше завдання
        task2.addObserver(mgr1); // Менеджер відстежує обидва
        task2.addObserver(dev2);

        // 4. Зміна стану завдань та автоматичне надсилання сповіщень

        // Зміна 1: Проміжний статус. Client не реагує.
        task1.setStatus("в процесі");

        // Зміна 2: Проміжний статус для іншого завдання. Client не реагує.
        task2.setStatus("в процесі");

        // Зміна 3: Фінальний статус. Реагують усі, Developer реагує спеціально.
        task1.setStatus("виконано");

        // Зміна 4: Фінальний статус. Реагують усі, Client реагує на фінал.
        task2.setStatus("скасовано");
    }
}
