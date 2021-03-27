/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorteo;

import Dao.TbPersonasDao;
import Modelos.TbPersonas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class ClsSorteo {
    private List<String> llenarDatos(){
        TbPersonasDao a = new TbPersonasDao();
        //a.DevuelveValores();
        List<TbPersonas> lista =  a.DevuelveValores();
        ArrayList<String> devuelta = new ArrayList<String>();
        for(TbPersonas datos : lista){
            devuelta.add(datos.getNombre());
        }
        return devuelta;
    }
    public void Juega(){       
        Scanner sc = new Scanner(System.in);
        List<String> datosObt = llenarDatos();
        List<String> Ganadores = new ArrayList<String>();
        System.out.println("Elija la cantidad de Ganadores");
        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            Collections.shuffle(datosObt);
            System.out.println("El ganador no."+(i+1)+" es: "+datosObt.get(0));
            String gana = datosObt.get(0);
            Ganadores.add(gana);
            datosObt.remove(0);
        }
        MuestraLista(Ganadores, "Los ganadores son");
        MuestraLista(datosObt, "Los que no ganaron son");
        
    }
    public void MuestraLista(Collection c, String msg){
        Iterator iter = c.iterator();
        System.out.println();
        System.out.println(msg);
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
