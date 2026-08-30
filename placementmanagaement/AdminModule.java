import java.util.Scanner;

class Admin {
    int adminId;
    String adminName;
    String username;
    String password;

    Admin(int adminId, String adminName, String username, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.username = username;
        this.password = password;
    }

    boolean login(String enteredUsername, String enteredPassword) {
        return username.equals(enteredUsername)
                && password.equals(enteredPassword);
    }

    void displayAdmin() {
        System.out.println("\n----- Admin Details -----");
        System.out.println("Admin ID   : " + adminId);
        System.out.println("Admin Name : " + adminName);
        System.out.println("Username   : " + username);
    }
}

public class adminmodule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin(
                101,
                "Placement Admin",
                "jadx",
                "123"
        );

        System.out.println("=================================");
        System.out.println("   PLACEMENT MANAGEMENT SYSTEM");
        System.out.println("          ADMIN MODULE");
        System.out.println("=================================");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (admin.login(username, password)) {

            System.out.println("\nLogin Successful!");
            admin.displayAdmin();

            int choice;

            do {
                System.out.println("\n----- Admin Menu -----");
                System.out.println("1. Manage Students");
                System.out.println("2. Manage Companies");
                System.out.println("3. Manage Placements");
                System.out.println("4. Manage Certificates");
                System.out.println("5. View Reports");
                System.out.println("6. Logout");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Student Management Selected");
                        break;

                    case 2:
                        System.out.println("Company Management Selected");
                        break;

                    case 3:
                        System.out.println("Placement Management Selected");
                        break;

                    case 4:
                        System.out.println("Certificate Management Selected");
                        break;

                    case 5:
                        System.out.println("Reports Selected");
                        break;

                    case 6:
                        System.out.println("Admin Logged Out.");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 6);

        } else {
            System.out.println("\nInvalid Username or Password!");
        }

        sc.close();
    }
}