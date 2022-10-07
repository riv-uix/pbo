public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    String getJenisHP(){
        return jenis_hp;
    }
    long getTahunPembuatan(){
        return tahun_pembuatan;
    }
    public static void main(String[] args){
        Handphone hp = new Handphone();
        hp.setDataHP("nothingphone", 2040);
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}
