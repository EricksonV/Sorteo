/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaPuntos;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class ClsLista {
    private ClsNodo primero;
    public ClsLista(){
        primero = null;
    }
    
    private int leerEntero(){
        System.out.println("Ingrese valor, -1 para finalizar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    public ClsLista crearLista(){
        int x;
        primero = null;
        do{
            x = leerEntero();
            if(x != -1){
                primero = new ClsNodo(x, primero);
            }
        }while(x!=-1);
        return this;
    }
}
