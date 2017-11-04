/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcv;

import pcv.calculadores_peso.CalculadorPeso;
import pcv.geradores_individuos.GeradorIndividuo;
import pcv.geradores_populacoes.GeradorPopulacao;
import pcv.mutadores.Mutador;

/**
 *
 * @author Ken
 */
public class PCVStrategy {
    
    private Mutador m;
    private CalculadorPeso cp;
    private GeradorIndividuo gi;
    private GeradorPopulacao gp;
    
    PCVStrategy(Mutador m, CalculadorPeso cp, GeradorIndividuo gi, GeradorPopulacao gp){
        this.m = m;
        this.cp = cp;
        this.gi = gi;
        this.gp = gp;
    }
    
    public Mutador getMutador(){
        return m;
    }
    
    public CalculadorPeso getCalculadorPeso(){
        return cp;
    }
    
    public GeradorIndividuo getGeradorIndividuo(){
        return gi;
    }
    
    public GeradorPopulacao getGeradorPopulacao(){
        return gp;
    }
    
}
