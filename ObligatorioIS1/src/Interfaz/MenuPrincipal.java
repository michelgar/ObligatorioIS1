
package Interfaz;
  

import Dominio.Sistema;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuPrincipal extends javax.swing.JFrame {
private Sistema modelo;
    
    public MenuPrincipal(Sistema unModelo) {
        modelo = unModelo;
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calenComun = new javax.swing.JButton();
        calenPaseos = new javax.swing.JButton();
        agregarNotificacion = new javax.swing.JButton();
        idaAlVet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        calenComun.setText("Calendario Comun");
        calenComun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calenComunActionPerformed(evt);
            }
        });

        calenPaseos.setText("Calendario Paseos");
        calenPaseos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calenPaseosActionPerformed(evt);
            }
        });

        agregarNotificacion.setText("Agregar Notificados");
        agregarNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNotificacionActionPerformed(evt);
            }
        });

        idaAlVet.setText("Agregar Veterinario");
        idaAlVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idaAlVetActionPerformed(evt);
            }
        });

        jButton1.setText("Agendar Comida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(calenPaseos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(agregarNotificacion)
                        .addComponent(calenComun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idaAlVet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(calenComun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calenPaseos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarNotificacion)
                .addGap(27, 27, 27)
                .addComponent(idaAlVet)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calenComunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calenComunActionPerformed
        CalendarioComun c;
    try {
        c = new CalendarioComun(modelo);
        c.setVisible(true);
    } catch (InterruptedException ex) {
        Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_calenComunActionPerformed

    private void calenPaseosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calenPaseosActionPerformed
        CalendarioPaseos c = new CalendarioPaseos(modelo);
    c.setVisible(true);
    }//GEN-LAST:event_calenPaseosActionPerformed

    private void agregarNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNotificacionActionPerformed
        AgregarNotificados agregarNoti = new AgregarNotificados(modelo);
        agregarNoti.setVisible(true);
    }//GEN-LAST:event_agregarNotificacionActionPerformed

    private void idaAlVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idaAlVetActionPerformed
        IdaVeterinario idaVet= new IdaVeterinario(modelo);
        idaVet.setVisible(true);
    }//GEN-LAST:event_idaAlVetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       AgendarComida agendarcomida=new AgendarComida(modelo);
       agendarcomida.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarNotificacion;
    private javax.swing.JButton calenComun;
    private javax.swing.JButton calenPaseos;
    private javax.swing.JButton idaAlVet;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
