package Controlador;

import Modelo.Codigo;
import Vista.frmCodigo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;
import java.util.Set;

public class ctrlCodigo implements MouseListener{

//Llamamos a las capas modelo y vista ;)    
    private Codigo modelo;
    private frmCodigo vista;

// Creamos el constructor de la cla
    
    se
    public ctrlCodigo(Codigo modelo, frmCodigo vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vista.btnAgregar){
           modelo.setNombreE(vista.txtNombreE.getText());
           modelo.setCodigo(vista.txtCodigo.getText());
           modelo.setCarnetE(Integer.parseInt(vista.txtCarnet.getText()));
           modelo.Guardar();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
