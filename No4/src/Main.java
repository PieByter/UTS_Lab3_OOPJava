import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        System.out.println("Pilihan : ");
        System.out.println("1. Matematika (Perhitungan Luas Segitiga berdasarkan sudut)");
        System.out.println("2. Fisika (Perhitungan Mekanika Fluida)");
        System.out.println();

        System.out.print("Masukkan Pilihan : ");
        do {
            char pilihan = input.next().charAt(0);
            input.nextLine();
            if (pilihan == '1') {
                // membuat objek dengan constructor dari class Matematika (parent class) tanpa parameter
                Matematika matematika1 = new Matematika();
                matematika1.setSudut(150);
                matematika1.setTinggi(15);
                System.out.println("Luas segitiga : " + matematika1.hitungLuasSegitiga() + " cm");

                // membuat objek dengan constructor dari class Matematika (parent class) dengan parameter
                Matematika matematika2 = new Matematika(90, 21);
                double luasSegitiga2 = matematika2.hitungLuasSegitiga(16);
                System.out.println("Luas segitiga : " + luasSegitiga2 + " cm");

                isValid = true;
            }
            else if (pilihan == '2') {
                // membuat objek dengan constructor dari class Fisika (child class) tanpa parameter
                Fisika fisika1 = new Fisika();
                fisika1.setMassa(5); // mengubah nilai massa menjadi 5
                fisika1.setDiameter(2); // mengubah nilai diameter menjadi 2
                fisika1.setKecepatan(10); // mengubah nilai kecepatan menjadi 10
                fisika1.setViskositas(0.1); // mengubah nilai viskositas menjadi 0.1

                // menghitung kecepatan aliran fluida
                double kecepatanAliran = fisika1.hitungKecepatanAliran();
                System.out.println("Kecepatan aliran fluida: " + kecepatanAliran + " m/s");

                // menghitung bilangan Reynold
                double reynoldsNumber = fisika1.hitungReynoldsNumber();
                System.out.println("Bilangan Reynold: " + reynoldsNumber);

                // menghitung tekanan dinamis
                double tekananDinamis = fisika1.hitungTekananDinamis();
                System.out.println("Tekanan dinamis: " + tekananDinamis + " N/m²");

                // menghitung tekanan hidrostatis
                double tekananHidrostatis = fisika1.hitungTekananHidrostatis(30, 20, 10);
                System.out.println("Tekanan Hidrostatis " + tekananHidrostatis + " N/m²");
                System.out.println();

                // membuat objek dengan constructor enam parameter
                Fisika fisika2 = new Fisika(30, 20, 5, 2, 10, 0.1);

                // menghitung kecepatan aliran fluida
                double kecepatanAliran2 = fisika2.hitungKecepatanAliran();
                System.out.println("Kecepatan aliran fluida: " + kecepatanAliran2 + " m/s");

                // menghitung bilangan Reynold
                double reynoldsNumber2 = fisika2.hitungReynoldsNumber();
                System.out.println("Bilangan Reynold: " + reynoldsNumber2);

                // menghitung tekanan dinamis
                double tekananDinamis2 = fisika2.hitungTekananDinamis();
                System.out.println("Tekanan dinamis: " + tekananDinamis2 + " N/m²");

                // menghitung tekanan hidrostatis
                double tekananHidrostatis2 = fisika2.hitungTekananHidrostatis(10);
                System.out.println("Tekanan Hidrostatis " + tekananHidrostatis2 + " N/m²");

                isValid = true;
            } else {
                System.out.println("Pilihan tidak tersedia silahkan ulangi input...");
            }
        } while (!isValid);
    }
}
