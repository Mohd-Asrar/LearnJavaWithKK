package SwitchCase;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter EmpID");
        int empId = sc.nextInt();
        System.out.println("Enter Department");
        String department = sc.next();

        switch (empId){
            case 1:
                System.out.println("Asrar");
                break;
            case 2 :
                System.out.println("Shaikh");
                break;
            case 3 :
                System.out.println("Golu");
                switch (department){
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Managemnt Department");
                    default -> System.out.println("Invalid Department");
                }
                break;
            default:
                System.out.println("Invalid EmpId");

        }
    }
}
