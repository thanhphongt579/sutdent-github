package t1908mstudent;

import java.util.HashMap;
import java.util.Scanner;

public class MainThread {
    public static Scanner scanner = new Scanner(System.in);
    public static Student student;
    public static HashMap<String, Student> mapStudent = new HashMap<String, Student>();
    public static void main(String[] args) {
        while (true) {
            try{
                System.out.println("-------------------------------------------");
                System.out.println(" 1.Thêm sinh viên");
                System.out.println(" 2.Tìm kiếm thông tin theo mã sinh viên ");
                System.out.println(" 3.Thoát");
                System.out.println("--------------------------------------------");
                System.out.print("Choice = ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        createStudent();
                        break;
                    case 2:
                        searching();
                        break;
                    case 3:
                        System.out.println("Goodbye!!");
                        break;
                    default:
                        System.out.println("Please enter it again");
                        break;
                }
                if (choice == 3) {
                    break;
                }
            }catch (Exception e){
                System.out.println("Error!!");
                e.printStackTrace();
                break;
            }

        }
    }


    public static void createStudent(){
        System.out.println("Enter Information Student");
        System.out.println("-------------------------");
        System.out.print("Enter RollNumber : ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        Student student = new Student(rollNumber, name, phone);
        mapStudent.put(rollNumber, student);
        System.out.println("Save success!!");
    }

    public static void searching(){
        System.out.print("Tìm kiếm thông tin theo mã sinh viên: ");
        String searching = scanner.nextLine();
        student = mapStudent.get(searching);
        if (student == null) {

            System.out.println("Not fount!!");

        } else {
            System.out.println("Name: " + student.getName() + "\nPhone number: " + student.getPhone());
        }
    }
}
