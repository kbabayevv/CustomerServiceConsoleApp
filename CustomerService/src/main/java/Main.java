import model.Customer;
import service.CustomerService;

import java.util.Scanner;

public class Main {
    static CustomerService customerService = new CustomerService();


    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Select menu" +
                    "\n1.Add new Customer" +
                    "\n2.Show all Customers" +
                    "\n3.Show Customer's name by fincode" +
                    "\n4.Show Customer's phone number by fincode" +
                    "\n5.Update Customer's name by fincode" +
                    "\n6.Delete Customer by fincode" +
                    "\n7.Exit system");
            int menu = sc.nextInt();

            if (menu == 1) {
                customerService.createCustomer();
            } else if (menu == 2) {
                customerService.getAllCustomer();
            } else if (menu == 3) {
                customerService.getCustomerNameByFinCode();
            } else if (menu == 4) {
                customerService.getCustomerPhoneNumberByFinCode();
            } else if (menu == 5) {
                customerService.updateCustomerByFinCode();
            } else if (menu == 6) {
                customerService.deleteCustomerByFinCode();
            } else if (menu == 7) {
                System.exit(0);
                break;
            }
        }
    }
}



