package com.minhkhoa.testandroidt;

public class SinhVien {
    private String nameSV;
    private  int idSV;



    public SinhVien()
    {

    }

    public SinhVien(String nameSV, int idSV) {
        this.nameSV = nameSV;
        this.idSV = idSV;
    }

    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public int getIdSV() {
        return idSV;
    }

    public void setIdSV(int idSV) {
        this.idSV = idSV;
    }
}
