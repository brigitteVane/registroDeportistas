/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroDeportistas;

import Controlador.controladorVista;
import Vista.registroCompetencia;

/**
 *
 * @author Vanesa Chavez
 */
public class principal {
    public static void main(String[] args) {
        registroCompetencia ventanaRegistro = new registroCompetencia();
        registroCompetencia registroCompetencia = null;
        controladorVista controladorVista = new controladorVista(registroCompetencia);

        controladorVista.iniciar();
        ventanaRegistro.setVisible(true);
    }
    
}
