package work4.task1;
// клас-учасник
/**
 * Клас Client (CONCRETE OBSERVER у шаблоні Observer).
 * Отримує сповіщення лише про фінальні стани ("виконано" або "скасовано").
 *
 * @author Журавель Богдана ІО-42
 */
public class Client implements TaskObserver {
    @Override
    public void update(String taskName, String newStatus) {
        // Client – отримує сповіщення лише про фінальні стани
        if (newStatus.equalsIgnoreCase("виконано") || newStatus.equalsIgnoreCase("скасовано")) {
            System.out.println("[Client]: Завдання '" + taskName + "' перейшло у фінальний стан: " + newStatus + ". Дякую за роботу.");
        }
        // Ігноруємо проміжні статуси
    }
}