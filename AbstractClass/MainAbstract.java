package AbstractClass;

public class MainAbstract {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan kapal = new Kapal();
        Kendaraan pesawat = new Pesawat();

        mobil.info();
        mobil.bergerak();
        kapal.bergerak();
        pesawat.bergerak();
    }
}