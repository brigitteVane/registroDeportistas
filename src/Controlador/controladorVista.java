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

    public controladorVista(registroCompetencia registroCompetencia) {
        this.registroCompetencia = registroCompetencia;
    }

    private void limpiarCampos() {
        JTextField txtId = registroCompetencia.getTxtId();
        JTextField txtNombres = registroCompetencia.getTxtNombres();
        JTextField txtApellidos = registroCompetencia.getTxtApellidos();

        txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
    }
}
