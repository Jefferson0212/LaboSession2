/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.entidades;

/**
 *
 * @author Estudiante
 */
public class Enemigos {

    
    
    private int vidas;
    private int tipo;
    private int nivel;
    
    public Enemigos(int vidas, int tipo, int nivel) {
        this.vidas = vidas;
        this.tipo = tipo;
        this.nivel = nivel;
    }
    public Enemigos(){}

    /**
     * @return las vidas
     */
    
    
    
    public int getVidas() {
        return vidas;
    }

    /**
     * @param vidas las vidas del enemigo
     
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
    
    
    
    
}
