package work4.task1;
// клас-учасник
/**
 * Клас Developer (CONCRETE OBSERVER у шаблоні Observer).
 * Реагує лише на статус "виконано", щоб розпочати, наприклад, код-рев'ю.
 *
 * @author Журавель Богдана ІО-42
 */
public class Developer implements TaskObserver {
    @Override
    public void update(String taskName, String newStatus) {
        // Developer – реагує, коли завдання переходить у статус "виконано"
        if (newStatus.equalsIgnoreCase("виконано")) {
            System.out.println("[Developer]: Завдання '" + taskName + "' завершено! Починаю код-рев'ю.");
        } else {
            System.out.println("[Developer]: Статус завдання '" + taskName + "' змінено на: " + newStatus + ". Очікую.");
        }
    }
}