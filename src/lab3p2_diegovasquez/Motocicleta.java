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
public class Motocicleta extends Vehiculo{
    private double Velocidad;
    private double peso;
    private double LitrosConsumidos;

    public Motocicleta() {
    }

    public Motocicleta(double Velocidad, double peso, double LitrosConsumidos, String Placa, String Marca, String Modelo, String tipo, Color color, Date año) {
        super(Placa, Marca, Modelo, tipo, color, año);
        this.Velocidad = Velocidad;
        this.peso = peso;
        this.LitrosConsumidos = LitrosConsumidos;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLitrosConsumidos() {
        return LitrosConsumidos;
    }

    public void setLitrosConsumidos(double LitrosConsumidos) {
        this.LitrosConsumidos = LitrosConsumidos;
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
        return "Motocicleta{" + "Velocidad=" + Velocidad + ", peso=" + peso + ", LitrosConsumidos=" + LitrosConsumidos + '}';
    }
    
    
    
}
