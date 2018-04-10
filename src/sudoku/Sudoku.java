
package sudoku;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static sudoku.Main.gecici1;

public class Sudoku extends javax.swing.JFrame {
    
    public Sudoku() {
        initComponents();
       
    }
   
    public static void main(String args[]) {
        
        
       
      
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        calis_alt2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        calis_ust1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        calis_ust2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        calis_alt1 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        calis_ust3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        calis_alt3 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        calis_ust4 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        calis_alt4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        calis_alt2.setColumns(20);
        calis_alt2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        calis_alt2.setRows(5);
        jScrollPane1.setViewportView(calis_alt2);

        calis_ust1.setEditable(false);
        calis_ust1.setBackground(new java.awt.Color(102, 102, 102));
        calis_ust1.setColumns(20);
        calis_ust1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        calis_ust1.setForeground(new java.awt.Color(255, 255, 255));
        calis_ust1.setRows(5);
        calis_ust1.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jScrollPane4.setViewportView(calis_ust1);

        calis_ust2.setColumns(20);
        calis_ust2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        calis_ust2.setRows(5);
        calis_ust2.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jScrollPane5.setViewportView(calis_ust2);

        calis_alt1.setBackground(new java.awt.Color(102, 102, 102));
        calis_alt1.setColumns(20);
        calis_alt1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        calis_alt1.setForeground(new java.awt.Color(255, 255, 255));
        calis_alt1.setRows(5);
        jScrollPane2.setViewportView(calis_alt1);

        calis_ust3.setBackground(new java.awt.Color(102, 102, 102));
        calis_ust3.setColumns(20);
        calis_ust3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        calis_ust3.setForeground(new java.awt.Color(255, 255, 255));
        calis_ust3.setRows(5);
        calis_ust3.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jScrollPane7.setViewportView(calis_ust3);

        calis_alt3.setBackground(new java.awt.Color(102, 102, 102));
        calis_alt3.setColumns(20);
        calis_alt3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        calis_alt3.setForeground(new java.awt.Color(255, 255, 255));
        calis_alt3.setRows(5);
        jScrollPane8.setViewportView(calis_alt3);

        calis_ust4.setColumns(20);
        calis_ust4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        calis_ust4.setRows(5);
        calis_ust4.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jScrollPane9.setViewportView(calis_ust4);

        calis_alt4.setColumns(20);
        calis_alt4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        calis_alt4.setRows(5);
        jScrollPane10.setViewportView(calis_alt4);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("SUDOKU ANALİZ ÇİZELGESİ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Thread 1");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Thread 3");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Thread 2");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Thread 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(566, 566, 566)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel2)
                        .addGap(289, 289, 289)
                        .addComponent(jLabel4)
                        .addGap(269, 269, 269)
                        .addComponent(jLabel3)
                        .addGap(269, 269, 269)
                        .addComponent(jLabel6)))
                .addContainerGap(291, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea calis_alt1;
    public static javax.swing.JTextArea calis_alt2;
    public static javax.swing.JTextArea calis_alt3;
    public static javax.swing.JTextArea calis_alt4;
    public static javax.swing.JTextArea calis_ust1;
    public static javax.swing.JTextArea calis_ust2;
    public static javax.swing.JTextArea calis_ust3;
    public static javax.swing.JTextArea calis_ust4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables

    void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
