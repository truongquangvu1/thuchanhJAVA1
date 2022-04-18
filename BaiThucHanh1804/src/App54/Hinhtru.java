package App54;
import java.util.Scanner;

public class Hinhtru extends Hinhtron { 
    public float chieuCao;
    public Hinhtru() {
        ten = "Hình Trụ";
    }
    public void nhapChieuCao() {
        nhapbankinh();
        System.out.println("Chiều cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich() {
        tinhTheTich();
        thetich = dientich * chieuCao;
    }
}