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
public class Vehiculo {
    protected String Placa;
    protected String Marca;
    protected String Modelo;
    protected String tipo;
    protected Color color;
    protected Date año;

    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Marca, String Modelo, String tipo, Color color, Date año) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.tipo = tipo;
        this.color = color;
        this.año = año;
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
        return "Placa=" + Placa + "\nMarca=" + Marca + "\nModelo=" + Modelo + "\nTipo=" + tipo + "\nColor=" + color + "\nA\u00f1o=" + año.getHours();
    }
    
    
    
    
}
