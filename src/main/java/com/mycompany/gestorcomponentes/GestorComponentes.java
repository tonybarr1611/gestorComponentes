/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorcomponentes;

import com.mycompany.gestorcomponentes.Componentes.Zombies.ZombieAereo;

/**
 *
 * @author barra
 * @author ayme
 */
public class GestorComponentes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    ZombieAereo za = new ZombieAereo("Zombie Aereo", "Aereo", null, 100, 1, 1, 1, 1);
    writeObject(za);
}
