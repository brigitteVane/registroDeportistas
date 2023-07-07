/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Dao.daoDeportista;
import Modelo.deportista;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Vanesa Chavez
 */
public class controladorDeportista {
    private JTextField txtId;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    
    private daoDeportista dao;
    private controladorVista ctrlVista;
    
    
    public controladorDeportista() {
        dao = new daoDeportista();
        ctrlVista = new controladorVista(); 
    }
    
     public void agregarDeportista(JTextField txtId, JTextField txtNombres, JTextField txtApellidos) {
        String Id = txtId.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        dao.agregarDeportista(Id, nombres, apellidos);
        ctrlVista.limpiarCampos(txtId, txtNombres, txtApellidos);

       
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            if (boton.getText().equals("Agregar")) {
                String Id = txtId.getText();
                String nombres = txtNombres.getText();
                String apellidos = txtApellidos.getText();

                dao.agregarDeportista(Id, nombres, apellidos);
                ctrlVista.limpiarCampos(txtId, txtNombres, txtApellidos);
            }
        }
    }
    
    public ArrayList<deportista> obtenerDeportistas() {
        return dao.obtenerDeportistas();
    }
    
    
    
    
}
