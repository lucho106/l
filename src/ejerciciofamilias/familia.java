/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofamilias;

/**
 *
 * @author Estudiante
 */
public class familia {
    private String apellido;
    private persona madre;
    private persona padre;
    private persona[]hijos; 
    
    public familia(String apellido)
    {
        this.apellido=apellido;
        this.hijos = new persona[2];
    }
public persona[] listarMiembros()
{
    return null;
}
public persona buscarMiembro(String nombre){
    return null;
}
    
    
    
    
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public persona getMadre() {
        return madre;
    }

    public void setMadre(persona madre) {
        this.madre = madre;
    }

    public persona getPadre() {
        return padre;
    }

    public void setPadre(persona padre) {
        this.padre = padre;
    }

    public persona[] getHijos() {
        return hijos;
    }

    public void setHijos(persona[] hijos) {
        this.hijos = hijos;
    }

    
    
}
