import java.util.Scanner;

public class for_vonglap {

    public int tongn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập n: ");
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            n = n + i;
        }
        System.out.println("Tổng của n là " + n);
        return n;
    }

    public int ucln(int n, int m){
        int ucln = 1;
        int x = n < m ? n : m;
        for (int i = x; i > 0;i--){
            if(n % i == 0 && m % i == 0){
                ucln = i;
                System.out.println("ước của x,y: "+ ucln);
                break;
            }
        }
        return ucln;
    }

    public int bcln(int x, int y) {
        int bcnn = 1;
        int n = x * y;
        for (int i = 1; i < n ; i++) {
            if(x % i == 0 && y % i == 0){
                bcnn = i;
                System.out.println("ước của x,y: "+ bcnn);
                break;
            }
        }
        return bcnn;
    }

    public boolean snt(int a){
        if (a < 2) {
            return false;
        }else {
            int squareRoot = (int) Math.sqrt(a);
            for (int i = 2; i <= squareRoot; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public void tamgiac(){
        int height;
        int i;
        Scanner sc = new Scanner(System.in);;

        System.out.print("\n height = ");
        height = sc.nextInt();

        for(i = 1; i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                if(k == 1 || k == 2*i-1 || i == height) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }


    public void hcn(){
        int height, width;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("height = ");
        height = sc.nextInt();

        System.out.print("width = ");
        width = sc.nextInt();
        for(i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++) {
                if(i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }

        sc.close();
    }




    public static void main(String[] args) {
        for_vonglap tongn_1 = new for_vonglap();
        tongn_1.tongn();

        for_vonglap ucln = new for_vonglap();
        ucln.ucln(20, 30);

        for_vonglap bcnn = new for_vonglap();
        bcnn.bcln(50 , 60);

        for_vonglap snt = new for_vonglap();
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (snt.snt(i)) {
                System.out.print(i + " ");
            }
        }

        for_vonglap tamgiac = new for_vonglap();
        tamgiac.tamgiac();

        for_vonglap hcn = new for_vonglap();
        hcn.hcn();


        Scanner scanner = new Scanner(System.in);

        // Nhập vào số N
        //Bài 7
        System.out.print("Nhập vào một số nguyên N > 0: ");
        int N = scanner.nextInt();

        XuLySo xuLySo = new XuLySo(N);

        // In ra số lẻ nhỏ hơn N và tổng bình phương của chúng
        xuLySo.inSoLeVaTongBinhPhuong();

        // In ra số chẵn lớn hơn trung bình cộng của N số nguyên từ 1 tới N
        xuLySo.inSoChanLonHonTrungBinhCong();

        //Bài 8
        // Nhập giá trị n từ người dùng
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        // Kiểm tra nếu n không âm
        if (n < 0) {
            System.out.println("Vui long nhap mot so nguyen khong am.");
        } else {
            // Tạo đối tượng GiaiThuaCalculator
            bai8 calculator = new bai8();

            // Gọi phương thức tính giai thừa và in ra kết quả
            long ketQua = bai8.tinhGiaiThua(n);
            System.out.println("Giai thua cua " + n + " la " + ketQua);
        }

        //bài 9
        bai9 menu = new bai9();

        int luaChon;
        do {
            menu.hienThiMenu();

            // Nhập lựa chọn từ người dùng
            System.out.print("Nhap lua chon cua ban (1-6): ");
            luaChon = scanner.nextInt();

            // Xử lý lựa chọn
            menu.xuLyLuaChon(luaChon);

        } while (luaChon != 6);

        scanner.close();

        //bài 10
        // Nhập số nguyên dương từ người dùng
        System.out.print("Nhap mot so nguyen duong: ");
        int soNguyenDuong = scanner.nextInt();

        // Tạo đối tượng SoHoanHao
        bai10 soHoanHao = new bai10(soNguyenDuong);

        // Kiểm tra và in kết quả
        if (soHoanHao.kiemTraSoHoanHao()) {
            System.out.println(soNguyenDuong + " la so hoan hao.");
        } else {
            System.out.println(soNguyenDuong + " khong phai la so hoan hao.");
        }

        scanner.close();

        //bai11
        // Nhập giá trị n từ người dùng
        System.out.print("Nhap mot so nguyen duong n: ");
        int e = scanner.nextInt();

        // In ra cac so hoan hao tu 1 den n
        System.out.println("Cac so hoan hao tu 1 den " + n + " la:");
        for (int i = 1; i <= e; i++) {
            bai11 soHoanHao11 = new bai11(i);
            if (soHoanHao11.kiemTraSoHoanHao()) {
                System.out.print(i + " ");
            }
        }



        //bài 12
        // Nhập giới hạn n từ người dùng
        System.out.print("Nhap mot so nguyen duong n: ");
        int q = scanner.nextInt();

        // In ra dãy Fibonacci trong khoảng từ 1 đến n
        bai12 dayFibonacci = new bai12(q);
        dayFibonacci.inDayFibonacci();

        //bài 13
        System.out.print("Nhap mot so nguyen n: ");
        int v = scanner.nextInt();

        // In ra tích lũy thừa số nguyên tố của n
        bai13 tichLuongThuaSoNguyenTo = new bai13(v);
        tichLuongThuaSoNguyenTo.inTichLuongThuaSoNguyenTo();
    }
}
