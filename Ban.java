public class Ban extends Motor{
    protected int id_ban;
    protected String Nama_ban;
    protected String jenis_ban;
    protected String ukuran;
    protected String harga;

    public Ban (String kd_ban){
    }

    @Override
    public void Ban(){
        System.out.println("1. PIRELI , 400000");
        System.out.println("2. BRIDGESTONE, 500000");
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getId_ban() {
        return id_ban;
    }

    public void setId_ban(int id_ban) {
        this.id_ban = id_ban;
    }

    public String getNama_ban() {
        return Nama_ban;
    }

    public void setNama_ban(String nama_ban) {
        Nama_ban = nama_ban;
    }

    public String getJenis_ban() {
        return jenis_ban;
    }

    public void setJenis_ban(String jenis_ban) {
        this.jenis_ban = jenis_ban;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
}
