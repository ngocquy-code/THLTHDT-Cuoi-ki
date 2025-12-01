public class Main {
    public static void main(String[] args) {
        QuanLyHoa qlHoa = new QuanLyHoa();
        NhanVien nv1 = new NhanVien("NV01", "Mai An Tiem");
        Hoa h1 = new Hoa("H1", "Hong Do", 10000, "Da Lat");
        Hoa h2 = new Hoa("H2", "Cuc Vang", 5000, "Ha Noi");
        qlHoa.them(h1);
        qlHoa.them(h2);
        qlHoa.hienThiDanhSach();
        System.out.println("\n--- TẠO ĐƠN HÀNG MỚI ---");
        DonHang dh = new DonHang("DH001", nv1);
        dh.themHoa(h1); 
        dh.themHoa(h2);
        System.out.println(dh.xuatHoaDon());
        qlHoa.ghiFile("dulieu_hoa.txt");
    }
}