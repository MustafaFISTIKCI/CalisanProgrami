public class Calisan {

    private String ad;
    private String soyad;
    private int id;

    public Calisan(String ad, String soyad, int id ) {
        this.soyad = soyad;
        this.id = id;
        this.ad = ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void bilgileriGoster(){
        System.out.println("Çalışan bilgileri");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("ID: " + id);





    }




























}
