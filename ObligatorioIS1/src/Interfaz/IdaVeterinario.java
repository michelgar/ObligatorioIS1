
package Interfaz;

import Dominio.Actividad;
import static Dominio.Actividad.TipoActividad.VETERINARIO;
import Dominio.Mascota;
import Dominio.Sistema;
import Dominio.Usuario;
import Dominio.Veterinario;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;


public class IdaVeterinario extends javax.swing.JFrame {
public Sistema modelo;
DefaultListModel modeloLista = new DefaultListModel();
DefaultListModel modeloLista2 = new DefaultListModel();
DefaultListModel modeloLista3 = new DefaultListModel();
    public IdaVeterinario(Sistema miModelo) {
        modelo= miModelo;       
        initComponents();
        this.cargarUsuarios();
        this.cargarMascotas();
        this.cargarVeterinario();
        listaUsuarios.setModel(modeloLista);
        listaMascotas.setModel(modeloLista2);
        listaVeterinarios.setModel(modeloLista3);
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
public void cargarVeterinario() {
        for (int i = 0; i < modelo.getListaVeterinarios().size(); i++) {
            modeloLista3.addElement(modelo.getListaVeterinarios().get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVeterinarios = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaMascotas = new javax.swing.JList();
        calendarioFecha = new com.toedter.calendar.JDateChooser();
        hora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaUsuarios);

        jScrollPane2.setViewportView(listaVeterinarios);

        jScrollPane3.setViewportView(listaMascotas);

        hora.setText("ej. 24:00");

        jLabel1.setText("Hora");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(botonAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonSalir)
                                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(botonAgregar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        
        Usuario u=(Usuario) listaUsuarios.getSelectedValue();
        Mascota m=(Mascota) listaMascotas.getSelectedValue();
        Veterinario vet=(Veterinario) listaVeterinarios.getSelectedValue();
        modelo.getListaVeterinarios().add(vet);
        String h=hora.getText();
        Date fecha=calendarioFecha.getDate();
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTime(fecha);
        int dia=gc.get(GregorianCalendar.DAY_OF_MONTH);
        int mes= gc.get(GregorianCalendar.MONTH) + 1;///Se suma el 1, porque los meses están dados del 0 al 11
        //       int año=gc.get(GregorianCalendar.YEAR);
        Actividad actividad= new Actividad(m,u,dia,mes,null,VETERINARIO);
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
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaMascotas;
    private javax.swing.JList listaUsuarios;
    private javax.swing.JList listaVeterinarios;
    // End of variables declaration//GEN-END:variables
}
