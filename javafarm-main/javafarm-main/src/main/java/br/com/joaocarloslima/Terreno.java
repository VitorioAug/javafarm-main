package br.com.joaocarloslima;

public class Terreno {

    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata a){
        if (!estaOcupado()) this.batata = a;   
    }

    public void plantar(Cenoura b){
        if (!estaOcupado()) this.cenoura = b;   
    }

    public void plantar(Morango c){
        if (!estaOcupado()) this.morango = c;  
    }

   public void colher(Celeiro celeiro){
    if (batata != null && batata.podeColher()) {
        celeiro.armazenarBatata();
        this.batata = null; 
    } else if (cenoura != null && cenoura.podeColher()){
        celeiro.armazenarCenoura();
        this.cenoura = null; 
    } else if (morango != null && morango.podeColher()){
        celeiro.armazenarMorango();
        this.morango = null;
    }
}

    public Boolean estaOcupado(){
        return batata != null || cenoura != null || morango != null;   
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

     







    

    

    




}
