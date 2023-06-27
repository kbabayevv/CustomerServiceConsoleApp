package service;


import model.Customer;

import java.util.Scanner;

import static config.CustomerConfig.customers;

public class CustomerService {
    public void createCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: \n1.Customer's fincode: \n2.Customer's name: \n3.Customer's surname: \n4.Customer's phone number ");
        String fincode = sc.nextLine();
        String name = sc.nextLine();
        String surname = sc.nextLine();
        String phone = sc.nextLine();

        Customer customer = new Customer();
        customer.setFinCode(fincode);
        customer.setName(name);
        customer.setSurName(surname);
        customer.setPhoneNumber(phone);
        customers.add(customer);
        System.out.println("Customers added successfully!");
        System.out.println();
    }

    public void getAllCustomer() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    public void deleteCustomerByFinCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer's fincode");
        String finCode = sc.nextLine();
        boolean b = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getFinCode().equals(finCode)) {
                customers.remove(i);
                System.out.println("Customer deleted successfully!");
                System.out.println();
                b = false;
                break;
            }
            b = true;
        }
        while (b) {
            System.out.println("This fincode doesn't match to any Customer");
            System.out.println();
            break;
        }

    }

    public void updateCustomerByFinCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer's fincode");
        String finCode = sc.nextLine();
        boolean b = false;
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getFinCode().equals(finCode)) {
                sc = new Scanner(System.in);
                System.out.println("Enter new name");
                String s = sc.nextLine();
                customers.get(i).setName(s);
                System.out.println("Customer updated successfully!");
                System.out.println();
                b = false;
                break;
            }
            b = true;
        }
        while (b) {
            System.out.println("This fincode doesn't match to any Customer");
            System.out.println();
            break;
        }

    }

    public void getCustomerNameByFinCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fincode");
        String finCode = sc.nextLine();
        try {
            Customer customer = fetchCustomerByFinCode(finCode);
            System.out.println(customer.getName());
        } catch (Exception e) {
            System.out.println("This fincode doesn't match to any Customer");
            System.out.println();
        }
    }

    public void getCustomerPhoneNumberByFinCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fincode");
        String finCode = sc.nextLine();
        try {
            Customer customer = fetchCustomerByFinCode(finCode);
            System.out.println(customer.getPhoneNumber());
        } catch (Exception e) {
            System.out.println("This fincode doesn't match to any Customer");
            System.out.println();
        }
    }

    private Customer fetchCustomerByFinCode(String finCode) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getFinCode().equals(finCode)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
