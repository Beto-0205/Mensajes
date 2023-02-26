
package com.mycompany.mensajes;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        //Conexion.getConexion();
        //System.out.println("Conexion Exitosa");
        MensajeDao mensajeDao = new MensajeDao();
        
        //Mensaje msm = new Mensaje("Hola desde Main", "MainClass");
        //int registro = mensajeDao.insertar(msm);
        //System.out.println("Se ha insertado "+ registro+"registro");
        
        //Mensaje msm = new Mensaje(3, "Hola desde Java Web", "Java Web");
        //int registro = mensajeDao.editar(msm);
        //System.out.println("Se edito "+ registro+ " registro");
        
        Mensaje msm = new Mensaje(3);
        int registro = mensajeDao.eliminar(msm);
        System.out.println("Se elimino "+ registro+ " registro");
        
        List<Mensaje> mensajes = mensajeDao.seleccionar();
        
        for(Mensaje mensaje: mensajes){
            System.out.println(mensaje);
        }
    }
}
