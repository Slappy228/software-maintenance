import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Enterprise enterprise = new Enterprise();

        FillingWithData(enterprise); //Заповнення класів даними

        while (true) {
            System.out.println("Меню :");
            System.out.println("1. Переглянути інформацію про співробітників відділу");
            System.out.println("2. Додати нового співробітника");
            System.out.println("3. Вийти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Перегляд інформації про співробітників
                    System.out.println("Введіть назву відділу:");
                    String departmentName = scanner.nextLine();
                    Department department = enterprise.findDepartmentByName(departmentName);

                    if (department != null) {
                        List<Employee> employees = department.getEmployees();
                        for (Employee employee : employees) {
                            System.out.println("Ім'я: " + employee.getName());
                            System.out.println("Посада: " + employee.getPosition());
                            System.out.println("Попередні посади: " + employee.getPreviousPositions());
                            System.out.println("Картка доступу: " + employee.getAccessCard().getCardNumber());
                            System.out.print("Приміщення: ");
                            List<Room> assignedRooms = employee.getAssignedRooms();
                            for (int i = 0; i < assignedRooms.size(); i++) {
                                System.out.print(assignedRooms.get(i).getRoomNumber());
                                if (i < assignedRooms.size() - 1) {
                                    System.out.print(", ");
                                }
                        }

                            System.out.println("\n---------------");
                        }
                    } else {
                        System.out.println("Відділ не знайдено.");
                    }
                    break;

                case 2:
                    // Додавання нового співробітника
                    System.out.println("Введіть назву відділу:");
                    departmentName = scanner.nextLine();
                    department = enterprise.findDepartmentByName(departmentName);

                    if (department != null) {
                        System.out.println("Введіть ім'я співробітника:");
                        String employeeName = scanner.nextLine();
                        System.out.println("Введіть посаду співробітника:");
                        String employeePosition = scanner.nextLine();
                        System.out.println("Введіть номер картки доступу:");
                        int cardNumber = scanner.nextInt();
                        scanner.nextLine(); // Очистка буфера
                        System.out.println("Введіть дату видачі карти (рік-місяць-день):");
                        String issueDateStr = scanner.nextLine();
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                        try {
                            // Конвертуємо рядок у об'єкт Date
                            Date issueDate = dateFormat.parse(issueDateStr);
                            DateFormat df = new SimpleDateFormat("dd MMM yyyy");
                            System.out.println("Отримана дата: " + df.format(issueDate));
                        } catch (ParseException e) {
                            System.out.println("Помилка при конвертації дати. Перевірте формат введеної дати.");
                            e.printStackTrace();
                        }

                        AccessCard accessCard = new AccessCard(cardNumber, new Date());
                        Employee newEmployee = new Employee(employeeName, employeePosition, accessCard);

                        System.out.println("Чи є у співробітника попередні посади? (Так/Ні)");
                        String hasPreviousPositions = scanner.nextLine();

                        if (hasPreviousPositions.equalsIgnoreCase("Так")) {
                            System.out.println("Введіть список попередніх посад (через кому):");
                            String[] previousPositions = scanner.nextLine().split(",");
                            for (String position : previousPositions) {
                                newEmployee.addPreviousPosition(position.trim());
                            }
                        }
                        System.out.println("Чи прив'язаний співробітник до приміщень? (Так/Ні)");
                        String hasAssignedRooms = scanner.nextLine();

                        if (hasAssignedRooms.equalsIgnoreCase("Так")) {
                            System.out.println("Введіть номера приміщень, до яких прив'язаний співробітник (через кому):");
                            String[] roomNumbers = scanner.nextLine().split(",");
                            for (String roomNumber : roomNumbers) {
                                Room room = new Room(Integer.parseInt(roomNumber.trim()));
                                newEmployee.assignRoom(room);
                            }
                        }
                        department.addEmployee(newEmployee);
                        System.out.println("Співробітник доданий до відділу.");
                    } else {
                        System.out.println("Відділ не знайдено.");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
                    break;
            }
        }
    }

    private static void FillingWithData(Enterprise enterprise) {
        Department hrDepartment = new Department("Відділ кадрів");
        Department itDepartment = new Department("Відділ ІТ");

        enterprise.addDepartment(hrDepartment);
        enterprise.addDepartment(itDepartment);

        // Додаємо приміщення
        Room meetingRoom = new Room(101);
        Room officeRoom = new Room(102);

        // Додаємо співробітників з приміщеннями та попередніми посадами
        AccessCard accessCard1 = new AccessCard(123, new Date());
        Employee hrManager = new Employee("Іван Іванов", "Менеджер з кадрів", accessCard1);
        hrManager.addPreviousPosition("Спеціаліст з кадрів");
        hrManager.assignRoom(officeRoom);
        hrDepartment.addEmployee(hrManager);

        AccessCard accessCard2 = new AccessCard(456, new Date());
        Employee itSpecialist = new Employee("Петро Петров", "ІТ-спеціаліст", accessCard2);
        itSpecialist.addPreviousPosition("Системний адміністратор");
        itSpecialist.assignRoom(meetingRoom);
        itDepartment.addEmployee(itSpecialist);
    }
}
