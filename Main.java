public class Main {
    public static void main(String[] args) {
        // Create a Todo object
        Todo todo = new Todo();

        // Set properties
        todo.setDescription("Finish project proposal");
        todo.setDueDate("2024-04-30");
        todo.setCompleted(false);

        // Display Todo details
        System.out.println("Description: " + todo.getDescription());
        System.out.println("Due Date: " + todo.getDueDate());
        System.out.println("Completed: " + todo.isCompleted());
    }
}
