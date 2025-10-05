package InterfaceAbstraction;

public class Sepeda implements Bergerak {
    @Override
    public void maju() {
        System.out.println("Sepeda dikayuh ke depan.");
    }

    @Override
    public void berhenti() {
        System.out.println("Sepeda berhenti.");
    }
}