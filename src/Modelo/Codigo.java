/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.UUID;

public class Codigo {
    
    private String UUIDE;
    private String NombreE;
    private String Codigo;
    private int CarnetE;

    public String getUUIDE() {
        return UUIDE;
    }

    public void setUUIDE(String UUIDE) {
        this.UUIDE = UUIDE;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getCarnetE() {
        return CarnetE;
    }

    public void setCarnetE(int CarnetE) {
        this.CarnetE = CarnetE;
    }
    
    

    
    public void Guardar() {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = Conexion.getConexion();
        try {
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addProducto = conexion.prepareStatement("INSERT INTO tbCodigos(UUID_Codigo, Nombre_estudiante, Tipo_Codigo, carnet_estudiante) VALUES (?, ?, ?, ?)");
            //Establecer valores de la consulta SQL
            addProducto.setString(1, UUID.randomUUID().toString());
            addProducto.setString(2, getNombreE());
            addProducto.setString(3, getCodigo());
            addProducto.setInt(4, getCarnetE());
            //Ejecutar la consulta
            addProducto.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
    }
}
