/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es9cerbai;

/**
 *
 * @author cerba
 */
public class Camera {
    
    private int numero;
    private String tipologia;
    private boolean occupata;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }

    public Camera() {
    
        numero=0;
        tipologia="";
        occupata= false;
    }

    public Camera(int numero, String tipologia, boolean occupata) {
        this.numero = numero;
        this.tipologia = tipologia;
        this.occupata = occupata;
    }
    
    public Camera(Camera c) {
        this.numero = c.numero;
        this.tipologia = c.tipologia;
        this.occupata = c.occupata;
    }
    
}
