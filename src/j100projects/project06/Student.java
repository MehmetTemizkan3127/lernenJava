package j100projects.project06;

public class Student {

    //Grup Üyesi 1: Student sınıfını oluşturun; id, isim, soyisim, email gibi özellikleri ekleyin.

    private String isim;
    private static int counter;
    private String soyisim;
    private String id;
    private String email;

    public Student() {
    }

    public Student(String isim, String soyisim, String id, String email) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.id = id;
        this.email = email;
        counter ++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "isim='" + getIsim() + '\'' +
                ", soyisim='" + getSoyisim() + '\'' +
                ", id='" + getId() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}