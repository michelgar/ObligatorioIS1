/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Dominio.Sistema;
import java.time.*;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.LocalDate;

import java.util.Calendar;


public class CalendarioComun extends javax.swing.JFrame {
private JButton[][] botones;
private Sistema modelo;





    public CalendarioComun(Sistema unModelo) throws InterruptedException {
         modelo = unModelo;
        initComponents();
  
        String[] dias = {"", "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};
        
        panelCalendario.setLayout(new GridLayout(9, 8));
        botones = new JButton[9][9];
        
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 7; j++) {
                JButton jButton = new JButton();
                jButton.addActionListener(new CalendarioComun.ListenerBoton(i, j));
                panelCalendario.add(jButton);
                botones[i][j] = jButton;
                botones[0][j].setEnabled(false);
                botones[i][0].setEnabled(false);
                botones[0][j].setText(dias[j]);
                botones[0][j].setBackground(Color.LIGHT_GRAY);
                botones[i][j].setMargin(new Insets(-5, -5, -5, -5));
                
            }
        }
        
      Calendar ahora = Calendar.getInstance();
      int primerDia=ahora.get(Calendar.DAY_OF_WEEK)+1;
      int cont=1;
      for (int i = 1; i <=8; i++) {          
            for (int j = primerDia; j <= 7; j++) {             
           if(cont<=ahora.getActualMaximum(Calendar.DAY_OF_MONTH)){
               String num = Integer.toString(cont);
               botones[i][j].setText(num);
            primerDia++;
            cont++;
            if(primerDia>7){
                primerDia=1;
            }
           }
            
            
            }
           
            }

    }
 private class ListenerBoton implements ActionListener {

        private int x;
        private int y;

        public ListenerBoton(int i, int j) {
            x = i;
            y = j;
        }

        public void actionPerformed(ActionEvent e) {
            clickBoton(x, y);

        }

    }

private void clickBoton(int fila, int columna) {

       
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCalendario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelCalendarioLayout = new javax.swing.GroupLayout(panelCalendario);
        panelCalendario.setLayout(panelCalendarioLayout);
        panelCalendarioLayout.setHorizontalGroup(
            panelCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        panelCalendarioLayout.setVerticalGroup(
            panelCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(panelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(panelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelCalendario;
    // End of variables declaration//GEN-END:variables
}
