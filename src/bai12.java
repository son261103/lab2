public class bai12 {
    private int gioiHan;

    public bai12(int gioiHan) {
        this.gioiHan = gioiHan;
    }

    public void inDayFibonacci() {
        int a = 0, b = 1, c;

        System.out.println("Dãy Fibonacci trong khoảng từ 1 đến " + gioiHan + " là:");
        System.out.print(a + " " + b + " ");

        for (c = a + b; c <= gioiHan; c = a + b) {
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
