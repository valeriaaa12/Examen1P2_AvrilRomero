/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_avrilromero;

/**
 *
 * @author rodge
 */
public class Estadio {

    private String nombre;
    private String Ciudad;
    private Equipo equipo;

    public Estadio() {
    }

    public Estadio(String nombre, String Ciudad, Equipo equipo) {
        this.nombre = nombre;
        this.Ciudad = Ciudad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Estadio:" + "\n" + "nombre: " + nombre + "\n" + "Ciudad:" + Ciudad + "\n" + "equipo: " + equipo;
    }

}
