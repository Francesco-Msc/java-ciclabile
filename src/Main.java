public class Main {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        Elenco elenco = new Elenco(numeri);

        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.hasAncoraElementi());
        System.out.println(elenco.getElementoSuccessivo());
        System.out.println(elenco.hasAncoraElementi());
        System.out.println(elenco.getElementoSuccessivo());

        // while (elenco.hasAncoraElementi()) {
        //     System.out.println(elenco.getElementoSuccessivo());
        // }
    }
}
