/*
 Minecraft Hyperlapse Command Creator V1.1

 Create by Autopoietico:

 Github: https://github.com/Autopoietico
 Twitter: https://twitter.com/AutopoieticoLP
 Youtube: https://www.youtube.com/user/SrAutopoietico/
 */

package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        Dimension screen, frame;
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame = this.getSize();
        this.setLocation(((screen.width - frame.width) / 2), (screen.height - frame.height) / 2);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        twoPoints = new Panes.TwoPoints();
        onePointTwoCenters = new Panes.OnePointTwoCenters();
        twoPointsOneCenter = new Panes.TwoPointsOneCenter();
        twoPointsTwoCenters = new Panes.TwoPointsTwoCenters();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_Exit = new javax.swing.JMenuItem();
        jMenu_Help = new javax.swing.JMenu();
        jMenuItem_About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minecraft Hyperlapse");
        setResizable(false);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.addTab("Two Points", twoPoints);
        jTabbedPane1.addTab("One Point, Two Centers", onePointTwoCenters);
        jTabbedPane1.addTab("Two Points, One Center", twoPointsOneCenter);
        jTabbedPane1.addTab("Two Points, Two Centers", twoPointsTwoCenters);

        jMenu_File.setText("File");

        jMenuItem_Exit.setText("Exit");
        jMenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu_File.add(jMenuItem_Exit);

        jMenuBar2.add(jMenu_File);

        jMenu_Help.setText("Help");

        jMenuItem_About.setText("About");
        jMenuItem_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AboutActionPerformed(evt);
            }
        });
        jMenu_Help.add(jMenuItem_About);

        jMenuBar2.add(jMenu_Help);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItem_ExitActionPerformed

    private void jMenuItem_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AboutActionPerformed

        About about = new About(this, true);
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AboutActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem_About;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Help;
    private javax.swing.JTabbedPane jTabbedPane1;
    private Panes.OnePointTwoCenters onePointTwoCenters;
    private Panes.TwoPoints twoPoints;
    private Panes.TwoPointsOneCenter twoPointsOneCenter;
    private Panes.TwoPointsTwoCenters twoPointsTwoCenters;
    // End of variables declaration//GEN-END:variables
}
