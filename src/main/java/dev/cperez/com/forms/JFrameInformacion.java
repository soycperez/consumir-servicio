
package dev.cperez.com.forms;

import dev.cperez.com.entidad.Dato;
import dev.cperez.com.implementacion.ImpDato;
import dev.cperez.com.implementacion.ImpValidaciones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Cesar Perez
 */
public class JFrameInformacion extends javax.swing.JFrame {

    List<Dato> listaDatos = new ArrayList<Dato>();
    ImpDato impDato = new ImpDato();
    ImpValidaciones impValidaciones = new ImpValidaciones();
    Dato datoC = null;
    private String id;
    private String nom;
    private String app;
    private String tel;
    private String clave;
    private int key;
    private int indice;

    public JFrameInformacion(int clave) {
        initComponents();
        this.setResizable(false);
        this.jTFMatricula.setEditable(false);
        // Pasamos la clave para el registro
        this.jTFMatricula.setText(String.valueOf(clave));
        // Creamos objeto de tipo dato
        datoC = new Dato();
        // Le asignamos la clave o matricula
        datoC.setClave(jTFMatricula.getText());
        // Realizamos peticion Json para llenar la lista
        impDato.leerJson(datoC);
        // Retornamos la lista llenada de haber leido el json
        this.clave = jTFMatricula.getText();
        //System.out.println(clave);
        // Llenamos la tabla
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        JPanelInformacion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFApp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFTel = new javax.swing.JTextField();
        JPanelAcciones = new javax.swing.JPanel();
        jBtnCrear = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnActualizarTabla = new javax.swing.JButton();
        jBtnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Telefono", "Clave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableDatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanelInformacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

        jLabel1.setText("Matricula:");

        jTFMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFMatriculaKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jTFNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNomKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellido:");

        jTFApp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFAppKeyTyped(evt);
            }
        });

        jLabel4.setText("Telefono:");

        jTFTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout JPanelInformacionLayout = new javax.swing.GroupLayout(JPanelInformacion);
        JPanelInformacion.setLayout(JPanelInformacionLayout);
        JPanelInformacionLayout.setHorizontalGroup(
            JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelInformacionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNom))
                    .addGroup(JPanelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFApp))
                    .addGroup(JPanelInformacionLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        JPanelInformacionLayout.setVerticalGroup(
            JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelInformacionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTFMatricula.getAccessibleContext().setAccessibleName("");
        jTFMatricula.getAccessibleContext().setAccessibleDescription("");

        JPanelAcciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        jBtnCrear.setText("Crear");
        jBtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCrearActionPerformed(evt);
            }
        });

        jBtnEditar.setText("Editar");
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnActualizarTabla.setText("Actualizar Tabla");
        jBtnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarTablaActionPerformed(evt);
            }
        });

        jBtnCerrarSesion.setText("Cambiar Sesion");
        jBtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelAccionesLayout = new javax.swing.GroupLayout(JPanelAcciones);
        JPanelAcciones.setLayout(JPanelAccionesLayout);
        JPanelAccionesLayout.setHorizontalGroup(
            JPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelAccionesLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(JPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnActualizarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
        );
        JPanelAccionesLayout.setVerticalGroup(
            JPanelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelAccionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnActualizarTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnCerrarSesion)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPanelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPanelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTabla() {
        // Retornamos la lista llenada de haber leido el json
        listaDatos = (List<Dato>) (Object) impDato.recuperarLista();
        System.out.println("Actualizando tabla del servicio web:");
        System.out.println(listaDatos);
        DefaultTableModel defaultTableModel = new DefaultTableModel(new String[]{"ID", "Nombre", "Apellido Paterno", "Telefono", "Clave"}, listaDatos.size()) {
            //Indicamos que no sean editables las celdas
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jTableDatos.setModel(defaultTableModel);

        TableModel tableModel = jTableDatos.getModel();
        for (int i = 0; i < listaDatos.size(); i++) {
            datoC = listaDatos.get(i);
            tableModel.setValueAt(datoC.getId(), i, 0);
            tableModel.setValueAt(datoC.getNom(), i, 1);
            tableModel.setValueAt(datoC.getApp(), i, 2);
            tableModel.setValueAt(datoC.getTel(), i, 3);
            tableModel.setValueAt(datoC.getClave(), i, 4);
        }
    }

    public void limpiarId() {
        this.id = null;
    }

    public void limpiarDatos() {
        this.id = null;
        jTFNom.setText(null);
        jTFApp.setText(null);
        jTFTel.setText(null);
        this.clave = null;
    }

    public boolean textFielVacios() {
        return jTFNom.getText().isEmpty() || jTFApp.getText().isEmpty() || jTFTel.getText().isEmpty();
    }

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        try {
            if (!(this.id == null)) {
                if (!(textFielVacios())) {
                    datoC = (Dato) impDato.recuperar(indice);
                    datoC.setNom(jTFNom.getText());
                    datoC.setApp(jTFApp.getText());
                    datoC.setTel(jTFTel.getText());
                    System.out.println("Dato: " + datoC);
                    int input = JOptionPane.showConfirmDialog(null, "¿Desea editar el registro " + this.id + "?", "Editar Registros",
                            JOptionPane.OK_CANCEL_OPTION);
                    if (input == 0) {
                        impDato.editarJson(datoC);
                        llenarTabla();
                        limpiarDatos();
                        JOptionPane.showMessageDialog(null, "Registro Editado");
                    }
                    limpiarDatos();
                } else {
                    JOptionPane.showMessageDialog(null, "No deje campos vacios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
                limpiarDatos();

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        JFrameMatricula frameMatricula = new JFrameMatricula();
        frameMatricula.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnCerrarSesionActionPerformed

    private void jTableDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMousePressed
        // TODO add your handling code here:
        if (jTableDatos.getSelectedRow() >= 0) {
            System.out.println("Fila: " + jTableDatos.getSelectedRow());
            this.indice = jTableDatos.getSelectedRow();
            // Recuperamos el modelo de la tabla
            DefaultTableModel defaultTableModel = (DefaultTableModel) jTableDatos.getModel();
            // Accedemos a los lados para pasarlos a los TextField
            this.id = String.valueOf(defaultTableModel.getValueAt(jTableDatos.getSelectedRow(), 0));
            jTFNom.setText(String.valueOf(defaultTableModel.getValueAt(jTableDatos.getSelectedRow(), 1)));
            jTFApp.setText(String.valueOf(defaultTableModel.getValueAt(jTableDatos.getSelectedRow(), 2)));
            jTFTel.setText(String.valueOf(defaultTableModel.getValueAt(jTableDatos.getSelectedRow(), 3)));
        }
    }//GEN-LAST:event_jTableDatosMousePressed

    private void jTFMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFMatriculaKeyTyped
        // TODO add your handling code here:
        this.key = evt.getKeyChar();
        //System.out.println("ASCII tecla: " + key);
        if (!impValidaciones.validarAlfabeticos(key)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo caracteres Alfabéticos");
        }
    }//GEN-LAST:event_jTFMatriculaKeyTyped

    private void jTFNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomKeyTyped
        // TODO add your handling code here:
        this.key = evt.getKeyChar();
        //System.out.println("ASCII tecla: " + key);
        if (!impValidaciones.validarAlfabeticos(key)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo caracteres Alfabéticos");
        }
    }//GEN-LAST:event_jTFNomKeyTyped

    private void jTFAppKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFAppKeyTyped
        // TODO add your handling code here:
        this.key = evt.getKeyChar();
        //System.out.println("ASCII tecla: " + key);
        if (!impValidaciones.validarAlfabeticos(key)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo caracteres Alfabéticos");
        }
    }//GEN-LAST:event_jTFAppKeyTyped

    private void jTFTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelKeyTyped
        // TODO add your handling code here:
        this.key = evt.getKeyChar();
        //System.out.println("ASCII tecla: " + key);
        if (!impValidaciones.validarNumericos(key) || jTFTel.getText().length() >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo caracteres Númericos");
        }

    }//GEN-LAST:event_jTFTelKeyTyped

    private void jBtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCrearActionPerformed
        // TODO add your handling code here:
        try {
            if (this.id == null) {
                if (!(textFielVacios())) {
                    datoC = new Dato(this.id, jTFNom.getText(), jTFApp.getText(), jTFTel.getText(), this.clave);
                    impDato.crearJson(datoC);
                    llenarTabla();
                    limpiarDatos();
                } else {
                    JOptionPane.showMessageDialog(null, "No deje campos vacios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este usuario ya existe");
                limpiarDatos();

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jBtnCrearActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (!(this.id == null)) {
                if (!(textFielVacios())) {
                    datoC = (Dato) impDato.recuperar(indice);
                    System.out.println("Dato: " + datoC);
                    int input = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro " + this.id + "?", "Eliminar Registro",
                            JOptionPane.OK_CANCEL_OPTION);
                    if (input == 0) {
                        impDato.eliminarJson(datoC);
                        llenarTabla();
                        limpiarDatos();
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    }
                    limpiarDatos();
                } else {
                    JOptionPane.showMessageDialog(null, "No deje campos vacios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
                limpiarDatos();

            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarTablaActionPerformed
        // TODO add your handling code here:
        // Pasamos la clave para el registro
        //this.jTFMatricula.setText(String.valueOf(clave));
        // Creamos objeto de tipo dato
        datoC = new Dato();
        // Le asignamos la clave o matricula
        datoC.setClave(jTFMatricula.getText());
        // Realizamos peticion Json para llenar la lista
        impDato.leerJson(datoC);
        //System.out.println(listaDatos);
        this.clave = jTFMatricula.getText();
        //System.out.println(clave);
        llenarTabla();
        limpiarDatos();
    }//GEN-LAST:event_jBtnActualizarTablaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelAcciones;
    private javax.swing.JPanel JPanelInformacion;
    private javax.swing.JButton jBtnActualizarTabla;
    private javax.swing.JButton jBtnCerrarSesion;
    private javax.swing.JButton jBtnCrear;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApp;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFNom;
    private javax.swing.JTextField jTFTel;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
