/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorcomponentes.Componentes;

import com.mycompany.gestorcomponentes.Componente;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author barra
 */
public class ChoqueImpacto extends Componente implements Serializable {
    
    public ChoqueImpacto(String nombre, String tipoApariencia, ArrayList<String> sprites, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion){
        super(nombre, tipoApariencia, sprites, vida, cantidadGolpes, nivel, campos, nivelAparicion);
    }
}
