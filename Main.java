import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String id_montir;
        String nama_montir;
        Montir mntr = new Montir();
        Scanner Montir = new Scanner(System.in);
        System.out.println("=====Montir=====");
        System.out.println("Masukkan id montir = ");
        id_montir = Montir.nextLine();
        System.out.println("Masukkan Nama = ");
        nama_montir = Montir.nextLine();

        String id_customer;
        String nama_customer;
        String no_hp;
        Customer cs = new Customer();
        Scanner Customer = new Scanner(System.in);
        System.out.println("=====Customer====");
        System.out.println("Masukkan Nama Customer : ");
        nama_customer = Customer.nextLine();
        System.out.println("Masukkan id customer : ");
        id_customer = Customer.nextLine();
        System.out.println("Masukkan no hp : ");
        no_hp = Customer.nextLine();

        System.out.println("==========DATA MONTIR========");
        System.out.println("Nama Montir : " +nama_montir);
        System.out.println("id montir : "+id_montir);

        System.out.println("==========DATA CUSTOMER=======");
        System.out.println("Nama Customer : "+nama_customer);
        System.out.println("id Customer : "+id_customer);
        System.out.println("No hp : "+no_hp);





    }
}