/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_avrilromero;

import java.util.Random;

/**
 *
 * @author rodge
 */
public class Defensa extends Jugador {

    public Defensa() {
    }

    public Defensa(String nombre, int edad, String nacionalidad, String pie, Equipo equipo) {
        super(nombre, edad, nacionalidad, pie, equipo);
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

    @Override
    public Jugador ratings(Jugador x) {
        Random random = new Random();
        int rating1 = 0;
        int rand1 = random.nextInt(1, 12);
        int mult = rand1 * 12;
        while (mult < 70 || mult > 100) {
            rand1 = random.nextInt(1, 12);
            mult = rand1 * 12;
        }
        rating1 += mult;
        int rand2 = random.nextInt(1, 12);
        int mult2 = rand2 * 12;
        while (mult2 < 70 || mult2 > 100) {
            rand2 = random.nextInt(1, 12);
            mult2 = rand2 * 12;
        }
        rating1 += mult2;
        int rand3 = random.nextInt(1, 12);
        int mult3 = rand3 * 12;
        while (mult3 < 70 || mult3 > 100) {
            rand3 = random.nextInt(1, 12);
            mult3 = rand3 * 12;
        }
        rating1 += mult3;
        x.setFisico(mult);
        x.setRitmo(mult2);
        x.setEntrada(mult3);
        int rand4 = random.nextInt(1, 5);
        int mult4 = rand4 * 13;
        while (mult4 > 100) {
            rand4 = random.nextInt(1, 5);
            mult4 = rand4 * 13;
        }
        rating1 += mult4;
        int rand5 = random.nextInt(1, 5);
        int mult5 = rand5 * 13;
        while (mult5 > 100) {
            rand5 = random.nextInt(1, 5);
            mult5 = rand5 * 13;
        }
        rating1 += mult5;
        int rand6 = random.nextInt(1, 5);
        int mult6 = rand6 * 13;
        while (mult6 > 100) {
            rand6 = random.nextInt(1, 5);
            mult6 = rand6 * 13;
        }
        rating1 += mult6;
        int rand7 = random.nextInt(1, 5);
        int mult7 = rand7 * 13;
        while (mult7 > 100) {
            rand7 = random.nextInt(1, 5);
            mult7 = rand7 * 13;
        }
        rating1 += mult7;
        int rand8 = random.nextInt(1, 5);
        int mult8 = rand8 * 13;
        while (mult8 > 100) {
            rand8 = random.nextInt(1, 5);
            mult8 = rand8 * 13;
        }
        rating1 += mult8;
        int rand9 = random.nextInt(1, 5);
        int mult9 = rand9 * 13;
        while (mult9 > 100) {
            rand9 = random.nextInt(1, 5);
            mult9 = rand9 * 13;
        }
        rating1 += mult9;
        x.setAgarre(mult4);
        x.setLanzamiento(mult5);
        x.setPassing(mult6);
        x.setVision(mult7);
        x.setRegate(mult8);
        x.setDisparo(mult9);
        int rf = rating1 / 9;
        x.setRating(rf);
        return x;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
