/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3basedatos;



import static guia3basedatos.Guia3BaseDatos.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Dario
 */
public class PantallaPrincipal extends javax.swing.JFrame {
    private boolean primierInicio = true;
    
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        actualizarCombo();
        setTitle("Sistem de Bases de Datos --- Conectado a " + conexion.getBaseDatos().toUpperCase() );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxComandos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jcbBaseDatos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jtxComandos.setColumns(20);
        jtxComandos.setRows(5);
        jScrollPane2.setViewportView(jtxComandos);

        jButton1.setText("Ejecutar Linea");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ejecutar Todas las Lineas");

        jButton3.setText("Borrar Comandos");

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jcbBaseDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcbBaseDatos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbBaseDatosItemStateChanged(evt);
            }
        });
        jcbBaseDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbBaseDatosMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Base de Datos");

        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jcbBaseDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton5))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jMenu3.setText("Crear BD");

        jMenuItem6.setText("Ej 1 - Hotel");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Ej 2 - Veterinario");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Ej 3 - Gestion de Pedidos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Ej 4 - Construir S. A.");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Ej 5 - Biblioteca");
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Cargar BD");

        jMenuItem2.setText("Ej 1 - Hotel");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Ej 2 - Veterinario");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Ej 3 - Gestion de Pedidos");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Ej 4 - Construir S. A.");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Ej 5 - Biblioteca");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Crearemos las Tablas del Primer Ejersicio de la Guia
        String tablas = "START TRANSACTION;\n"
                + "CREATE TABLE `categoria` (`idCategoria` int(11) NOT NULL,`cantPersonas` int(11) NOT NULL,`cantCamas` int(11) NOT NULL,`tipoCamas` int(11) NOT NULL,`tipoHabitacion` varchar(11) NOT NULL,`precio` double NOT NULL,`activo` tinyint(4) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;\n"
                + "CREATE TABLE `habitacion` (`idHabitacion` int(11) NOT NULL,`idCategoria` int(1) NOT NULL,`nmroHabitacion` int(11) NOT NULL,`piso` int(11) NOT NULL,`refaccion` tinyint(4) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;\n"
                + "CREATE TABLE `huesped` (`idHuesped` int(11) NOT NULL,`nombre` varchar(25) NOT NULL,`apellido` varchar(25) NOT NULL,`dni` bigint(20) NOT NULL,`domicilio` varchar(30) NOT NULL,`correo` varchar(30) NOT NULL,`celular` varchar(30) NOT NULL,`activo` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;\n"
                + "CREATE TABLE `reserva` (`idReserva` int(11) NOT NULL,`idHabitacion` int(11) NOT NULL,`idHuesped` int(11) NOT NULL,`fechaInicio` date NOT NULL,`fechaFin` date NOT NULL,`precioTotal` double NOT NULL,`cantPersonas` int(11) NOT NULL,`activo` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;\n"
                + "ALTER TABLE `categoria`  ADD PRIMARY KEY (`idCategoria`);\n"
                + "ALTER TABLE `habitacion`  ADD PRIMARY KEY (`idHabitacion`),  ADD KEY `idCategoria` (`idCategoria`);\n"
                + "ALTER TABLE `huesped` ADD PRIMARY KEY (`idHuesped`), ADD UNIQUE KEY `dni` (`dni`);\n"
                + "ALTER TABLE `reserva` ADD PRIMARY KEY (`idReserva`), ADD UNIQUE KEY `idHabitacion` (`idHabitacion`), ADD KEY `idHuesped` (`idHuesped`);\n"
                + "ALTER TABLE `categoria` MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT;\n"
                + "ALTER TABLE `habitacion` MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT;\n"
                + "ALTER TABLE `huesped` MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT;\n"
                + "ALTER TABLE `categoria` ADD CONSTRAINT `categoria_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `habitacion` (`idCategoria`);\n"
                + "ALTER TABLE `habitacion`ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`idHabitacion`) REFERENCES `reserva` (`idHabitacion`);\n"
                + "ALTER TABLE `reserva` ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`);\n"
                + "COMMIT;";
        creaTablas(tablas);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean correcto = true,actualizar = false; // Correcto para saber si se ejecuto bien la sentencia SQL y Actualizar para saber si es necesario actualizar el jTable
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //con esto obtenemos la linea completa en la que se encuentra el cursor
            int pos = jtxComandos.getCaretPosition(); // obtiene la posicion del cursor contando los caracteres y saltos de linea digamos que si tiene 10 letras en dos filas regresa 11
            int lineIndex = jtxComandos.getLineOfOffset(pos);  // por medio de la cantidad de caracteres nos regresa el numero de linea que empieza en 0
            int lineStartOffset = jtxComandos.getLineStartOffset(lineIndex); // indica la cantidad inicial del esa linea
            int lineEndOffset = jtxComandos.getLineEndOffset(lineIndex); // indica la cantidad al final de la linea
            String sql = jtxComandos.getText(lineStartOffset, lineEndOffset - lineStartOffset); // extrae todo entre el inicio y fin de linea de la fila en la que se encuentra el cursor
            //System.out.println(lineText);
            // ahora solo tenemos que ejecutarla!!!
          
            Connection con = conexion.getcSQL();
            ps = con.prepareStatement(sql);
            if (sql.toLowerCase().contains("insert") || sql.toLowerCase().contains("update") || sql.toLowerCase().contains("delete") || sql.toLowerCase().contains("use") || sql.toLowerCase().contains("create database") ){ // (INSERT, UPDATE, DELETE) executeQuery cuando es una de esas acciones sino el otro Execute para los demas
                ps.executeUpdate();
            }else{                
                rs = ps.executeQuery();
                System.out.println("Se ejecuto la consulta");
                actualizar = true;
            }
        } catch (BadLocationException | SQLException ex) {
            //Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "No se pudo ejecutar " + ex.getMessage());
            correcto = false;
        }
        if (correcto){
            System.out.println(" se considera Correcto");
            if (actualizar){ 
                System.out.println(" se trata de ordenar la tabla");
                try {
                    // Metodo que actualize el jTable con el resultado de la tabla.
                    modelarTabla(rs);
                } catch (SQLException ex) {
                    Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String tabla = "START TRANSACTION;\n"
                + "CREATE TABLE `cliente` (`idCliente` int NOT NULL,`dni` int NOT NULL,`nombre` varchar(30) NOT NULL,`apellido` varchar(30) NOT NULL,`telefono` bigint NOT NULL,`direccion` varchar(50) NOT NULL,`contactoAlternativo` bigint NOT NULL,`activo` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n"
                + "CREATE TABLE `mascota` (`idMascota` int NOT NULL,`alias` varchar(30) NOT NULL,`sexo` varchar(30) NOT NULL,`especie` varchar(30) NOT NULL,`raza` varchar(30) NOT NULL,`colorPelo` varchar(50) NOT NULL,`fechaNac` date NOT NULL,`idCliente` int NOT NULL,`activo` tinyint NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n"
                + "CREATE TABLE `tratamiento` (`idTratamiento` int NOT NULL,`descripcion` varchar(70) NOT NULL,`medicamento` varchar(50) NOT NULL,`importe` double NOT NULL,`tipoTratamiento` varchar(30) NOT NULL,`activo` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n"
                + "CREATE TABLE `visita` (`idVisita` int NOT NULL,`idMascota` int NOT NULL,`fechaVisita` date NOT NULL,`detalle` varchar(50) NOT NULL,`peso` double NOT NULL,`idTratamiento` int NOT NULL,`activo` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n"
                + "ALTER TABLE `cliente` ADD PRIMARY KEY (`idCliente`), ADD KEY `dni` (`dni`);\n"
                + "ALTER TABLE `mascota` ADD PRIMARY KEY (`idMascota`), ADD KEY `idCliente` (`idCliente`);\n"
                + "ALTER TABLE `tratamiento` ADD PRIMARY KEY (`idTratamiento`);\n"
                + "ALTER TABLE `visita` ADD PRIMARY KEY (`idVisita`), ADD KEY `idMascota` (`idMascota`), ADD KEY `idTratamiento` (`idTratamiento`);\n"
                + "ALTER TABLE `cliente` MODIFY `idCliente` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;\n"
                + "ALTER TABLE `mascota` MODIFY `idMascota` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;\n"
                + "ALTER TABLE `tratamiento` MODIFY `idTratamiento` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;\n"
                + "ALTER TABLE `visita` MODIFY `idVisita` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;\n"
                + "ALTER TABLE `mascota` ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE RESTRICT ON UPDATE RESTRICT;\n"
                + "ALTER TABLE `tratamiento` ADD CONSTRAINT `tratamiento_ibfk_1` FOREIGN KEY (`idTratamiento`) REFERENCES `visita` (`idTratamiento`) ON DELETE RESTRICT ON UPDATE RESTRICT;\n"
                + "ALTER TABLE `visita` ADD CONSTRAINT `visita_ibfk_1` FOREIGN KEY (`idMascota`) REFERENCES `mascota` (`idMascota`) ON DELETE RESTRICT ON UPDATE RESTRICT;\n"
                + "COMMIT;";
        creaTablas(tabla);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String tabla = "START TRANSACTION;\n"
                + "CREATE TABLE `clientes` (`idCliente` int NOT NULL,`dni` int NOT NULL,`nombre` varchar(30) NOT NULL,`apellido` varchar(30) NOT NULL,`telefono` bigint NOT NULL,`direccion` varchar(50) NOT NULL,`contactoAlternativo` bigint NOT NULL,`activo` tinyint(1) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;\n"
                + "";
                
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jcbBaseDatosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbBaseDatosItemStateChanged
        // cuando el usuario selecciona otra base de datos se debe indicar a la conexion que se cambio de base de datos con el comando USE + nombre de la base de datos
        if (primierInicio){
            primierInicio = false;
        }else{
            String cadena = "use " + jcbBaseDatos.getSelectedItem();
            boolean vResp = ejecutaSQL(cadena);
            setTitle("Sistem de Bases de Datos --- Conectado a " + jcbBaseDatos.getSelectedItem().toString().toUpperCase()  );
        }
        
        
    }//GEN-LAST:event_jcbBaseDatosItemStateChanged

    private void jcbBaseDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbBaseDatosMouseClicked
        
    }//GEN-LAST:event_jcbBaseDatosMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Se actualiza el contenido del combo con las tablas existentes en el servidor
        actualizarCombo();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JComboBox<String> jcbBaseDatos;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JTextArea jtxComandos;
    // End of variables declaration//GEN-END:variables
    private void modelarTabla(ResultSet rs) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSetMetaData meta = rs.getMetaData();
        int cantColum = meta.getColumnCount();
        for (int i = 1; i <= cantColum; i++) {
            modelo.addColumn(meta.getColumnName(i));
        }
        modelo.setRowCount(0); // Borra todas las filas
        while (rs.next()) {
            Object[] fila = new Object[cantColum];
            for (int i = 1; i <= cantColum; i++) {
                fila[i - 1] = rs.getObject(i);
            }
            modelo.addRow(fila);
        }
        jTabla.setModel(modelo);

    }
    private void creaTablas(String tablas){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion.getcSQL();
        String[] sentencias = tablas.split(";");
        for (String sql : sentencias) {
            if (!sql.trim().isEmpty()) {
                try {
                    ps = con.prepareStatement(sql);
                    ps.executeUpdate(sql);
                } catch (SQLException ex) {
                   // Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                   // System.out.println(" error " + ex.getMessage());
                   JOptionPane.showMessageDialog(rootPane," Las Tablas ya existen");
                   break;
                }
            }
        }
        
    }
    
    private void actualizarCombo() {
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conexion.getcSQL();
            String cadena = "show databases";
            ps = con.prepareStatement(cadena);
            rs = ps.executeQuery();
            jcbBaseDatos.removeAllItems();
            while (rs.next()) {
                String bdNombre = rs.getString(1);
                if (!bdNombre.contains("information_schema") && !bdNombre.contains("mysql") && !bdNombre.contains("performance_schema") && !bdNombre.contains("sys")) {
                //if (!bdNombre.contains("information_schema") && !bdNombre.contains("performance_schema") ) {
                    jcbBaseDatos.addItem(bdNombre);
                }
            }
        } catch (SQLException ex) {
            // Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se puede Actualizar el ComboBox con los nombres de Base de Datos");
        }
    }
    
    private boolean ejecutaSQL(String cadena){
        boolean vResp = false;
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = conexion.getcSQL();
            ps = con.prepareStatement(cadena);
            //rs = ps.executeQuery();
            ps.executeUpdate();
            vResp = true;
            
        } catch (SQLException ex) {
            // Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se pudo ejecutar el comando \n " + cadena + " \n "+ ex.getMessage());
            vResp = false;
        }
        
        return vResp;
    }
    
}
