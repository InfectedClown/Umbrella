package __View__;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class __Class__2 extends javax.swing.JFrame {
    public static String xx1 = null;
    public __Class__2() {
            ImageIcon img;
        img = new ImageIcon(getClass().getResource( "/__Asset__/InfectedClown.png"));
    this.setIconImage(img.getImage());
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _________________ = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Save as ");
        setResizable(false);

        _________________.setAcceptAllFileFilterUsed(false);
        _________________.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        _________________.setApproveButtonText("Save");
        _________________.setBackground(new java.awt.Color(0, 0, 0));
        _________________.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("*.exe","exe"));
        _________________.setForeground(new java.awt.Color(0, 102, 204));
        _________________.setDragEnabled(true);
        _________________.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _________________ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_________________, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(_________________, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _________________ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__________________ActionPerformed
        File SS = _________________.getSelectedFile();
        if (SS == null) {
            this.dispose();
}
else {
    
       xx1 = _________________.toString();
       switch(__View__.__Class__1.P){
        case 0 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__0._InfectedClown_0
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 1 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__1._InfectedClown_1
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 2 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__2._InfectedClown_2
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 3 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__3._InfectedClown_3
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 4 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__4._InfectedClown_4
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 5 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__5._InfectedClown_5
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 6 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__6._InfectedClown_6
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 7 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__7._InfectedClown_7
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 8 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__8._InfectedClown_8
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 9 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__9._InfectedClown_9
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 10 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__10._InfectedClown_10
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 11 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__11._InfectedClown_11
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 12 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__12._InfectedClown_12
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 13 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__13._InfectedClown_13
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 14 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__14._InfectedClown_14
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }


        case 15 : {
        try {
                __View__.__Class__1.Roption(
                        String.valueOf(__View__.__Class__1.R)+".ico"
                        ,__Asset__.__Data__15._InfectedClown_15
                        ,__Asset__.__Data__16._InfectedClown_16
                        ,_________________.getSelectedFile().getPath());
        } catch (IOException | InterruptedException ex) {
                Logger.getLogger(__Class__2.class.getName()).log(Level.SEVERE, null, ex);
        }
                break; }  }
       
        }
        JOptionPane.showMessageDialog(this, "Done...!","Umbrella",1);
        this.dispose();
    }//GEN-LAST:event__________________ActionPerformed

    public static void __Class___() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(__Class__2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new __Class__2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser _________________;
    // End of variables declaration//GEN-END:variables
}
