public class bai13 {
    private int soNhap;

    public bai13(int soNhap) {
        this.soNhap = soNhap;
    }

    public void inTichLuongThuaSoNguyenTo() {
        System.out.print("Tich luy thua so nguyen to cua " + soNhap + " la: ");

        // In ra cac thua so nguyen to
        for (int i = 2; i <= soNhap; i++) {
            while (soNhap % i == 0) {
                System.out.print(i + " ");
                soNhap /= i;
            }
        }
    }
}
