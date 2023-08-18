/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_avrilromero;

/**
 *
 * @author rodge
 */
public abstract class Jugador {

    protected String nombre;
    protected int edad;
    protected String nacionalidad;
    protected String pie;
    protected int rating;
    protected Equipo equipo;
    protected int Agarre;
    protected int Lanzamiento;
    protected int Fisico;
    protected int Ritmo;
    protected int Entrada;
    protected int Vision;
    protected int Passing;
    protected int Regate;
    protected int Disparo;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String nacionalidad, String pie, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pie = pie;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return Agarre;
    }

    public void setAgarre(int Agarre) {
        this.Agarre = Agarre;
    }

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(int Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getFisico() {
        return Fisico;
    }

    public void setFisico(int Fisico) {
        this.Fisico = Fisico;
    }

    public int getRitmo() {
        return Ritmo;
    }

    public void setRitmo(int Ritmo) {
        this.Ritmo = Ritmo;
    }

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getVision() {
        return Vision;
    }

    public void setVision(int Vision) {
        this.Vision = Vision;
    }

    public int getPassing() {
        return Passing;
    }

    public void setPassing(int Passing) {
        this.Passing = Passing;
    }

    public int getRegate() {
        return Regate;
    }

    public void setRegate(int Regate) {
        this.Regate = Regate;
    }

    public int getDisparo() {
        return Disparo;
    }

    public void setDisparo(int Disparo) {
        this.Disparo = Disparo;
    }
    public abstract Jugador ratings(Jugador x);

    @Override
    public String toString() {
        return "Jugador: " + "\n" + "nombre: " + nombre + "\n" + "edad: " + edad + "\n" + "nacionalidad: " + nacionalidad + "\n" + "pie:" + pie + "\n" + "rating: " + rating + "\n" + "equipo: " + equipo + "\n" + "Agarre: " + Agarre + "\n" + "Lanzamiento: " + Lanzamiento + "\n" + "Fisico: " + Fisico + "\n" + "Ritmo:" + Ritmo + "\n" + "Entrada: " + Entrada + "\n" + "Vision:" + Vision + "\n" + "Passing:" + Passing + "\n" + "Regate:" + Regate + "\n" + "Disparo:" + Disparo;
    }

}
