/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3basedatos;

import java.sql.SQLException;

/**
 *
 * @author Dario
 */
public class Guia3BaseDatos {

    public static ConectarBD conexion = new ConectarBD();

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Login inicio = new Login();
        inicio.setVisible(true);
        inicio.show();
        // faltaria cerrar la conexion pero no lo he implementado todavia

    }

}
