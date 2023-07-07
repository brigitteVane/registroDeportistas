/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.registroCompetencia;
import java.awt.TextField;
import javax.swing.JTextField;

/**
 *
 * @author Vanesa Chavez
 */
public class controladorVista {

    
    private registroCompetencia registroCompetencia;
    private JTextField txtId;
    private JTextField txtNombres;
    private JTextField txtApellidos;

    public controladorVista(){
        
    }
    
    public controladorVista(registroCompetencia registroCompetencia) {
        this.registroCompetencia = registroCompetencia;
    }

    public void limpiarCampos(JTextField txtId, JTextField txtNombres, JTextField txtApellidos) {
        this.txtId = registroCompetencia.getTxtId();
        this.txtNombres = registroCompetencia.getTxtNombres();
        this.txtApellidos = registroCompetencia.getTxtApellidos();

        txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        
    }
    
    public void iniciar(){
        registroCompetencia.setTitle("Bienvenido");
        registroCompetencia.setLocationRelativeTo(null);
    }
}
