package InterfaceAbstraction;

public class Mobil implements Bergerak {
    @Override
    public void maju() {
        System.out.println("Mobil berjalan maju.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}