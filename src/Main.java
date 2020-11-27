import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program Kasir Rock n Roll
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        Customer customer = new Customer();
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        scanner = new Scanner(System.in);
        customer.setNama(scanner.nextLine());
        System.out.print("Customer Email : ");
        scanner = new Scanner(System.in);
        customer.setEmail(scanner.nextLine());
        customer.displayService();
        System.out.print("Choose (1/2/3) : ");
        customer.setPriceService(scanner.nextInt());
        System.out.print("Are you Member (yes/no) : ");
        customer.checkMemberStatus(scanner.nextLine());
        customer.currentTime();
    }
}
