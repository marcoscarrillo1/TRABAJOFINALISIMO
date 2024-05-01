package Recursos;
import java.util.Random;
public class Biblioteca extends Recursos{
    public int probabilidadbiblio;
    public Biblioteca(int x, int y, String tipos, int t, int p) {
        super(x, y, tipos, t, p);
    }

    public int getProbabilidadbiblio() {
        return probabilidadbiblio;
    }

    public void setProbabilidadbiblio(int probabilidadbiblio) {
        this.probabilidadbiblio = probabilidadbiblio;
    }

    public void propiedadbiblioteca(){
         Random random=new Random();
         int x= random.nextInt(101);
        individuo.setporcentajeclonacion(individuo.getporcentajeclonacion*(1+x/100));
        individuo.setTipo(individuo.getTipo()+1);
        if(individuo.getTipo()>3){
            individuo.setTipo(3);
        }



    }
}
