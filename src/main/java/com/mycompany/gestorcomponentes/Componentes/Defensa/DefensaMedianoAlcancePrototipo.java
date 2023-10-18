/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorcomponentes.Componentes.Defensa;

import java.util.ArrayList;

import com.mycompany.gestorcomponentes.Componentes.MedianoAlcancePrototipo;

/**
 *
 * @author barra
 */
public class DefensaMedianoAlcancePrototipo extends MedianoAlcancePrototipo {
    
    public DefensaMedianoAlcancePrototipo(String nombre, String tipoApariencia, ArrayList<String> sprites, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion, int alcance){
        super(nombre, tipoApariencia, sprites, vida, cantidadGolpes, nivel, campos, nivelAparicion, alcance);
    }
}
