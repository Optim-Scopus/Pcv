/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcv;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ken
 */
public class Tour {
    
    // Holds our tour of cities
    private ArrayList tour = new ArrayList<Cidade>();
    // Cache
    private double fitness = 0;
    private int peso = 0;
//    private PCVStrategy strat; 
    
    // Constructs a blank tour
    public Tour(){
        for (int i = 0; i < GerenciadorTour.qtdCidades(); i++) {
            tour.add(null);
        }
    }
    
    public Tour(ArrayList tour){
        this.tour = tour;
    }

    // Gets a cidade from the tour
    public Cidade getCidade(int tourPosition) {
        return (Cidade)tour.get(tourPosition);
    }

    // Sets a cidade in a certain position within a tour
    public void setCidade(int tourPosition, Cidade cidade) {
        tour.set(tourPosition, cidade);
        // If the tours been altered we need to reset the fitness and peso
        fitness = 0;
        peso = 0;
    }
    
    // Creates a random individual
    public void geraIndividuo() {
        tour = Pcv.strat.getGeradorIndividuo().geraIndividuo();
    }

    
    // Gets the tours fitness
    public double getFitness() {
        if (fitness == 0) {
            fitness = 1/(double)getPeso();
        }
        return fitness;
    }
    
    // Gets the total peso of the tour
    public int getPeso(){
        if (peso == 0) {
            peso = Pcv.strat.getCalculadorPeso().calculaPeso(tour);
        }
        return peso;
    }

    // Get number of cities on our tour
    public int tourSize() {
        return tour.size();
    }
    
    // Check if the tour contains a cidade
    public boolean containsCidade(Cidade cidade){
        return tour.contains(cidade);
    }
    
    @Override
    public String toString() {
        String geneString = "|";
        for (int i = 0; i < tourSize(); i++) {
            geneString += getCidade(i)+"|";
        }
        return geneString;
    }
}
