/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rexdou
 */
public class calculator {
    public static int getCheck(int a, int b, String card){
        int perfom;
        
        if(card=="Nvidia")
            perfom = (50*a+300*b)/1000;
        else
            perfom = 2*(50*a+300*b)/1000;
        return perfom;
        
    }
    
    public static int getTDP(int a, int b, String card){
        int perfom;
        
        if(card=="Nvidia")
            perfom = (70*a+20*b)/2000;
        else
            perfom =  (70*a+20*b)/1500;
        return perfom;
        
    }
    
     public static int getCriptPerHour(int a){
        int mining;
        mining = a/20;
        return mining;
        
    }
    
}
