public class Main {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        Elenco elenco = new Elenco(numeri);

        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }
    }
}
