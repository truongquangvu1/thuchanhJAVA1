import java.util.Scanner;
public class HinhChuNhat {
    int cd, cr;
    void nhapHCN()
    {
        System.out.println("nhap chieu dai HCN: ");
        Scanner scanner = new Scanner(System.in);
        cd = scanner.nextInt();
        System.out.println("nhap chieu rong HCN: ");
        cr = scanner.nextInt();
    }
    void dienTichHCN()
    {
        System.out.println("dien tich HCN: "+(cd*cr));
    }
    void chuViHCN()
    {
        System.out.println("chu vi HCN: "+((cd+cr)*2));
    }
}