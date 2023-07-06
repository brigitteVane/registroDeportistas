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
    private List<deportista> deportistas;
    
    
    
    
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
        
        
        
    }
      
}
