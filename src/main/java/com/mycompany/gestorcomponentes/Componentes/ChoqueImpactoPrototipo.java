/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorcomponentes.Componentes;

import com.mycompany.gestorcomponentes.ComponentePrototipo;

import java.util.ArrayList;

/**
 *
 * @author barra
 */
public class ChoqueImpactoPrototipo extends ComponentePrototipo{
    private int rango;
    
    public ChoqueImpactoPrototipo(String nombre, String tipoApariencia, ArrayList<String> sprites, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, int rango){
        super(nombre, tipoApariencia, sprites, vida, cantidadGolpes, nivel, campos, nivelAparicion);
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        if(rango > 0){
            this.rango = rango;
        }
    }
}
