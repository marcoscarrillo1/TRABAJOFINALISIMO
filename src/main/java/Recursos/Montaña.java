package Recursos;

public class Montaña  extends Recursos{
    public int probabilidadmontaña;
    public Montaña(int x, int y, String tipos, int t, int p) {
        super(x, y, tipos, t, p);
    }
    public void Propiedadmontaña(){
        individuo.setvida(individuo.getvida()-2);
    }

    public void setProbabilidadmontaña(int probabilidadmontaña) {
        this.probabilidadmontaña = probabilidadmontaña;
    }

    public int getProbabilidadmontaña() {
        return probabilidadmontaña;
    }
}
