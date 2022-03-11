package edu.eci.cvds.servlet.adivinanza;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "guessBean")
@ApplicationScoped
@SessionScoped

public class Adivinanza {
    int Numadi=(int) (Math.random() * 10);
    int intentos;
    int premio=0;
    String estado;
    int numingr;

    public Adivinanza() {}

    public int getNumadi() {
        return Numadi;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getPremio() {
        return premio;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumingr() {
        return numingr;
    }

    public void setNumadi(int numadi) {
        Numadi = numadi;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumingr(int numingr) {
        this.numingr = numingr;
    }

    public void guess(){
        if (Numadi == numingr){
            premio += 100;
            estado = "ganó 100 puntos";
        }
        else{
            premio += 0;
            estado = "no ganó";
            intentos += 1;
        }
    }

    public void restart(){
        intentos=0;
        premio=0;
        estado="";
        numingr=0;
        Numadi = (int) (Math.random() * 10);
    }
}
