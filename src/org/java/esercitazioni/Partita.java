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

public class Partita {
    private int goal;
    Squadra squadraDiCasa;
    Squadra squadraOspite;
    boolean iniziata;

    public Partita(Squadra squadraDiCasa, Squadra squadraOspite, boolean iniziata) {
        this.goal = goal;
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.iniziata = iniziata;
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

    public String statoPartita() {
        if (iniziata)
            return "Partita Iniziata";
        else {
            return "Errore, la partita non è ancora iniziata";
        }
    }



    public String segnaSquadraDiCasa(){
        segnaGoal();
        return "Ha segnato la " + squadraDiCasa;

    }

    public String segnaSquadraOspite(){
        segnaGoal();
        return "Ha segnato la " + squadraOspite;
    }
  public void segnaGoal(){
       if(iniziata)
        goal++;
     }

}
