package tp1;

/**
 *
 * @author Hafizh
 */
public class Author {
    private String nama;
    private int jumlah_buku;

    public Author(String nama, int jumlah_buku) {
            this.nama = nama;
            this.jumlah_buku = jumlah_buku;
    }


    public int getJumlah_buku() {
            return this.jumlah_buku;
    }

    public String getNama() {
            return this.nama;
    }


    public void setNama(String nama) {
            this.nama = nama;
    }

    public void setJumlah_buku(int jumlah_buku) {
            this.jumlah_buku = jumlah_buku;
    }
}