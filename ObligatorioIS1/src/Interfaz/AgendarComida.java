
package Interfaz;

import Dominio.Actividad;
import static Dominio.Actividad.TipoActividad.ALIMENTADO;
import Dominio.Mascota;
import Dominio.Sistema;
import Dominio.Usuario;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;

public class AgendarComida extends javax.swing.JFrame {
DefaultListModel modeloLista = new DefaultListModel();
DefaultListModel modeloLista2 = new DefaultListModel();
DefaultListModel modeloLista3 = new DefaultListModel();
public Sistema modelo;
    public AgendarComida(Sistema miModelo) {
         modelo= miModelo;       
        initComponents();
        this.cargarUsuarios();
        this.cargarMascotas();
         this.cargarAlimento();
        listaUsuarios.setModel(modeloLista);
        listaMascotas.setModel(modeloLista2);
        listaAlimentos.setModel(modeloLista3);
        calendarioFecha.getJCalendar();
    }
public void cargarUsuarios() {
        for (int i = 0; i < modelo.getListaUsuarios().size(); i++) {
           modeloLista.addElement(modelo.getListaUsuarios().get(i));
       }
}
public void cargarMascotas() {
        for (int i = 0; i < modelo.getListaMascotas().size(); i++) {
            modeloLista2.addElement(modelo.getListaMascotas().get(i));
        }
    }
public void cargarAlimento() {
        for (int i = 0; i < modelo.getListaAlimentos().size(); i++) {
            modeloLista3.addElement(modelo.getListaAlimentos().get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendarioFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMascotas = new javax.swing.JList();
        botonAgregar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaAlimentos = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setViewportView(listaUsuarios);

        jScrollPane1.setViewportView(listaMascotas);

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listaAlimentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(botonAgregar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonSalir)
                    .addGap(37, 37, 37)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(108, 108, 108)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAgregar)
                        .addComponent(botonSalir))
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
       
        Usuario u=(Usuario) listaUsuarios.getSelectedValue();
        Mascota m=(Mascota) listaMascotas.getSelectedValue();
        Date fecha=calendarioFecha.getDate();
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTime(fecha);
        int dia=gc.get(GregorianCalendar.DAY_OF_MONTH);
        int mes= gc.get(GregorianCalendar.MONTH) + 1;
        Actividad actividad= new Actividad(m,u,dia,mes,null,ALIMENTADO);
        modelo.notificacion.scheduleMail(u, actividad.toString(), fecha);
        m.getListaActividades().add(actividad);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser calendarioFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listaAlimentos;
    private javax.swing.JList listaMascotas;
    private javax.swing.JList listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
