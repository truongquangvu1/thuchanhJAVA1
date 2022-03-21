import java.util.Scanner;
public class Ptb2 {
    double a, b, c, x1, x2;;
    Scanner scanner = new Scanner(System.in);
    void nhapPT2()
    {
        System.out.println("nhap he so thu nhat: ");
        a = scanner.nextInt();
        System.out.println("nhap he so thu hai: ");
        b = scanner.nextInt();
        System.out.println("nhap he so thu ba: ");
        c= scanner.nextInt();
    }
    void tinhPT2()
    {
        double delta = b*b - 4*a*c;
       
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
            }
        }
    
    void inPT2()
    {
        System.out.println("phuong trinh bac 2 co dang: "+a+"x2"+b+"x"+c);
        System.out.println("nghiem cua phuong trinh bac 2 la: "+x1+" va "+x2);
    }
}