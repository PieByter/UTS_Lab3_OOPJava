//a. Class dengan nama PokemonNo1
public class PokemonNo1 {
    /*
    a. Class dalam Java adalah sebuah blueprint atau rancangan yang digunakan untuk membuat sebuah objek.
    Class memuat definisi atribut (variabel) dan method (fungsi) yang akan dimiliki oleh objek yang dibuat berdasarkan class tersebut.
    b. Object dalam Java adalah sebuah instance atau wujud nyata dari sebuah class. Ketika class dibuat, objek-objek dapat dibuat berdasarkan definisi class tersebut.
    c. Constructor dalam Java adalah sebuah method yang digunakan untuk melakukan inisialisasi awal pada objek yang dibuat berdasarkan class.
    d. Method Overloading dalam Java adalah membuat beberapa method dengan nama yang sama di dalam sebuah class, namun dengan parameter yang berbeda.
    Hal ini memungkinkan pemanggilan method yang sama dengan argumen yang berbeda.
    e. Method Setter dan Getter dalam Java adalah method yang digunakan untuk mengubah (setter) dan mengambil (getter) nilai dari suatu atribut di dalam objek.
    Method setter dan getter biasanya digunakan untuk menjaga keamanan dan konsistensi data di dalam objek.
     */
    private String nama;
    private int level;
    private String tipe;

    //c. Constructor + Overloading
    public PokemonNo1(String nama, int level, String tipe) {
        this.nama = nama;
        this.level = level;
        this.tipe = tipe;
    }

    public PokemonNo1() {
        this("Bulbasaur", 5, "Rumput");
    }

    //d. Method Overloading
    public void serang() {
        System.out.println(nama + " menyerang!");
    }

    public void serang(String lawan) {
        System.out.println(nama + " menyerang " + lawan + "!");
    }

    public void serang(String lawan, String serangan) {
        System.out.println(nama + " menyerang " + lawan + " dengan " + serangan + "!");
    }

    public void bertahan() {
        System.out.println(nama + " bertahan!");
    }

    public void naikLevel(int naik) {
        level += naik;
        System.out.println(nama + " naik level menjadi " + level + "!");
    }

    //e. Method Setter & Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}


