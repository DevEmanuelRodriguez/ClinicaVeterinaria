package com.mycompany.peluqueriacanina2.igu;

import com.mycompany.peluqueriacanina2.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina2.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    //Creamos la controladora de la logica
    ControladoraLogica control = null;

    public VerDatos() {
        control = new ControladoraLogica();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 238, 147));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ver Datos");

        jPanel9.setBackground(new java.awt.Color(255, 238, 147));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setBackground(new java.awt.Color(255, 238, 147));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        tablaMascotas.setBackground(new java.awt.Color(237, 219, 205));
        tablaMascotas.setForeground(new java.awt.Color(51, 51, 51));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Datos de mascotas:");

        jPanel10.setBackground(new java.awt.Color(255, 238, 147));

        btnEditar.setBackground(new java.awt.Color(237, 219, 205));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\edit_121277.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(237, 219, 205));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Downloads\\trash_bin_icon-icons.com_67981.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //debemos dar clic derecho en el frame principal de la ventana y poner en window>>window opened
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Para eleiminar debemos controlar que la tabla no este vacia y que si hay datos tengamos una fila seleccionada

        //miramos la cnatidad de filas para saber si hay algun dato de la siguiente forma
        //Si es mayor a cero quiere decir que hay datos y la tabla no esta vacia
        if (tablaMascotas.getRowCount() > 0) {

            //Ponemos -1 porque indica que ha seleccionado alguna fila (registro de la tabla)
            if (tablaMascotas.getSelectedRow() != -1) {
                //Recordamos que las tablas guardan los datos como String. Debemos hacer un parse de String a int

                /*Con el siguinete codigo nos ubicamos en la columna cero y en la fila seleccionada. Asi podemos traer el id de 
                esa fila seleccionada por el  usuario*/
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));

                //Ahora procedemos a borrar la mascota unavez teniendo el id del cliente con num_cliente
                control.borrarMascota(num_cliente);
                
                //aviso al usuario que borró correctamente
                mostrarMensaje("Mascota eliminada correctamente", "inFo", "Borrado de Mascota");
                
                //Cargamos la tabla nuevamente con la informacion actualizada
                
                cargarTabla();
                

            }
            else{
                mostrarMensaje("No seleccionó ninguna mascota", "error", "Error al elimnar");
            
            }

        }
        else{
            mostrarMensaje("No hya nada para eliminar", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //Para editar debemos controlar que la tabla no este vacia y que si hay datos tengamos una fila seleccionada

        //miramos la cantidad de filas para saber si hay algun dato de la siguiente forma
        //Si es mayor a cero quiere decir que hay datos y la tabla no esta vacia
        if (tablaMascotas.getRowCount() > 0) {

            //Ponemos -1 porque indica que ha seleccionado alguna fila (registro de la tabla)
            if (tablaMascotas.getSelectedRow() != -1) {
                //Recordamos que las tablas guardan los datos como String. Debemos hacer un parse de String a int

                /*Con el siguinete codigo nos ubicamos en la columna cero y en la fila seleccionada. Asi podemos traer el id de 
                esa fila seleccionada por el  usuario*/
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));

                //Una vez teniendo el ID del cliente podemos llamar a una ventana para que se abra con los datos cargados a editar
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                //Una vez llamamos a la venta modificarDatos cerramos la venta VerDatos
                this.dispose();
                
                /*
                //aviso al usuario que borró correctamente
                mostrarMensaje("Mascota eliminada correctamente", "inFo", "Borrado de Mascota");
                
                //Cargamos la tabla nuevamente con la informacion actualizada
                
                cargarTabla();
                */

            }
            else{
                mostrarMensaje("No seleccionó ninguna mascota", "error", "Error al elimnar");
            
            }

        }
        else{
            mostrarMensaje("No hya nada para eliminar", "Error", "Error al eliminar");
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarMensaje(String mensaje, String tipoMensaje, String titulo) {
        //PopUp para decir que ya se han eliminado los datos
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoMensaje.equalsIgnoreCase("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(tipoMensaje.equalsIgnoreCase("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);        
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //definir el modelo que queremos que tenga la configuracionTabla
        DefaultTableModel configuracionTabla = new DefaultTableModel() {
            //Para hacer que las filas y columnas en la configuracionTabla no sean editables sin pulsar el boton editar configuracionTabla

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Establecemos los nombres de las columnas usando vectores
        String titulosCabeceras[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp.", "Nom.Dueño", "Cel.Dueño"};

        //Hacemos que los titulos de cabecera se seten en la configuracionTabla
        configuracionTabla.setColumnIdentifiers(titulosCabeceras);

        //Carga de los datos desde la base de datos y los guardamos en la lista
        List<Mascota> listaMascotas = control.traerMascotas();

        //recorrermos la lista y mostramos coada elemento en la configuracionTabla
        if (listaMascotas != null) { //Si la lista no esta vacia hacemos lo siguiente

            for (Mascota masco : listaMascotas) {
                //Usamos un array de tipo Objet porque es un array de varios tipos de datos (int,String)
                Object[] objeto = {masco.getNumCliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), masco.getAlergico(),
                    masco.getAtencionEspecial(), masco.getDuenio().getNombre(), masco.getDuenio().getCelDuenio()};
                configuracionTabla.addRow(objeto);
            }
        }
        //ponemos la configuracion a la pantalla en nuestro caso la pantalla se llama tablaMascotas
        tablaMascotas.setModel(configuracionTabla);
    }

}
