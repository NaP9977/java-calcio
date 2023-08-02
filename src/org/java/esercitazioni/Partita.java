//Parte 2
//Creare una classe Arbitro, che estende la classe Persona. Ogni arbitro ha un ruolo.
//Creare una classe Partita che contiene al suo interno una Squadra di casa, una Squadra ospite e un Arbitro.
//Implementa un metodo per iniziare la partita (che imposti lo stato della partita come "iniziata") e un metodo per segnare un goal:
// scegliere in modo casuale quale delle
// due squadre ha segnato e stampare la stringa “Ha segnato la squadra <nomeSquadra>”. A prescindere da quale squadra ha segnato,
// incrementare un contatore con il totale dei goal segnati.
//NB: non è possibile segnare un goal se la partita non è ancora iniziata! In questo caso il sistema deve restituire un messaggio d’errore.
//Nel metodo main, istanziare 2 oggetti di tipo Squadra e creare una Partita. Invocare il metodo per iniziare la partita,
// segnare qualche goal e concludere la partita.
//BONUS: nella classe Partita, memorizzare la lista dei giocatori che hanno fatto goal. Quando viene invocato
// il metodo goalSegnato(), estrarre in modo casuale un giocatore
// dalla squadra che ha segnato e
// inserirlo in un’apposita lista di marcatori, una per ogni squadra.


package org.java.esercitazioni;

import java.util.Random;

public class Partita {
    private int goal;
    Squadra squadraDiCasa;
    Squadra squadraOspite;

    Arbitro arbitro;

    public Partita(Squadra squadraDiCasa, Squadra squadraOspite) {
        this.goal = 0;
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.arbitro = arbitro;
    }

    public int getGoal() {
        return goal;
    }

    public Squadra getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public Squadra getSquadraOspite() {
        return squadraOspite;
    }

    public boolean statoPartita() {
        Random random = new Random();
        return random.nextBoolean();
    }

public String segnaSquadra() {
    Random random = new Random();
    int randomNumero = random.nextInt(1,2);
    if(randomNumero == 1)
        return "Ha segnato la squadra di casa";

    else if(randomNumero == 2) {
        return "Ha segnato la squadra ospite";
    }
    return "La partita è finita 0-0";
    }




  public void segnaGoal(){
    if(statoPartita())
        goal++;
     }

    @Override
    public String toString() {
        return "Partita:" +
                "goal =" + goal +
                " Squadra di Casa = " + squadraDiCasa +
                " Squadra ospite = " + squadraOspite + " " +statoPartita() +
                ", arbitro = " + arbitro + "Ha segnato:" + segnaSquadra();

    }
}
