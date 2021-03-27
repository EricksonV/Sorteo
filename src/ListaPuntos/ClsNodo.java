/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaPuntos;

/**
 *
 * @author villa
 */
public class ClsNodo {
    int dato;
    ClsNodo enlace;
    
    public ClsNodo(int x){
        dato = x;
        enlace = null;
    }
    public ClsNodo(int x, ClsNodo n){
        dato = x;
        enlace = n;
    }
    
    public int getDato(){
        return dato;
    }
    public ClsNodo getEnlace(){
        return enlace;
    }
    public void setEnlace(ClsNodo enlace){
        this.enlace = enlace;
    }
}
