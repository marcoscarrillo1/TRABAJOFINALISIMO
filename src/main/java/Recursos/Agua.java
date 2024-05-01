package Recursos;

public class Agua extends Recursos {

    public  int probabilidadagua;

    public Agua(int x, int y, String tipos,int t,int p, int Pagua) {
        super(x, y, tipos,t,p);
        this.probabilidadagua=Pagua;

    }

    public int getProbabilidadagua() {
        return probabilidadagua;
    }

    public void setProbabilidadagua(int probabilidadagua) {
        this.probabilidadagua = probabilidadagua;
    }
    public void Propiedadagua(){
        this.individuo.setVida(individuo.getVida()+2);
    }
}
