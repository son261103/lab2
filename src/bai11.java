public class bai11 {
    private int soNguyenDuong;

    public bai11(int soNguyenDuong) {
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
