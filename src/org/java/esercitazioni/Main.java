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

import java.util.Random;

public class Main {
    public static final String [] NomiCognomiGiocatori = { "Marco Rossi", "Alessio Bianchi", "Lorenzo Russo", "Simone Ferrara", "Andrea Martini",
            "Luca Rossetti", "Davide Fontana", "Giovanni Ricci", "Filippo Bellini", "Nicolas De Luca",
            "Emanuele Gallo", "Matteo Rossi", "Paolo Marini", "Riccardo Leone", "Tommaso Vitale",
            "Enrico Longo", "Lorenzo Gatti", "Mattia Barbieri", "Pietro Greco", "Luigi Fiore",
            "Dario Lombardi", "Andrea Mariani", "Fabio Serra", "Stefano Ruggiero", "Davide Palumbo",
            "Nicola Lombardi", "Michele Russo", "Alessio D'Amico", "Gianluca Santoro", "Nicolas Lombardi",
            "Fabrizio Marino", "Simone Barone", "Daniele Pellegrini", "Roberto Mariani", "Andrea Rizzi",
            "Matteo Moretti", "Davide Barbieri", "Stefano Bianchi", "Pietro Marchetti", "Nicolas Santoro",
            "Marco Monti", "Giovanni Martino", "Lorenzo Galli", "Alessandro Marchetti", "Luca Coppola",
            "Davide Palmieri", "Giacomo Leone", "Matteo Santoro", "Fabrizio Marino", "Gianluca Fontana",
            "Alessandro De Angelis", "Leonardo Sorrentino", "Davide Farina", "Federico Romano",
            "Simone Rinaldi", "Francesco Esposito", "Luca Vitale", "Domenico Ferrara", "Antonio Martini",
            "Mario Rossetti", "Angelo Coppola", "Carmine Bellini", "Vincenzo Ricci", "Salvatore Greco",
            "Giovanni Marchetti", "Francesco Barbieri", "Raffaele Lombardi", "Federico Bianchi",
            "Emanuele Pellegrini", "Alessio Marino", "Stefano De Rosa", "Lorenzo Santoro",
            "Gianluca De Luca", "Alberto Monti", "Gabriele Martino", "Roberto Galli", "Matteo Ferri",
            "Alessandro Mariani", "Antonio Vitale", "Nicola Romano", "Massimo Palmieri", "Daniele Ferrari",
            "Vincenzo Greco", "Salvatore Moretti", "Davide Santoro", "Riccardo Marini", "Leonardo Fiore",
            "Angelo Ruggiero", "Carmine Sorrentino", "Emanuele Farina", "Francesco Rinaldi",
            "Luigi Esposito", "Domenico Vitale", "Antonio De Angelis", "Mario Barbieri", "Giovanni Marchetti",
            "Francesco Russo", "Raffaele Martini", "Federico Coppola", "Emanuele Bellini", "Alessio Ricci"};


    public static final String[] RuoliGiocatori = {"portiere", "difensore", "attaccante", "centrocampista"};
    public static void main(String[] args) {
   Squadra squadra = new Squadra();
        Random random = new Random();
        for(int i=0; i < NomiCognomiGiocatori.length; i++){
            int etaRandom = random.nextInt(16, 39);
            int indiceRandom = random.nextInt(0, NomiCognomiGiocatori.length);
            int indiceRuoli = random.nextInt(0, RuoliGiocatori.length);
           Giocatore giocatore = new Giocatore(etaRandom, NomiCognomiGiocatori[indiceRandom], RuoliGiocatori[indiceRuoli]);
           squadra.aggiungiMembri(giocatore);
        }
System.out.println(squadra);





    }
}
