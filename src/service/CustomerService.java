package service;

import model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerService {

    public static void printCustomer(List<Customer> customers){
        System.out.println("------------------------------");
        for (Customer customer : customers) {
            System.out.println(customer);
            if (customers.isEmpty()) {
                System.out.println("Sizda Hali mijozlar mavjud emas!");
            }
            for (Customer customer1 : customers) ;

        }
        System.out.println("-----------------------------");



    }
    public static Customer getCustomerid(List<Customer> customers, int id) {
        System.out.println("---------------------------------");
        if (customers.isEmpty()) {

            System.out.println("Sizda hali mijozlar mavjud emas");
            return null;

        }
        for (Customer customer : customers) {
            if (customer.getId() == id){
                System.out.println("Foydalanuchi topildi");
                return customer;

            }
        }
        System.out.println("Foydalanuvchi topilmadi");
        System.out.println("---------------------------------------");
        return null;
    }
    
    public  static void addDebt(List<Customer> customers, Scanner inNum) {
        System.out.println("Mijozni id sini kiriting: ");
        int id = inNum.nextInt();
        
        Customer customer = CustomerService.getCustomerid(customers, id);
        if (customer != null){
            System.out.println("Mijozni qarzdorligini kiriting:");
            double debt = customer.getDebt() + inNum.nextDouble();
            customer.setDebt(debt);
        }

        System.out.println("Muavafaqiyatli bajarildi!       ");
    }



    }



