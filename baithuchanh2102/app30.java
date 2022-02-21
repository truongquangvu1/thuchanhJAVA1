public static void main (string[] args)
{
    int n, sodu, tong = 0;
    scanner scanner = new scanner (system.in);
    system.out.println("nhap vao so nguyen duong bat ki: ");
    n = scanner.nextint ();
    while (n > 0 )
    { 
        sodu = n % 10;
        n = n / 10;
        tong += sodu;
    }
    system.out.println("tong cac chu so = " + tong);
}