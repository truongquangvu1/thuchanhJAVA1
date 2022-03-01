import java.util.Scanner;

public class App6 {
    public static boolean ktHoanThien(int n){
        int tongUoc = 0;
        for(int  i = 1; i < n; i++){
            if(n % i == 0){
                tongUoc += i;
            }
        }
        if(tongUoc == n)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap n (n > 0): ");
            n = input.nextInt();
        }while(n <= 0);

        System.out.println("Cac so hoan thien nho hon " + n + " la: ");
        for(int  i = 1; i < n; i++){
            if(ktHoanThien(i))
                System.out.print(i + " ");
        }
    }
}
