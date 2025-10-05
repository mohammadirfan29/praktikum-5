package InterfaceAbstraction;

public class MainInterface {
    public static void main(String[] args) {
        Bergerak m = new Mobil();
        Bergerak s = new Sepeda();

        m.maju();
        s.maju();
        s.berhenti();
    }
}