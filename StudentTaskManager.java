import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Comparator;

public class StudentTaskManager {
    static class Task {
        String name;
        int priority;

        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String toString() {
            return name + " - Priority: " + priority;
        }
    }

    public static void main(String[] args) {
        System.out.println("STUDENT TASK MANAGEMENT SYSTEM");
        System.out.println("\n--- STACK ---");
        Stack<String> stack = new Stack<String>();
        stack.push("Add Java task");
        stack.push("Update Math task");
        stack.push("Complete English task");
        System.out.println("Stack elements: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Search result: " + stack.search("Add Java task"));
        System.out.println("Is Stack empty? " + stack.empty());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("\n--- PRIORITY QUEUE ---");
        PriorityQueue<Task> pq = new PriorityQueue<Task>(
            Comparator.comparingInt(t -> t.priority)
        );

        Task java = new Task("Java Exam", 1);
        Task data = new Task("Data Structures", 2);
        Task math = new Task("Math Homework", 3);
        Task project = new Task("Software Project", 4);
        Task english = new Task("English Study", 5);
        Task programming = new Task("Programming Practice", 6);

        pq.add(java);
        pq.add(data);
        pq.add(math);
        pq.add(project);
        pq.add(english);
        pq.add(programming);

        System.out.println("Priority Queue elements: " + pq);
        System.out.println("Size of Priority Queue: " + pq.size());
        System.out.println("Top element (peek): " + pq.peek());
        System.out.println("Does pq contain Java? " + pq.contains(java));
        System.out.println("Remove English: " + pq.remove(english));
        System.out.println("Polled element: " + pq.poll());
        
        System.out.println("Remaining tasks in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        System.out.println("Is Priority Queue empty? " + pq.isEmpty());
        System.out.println("\nPROGRAM COMPLETED SUCCESSFULLY");
    }
}

