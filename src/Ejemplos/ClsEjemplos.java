/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author villa
 */
public class ClsEjemplos {
    public void ejemplo1(){
        String[] array = {"Zacarias","Maria","Abel","Betty","Fabrizio"};
        List<String> miLista = Arrays.asList(array);
        ImprimirTOdo(miLista);
        //System.out.println("Lista antes orden = "+miLista);
        Collections.sort(miLista);
        System.out.println("Lista Ordenada = "+miLista);
        int donde = Collections.binarySearch(miLista, "Abel");
        System.out.println("Abel se encuentra en el index = "+donde);
        Collections.shuffle(miLista);
        //System.out.println("Revuelto = "+miLista);
        ImprimirTOdo(miLista);
    }
    
    public void ImprimirTOdo(Collection c){
        Iterator iter = c.iterator();
        while(iter.hasNext()){
            System.out.println("Elemento = "+iter.next());
        }
    }
    
    public void pruebaArreglo(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("uno");
        lista.add("dos");
        Collections.shuffle(lista);
        String[] a = new String[20];
        lista.toArray(a);
    }
    
}//end class
