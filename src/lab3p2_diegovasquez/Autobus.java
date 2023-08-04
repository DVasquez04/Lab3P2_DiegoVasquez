/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_diegovasquez;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Diego Vasquez
 */
public class Autobus extends Vehiculo{
    private int CapPasajeros;
    private int NumEjes;
    private double Longitud;

    public Autobus() {
    }

    public Autobus(int CapPasajeros, int NumEjes, double Longitud, String Placa, String Marca, String Modelo, String tipo, Color color, Date año) {
        super(Placa, Marca, Modelo, tipo, color, año);
        this.CapPasajeros = CapPasajeros;
        this.NumEjes = NumEjes;
        this.Longitud = Longitud;
    }

    public int getCapPasajeros() {
        return CapPasajeros;
    }

    public void setCapPasajeros(int CapPasajeros) {
        this.CapPasajeros = CapPasajeros;
    }

    public int getNumEjes() {
        return NumEjes;
    }

    public void setNumEjes(int NumEjes) {
        this.NumEjes = NumEjes;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Autobus{" + "CapPasajeros=" + CapPasajeros + ", NumEjes=" + NumEjes + ", Longitud=" + Longitud + '}';
    }
    
    
}
