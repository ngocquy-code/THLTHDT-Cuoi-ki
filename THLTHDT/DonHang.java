import java.util.ArrayList;
import java.util.List;

public class DonHang {
    private String maDon;
    private NhanVien nguoiBan;
    private List<Hoa> dsHoa = new ArrayList<>();

    public DonHang(String maDon, NhanVien nguoiBan) {
        this.maDon = maDon;
        this.nguoiBan = nguoiBan;
    }
    public void themHoa(Hoa h) {
        dsHoa.add(h);
    }
    public double tinhTongTien() {
        double tong = 0;
        for (Hoa h : dsHoa) {
            tong += h.getGiaBan();
        }
        return tong;
    }
    public String getMaDon() { return maDon; }
    public String xuatHoaDon() {
        String s = "--- BILL " + maDon + " ---\n";
        s += "Người bán: " + nguoiBan.getTenNV() + "\n";
        s += "Chi tiết:\n";
        for (Hoa h : dsHoa) {
            s += "- " + h.getTenHoa() + ": " + h.getGiaBan() + "\n";
        }
        s += ">>> TỔNG: " + tinhTongTien() + "\n";
        return s;
    }
}