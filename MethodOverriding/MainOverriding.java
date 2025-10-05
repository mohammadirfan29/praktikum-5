package MethodOverriding;

public class MainOverriding {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Kucing();
        Hewan hewan3 = new Anjing();

        hewan1.bersuara();
        hewan2.bersuara();
        hewan3.bersuara();
    }
}