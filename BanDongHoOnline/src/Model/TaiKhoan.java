/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class TaiKhoan {
    private String MatKhau;
    private String LoaiTaiKhoan;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
    private String MaNV;
    public String getLoaiTaiKhoan() {
        return LoaiTaiKhoan;
    }

    public void setLoaiTaiKhoan(String LoaiTaiKhoan) {
        this.LoaiTaiKhoan = LoaiTaiKhoan;
    }
    



    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }





    public TaiKhoan( String MatKhau,String LoaiTaiKhoan,String ManV) {
        this.MatKhau = MatKhau;
        this.LoaiTaiKhoan = LoaiTaiKhoan;
        this.MaNV = ManV;
    }
    public TaiKhoan(){
        
    }
}
