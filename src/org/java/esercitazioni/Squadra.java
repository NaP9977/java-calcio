////Creare una classe Persona con gli attributi nome ed età.
////Estendere la classe Persona con una classe Giocatore e una classe Allenatore: ogni giocatore
//// ha un ruolo e ogni allenatore ha la sua strategia (es: difensiva o offensiva).
////Definire una classe Squadra che contiene una lista di oggetti di tipo Giocatore e un Allenatore.
////Creare infine una classe Main e definire al suo interno un array di nomi e un array con i
//// possibili ruoli per i giocatori.
////Nel metodo main, generare una Squadra formata da 11 giocatori creati in modo randomico:
////prelevare un nome casuale dall’array di nomi
////generare l’età in modo casuale
////prelevare un ruolo casuale dall’array di possibili ruoli
////BONUS: nella classe Persona, al posto dell’età, memorizzare la data di nascita


package org.java.esercitazioni;

import java.util.ArrayList;

public class Squadra {
    private ArrayList <Persona> squadra;
   private Allenatore allenatore;

    public Squadra(Allenatore allenatore) {
        this.squadra = new ArrayList<>();
        this.allenatore = allenatore;
    }

    public ArrayList <Persona> getSquadra() {
        return squadra;
    }
public void aggiungiMembri (Persona persona){
        squadra.add(persona);
}

    @Override
    public String toString() {
        return "Squadra: " +
                "squadra = " + squadra +
                ", allenatore =" + allenatore
                ;
    }
}
