/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestores;

import entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author luchiblue
 */
public class GestorUsuario {
        
    private final ArrayList<Persona> listaPersonas;
    
    public GestorUsuario() {
        listaPersonas = new ArrayList<>();
    }
    
    public void addPersona(Persona p){
        if(listaPersonas != null)
        listaPersonas.add(p);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }
    
    public Persona getPersonaAtIndex(int index){
        if(listaPersonas != null)
            return listaPersonas.get(index);
        else return null;
    }
    
    public void setPersonaAtIndex(Persona p, int index){
        if(listaPersonas != null)
        listaPersonas.set(index, p);
    }

}
