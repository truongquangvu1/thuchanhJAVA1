package App54;

import java.util.Scanner;

public class Hinhtron  extends Hinhhoc {
    public float bankinh;

    public Hinhtron() {
        ten = "Hình Tròn"; 
    }
    
    public void nhapbankinh() {
        System.out.println("Bán kính = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
    }
    public void tichchuvi() {
        chuvi = 2 * PI* bankinh;
    }
    public void tinhdientich() {
        dientich = PI * bankinh * bankinh;
    }
}