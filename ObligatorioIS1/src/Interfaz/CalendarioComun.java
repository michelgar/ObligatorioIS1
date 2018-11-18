
package Interfaz;
import Dominio.Sistema;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalendarioComun extends javax.swing.JFrame {
private JButton[][] botones;
private Sistema modelo;
int realYear, realMonth, realDay, currentYear, currentMonth;
    public CalendarioComun(Sistema unModelo) throws InterruptedException {
         modelo = unModelo;
        initComponents();
        
       
         panelCalendario.setLayout(new GridLayout(7, 7));
       botones = new JButton[7][7];
         String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};
         for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                JButton jButton = new JButton();
                jButton.addActionListener(new CalendarioComun.ListenerBoton(i, j));
                panelCalendario.add(jButton);
                botones[i][j] = jButton;
                botones[0][j].setEnabled(false);
                botones[0][j].setText(dias[j]);
                botones[0][j].setBackground(Color.LIGHT_GRAY);
               
                
            }
        }
        botonSig.addActionListener(new btnNext_Action());
        
         GregorianCalendar cal = new GregorianCalendar(); //Create calendar
        realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        realMonth = cal.get(GregorianCalendar.MONTH); //Get month
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        currentMonth = realMonth; //Match month and year
        currentYear = realYear;
       this.llenarCalendario(realMonth, realYear);

    }
   public class btnNext_Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (currentMonth == 11){ //Foward one year
                currentMonth = 0;
                currentYear += 1;
            }
            else{ //Foward one month
                currentMonth += 1;
            }
            llenarCalendario(currentMonth, currentYear);
        }
    }
   
   public void borrarMesant(int diasMes){
       for (int i = 1; i <7; i++) { 
          
            for (int j = 0; j < 7; j++) {             
           
              
               botones[i][j].setText(" ");
           
               }
           }
       
   }
   
   public void colorearActividad(String dia,int mes){
       for (int i = 1; i <7; i++) { 
          
            for (int j = 0; j < 7; j++) {
                
                String d=botones[i][j].getText();
                if(d.equalsIgnoreCase(dia)){
                    
                }
                
            }
       }
   }
    public void llenarCalendario(int mes,int año){
        
        
        
      GregorianCalendar cal = new GregorianCalendar(año,mes, 1);
      this.borrarMesant(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
      int primerDia=cal.get(GregorianCalendar.DAY_OF_WEEK)-1;
      int cont=1;
      for (int i = 1; i <7; i++) { 
          
            for (int j = primerDia; j < 7; j++) {             
           if(cont<=cal.getActualMaximum(Calendar.DAY_OF_MONTH)){
               String num = Integer.toString(cont);
               botones[i][j].setText(num);
            primerDia++;
            cont++;
            if(primerDia>6){
                primerDia=0;
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
        mes = new javax.swing.JLabel();
        botonSig = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        botonSig.setText("Siguiente");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(panelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSig)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSig;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel mes;
    private javax.swing.JPanel panelCalendario;
    // End of variables declaration//GEN-END:variables
}
