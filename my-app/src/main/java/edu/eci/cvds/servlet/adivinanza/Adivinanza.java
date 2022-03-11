package edu.eci.cvds.servlet.adivinanza;

import java.util.ArrayList;
import java.util.Random;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.*;
import javax.annotation.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "guessBean")
@ApplicationScoped
@SessionScoped

public class Adivinanza {
    int Numadi=0;
    int intentos=0;
    int premio=0;
    String estado;

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

    public void guess(int intento){
        Numadi = (int) (Math.random() * 10);
        if (Numadi == intento){
            premio += 100;
            estado = "ganó 100 puntos";
        }
        else{
            premio += 0;
            estado = "no ganó";
        }
    }

    public void restart(){}
}
