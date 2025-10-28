package work4.task1;
// клас-учасник
/**
 * Клас Manager (CONCRETE OBSERVER у шаблоні Observer).
 * Відстежує всі зміни для контролю прогресу.
 *
 * @author Журавель Богдана ІО-42
 */
public class Manager implements TaskObserver {
    @Override
    public void update(String taskName, String newStatus) {
        // Manager – відстежує всі зміни для контролю прогресу
        System.out.println("[Manager]: Оновлення статусу завдання '" + taskName + "'. Новий статус: " + newStatus + ". Оновлюю звіт.");
    }
}