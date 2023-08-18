/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_avrilromero;

import java.util.ArrayList;

/**
 *
 * @author rodge
 */
public class Equipo {

    private String nombre;
    private String pais;
    private int Rating;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo:" + "\n" + "nombre: " + nombre + "\n" + "pais: " + pais + "\n" + "Rating:" + Rating + "\n" + "Plantilla: " + jugadores;
    }

}
