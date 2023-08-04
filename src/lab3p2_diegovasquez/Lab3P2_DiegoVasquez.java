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
                        for (int i = 0; i < vehiculos.size(); i++) {
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
                        for (int i = 0; i < vehiculos.size(); i++) {
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
                        for (int i = 0; i < vehiculos.size(); i++) {
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
                    lea = new Scanner(System.in);
                    for (int i = 0; i < vehiculos.size(); i++) {
                        System.out.println("Vehiculo "+i+"\n"+vehiculos.get(i).toString());
                        System.out.println("");
                    }//fin listar.
                    System.out.println("");
                    System.out.println("Ingrese que vehiculo desea modificar: ");
                    int p = lea.nextInt();
                    while(p < 0 || p > vehiculos.size()-1){
                        System.out.println("Out Of Bounds \nIntentelo de nuevo: ");
                        p = lea.nextInt();
                    }
                    if(vehiculos.get(p) instanceof Automovil){
                        System.out.println("""
                                           =SUB MENU MODIFICACION AUTOMOVIL=
                                           1.placa
                                           2.marca
                                           3.modelo
                                           4.tipo
                                           5.color
                                           6.año
                                           7.tipo combustible
                                           8.numero puertas
                                           9.tipo transmision
                                           10.num asientos""");
                        int mod = lea.nextInt();
                        switch(mod){
                            case 1:{
                                System.out.println("Ingrese la nueva placa: ");
                                String placa = lea.next();
                                boolean valid = true;
                                while(valid){
                                    boolean placaRep = false;
                                    for (int i = 0; i < vehiculos.size(); i++) {
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
                                vehiculos.get(p).setPlaca(placa);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 2:{
                                System.out.println("Ingrese la nueva marca: ");
                                String marc = lea.next();
                                vehiculos.get(p).setMarca(marc);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 3:{
                                System.out.println("Ingrese el nuevo modelo: ");
                                String modelo = lea.next();
                                vehiculos.get(p).setModelo(modelo);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 4:{
                                System.out.println("Ingrese el nuevo tipo: ");
                                String tipo = lea.next();
                                vehiculos.get(p).setTipo(tipo);
                            }
                            break;
                            case 5:{
                                Color ncolor = JColorChooser.showDialog(null, "Ingrese el nuevo color: ", Color.yellow);
                                vehiculos.get(p).setColor(ncolor);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 6:{
                                System.out.println("Ingrese el nuevo año: ");
                                String año = lea.next();
                                Date ano = df.parse(año);
                                vehiculos.get(p).setAño(ano);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 7:{
                                System.out.println("Ingrese el nuevo tipo de combustible: ");
                                String tipo = lea.next();
                                ((Automovil)vehiculos.get(p)).setTipoCombustible(tipo);
                            }
                            break;
                            case 8:{
                                System.out.println("Ingrese el nuevo numero de puertas: ");
                                int num = lea.nextInt();
                                while(num < 0){
                                    System.out.println("Invalido, Intentelo de nuevo:");
                                    num = lea.nextInt();
                                }
                                ((Automovil)vehiculos.get(p)).setNumPuertas(num);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 9:{
                                System.out.println("Ingrese el nuevo tipo de transmision: (automatica/manual)");
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
                                ((Automovil)vehiculos.get(p)).setTipoTransmision(trans);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            case 10:{
                                System.out.println("Ingrese el nuevo num de asientos: ");
                                int numA = lea.nextInt();
                                while(numA < 0){
                                    System.out.println("Invalido, Intentelo denuevo: ");
                                    numA = lea.nextInt();
                                }
                                ((Automovil)vehiculos.get(p)).setNumAsientos(numA);
                                System.out.println("Modificacion Exitosa");
                            }
                            break;
                            default:{
                                System.out.println("Opcion Invalida \nNo se pudo modificar nada xd");
                            }
                            break;
                        }
                    }
                }//fin case
                break;
                case 5:{
                    lea = new Scanner(System.in);
                    for (int i = 0; i < vehiculos.size(); i++) {
                        System.out.println("Vehiculo "+i+"\n"+vehiculos.get(i).toString());
                        System.out.println("");
                    }//fin listar.
                    System.out.println("");
                    System.out.println("Ingrese que vehiculo desea modificar: ");
                    int p = lea.nextInt();
                    while(p < 0 || p > vehiculos.size()-1){
                        System.out.println("Out Of Bounds \nIntentelo de nuevo: ");
                        p = lea.nextInt();
                    }
                    vehiculos.remove(p);
                    System.out.println("Vehiculo removido Exitosamente.");
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
