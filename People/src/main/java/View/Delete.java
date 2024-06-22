/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static OtherFunctions.DataValidation.calculateNifLetter;
import static OtherFunctions.DataValidation.isNumber;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Interface used to delete a person. It is mandatory to enter the NIF.
 * @author Francesc Perez
 * @version 1.1.0
 */
public class Delete extends javax.swing.JDialog {

    /**
     * Creates new form StudentDelete
     * @param parent
     * @param modal
     */
    public Delete(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public JButton getDelete() {
        return delete;
    }

    public JTextField getNif() {
        return nif;
    }

    public JButton getReset() {
        return reset;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        nif = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete - People v1.1.0");
        setMinimumSize(new java.awt.Dimension(350, 200));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NIF");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 12, 12);
        getContentPane().add(jLabel1, gridBagConstraints);

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.setEnabled(false);
        delete.setMaximumSize(new java.awt.Dimension(187, 33));
        delete.setMinimumSize(new java.awt.Dimension(187, 33));
        delete.setPreferredSize(new java.awt.Dimension(187, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 12);
        getContentPane().add(delete, gridBagConstraints);

        nif.setMaximumSize(new java.awt.Dimension(400, 22));
        nif.setMinimumSize(new java.awt.Dimension(400, 22));
        nif.setPreferredSize(new java.awt.Dimension(400, 22));
        nif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nifKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nifKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nifKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 12, 12, 24);
        getContentPane().add(nif, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Author: francesc.perez@stucom.com - Version 1.1.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 24, 12, 24);
        getContentPane().add(jLabel2, gridBagConstraints);

        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.setMaximumSize(new java.awt.Dimension(187, 33));
        reset.setMinimumSize(new java.awt.Dimension(187, 33));
        reset.setPreferredSize(new java.awt.Dimension(187, 33));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 12, 24);
        getContentPane().add(reset, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nifKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nifKeyPressed
        if (nif.getText().length() == 8) {
            evt.consume();
            nif.setText(calculateNifLetter(nif.getText()));
            nif.setEditable(false);
            delete.setEnabled(true);
        }
    }//GEN-LAST:event_nifKeyPressed
   
    private void nifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nifKeyReleased
        if (nif.getText().length() == 8) {
            nif.setText(calculateNifLetter(nif.getText()));
            nif.setEditable(false);
            delete.setEnabled(true);
        }
    }//GEN-LAST:event_nifKeyReleased

    private void nifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nifKeyTyped
        if (!isNumber(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != KeyEvent.VK_DELETE) {
            JOptionPane.showMessageDialog(this, "Type only numbers [0-9]", this.getTitle(), JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_nifKeyTyped

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        nif.setText("");
        nif.setEditable(true);
        delete.setEnabled(false);
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nif;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
