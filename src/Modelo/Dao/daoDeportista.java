/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Dao;

import Modelo.deportista;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Vanesa Chavez
 */
public class daoDeportista {
    
    private File archivoDeportistas;
    private ArrayList<deportista> deportistas;
    
    
    
    
    public daoDeportista(){
        archivoDeportistas = new File("src/Modelo/archivos/Deportistas.txt");
        if(!archivoDeportistas.exists()){
            try{
                archivoDeportistas.createNewFile();
            }catch(IOException ex) {
                ex.printStackTrace();
            }
        }
        
        deportistas = new ArrayList<>();
        cargarDeportistas();
    }
    
    public void agregarDeportista(String Id, String nombres, String apellidos) {
        if (!existeDeportista(Id)) {
            deportista deportista = new deportista(Id, nombres, apellidos);
            deportistas.add(deportista);
            guardarDeportistas();
        } else {
            System.out.println("Ya existe un deportista con la misma identificación.");
        }
    }
    
    private void cargarDeportistas() {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoDeportistas))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] indice = linea.split(",");
                if (indice.length == 3) {
                    String nombres = indice[0];
                    String apellidos = indice[1];
                    String identificacion = indice[2];
                    deportista deportista = new deportista(nombres, apellidos, identificacion);
                    deportistas.add(deportista);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private void guardarDeportistas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDeportistas))) {
            for (deportista deportista : deportistas) {
                String linea = String.format("%s,%s,%s", deportista.getId( ),deportista.getNombres(), deportista.getApellidos());
                writer.write(linea);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private boolean existeDeportista(String Id) {
        for (deportista deportista : deportistas) {
            if (deportista.getId().equals(Id)) {
                return true;
            }
        }
        return false;
    }
         
      
}
