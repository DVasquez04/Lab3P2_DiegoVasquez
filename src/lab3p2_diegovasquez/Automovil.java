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
public class Automovil extends Vehiculo{
    private String TipoCombustible;
    private int NumPuertas;
    private String TipoTransmision;
    private int NumAsientos;

    public Automovil() {
    }

    public Automovil(String TipoCombustible, int NumPuertas, String TipoTransmision, int NumAsientos, String Placa, String Marca, String Modelo, String tipo, Color color, Date año) {
        super(Placa, Marca, Modelo, tipo, color, año);
        this.TipoCombustible = TipoCombustible;
        this.NumPuertas = NumPuertas;
        this.TipoTransmision = TipoTransmision;
        this.NumAsientos = NumAsientos;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String TipoCombustible) {
        this.TipoCombustible = TipoCombustible;
    }

    public int getNumPuertas() {
        return NumPuertas;
    }

    public void setNumPuertas(int NumPuertas) {
        this.NumPuertas = NumPuertas;
    }

    public String getTipoTransmision() {
        return TipoTransmision;
    }

    public void setTipoTransmision(String TipoTransmision) {
        this.TipoTransmision = TipoTransmision;
    }

    public int getNumAsientos() {
        return NumAsientos;
    }

    public void setNumAsientos(int NumAsientos) {
        this.NumAsientos = NumAsientos;
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
        //System.out.println(super.toString());
        return "Automovil \n Tipo de Combustible=" + TipoCombustible + "\nNumero de Puertas=" + NumPuertas + "\nTipo de Transmision=" + TipoTransmision + "\nNumero de Asientos=" + NumAsientos;
    }
    
    
}
