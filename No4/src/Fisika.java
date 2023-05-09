public class Fisika extends Matematika {
    private double massa;
    private double diameter;
    private double kecepatan;
    private double viskositas;

    // Overloading & Overriding Constructor
    public Fisika() {
        super();
        this.massa = 0;
        this.diameter = 0;
        this.kecepatan = 0;
        this.viskositas = 0;
    }

    public Fisika(double massa, double diameter, double kecepatan, double viskositas) {
        super();
        this.massa = massa;
        this.diameter = diameter;
        this.kecepatan = kecepatan;
        this.viskositas = viskositas;
    }

    public Fisika(double sudut, double tinggi, double massa, double diameter, double kecepatan, double viskositas) {
        super(sudut, tinggi);
        this.massa = massa;
        this.diameter = diameter;
        this.kecepatan = kecepatan;
        this.viskositas = viskositas;
    }

    //Method Getter & Setter
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        if (massa < 0) {
            throw new IllegalArgumentException("Massa tidak boleh negatif!");
        }
        this.massa = massa;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter < 0) {
            throw new IllegalArgumentException("Diameter tidak boleh negatif!");
        }
        this.diameter = diameter;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        if (kecepatan < 0) {
            throw new IllegalArgumentException("Kecepatan tidak boleh negatif!");
        }
        this.kecepatan = kecepatan;
    }

    public double getViskositas() {
        return viskositas;
    }

    public void setViskositas(double viskositas) {
        if (viskositas < 0) {
            throw new IllegalArgumentException("Viskositas tidak boleh negatif!");
        }
        this.viskositas = viskositas;
    }

    //Method menghitung kecepatan aliran fluida
    public double hitungKecepatanAliran() {
        return (4 * kecepatan) / (3 * Math.PI);
    }

    //Method menghitung Reynolds' Number
    public double hitungReynoldsNumber() {
        return (diameter * hitungKecepatanAliran() * massa) / viskositas;
    }

    //Method menghitung tekanan dinamis
    public double hitungTekananDinamis() {
        return 0.5 * massa * Math.pow(hitungKecepatanAliran(), 2);
    }

    //Method Overloading menghitung tekanan hidrostatis
    public double hitungTekananHidrostatis(double sudut, double tinggi, double volume) {
        double radian = Math.toRadians(sudut);
        double tekanan = (massa / volume) * 9.81 * (tinggi / Math.cos(radian));
        return tekanan;
    }

    public double hitungTekananHidrostatis(double volume) {
        double radian = Math.toRadians(getSudut());
        double tekanan = (massa / volume) * 9.81 * (getTinggi() / Math.cos(radian));
        return tekanan;
    }
}
