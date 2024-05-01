package Individuo;

import java.util.Random;

public class Individuo extends Parmetrosdatamodel {
    public int tipo;
    super Individuo(int vida, int clonacion, int hijo, int reproduccion){

    }
    public void setTipo(int t){
        this.tipo=t;
    }
    public int getTipo(){
        return tipo;
    } public boolean reproduccion(){
        Random random =new Random();
        int probabilidad= random.nextInt(101);
        if(probabilidad<=getporcentajereproduccion){
            return true;
        }else {
            return false;
        }
    }
    public boolean clonacion(){
        Random random =new Random();
        int probabilidad= random.nextInt(101);
        if(probabilidad<=getporcentajeclonacion()){
            return true;
        }else {
            return false;
        }
    }



}
