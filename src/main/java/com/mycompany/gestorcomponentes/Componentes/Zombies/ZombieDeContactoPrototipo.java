/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorcomponentes.Componentes.Zombies;

import com.mycompany.gestorcomponentes.Componentes.DeContactoPrototipo;

import java.util.ArrayList;

/**
 *
 * @author barra
 */
public class ZombieDeContactoPrototipo extends DeContactoPrototipo{
    
    public ZombieDeContactoPrototipo(String nombre, String tipoApariencia, ArrayList<String> sprites, int vida, int cantidadGolpes, int nivel, int campos, int nivelAparicion){
        super(nombre, tipoApariencia, sprites, vida, cantidadGolpes, nivel, campos, nivelAparicion);
    }
}
