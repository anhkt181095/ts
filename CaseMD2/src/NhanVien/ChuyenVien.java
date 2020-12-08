package NhanVien;

public class ChuyenVien extends People {
    private int overTime;
    private int troCap;
    public ChuyenVien(){
        super();
    }
    public ChuyenVien(int overTime){
        super();
        this.overTime = overTime;
    }
    public int getOverTime(){
        return overTime;
    }
    public void setOverTime(int overTime){
        this.overTime = overTime;
    }

    public int getTroCap() {
        return troCap;
    }

    public void setTroCap(int troCap) {
        this.troCap = troCap;
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhap số giờ làm thêm:");
        overTime = scanner.nextInt();
    }
    @Override
    public int tinhLuong(){
        this.luong = this.luongCoBan + this.troCap + this.overTime * 62000;
        return this.luong;
    }
}
