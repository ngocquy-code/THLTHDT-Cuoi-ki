import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLyHoa implements IQuanLy<Hoa> {
    private List<Hoa> khoHoa = new ArrayList<>();
    @Override
    public void them(Hoa h) {
        khoHoa.add(h);
    }
    @Override
    public void xoa(String maHoa) {
        khoHoa.removeIf(h -> h.getMaHoa().equals(maHoa));
    }
    @Override
    public void hienThiDanhSach() {
        System.out.println("\n--- DANH SÁCH HOA ---");
        for (Hoa h : khoHoa) {
            System.out.println(h.toString());
        }
    }
    @Override
    public void ghiFile(String tenFile) {
        try {
            FileWriter fw = new FileWriter(tenFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Hoa h : khoHoa) {
                String line = h.getMaHoa() + ";" + h.getTenHoa() + ";" + h.getGiaBan() + ";" + h.toString();
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("Đã lưu file: " + tenFile);
        } catch (Exception e) {}
    }
    @Override
    public void docFile(String tenFile) {
    } 
    public Hoa timHoa(String maHoa) {
        for (Hoa h : khoHoa) {
            if (h.getMaHoa().equals(maHoa)) return h;
        }
        return null;
    }
}