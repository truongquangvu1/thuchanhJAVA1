package Person;

public class Person {
    private int ID;
    private String name;

    System.out.println("nhập ID = ");
        Scanner scanner = new Scanner(System.in);
        ID = scanner.nextInt();
        System.out.println("nhập name = ");
        name = scanner.nextLine();
    }

    private void xuat() {
        System.out.println("ID là : " + ID);
        System.out.println("Tên là : " + name);
    }
    
}
