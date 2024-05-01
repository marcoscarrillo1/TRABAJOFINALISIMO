package Recursos;

import Individuo.Individuo;

public  abstract class  Recursos {
     public int cordenadax;
    public int cordenaday;
    public int Tiempo;
    public int Probabilidad;
    public Individuo individuo;
    public String tipo;
    public Recursos(int x, int y,String tipos, int t,int p){
        x=cordenadax;
        y=cordenaday;
        tipos=tipo;
        t=Tiempo;
        p=Probabilidad;

    }

    public int getCordenadax() {
        return cordenadax;
    }

    public int getCordenaday() {
        return cordenaday;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCordenadax(int cordenadax) {
        this.cordenadax = cordenadax;
    }

    public void setCordenaday(int cordenaday) {
        this.cordenaday = cordenaday;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public int getProbabilidad() {
        return Probabilidad;
    }

    public void setTiempo(int tiempo) {
        Tiempo = tiempo;
    }

    public void setProbabilidad(int probabilidad) {
        Probabilidad = probabilidad;
    }
}
