package Baitap;

public class HocSinh {
   public String name;
    public String birthday;
    public String classs;
    public float diemlt,diemth;
    public HocSinh(){

    }
    public HocSinh(String name,String birthday, String classs, float diemlt, float diemth){
        this.name = name;
        this.birthday = birthday;
        this.classs = classs;
        this.diemlt = diemlt;
        this.diemth = diemth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public float getDiemlt() {
        return diemlt;
    }

    public void setDiemlt(float diemlt) {
        this.diemlt = diemlt;
    }

    public float getDiemth() {
        return diemth;
    }

    public void setDiemth(float diemth) {
        this.diemth = diemth;
    }
    public float diemtb (){
        return (diemlt+diemth)/2;
    }
    public String toString() {
        return name + " - " + " diem Tb : " + diemtb();
    }
}
