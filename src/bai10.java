public class bai10 {
    private int soNguyenDuong;

    public bai10(int soNguyenDuong) {
        this.soNguyenDuong = soNguyenDuong;
    }

    public boolean kiemTraSoHoanHao() {
        int tongUoc = 0;

        // Tìm các ước số của số nguyên dương
        for (int i = 1; i <= soNguyenDuong / 2; i++) {
            if (soNguyenDuong % i == 0) {
                tongUoc += i;
            }
        }

        // Kiểm tra nếu tổng các ước số bằng số nguyên dương
        return tongUoc == soNguyenDuong;
    }
}
