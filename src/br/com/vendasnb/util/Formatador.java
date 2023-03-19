/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.util;

/**
 *
 * @author Nicolas
 */
public class Formatador {
    
    public Double converterVirgulaParaPonto(String pString){
        String retorno = "";
        int tamanhoString = pString.length();
        for(int i=0; i < tamanhoString; i++){
            if (pString.charAt(i)== ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
}
