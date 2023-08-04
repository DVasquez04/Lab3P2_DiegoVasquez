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
                    
                }//fin case
                break;
                case 2:{
                    
                }//fin case
                break;
                case 3:{
                    
                }//fin case
                break;
                case 4:{
                    
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
