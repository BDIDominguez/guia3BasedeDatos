
package guia3basedatos;

import static guia3basedatos.Guia3BaseDatos.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





/**
 *
 * @author Dario
 */
public class ConectarBD {
    String baseDatos= "";
    String url = "jdbc:mysql://localhost:3306/";
    String usuario = "";
    String clave = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cSQL;
    
    
    public Connection conectar(String usuario,String clave,String baseDatos,String url) throws SQLException{
        this.usuario = usuario;
        this.clave = clave;
        this.baseDatos = baseDatos;
        try {
            Class.forName(driver);
            cSQL = DriverManager.getConnection("jdbc:mysql://"+url+":3306/"+baseDatos,usuario,clave);
            
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
            int vResp = JOptionPane.showConfirmDialog(null,"No existe la base de Datos " + baseDatos + ", quieres Crearla","No Existe la Base de Datos",JOptionPane.YES_NO_OPTION);
            if (vResp == 0){
                String nueva = baseDatos;
                conectar(usuario, clave, "MySQL", url);
                if (conexion.getcSQL() != null) {
                    try {
                        PreparedStatement ps = null;
                        ResultSet rs = null;
                        Connection con = conexion.getcSQL();
                        String sql = "Create database " + nueva;
                        ps = con.prepareStatement(sql);
                        ps.executeUpdate();
                        conectar(usuario, clave, nueva, url);
                    } catch (SQLException ex1) {
                        JOptionPane.showMessageDialog(null, "No se puede crear la base de Datos " + ex1.getMessage());
                        System.out.println("Mensage " + ex1.getMessage());
                    }
                }

            }
        }
        return cSQL;
    }
    
    public void desconectar(){
        try {
            cSQL.close();
            System.out.println("Se a desconectado");    
        } catch (SQLException ex) {
            Logger.getLogger(ConectarBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getcSQL() {
        return cSQL;
    }

    public void setcSQL(Connection cSQL) {
        this.cSQL = cSQL;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
    
    
}
