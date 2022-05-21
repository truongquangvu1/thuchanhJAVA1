import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("So phan tu can them: ");
        number = scanner.nextInt();
        for (int i = 0; i<number; i++) {
            System.out.println("nhap phan tu " + (i+1));
            number = scanner.nextInt();
            hashSetInteger.add(number);
        
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.println("Cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap can thu can them: ");
        number = scanner.nextInt();

        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        }else {
            System.out.println("Phan tu " + number + "da ton tai!");
        }
    }
}
}