import java.util.Scanner;
public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    void set()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap cac thong tin: ");
        System.out.println("id: ");
        PersonID = scanner.nextLine();
        System.out.println("name: ");
        PersonName = scanner.nextLine();
        System.out.println("address: ");
        Address = scanner.nextLine();
        System.out.println("gender: ");
        Gender = scanner.nextBoolean();
        
    }

    void get()
    {
        System.out.println(PersonID);
        System.out.println(PersonName);
        System.out.println(Address);
        if (Gender == true)
        {
            System.out.println("nam");
        }
        else
        {
            System.out.println("nu");
        }
        
    }
}