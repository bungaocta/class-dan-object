public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    // Bug 1 & 2: void bukan String, tambah this.
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;                        // Bug 2 fix
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Bug 3: tambah return
    public String getJenisHP() {
        return jenis_hp;
    }

    // Bug 4: return type int bukan String, tambah return
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
    HandPhone hp = new HandPhone();
    hp.setDataHP("Samsung", 2023);
    System.out.println("Jenis HP  : " + hp.getJenisHP());
    System.out.println("Tahun     : " + hp.getTahunPembuatan());
}
}