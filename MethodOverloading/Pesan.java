public class Pesan {
    // Metode pertama: tanpa parameter
    public void kirimPesan() {
        System.out.println("Mengirim pesan default.");
    }

    // Metode kedua: satu parameter
    public void kirimPesan(String isi) {
        System.out.println("Mengirim pesan: " + isi);
    }

    // Metode ketiga: dua parameter
    public void kirimPesan(String penerima, String isi) {
        System.out.println("Mengirim pesan ke " + penerima + ": " + isi);
    }
}