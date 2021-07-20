

public class index extends javax.swing.JFrame {

    public index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbnstudent = new javax.swing.JButton();
        jbnAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ezgif.com-gif-maker.gif"))); // NOI18N

        jbnstudent.setText("Student");
        jbnstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnstudentActionPerformed(evt);
            }
        });

        jbnAdmin.setText("Admin");
        jbnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jbnstudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbnAdmin)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnstudent)
                    .addComponent(jbnAdmin))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAdminActionPerformed
        setVisible(false);
        new adminIndex().setVisible(true);
    }//GEN-LAST:event_jbnAdminActionPerformed

    private void jbnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnstudentActionPerformed
        setVisible(false);
        new studentIndex().setVisible(true);
    }//GEN-LAST:event_jbnstudentActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbnAdmin;
    private javax.swing.JButton jbnstudent;
    // End of variables declaration//GEN-END:variables
}
