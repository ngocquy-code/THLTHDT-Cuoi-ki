public class NhanVien {
    private String maNV;
    private String tenNV;
    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }
    public String getMaNV() { return maNV; }
    public String getTenNV() { return tenNV; }
    @Override
    public String toString() {
        return "NV: " + maNV + " - " + tenNV;
    }
}