public class Matematika {
    private double sudut;
    private double tinggi;

    //Overloading Constructor
    public Matematika() {
        this(180, 30);
    }

    public Matematika(double sudut, double tinggi) {
        this.sudut = sudut;
        this.tinggi = tinggi;
    }

    //Method Setter & Getter
    public double getSudut() {
        return sudut;
    }

    public void setSudut(double sudut) {
        this.sudut = sudut; // Sudut boleh bernilai negatif dan positif
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        if (tinggi < 0) {
            throw new IllegalArgumentException("Tinggi tidak boleh negatif!");
        }
        this.tinggi = tinggi;
    }

    //Method Overloading menghitung luas segitiga menggunakan sudut dan tinggi
    public double hitungLuasSegitiga() {
        double radian = Math.toRadians(sudut);
        return 0.5 * tinggi * Math.sin(radian);
    }

    public double hitungLuasSegitiga(double sisiA) {
        double radian = Math.toRadians(sudut);
        return 0.5 * sisiA * tinggi * Math.sin(radian);
    }
}