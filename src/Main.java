import model.Customer;
import service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static Scanner inTxt = new Scanner(System.in);
    static Scanner inNum = new Scanner(System.in);
    static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("--------------------------Mijozlar Royhatlovchii Dasturga Xush Kelibsiz-------------------");
        System.out.println(
                "1.  Mijozlar ro'yxati\n" +
                        "2. Mijoz qo'shish\n" +
                        "3. Mijozni o'chirish\n" +
                        "4. Mijozni ishonchliligini tasdiqlash\n" +
                        "5. Mijozga qarzdorlik qo'shish\n" +
                        "6. Mijozdan qarzdorlik o'chirish\n" +
                        "7. Qarzdor mijozlarni topish\n" +
                        "8. Ishonchli mijozlarni topish\n" +
                        "9. Dasturdan chiqish\n" +
                        "------Kiritish-----> "
        );
        int choice = inNum.nextInt();
        switch (choice) {
            case 1 -> {
                CustomerService.printCustomer(customers);
            }
            case 2 -> {
                System.out.println("Yangi Mijozni toliq ismini kiriting: ");
                String fullName = inTxt.nextLine();
                System.out.println("Yangi mijozni raqamini kiriting +998 : ");
                String phoneNumber = inTxt.nextLine();
                System.out.println("Yangi mijozni raqamini kirirting");
                double debt = inNum.nextDouble();
                System.out.println("Bu mijoz ishonchlimi ? y/n :");
                boolean identified = false;
                char choiceCus = inTxt.next().charAt(0);
                if (choiceCus == 'y') {
                    identified = true;
                }
                Customer newCustomer = new Customer(fullName, identified, debt, phoneNumber);
                customers.add(newCustomer);
                System.out.println("Mijoz muvaffaqiyatli bazaga qoshildi !");
            }
            case 3 -> {
                CustomerService.printCustomer(customers);
                System.out.println("id sini kiriting");
                int ententeredid = inNum.nextInt();
                Customer foundCustomer = CustomerService.getCustomerid(customers,ententeredid);
                if (foundCustomer != null){
                    customers.remove(foundCustomer);
                    System.out.println("------- Foydalanuvchi ochirildii ------");
                }


            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {

            }
            case 7 -> {

            }
            case 8 -> {
            }
            default -> {
                System.out.println("Dastur oz ishini tugatdi");
                return;

            }
        }
    }
}

