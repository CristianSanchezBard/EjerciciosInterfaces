/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import dto.Contacto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Presencial
 */
public class LogicaNegocio {
    
    private static List <Contacto> lista= new ArrayList<>();
    
    public static void anadirContacto (Contacto contacto){
        lista.add(contacto);
    }
    
    
}
