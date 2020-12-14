/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es9cerbai;
import com.sun.istack.internal.FinalArrayList;
import java.util.ArrayList;
/**
 *
 * @author cerba
 */
public class Albergo {
    
    private String nome;
    private ArrayList <Camera> camere;
    private ArrayList <Prenotazione> prenotazioni;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }

    public void setCamere(ArrayList<Camera> camere) {
        this.camere = camere;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public Albergo(String nome, ArrayList<Camera> camere, ArrayList<Prenotazione> prenotazioni ) {
        this.nome = nome;
        this.camere= camere;
        this.prenotazioni= prenotazioni;
        
    }
    
    public Albergo() {
        nome = "";
        camere= new ArrayList<>();
        prenotazioni= new ArrayList<>();
        
    }
    
    public Albergo(Albergo a) {
        this.nome = a.nome;
        this.camere= (ArrayList)camere.clone();
        this.prenotazioni= (ArrayList)prenotazioni.clone();
        
    }
    
    public boolean addPrenotazione(Prenotazione p){
        
        if(prenotazioni.add(p)){
            return true;
        }
        
        return false;
    }
    
    public boolean removePrenotazione(Prenotazione p){
        
        if(prenotazioni.remove(p)){
            return true;
        }
        
        return false;
    }
    
    public boolean addCamera(Camera c){
        
        if(camere.add(c)){
            return true;
        }
        
        return false;
    }
    
    public boolean removeCamera(Camera c){
        
        if(camere.remove(c)){
            return true;
        }
        
        return false;
    }
    
    public ArrayList<Prenotazione> ricercaPrenotazioniGiorno(int anno, int mese, int giorno){
        
        ArrayList<Prenotazione> p= new ArrayList<>();
        
        for(int i=0; i<prenotazioni.size(); i++){
            
           if(prenotazioni.get(i).getDataInizio().get(5)== giorno && prenotazioni.get(i).getDataInizio().get(2)== mese && prenotazioni.get(i).getDataInizio().get(1) == anno){
               
               p.add(prenotazioni.get(i));
               
           }
            
        }
        return p;
    }
    
    public ArrayList<Camera> ricercaCamereLibere(){
        
        ArrayList<Camera> p= new ArrayList<>();
        
        for(int i=0; i<camere.size(); i++){
            
           if(!camere.get(i).isOccupata()){
               
              p.add(camere.get(i)); 
               
           }
            
        }
        return p;
    }
}
    

