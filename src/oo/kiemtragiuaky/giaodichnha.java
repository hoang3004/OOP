package oo.kiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

import javax.security.auth.PrivateCredentialPermission;

public class giaodichnha extends giaodichnhadat{
    Scanner nhap = new Scanner(System.in);
    private String loaiNha;
    
    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
public void nhapDS() throws ParseException {
    super.nhapDS();
    System.out.print("+ Nhập loai nha: ");
    loaiNha = nhap.nextLine();
}
@Override
public String toString() {
    return super.toString() + "\n+ loai nha: "+loaiNha;
}
}
