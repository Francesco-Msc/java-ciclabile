
public class Elenco {
    private int[] elementi;
    private int indice;

    public Elenco(int[] elementi) {
        this.elementi = elementi;
        this.indice = 0;
    }

    public int getElementoSuccessivo(){
        return elementi[indice++];
    }

    public boolean hasAncoraElementi(){
        return indice < elementi.length;
    }
}