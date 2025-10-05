public class MainOverLoading {
    public static void main(String[] args) {
        Pesan pesan = new Pesan();

        pesan.kirimPesan();
        pesan.kirimPesan("Selamat pagi!");
        pesan.kirimPesan("Irfan", "Jangan lupa tugasnya!");
    }
}