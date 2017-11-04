/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcv.calculadores_peso;

import pcv.Cidade;

/**
 *
 * @author Ken
 */
public class CalculadorPeso_Default extends CalculadorPeso {
    
    private int calculaDistancia(Cidade c1, Cidade c2){
        int xDistance = Math.abs(c1.getX() - c2.getX());
        int yDistance = Math.abs(c1.getY() - c2.getY());
        return (int) Math.sqrt((xDistance*xDistance) + (yDistance*yDistance));
    }
    
    private  int calculaEspera(Cidade c1){
        return 0;
    }
}
