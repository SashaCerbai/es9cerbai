/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es9cerbai;
import java.util.GregorianCalendar;
/**
 *
 * @author cerba
 */
public class Prenotazione {
    
    private GregorianCalendar dataInizio;
    private GregorianCalendar dataFine;
    private String nome;
    private Camera cameraPrenotata;

    public GregorianCalendar getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(GregorianCalendar dataInizio) {
        this.dataInizio = dataInizio;
    }

    public GregorianCalendar getDataFine() {
        return dataFine;
    }

    public void setDataFine(GregorianCalendar dataFine) {
        this.dataFine = dataFine;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Camera getCameraPrenotata() {
        return cameraPrenotata;
    }

    public void setCameraPrenotata(Camera cameraPrenotata) {
        this.cameraPrenotata = cameraPrenotata;
    }

    public Prenotazione(GregorianCalendar dataInizio, GregorianCalendar dataFine, String nome, Camera cameraPrenotata) {
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.nome = nome;
        this.cameraPrenotata = cameraPrenotata;
    }

    public Prenotazione() {
    
        nome ="";
        
    }
    
    public Prenotazione(Prenotazione p) {
        this.dataInizio = p.dataInizio;
        this.dataFine = p.dataFine;
        this.nome = p.nome;
        this.cameraPrenotata = p.cameraPrenotata;
    }
    
    
}
