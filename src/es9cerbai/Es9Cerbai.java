/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es9cerbai;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.GregorianCalendar;
/**
 *
 * @author cerba
 */
public class Es9Cerbai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Camera c1= new Camera(12, "singola", false);
        Camera c2= new Camera(24, "singola", true);
        Camera c3= new Camera(31, "matrimoniale", false);
        Camera c4= new Camera(47, "matrimoniale", true);
        Camera c5= new Camera(58, "doppia", false);
        Camera c6= new Camera(69, "doppia", true);
        
        ArrayList<Camera> camere= new ArrayList<>();
        camere.add(c1);
        camere.add(c2);
        camere.add(c3);
        camere.add(c4);
        camere.add(c5);
        camere.add(c6);
        
        GregorianCalendar data1= new GregorianCalendar(2020, 11, 23);
        GregorianCalendar data2= new GregorianCalendar(2020, 11, 27);
        Prenotazione p1= new Prenotazione(data1, data2, "Antonio", c1);
        
        GregorianCalendar data3= new GregorianCalendar(2020, 12, 2);
        GregorianCalendar data4= new GregorianCalendar(2020, 12, 4);
        Prenotazione p2= new Prenotazione(data3, data4, "Ruggero", c3);
        
        GregorianCalendar data5= new GregorianCalendar(2021, 1, 15);
        GregorianCalendar data6= new GregorianCalendar(2021, 1, 19);
        Prenotazione p3= new Prenotazione(data5, data6, "Jhonny", c5);
        
        ArrayList<Prenotazione> prenotazioni= new ArrayList<>();
        prenotazioni.add(p1);
        prenotazioni.add(p2);
        prenotazioni.add(p3);
        
        Albergo a1= new Albergo("CasaBella", camere, prenotazioni);
        
        if(a1.removePrenotazione(p3)){
            System.out.println("La prenotazione è stata rimossa");
        }else{
            System.out.println("La prenotazione non è stata rimossa");
        }
        
        if(a1.addCamera(c4)){
            System.out.println("La camera è stata aggiunta");
        }else{
            System.out.println("La camera non è stata aggiunta");
        }
        
        ArrayList<Camera> camereLibere= new ArrayList<>();
        camereLibere= a1.ricercaCamereLibere();
        
        if(camereLibere.isEmpty()){
            
            System.out.println("Non ci sono camere libere");
            
        }else{
            
            System.out.println("Le camere libere sono -");
            
            for(int i = 0; i < camereLibere.size(); i++){
                
               System.out.println(i+1 + ": la numero " + camereLibere.get(i).getNumero());
            
            }
        
        }
        
        ArrayList<Prenotazione> prenotazioniInGiorno= new ArrayList<>();
        prenotazioniInGiorno= a1.ricercaPrenotazioniGiorno(2020, 11, 23);
        
        if(prenotazioniInGiorno.isEmpty()){
            
            System.out.println("Non ci sono prenotazioni in questo giorno");
            
        }else{
            
            System.out.println("Le prenotazioni in questa giornata sono -");
            
            for(int i = 0; i < prenotazioniInGiorno.size(); i++){
                
                System.out.println(i+1 + ": la numero " + prenotazioniInGiorno.get(i).getCameraPrenotata().getNumero());
            
             }
            
        }
    }    

}
