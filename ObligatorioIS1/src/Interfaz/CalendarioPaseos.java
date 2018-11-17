package Interfaz;
import Dominio.Actividad;
import static Dominio.Actividad.TipoActividad.PASEO;
import Dominio.Calendario;
import Dominio.Mascota;
import Dominio.Paseo;
import Dominio.Sistema;
import Dominio.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.Timer;


public class CalendarioPaseos extends javax.swing.JFrame {
DefaultListModel modeloLista = new DefaultListModel();
DefaultListModel modeloLista2 = new DefaultListModel();
public Sistema modelo;

    public CalendarioPaseos(Sistema miModelo) {
        modelo= miModelo;       
        initComponents();
        this.cargarUsuarios();
        this.cargarMascotas();
        listaUsuarios.setModel(modeloLista);
        listaMascotas.setModel(modeloLista2);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendarioFecha = new com.toedter.calendar.JDateChooser();
        hora = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        fechaPrueba = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMascotas = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jScrollPane1.setViewportView(listaMascotas);

        jScrollPane3.setViewportView(listaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(botonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fechaPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(fechaPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonSalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
       Calendario calendario;
      Usuario u=(Usuario) listaUsuarios.getSelectedValue();
      Mascota m=(Mascota) listaMascotas.getSelectedValue();
       String h=hora.getText();
       Paseo p = new Paseo(u,m,h);
       modelo.getListaPaseos().add(p);
       Date fecha=calendarioFecha.getDate();
       GregorianCalendar gc=new GregorianCalendar();
       gc.setTime(fecha);
       int dia=gc.get(GregorianCalendar.DAY_OF_MONTH);
       int mes= gc.get(GregorianCalendar.MONTH) + 1;///Se suma el 1, porque los meses están dados del 0 al 11
//       int año=gc.get(GregorianCalendar.YEAR);
       Actividad actividad= new Actividad(m,u,dia,mes,p,PASEO);
       m.getListaActividades().add(actividad);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser calendarioFecha;
    private javax.swing.JLabel fechaPrueba;
    private javax.swing.JTextField hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listaMascotas;
    private javax.swing.JList listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
