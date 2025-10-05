package AbstractClass;

public abstract class Kendaraan {
    // Method abstrak: harus diimplementasikan oleh subclass
    public abstract void bergerak();

    // Method konkret: bisa langsung digunakan
    public void info() {
        System.out.println("Setiap kendaraan memiliki cara bergerak masing-masing.");
    }
}