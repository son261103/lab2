public class XuLySo {
        private int N;

        public XuLySo(int N) {
            this.N = N;
        }

        public void inSoLeVaTongBinhPhuong() {
            System.out.print("Các số lẻ nhỏ hơn " + N + " là: ");
            int tongBinhPhuongLe = 0;

            for (int i = 1; i < N; i += 2) {
                System.out.print(i + " ");
                tongBinhPhuongLe += i * i;
            }

            System.out.println("\nTổng bình phương của các số lẻ trên là: " + tongBinhPhuongLe);
        }

        public void inSoChanLonHonTrungBinhCong() {
            double trungBinhCong = (N * (N + 1)) / (2.0 * N);
            System.out.println("Trung bình cộng của N số nguyên từ 1 tới " + N + " là: " + trungBinhCong);

            System.out.print("Các số chẵn lớn hơn trung bình cộng là: ");
            for (int i = 2; i <= N; i += 2) {
                if (i > trungBinhCong) {
                    System.out.print(i + " ");
                }
            }
        }
    }

