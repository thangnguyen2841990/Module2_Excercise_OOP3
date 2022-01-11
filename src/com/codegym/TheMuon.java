package com.codegym;

public class TheMuon extends SinhVien{
    private int number;
    private String toDate;
    private String formDate;
    private String idOfBook;

    public TheMuon() {
    }

    public TheMuon(int number, String toDate, String formDate, String idOfBook) {
        this.number = number;
        this.toDate = toDate;
        this.formDate = formDate;
        this.idOfBook = idOfBook;
    }

    public TheMuon(String name, String mssv, String birthDay, String className, int number, String toDate, String formDate, String idOfBook) {
        super(name, mssv, birthDay, className);
        this.number = number;
        this.toDate = toDate;
        this.formDate = formDate;
        this.idOfBook = idOfBook;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getIdOfBook() {
        return idOfBook;
    }

    public void setIdOfBook(String idOfBook) {
        this.idOfBook = idOfBook;
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên: "+ super.toString()+"\n"+
                "Số phiếu: "+ getNumber()+", Ngày mượn: "+getToDate()+", Hạn trả: "+getFormDate()+", Số hiệu sách: "+
                getIdOfBook();
    }
}
