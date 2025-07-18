import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: StudentManager.addStudent(); break;
                case 2: StudentManager.listStudents(); break;
                case 3: StudentManager.updateStudent(); break;
                case 4: StudentManager.deleteStudent(); break;
                case 5: System.exit(0);
                default: System.out.println("❌ Invalid option");
            }
        }
    }
}
