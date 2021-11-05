/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Alumno Presencial
 */
public class Contacto {
    
        
        int fila, columna;
        String modulo, profesor;

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
        
        
    public String[] arrayCosas() {
    String[] cosas= new String [4];
    cosas[0]=String.valueOf(fila);
    cosas[1]=String.valueOf(columna);
    cosas[2]=modulo;
    cosas[3]=profesor;
            return cosas;
    
    }
    
        
    
}
