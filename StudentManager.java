import java.util.*;

public class StudentManager {
    private static List<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        students.add(new Student(id, name, email));
        System.out.println("✅ Student added!");
    }

    public static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("📭 No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        String id = sc.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("New name (blank to skip): ");
                String name = sc.nextLine();
                if (!name.isEmpty()) s.setName(name);

                System.out.print("New email (blank to skip): ");
                String email = sc.nextLine();
                if (!email.isEmpty()) s.setEmail(email);

                System.out.println("✅ Student updated.");
                return;
            }
        }
        System.out.println("❌ Student not found.");
    }

    public static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = sc.nextLine();
        boolean removed = students.removeIf(s -> s.getId().equals(id));
        if (removed) System.out.println("✅ Student deleted.");
        else System.out.println("❌ Student not found.");
    }
}
