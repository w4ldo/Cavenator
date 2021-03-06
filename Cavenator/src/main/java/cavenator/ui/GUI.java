/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavenator.ui;

import cavenator.domain.CaveGenerator;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    private CaveGenerator cavegen;

    /**
     * Creates new form GUI
     */
    private int range = 2;
    private int wallLimit = 12;

    public GUI(CaveGenerator cavegen) {
        initComponents();
        this.cavegen = cavegen;
    }

    /**
     * Paint CavePanel based on map returned by cavegenerator. Each map tile is
     * 2x2 px on screen.
     *
     * @param map
     */
    public void setCaveContent(String[][] map) {
        Graphics g = cavePanel1.getGraphics();
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == "#") {
                    g.setColor(new Color(60, 63, 95));
                    g.fillRect(2 * x, 2 * y, 2, 2);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(2 * x, 2 * y, 2, 2);
                }
            }
        }
        cavePanel1.paintComponents(g);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cavePanel1 = new javax.swing.JPanel();
        buttonBackground = new javax.swing.JPanel();
        generateRandomButton = new javax.swing.JButton();
        shapingLabel = new javax.swing.JLabel();
        generateCustomButton = new javax.swing.JButton();
        customSeedField = new javax.swing.JTextField();
        fillSlider = new javax.swing.JSlider();
        seedLabel = new javax.swing.JLabel();
        fillLabel = new javax.swing.JLabel();
        rangeSlider = new javax.swing.JSlider();
        customizeAlgoLabel = new javax.swing.JLabel();
        rangeLabel = new javax.swing.JLabel();
        shapeButton1 = new javax.swing.JButton();
        shapeButton2 = new javax.swing.JButton();
        shapeButton3 = new javax.swing.JButton();
        shapeButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cavenator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        cavePanel1.setBackground(new java.awt.Color(60, 63, 95));
        cavePanel1.setName(""); // NOI18N
        cavePanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout cavePanel1Layout = new javax.swing.GroupLayout(cavePanel1);
        cavePanel1.setLayout(cavePanel1Layout);
        cavePanel1Layout.setHorizontalGroup(
            cavePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cavePanel1Layout.setVerticalGroup(
            cavePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        buttonBackground.setBackground(new java.awt.Color(153, 153, 153));

        generateRandomButton.setText("Generate random");
        generateRandomButton.setToolTipText("Generate random cave");
        generateRandomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateRandomButtonActionPerformed(evt);
            }
        });

        shapingLabel.setText("Try different settings and shaping algorithms");

        generateCustomButton.setText("Generate custom");
        generateCustomButton.setToolTipText("Generate cave from custom seed");
        generateCustomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateCustomButtonActionPerformed(evt);
            }
        });

        customSeedField.setBackground(new java.awt.Color(204, 204, 204));
        customSeedField.setToolTipText("Type custom seed here");
        customSeedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customSeedFieldActionPerformed(evt);
            }
        });

        fillSlider.setBackground(new java.awt.Color(155, 155, 155));
        fillSlider.setForeground(new java.awt.Color(0, 0, 0));
        fillSlider.setMajorTickSpacing(20);
        fillSlider.setMinorTickSpacing(1);
        fillSlider.setPaintLabels(true);
        fillSlider.setSnapToTicks(true);
        fillSlider.setToolTipText("Cave fill%");
        fillSlider.setValue(40);
        fillSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fillSliderStateChanged(evt);
            }
        });

        seedLabel.setText("Custom seed");

        fillLabel.setText("Fill: 40%");

        rangeSlider.setBackground(new java.awt.Color(155, 155, 155));
        rangeSlider.setForeground(new java.awt.Color(0, 0, 0));
        rangeSlider.setMajorTickSpacing(1);
        rangeSlider.setMaximum(3);
        rangeSlider.setMinimum(1);
        rangeSlider.setMinorTickSpacing(1);
        rangeSlider.setPaintLabels(true);
        rangeSlider.setSnapToTicks(true);
        rangeSlider.setToolTipText("Range from which neighbours are checked around the tile.");
        rangeSlider.setValue(2);
        rangeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rangeSliderStateChanged(evt);
            }
        });

        customizeAlgoLabel.setText("Customize algorithm");

        rangeLabel.setText("Range: 2");

        shapeButton1.setText("Shape A");
        shapeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeButton1ActionPerformed(evt);
            }
        });

        shapeButton2.setText("Shape B");
        shapeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeButton2ActionPerformed(evt);
            }
        });

        shapeButton3.setText("Shape D");
        shapeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeButton3ActionPerformed(evt);
            }
        });

        shapeButton4.setText("Shape C");
        shapeButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonBackgroundLayout = new javax.swing.GroupLayout(buttonBackground);
        buttonBackground.setLayout(buttonBackgroundLayout);
        buttonBackgroundLayout.setHorizontalGroup(
            buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBackgroundLayout.createSequentialGroup()
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(fillSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(fillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(generateRandomButton)))
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generateCustomButton)
                            .addGroup(buttonBackgroundLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(seedLabel)))
                        .addGap(165, 165, 165))
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customSeedField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonBackgroundLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customizeAlgoLabel)))
                            .addComponent(rangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(buttonBackgroundLayout.createSequentialGroup()
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shapeButton1)
                            .addComponent(shapeButton4))
                        .addGap(18, 18, 18)
                        .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shapeButton3)
                            .addComponent(shapeButton2)))
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(shapingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        buttonBackgroundLayout.setVerticalGroup(
            buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonBackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateRandomButton)
                    .addComponent(generateCustomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fillLabel)
                    .addComponent(seedLabel))
                .addGap(5, 5, 5)
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addComponent(fillSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shapeButton1)
                            .addComponent(shapeButton2)))
                    .addGroup(buttonBackgroundLayout.createSequentialGroup()
                        .addComponent(customSeedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customizeAlgoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(rangeLabel)))
                .addGap(18, 18, 18)
                .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rangeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shapeButton3)
                        .addComponent(shapeButton4)))
                .addGap(18, 18, 18)
                .addComponent(shapingLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cavePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cavePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customSeedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customSeedFieldActionPerformed
        cavegen.generateCaves(fillSlider.getValue(), customSeedField.getText());
        setCaveContent(cavegen.getMap());
    }//GEN-LAST:event_customSeedFieldActionPerformed

    private void generateCustomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateCustomButtonActionPerformed
        cavegen.generateCaves(fillSlider.getValue(), customSeedField.getText());
        setCaveContent(cavegen.getMap());
    }//GEN-LAST:event_generateCustomButtonActionPerformed

    private void generateRandomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateRandomButtonActionPerformed
        cavegen.generateCaves(fillSlider.getValue());
        setCaveContent(cavegen.getMap());
    }//GEN-LAST:event_generateRandomButtonActionPerformed

    private void fillSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fillSliderStateChanged
        fillLabel.setText("Fill: " + fillSlider.getValue() + "%");
    }//GEN-LAST:event_fillSliderStateChanged

    private void rangeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rangeSliderStateChanged
        rangeLabel.setText("Range: " + rangeSlider.getValue());
        if (rangeSlider.getValue() == 1) {
            this.range = 1;
            this.wallLimit = 4;
        } else if (rangeSlider.getValue() == 2) {
            this.range = 2;
            this.wallLimit = 12;
        } else if (rangeSlider.getValue() == 3) {
            this.range = 3;
            this.wallLimit = 24;
        }
    }//GEN-LAST:event_rangeSliderStateChanged

    private void shapeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeButton1ActionPerformed
        try {
            cavegen.shapeMapA(this.range, this.wallLimit);
            setCaveContent(cavegen.getMap());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "First generate a map", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_shapeButton1ActionPerformed

    private void shapeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeButton2ActionPerformed
        try {
            cavegen.shapeMapB(this.range, this.wallLimit);
            setCaveContent(cavegen.getMap());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "First generate a map", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_shapeButton2ActionPerformed

    private void shapeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeButton3ActionPerformed
        try {
            cavegen.shapeMapC(this.range, this.wallLimit);
            setCaveContent(cavegen.getMap());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "First generate a map", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_shapeButton3ActionPerformed

    private void shapeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeButton4ActionPerformed
        try {
            cavegen.shapeMapD(this.range, this.wallLimit);
            setCaveContent(cavegen.getMap());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "First generate a map", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_shapeButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonBackground;
    private javax.swing.JPanel cavePanel1;
    private javax.swing.JTextField customSeedField;
    private javax.swing.JLabel customizeAlgoLabel;
    private javax.swing.JLabel fillLabel;
    private javax.swing.JSlider fillSlider;
    private javax.swing.JButton generateCustomButton;
    private javax.swing.JButton generateRandomButton;
    private javax.swing.JLabel rangeLabel;
    private javax.swing.JSlider rangeSlider;
    private javax.swing.JLabel seedLabel;
    private javax.swing.JButton shapeButton1;
    private javax.swing.JButton shapeButton2;
    private javax.swing.JButton shapeButton3;
    private javax.swing.JButton shapeButton4;
    private javax.swing.JLabel shapingLabel;
    // End of variables declaration//GEN-END:variables

}
