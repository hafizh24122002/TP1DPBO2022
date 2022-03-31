package tp1;

/**
 *
 * @author Hafizh
 */
public class Buku {
    private String penerbit;
    private String author;
    private String desc;

    public Buku(String penerbit, String author, String desc) {
        this.penerbit = penerbit;
        this.author = author;
        this.desc = desc;
    }

    public String getPenerbit() {
        return this.penerbit;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setJumlah_buku(String author) {
        this.author = author;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
