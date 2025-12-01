public class Hoa {
    private String maHoa;
    private String tenHoa;
    private double giaBan;
    private String xuatXu;
    public Hoa(String maHoa, String tenHoa, double giaBan, String xuatXu) {
        this.maHoa = maHoa;
        this.tenHoa = tenHoa;
        this.giaBan = giaBan;
        this.xuatXu = xuatXu;
    }
    public String getMaHoa() { return maHoa; }
    public String getTenHoa() { return tenHoa; }
    public double getGiaBan() { return giaBan; }
    @Override
    public String toString() {
        return maHoa + " - " + tenHoa + " - " + giaBan + " VNĐ - " + xuatXu;
    }
}