public class MenuKasir{
    private int id;
    private String nama;
    private int harga;
    private int stok;

    public MenuKasir(int id, String nama, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int sisaStok (int banyak){
        if(stok<banyak) {
            System.out.println("ERROR: melebihi stok tersedia");
            System.exit(0);
        }
        else{
            stok=stok-banyak;
        }
        return stok;
    }

    public int tambahStok(int banyak){
        stok = stok+banyak;
        return stok;
    }

    public String toString(){
        return "[id="+id+", nama="+nama+", harga="+harga+", Sisa stok="+stok+"]";
    }

}
