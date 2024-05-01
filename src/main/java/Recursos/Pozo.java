package Recursos;

public class Pozo extends Recursos{
    int probabilidadpozo;
    public Pozo(int x, int y, String tipos, int t, int p) {
        super(x, y, tipos, t, p);
    }
    public void propiedadpozo(){
        individuo.setvida(-1);
    }

    public int getProbabilidadpozo() {
        return probabilidadpozo;
    }

    public void setProbabilidadpozo(int probabilidadpozo) {
        this.probabilidadpozo = probabilidadpozo;
    }
}
