/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_diegovasquez;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author Diego Vasquez
 */
public class Lab3P2_DiegoVasquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy");
        ArrayList <Vehiculo> vehiculos = new ArrayList();
        Scanner lea = new Scanner(System.in);
        boolean seguir = true;
        while (seguir){
            System.out.println("""
                               =MENU VEHICULOS=
                               1.Agregar Automóvil
                               2.Agregar Motocicleta
                               3.Agregar Autobus
                               4.Modificar Vehículo
                               5.Eliminar Vehiculo
                               6.Mostrar Vehículos
                               7.Generar Boleta
                               8.Salir""");
            int op = lea.nextInt();
            switch(op){
                case 1:{
                    //Automovil
                    lea = new Scanner(System.in);
                    System.out.println("Ingrese la placa: ");
                    String placa = lea.next().toUpperCase();
                    boolean valid = true;
                    while(valid){
                        boolean placaRep = false;
                        for (int i = 0; i < 10; i++) {
                            if(placa.equalsIgnoreCase(vehiculos.get(i).getPlaca())){
                                placaRep = true;
                            }
                        }//fin for
                        if(placaRep == false){
                            if(placa.startsWith("H")){
                                if(ValidPlaca(placa)){
                                    valid = false;
                                }else{
                                    System.out.println("Placa invalida, intentela de nuevo");
                                    placa = lea.next().toUpperCase();
                                }//fin else
                            }else{
                                System.out.println("Placa invalida, intentela de nuevo");
                                placa = lea.next().toUpperCase();
                            }//fin else
                        }else{
                            System.out.println("Placa Repetida \nIngrese otra: ");
                            placa = lea.next();
                        }//fin else placa repetida
                    }//fin valid placa
                    System.out.println("Ingrese la marca: ");
                    String marca = lea.next();
                    System.out.println("Ingrese el modelo: ");
                    String modelo = lea.next();
                    System.out.println("Ingrese su tipo: (Turismo, Camioneta, etc.)");
                    String tipo = lea.next();
                    Color color = JColorChooser.showDialog(null, "Ingrese el COlor", Color.WHITE);
                    System.out.println("Ingrese el año: yyyy");
                    String año = lea.next();
                    Date Año = df.parse(año);
                    System.out.println("Ingrese el tipo de combustible: (Diesel, Regular, Super)");
                    String tipoComb = lea.next();
                    System.out.println("Ingrese el numero de puertas: ");
                    int numPuertas = lea.nextInt();
                    while(numPuertas < 0){
                        System.out.println("No se puede nums negativos xd\n Intentelo de nuevo: ");
                        numPuertas = lea.nextInt();
                    }//fin valid num
                    System.out.println("Ingrese su tipo de transmision: (Automatica/Manual)");
                    String trans = lea.next();
                    boolean validT = true;
                    while(validT){
                        if(trans.equalsIgnoreCase("Automatica")||trans.equalsIgnoreCase("Manual")){
                            validT = false;
                        }else{
                            System.out.println("Transmision invalida \nIntentelo de nuevo (Automatica/manual)");
                            trans = lea.next();
                        }
                    }//fin while
                    System.out.println("Ingrese el numero de asientos: ");
                    int numAsientos = lea.nextInt();
                    while(numAsientos < 0){
                        System.out.println("Invalido intentelo de nuevo: ");
                        numAsientos = lea.nextInt();
                    }
                    //agregar el automovil al arraylist
                    Automovil auto = new Automovil(tipoComb, numPuertas, trans, numAsientos, placa, marca, modelo, tipo, color, Año);
                    vehiculos.add(auto);
                    System.out.println("Vehiculo agregado exitosamente!");
                }//fin case
                break;
                case 2:{
                    //Motocicleta
                    lea = new Scanner(System.in);
                    System.out.println("Ingrese la placa: ");
                    String placa = lea.next().toUpperCase();
                    boolean valid = true;
                    while(valid){
                        boolean placaRep = false;
                        for (int i = 0; i < 10; i++) {
                            if(placa.equalsIgnoreCase(vehiculos.get(i).getPlaca())){
                                placaRep = true;
                            }
                        }//fin for
                        if(placaRep == false){
                            if(placa.startsWith("B")){
                                if(ValidPlaca(placa)){
                                    valid = false;
                                }else{
                                    System.out.println("Placa invalida, intentela de nuevo");
                                    placa = lea.next().toUpperCase();
                                }//fin else
                            }else{
                                System.out.println("Placa invalida, intentela de nuevo");
                                placa = lea.next().toUpperCase();
                            }//fin else
                        }else{
                            System.out.println("Placa Repetida \nIngrese otra: ");
                            placa = lea.next();
                        }//fin else placa repetida
                    }//fin valid placa
                    System.out.println("Ingrese la marca: ");
                    String marca = lea.next();
                    System.out.println("Ingrese el modelo: ");
                    String modelo = lea.next();
                    System.out.println("Ingrese su tipo: (Harvey, Yamaha, etc.)");
                    String tipo = lea.next();
                    Color color = JColorChooser.showDialog(null, "Ingrese el COlor", Color.WHITE);
                    System.out.println("Ingrese el año: yyyy");
                    String año = lea.next();
                    Date Año = df.parse(año);
                    System.out.println("Ingrese la velocidad: ");
                    double vel = lea.nextDouble();
                    while(vel < 0 ){
                        System.out.println("Velocidad invalida \nIntentelo de nuevo:");
                        vel = lea.nextDouble();
                    }//fin valid
                    System.out.println("Ingrese el peso");
                    double peso = lea.nextDouble();
                    while(peso < 0 ){
                        System.out.println("Peso invalida \nIntentelo de nuevo:");
                        peso = lea.nextDouble();
                    }//fin valid
                    System.out.println("Ingrese los litroc consumidos por Kilometro: ");
                    double litros = lea.nextDouble();
                    while(litros < 0 ){
                        System.out.println("Cantidad de litros invalida \nIntentelo de nuevo:");
                        litros = lea.nextDouble();
                    }//fin valid
                    Motocicleta moto = new Motocicleta(vel, peso, litros, placa, marca, modelo, tipo, color, Año);
                    vehiculos.add(moto);
                    //agregar la moto al array
                    System.out.println("Moto agregada exitosamente!");
                }//fin case
                break;
                case 3:{
                    //Autobus
                    lea = new Scanner(System.in);
                    System.out.println("Ingrese la placa: ");
                    String placa = lea.next().toUpperCase();
                    boolean valid = true;
                    while(valid){
                        boolean placaRep = false;
                        for (int i = 0; i < 10; i++) {
                            if(placa.equalsIgnoreCase(vehiculos.get(i).getPlaca())){
                                placaRep = true;
                            }
                        }//fin for
                        if(placaRep == false){
                            if(placa.startsWith("B")){
                                if(ValidPlaca(placa)){
                                    valid = false;
                                }else{
                                    System.out.println("Placa invalida, intentela de nuevo");
                                    placa = lea.next().toUpperCase();
                                }//fin else
                            }else{
                                System.out.println("Placa invalida, intentela de nuevo");
                                placa = lea.next().toUpperCase();
                            }//fin else
                        }else{
                            System.out.println("Placa Repetida \nIngrese otra: ");
                            placa = lea.next();
                        }//fin else placa repetida
                    }//fin valid placa
                    System.out.println("Ingrese la marca: ");
                    String marca = lea.next();
                    System.out.println("Ingrese el modelo: ");
                    String modelo = lea.next();
                    System.out.println("Ingrese su tipo: (Turismo, de Ruta, rapidito)");
                    String tipo = lea.next();
                    Color color = JColorChooser.showDialog(null, "Ingrese el Color", Color.WHITE);
                    System.out.println("Ingrese el año: yyyy");
                    String año = lea.next();
                    Date Año = df.parse(año);
                    System.out.println("Ingrese la capacidad de pasajeros: ");
                    int cap = lea.nextInt();
                    while(cap < 0){
                        System.out.println("Capacidad invalida \nIntentelo de nuevo: ");
                        cap = lea.nextInt();
                    }
                    System.out.println("Ingrese la cantidad de ejes: ");
                    int ejes = lea.nextInt();
                    while(ejes <0){
                        System.out.println("Numero invalido \nIntentelo de nuevo: ");
                        ejes = lea.nextInt();
                    }
                    System.out.println("Ingrese la Longitud: ");
                    double lon = lea.nextDouble();
                    while(lon < 0){
                        System.out.println("Invalido, Intentelo de nuevo: ");
                        lon = lea.nextDouble();
                    }
                    Autobus bus = new Autobus(cap, ejes, lon, placa, marca, modelo, tipo, color, Año);
                    //agregar bus al array
                    vehiculos.add(bus);
                    System.out.println("Autobus agregado exitosamente!"); 
                }//fin case
                break;
                case 4:{
                    for (int i = 0; i < vehiculos.size(); i++) {
                        System.out.println("Vehiculo "+i+"\n"+vehiculos.get(i).toString());
                        System.out.println("");
                    }//fin listar.
                }//fin case
                break;
                case 5:{
                    
                }//fin case
                break;
                case 6:{
                    
                }//fin case
                break;
                case 7:{
                    
                }//fin case
                break;
                case 8:{
                    seguir = false;
                }//fin case
                break;
                default:{
                    
                }//fin default
                break;
            }
        }//fin while
    }//fin main
    
    public static boolean ValidPlaca(String p){
        //returns true si es placa valida, y false si es no valida xd
        boolean valid = true;
        int contD = 0;
        int contC = 0;
        for (int i = 0; i < p.length(); i++) {
            int loc = p.charAt(i);
            if(loc >= 65 && loc <= 90){
                contC++;
            }//fin aumento de chars
            if(loc >= 48 && loc <= 57){
                contD++;
            }//fin aumento de digitos
        }//fin for
        if(contD < 4 || contC < 3){
            valid = false;
        }
        return valid;
                
    }
    
}//fin class
