package Recursos;

public class Comida extends Recursos{
    public int probabilidadcomida;
    public Comida(int x, int y, String tipos, int t, int p) {
        super(x, y, tipos, t, p);
    }
    public void Propiedadcomida(){
        individuo.setvida(individuo.getvida+10);
    }

    public int getProbabilidadcomida() {
        return probabilidadcomida;
    }

    public void setProbabilidadcomida(int probabilidadcomida) {
        this.probabilidadcomida = probabilidadcomida;
    }
}
