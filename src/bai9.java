public class bai9 {
    public void hienThiMenu() {
        System.out.println("Cuoi tuan ban muon lam gi?");
        System.out.println("1. Di hoc Java");
        System.out.println("2. Di choi Cong vien ngam gau");
        System.out.println("3. Di (ve) nha nghi");
        System.out.println("4. Ra song Hong tam tien");
        System.out.println("5. Ngu ca ngay");
        System.out.println("6. Thoat");
    }

    public void xuLyLuaChon(int luaChon) {
        switch (luaChon) {
            case 1:
                System.out.println("Ban da chon di hoc Java. Chuc ban hoc tot!");
                break;
            case 2:
                System.out.println("Ban da chon di choi Cong vien ngam gau. Vui ve nhe!");
                break;
            case 3:
                System.out.println("Ban da chon di (ve) nha nghi. Chuc ban co mot cuoi tuan thu vi!");
                break;
            case 4:
                System.out.println("Ban da chon ra song Hong tam tien. Hay thuong thuc!");
                break;
            case 5:
                System.out.println("Ban da chon ngu ca ngay. Chuc ban co giac ngu ngon!");
                break;
            case 6:
                System.out.println("Cam on ban da su dung chuong trinh. Hen gap lai!");
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long chon lai.");
        }
    }
}
