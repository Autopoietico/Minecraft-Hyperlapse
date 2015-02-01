/*
 Minecraft Hyperlapse Command Creator V1.0

 Create by Autopoietico:

 Github: https://github.com/Autopoietico
 Twitter: https://twitter.com/AutopoieticoLP
 Youtube: https://www.youtube.com/user/SrAutopoietico/
 */

package Panes;

import cod.Calc;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class TwoPointsOneCenter extends javax.swing.JPanel {

    public TwoPointsOneCenter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jTxtField_InitialCommand = new javax.swing.JTextField();
        jBut_CopyInitialCommand = new javax.swing.JButton();
        jBut_CopyComandCommandBlock = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTxtField_ComandCommandBlock = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTxtField_MinecraftNick = new javax.swing.JTextField();
        jBut_GenerateComands = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTxtField_X1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTxtField_Y1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTxtField_Z1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTxtField_Y2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTxtField_Z2 = new javax.swing.JTextField();
        jTxtField_X2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTxtField_YC1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTxtField_ZC1 = new javax.swing.JTextField();
        jTxtField_XC1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtField_Hours = new javax.swing.JTextField();
        jTxtField_Days = new javax.swing.JTextField();
        jTxtField_Minutes = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(330, 443));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Two Points, One Center");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 304, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 286, 304, 10));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Teleporting to Initial Position, Command:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 302, 304, -1));

        jTxtField_InitialCommand.setEditable(false);
        add(jTxtField_InitialCommand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 322, 304, 27));

        jBut_CopyInitialCommand.setText("Copy to Clipboard");
        jBut_CopyInitialCommand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CopyInitialCommandActionPerformed(evt);
            }
        });
        add(jBut_CopyInitialCommand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, 304, -1));

        jBut_CopyComandCommandBlock.setText("Copy to Clipboard");
        jBut_CopyComandCommandBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CopyComandCommandBlockActionPerformed(evt);
            }
        });
        add(jBut_CopyComandCommandBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 435, 304, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CommandBlock, Command:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 389, 304, -1));

        jTxtField_ComandCommandBlock.setEditable(false);
        add(jTxtField_ComandCommandBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 409, 304, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(" This command block must be activated with a");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 469, 304, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("simple hopper clock to run correctly");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 489, 304, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Minecraft Nick:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, 324, -1));

        jTxtField_MinecraftNick.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtField_MinecraftNick.setText("@p[m=3]");
        add(jTxtField_MinecraftNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 214, 304, -1));

        jBut_GenerateComands.setText("Generate");
        jBut_GenerateComands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_GenerateComandsActionPerformed(evt);
            }
        });
        add(jBut_GenerateComands, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 245, 304, -1));

        jLabel19.setText("X1:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        jTxtField_X1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_X1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 43, 40, -1));

        jLabel20.setText("Y1:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        jTxtField_Y1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_Y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 69, 40, -1));

        jLabel21.setText("Z1:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, -1, -1));

        jTxtField_Z1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_Z1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, 40, -1));

        jLabel22.setText("X2:");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 46, -1, -1));

        jLabel23.setText("Y2:");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 72, -1, -1));

        jTxtField_Y2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 69, 40, -1));

        jLabel24.setText("Z2:");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 98, -1, -1));

        jTxtField_Z2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_Z2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 95, 40, -1));

        jTxtField_X2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_X2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 43, 40, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 43, -1, 70));

        jLabel28.setText("XC1:");
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 46, -1, -1));

        jLabel29.setText("YC1:");
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 72, -1, -1));

        jTxtField_YC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_YC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 69, 40, -1));

        jLabel30.setText("ZC1:");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 98, -1, -1));

        jTxtField_ZC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_ZC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 95, 40, -1));

        jTxtField_XC1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(jTxtField_XC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 43, 40, -1));

        jLabel2.setText("Days:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setText("Minutes:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel4.setText("Hours:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jTxtField_Hours.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtField_Hours.setText("0");
        add(jTxtField_Hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 84, -1));

        jTxtField_Days.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtField_Days.setText("0");
        add(jTxtField_Days, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 84, -1));

        jTxtField_Minutes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtField_Minutes.setText("0");
        add(jTxtField_Minutes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 84, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_CopyComandCommandBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CopyComandCommandBlockActionPerformed

        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(this.jTxtField_ComandCommandBlock.getText());
        cb.setContents(ss, ss);
    }//GEN-LAST:event_jBut_CopyComandCommandBlockActionPerformed

    private void jBut_GenerateComandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_GenerateComandsActionPerformed

        int days, hours, minutes, ticks;
        double x1, y1, z1, x2, y2, z2, xC1, yC1, zC1;
        String nick;
        double dx, dy, dz, iAH, iAV, dAH, dAV;
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#.################################", otherSymbols);

        try {
            minutes = Integer.parseInt(this.jTxtField_Minutes.getText());
            hours = Integer.parseInt(this.jTxtField_Hours.getText());
            days = Integer.parseInt(this.jTxtField_Days.getText());

            ticks = Calc.getHopperTicks(days, hours, minutes);

            if (ticks == 0) {

                JOptionPane.showMessageDialog(null, "Time values can not all be 0");
            } else {

                x1 = Integer.parseInt(this.jTxtField_X1.getText()) + 0.5;
                y1 = Integer.parseInt(this.jTxtField_Y1.getText());
                z1 = Integer.parseInt(this.jTxtField_Z1.getText()) + 0.5;
                x2 = Integer.parseInt(this.jTxtField_X2.getText()) + 0.5;
                y2 = Integer.parseInt(this.jTxtField_Y2.getText());
                z2 = Integer.parseInt(this.jTxtField_Z2.getText()) + 0.5;
                xC1 = Integer.parseInt(this.jTxtField_XC1.getText()) + 0.5;
                yC1 = Integer.parseInt(this.jTxtField_YC1.getText()) - 1;
                zC1 = Integer.parseInt(this.jTxtField_ZC1.getText()) + 0.5;

                nick = this.jTxtField_MinecraftNick.getText();
                nick.replaceAll("\\s", "");
                if (nick.isEmpty()) {

                    nick = "@p[m=3]";
                    this.jTxtField_MinecraftNick.setText(nick);
                }
                dx = (x2 - x1) / ticks;
                dy = (y2 - y1) / ticks;
                dz = (z2 - z1) / ticks;
                iAH = Calc.convertRadiansToDegrees(Calc.getHorizontalAngle(x1, z1, xC1, zC1));
                iAV = Calc.convertRadiansToDegrees(Calc.getVerticalAngle(x1, y1, z1, xC1, yC1, zC1));
                dAH = Calc.convertRadiansToDegrees(Calc.getHorizontalAngle2Points1Center(x1, z1, x2, z2, xC1, zC1)) / ticks;
                dAV = Calc.convertRadiansToDegrees(Calc.getVerticalAngle2Points1Center(x1, y1, z1, x2, y2, z2, xC1, yC1, zC1)) / ticks;

                this.jTxtField_InitialCommand.setText("/tp " + nick + " " + x1 + " " + y1 + " " + z1 + " " + formatter.format(iAH) + " " + formatter.format(iAV));
                this.jTxtField_ComandCommandBlock.setText("tp " + nick + " ~" + formatter.format(dx) + " ~" + formatter.format(dy) + " ~" + formatter.format(dz) + " ~" + formatter.format(dAH) + " ~" + formatter.format(dAV));
            }

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, "One of the values entered is not a number");
        }
    }//GEN-LAST:event_jBut_GenerateComandsActionPerformed

    private void jBut_CopyInitialCommandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CopyInitialCommandActionPerformed

        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ss = new StringSelection(this.jTxtField_InitialCommand.getText());
        cb.setContents(ss, ss);
    }//GEN-LAST:event_jBut_CopyInitialCommandActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_CopyComandCommandBlock;
    private javax.swing.JButton jBut_CopyInitialCommand;
    private javax.swing.JButton jBut_GenerateComands;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTxtField_ComandCommandBlock;
    private javax.swing.JTextField jTxtField_Days;
    private javax.swing.JTextField jTxtField_Hours;
    private javax.swing.JTextField jTxtField_InitialCommand;
    private javax.swing.JTextField jTxtField_MinecraftNick;
    private javax.swing.JTextField jTxtField_Minutes;
    private javax.swing.JTextField jTxtField_X1;
    private javax.swing.JTextField jTxtField_X2;
    private javax.swing.JTextField jTxtField_XC1;
    private javax.swing.JTextField jTxtField_Y1;
    private javax.swing.JTextField jTxtField_Y2;
    private javax.swing.JTextField jTxtField_YC1;
    private javax.swing.JTextField jTxtField_Z1;
    private javax.swing.JTextField jTxtField_Z2;
    private javax.swing.JTextField jTxtField_ZC1;
    // End of variables declaration//GEN-END:variables
}
