package Recursos;
import java.util.Random;

public class Tesoro extends Recursos{
    int probabilidadtesoro;
    public Tesoro(int x, int y, String tipos, int t, int p) {
        super(x, y, tipos, t, p);
    }
    public void propiedadTesoro(){
        Random random= new Random();
        int x= random.nextInt(101);
        individuo.setporcentareproduccion(individuo.getporcentajereproduccion*(1+x/100));
    }

    public int getProbabilidadtesoro() {
        return probabilidadtesoro;
    }

    public void setProbabilidadtesoro(int probabilidadtesoro) {
        this.probabilidadtesoro = probabilidadtesoro;
    }
}
