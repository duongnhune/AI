/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Hùng Trần
 */
public class main extends javax.swing.JFrame {
     private int[][] maze1 = 
    { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
      {2,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,2},
      {2,1,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,2},
      {2,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,2},
      {2,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,2},
      {2,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,2},
      {2,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,2},
      {2,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,2},
      {2,1,1,1,1,0,1,0,1,1,1,1,0,1,0,1,0,1,1,1,2},
      {2,0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,0,0,2},
      {2,0,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,1,2},
      {2,0,0,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,2},
      {2,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,1,2},
      {2,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,0,2},
      {2,1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,2},
      {2,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1,0,1,2},
      {2,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,0,0,0,1,2},
      {2,0,0,1,0,1,1,0,1,0,0,0,0,0,1,1,1,0,1,1,2},
      {2,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1,1,0,0,9,0},
      {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}
    };// mang 2chieu ma trang 
     // moi maze là 1 level
     private int[][] maze2 = 
    { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
      {2,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,2},
      {2,1,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,2},
      {2,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,2},
      {2,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,2},
      {2,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,2},
      {2,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,2},
      {2,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,2},
      {2,1,1,1,1,0,1,0,1,1,1,1,0,1,0,1,0,1,1,1,2},
      {2,0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,0,0,2},
      {2,0,1,1,1,0,1,0,0,0,1,1,0,1,0,1,1,1,1,1,2},
      {2,0,0,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,2},
      {2,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,1,2},
      {2,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,0,2},
      {2,1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,2},
      {2,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1,0,1,2},
      {2,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,0,0,0,1,2},
      {2,0,0,1,0,1,1,0,1,0,0,0,0,0,1,1,1,0,1,1,2},
      {2,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1,1,0,0,9,0},
      {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}
    };
     private int[][] maze3 = 
    { {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
      {2,0,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,0,0,1,2},
      {2,1,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,2},
      {2,1,0,1,1,1,0,1,0,1,0,0,0,1,0,0,0,1,0,0,2},
      {2,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,2},
      {2,1,0,1,0,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,2},
      {2,1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,1,1,0,1,2},
      {2,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,2},
      {2,1,1,1,1,0,1,0,1,1,1,1,0,1,0,1,0,1,1,1,2},
      {2,0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,0,0,2},
      {2,0,1,1,1,0,1,0,0,0,1,1,0,1,1,1,1,1,1,1,2},
      {2,0,0,0,1,0,1,1,1,0,0,0,0,1,0,0,0,1,0,0,2},
      {2,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,0,1,2},
      {2,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,0,2},
      {2,1,0,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,2},
      {2,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1,0,1,2},
      {2,0,1,1,0,1,1,0,1,1,1,0,1,0,1,0,0,0,0,1,2},
      {2,0,0,1,0,1,1,0,1,0,0,0,0,0,1,1,1,0,1,1,2},
      {2,1,0,0,0,1,1,0,0,0,1,1,1,1,1,1,1,0,0,9,0},
      {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}
    };
     // 0 di duoc
     // 1 ko di duong
     // 2 tuong thanh
     // 9 hoan thanh
    private int figureX = 1;
    private int figureY = 1;
    private KeyEvent KeyEvent;
    private Vector<Integer> path,path1,path2,path3; // chua duong di
    private boolean td = false;
    private int[][] maze; // co the doc file tuy y
    public main() {
        this.setTitle("Mê cung huyền thoại");
        this.setSize(1204, 743);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        initComponents();
        cbbLevel.setSelectedIndex(0);
        maze  = maze1; // gan mac dinh la level 1
                        path1 = new DepthFirst(maze1,1,1).getPath();  //path la duong di cua ma tran
                        path2 = new DepthFirst(maze2,1,1).getPath();
                        path3 = new DepthFirst(maze3,1,1).getPath();
        path = path1;
        suKien();
        jPanel3.setFocusable(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbbLevel = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        btnTimDuong = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel4.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Mê cung huyền thoại");
        jPanel4.add(jLabel1);

        jPanel6.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Level:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));

        cbbLevel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbbLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level 1", "Level 2", "Level 3" }));
        cbbLevel.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(5, 3, 5, 3)));
        cbbLevel.setFocusable(false);
        cbbLevel.setKeySelectionManager(null);
        cbbLevel.setRequestFocusEnabled(false);
        cbbLevel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cbbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel5.setOpaque(false);

        btnTimDuong.setBackground(new java.awt.Color(0, 0, 0));
        btnTimDuong.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnTimDuong.setForeground(new java.awt.Color(255, 255, 255));
        btnTimDuong.setText("Tìm đường đi");
        btnTimDuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimDuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTimDuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnTimDuong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUp.setText("Lên");
        btnUp.setPreferredSize(new java.awt.Dimension(69, 25));
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });
        jPanel7.add(btnUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 52));

        btnDown.setText("Xuống");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });
        jPanel7.add(btnDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 52));

        btnRight.setText("Phải");
        btnRight.setPreferredSize(new java.awt.Dimension(69, 25));
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        jPanel7.add(btnRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 52));

        btnLeft.setText("Trái");
        btnLeft.setPreferredSize(new java.awt.Dimension(69, 25));
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        jPanel7.add(btnLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 68, 52));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Đề mô thuật toán A*");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel3.setFocusCycleRoot(true);
        jPanel3.setFocusTraversalPolicyProvider(true);
        jPanel3.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimDuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimDuongActionPerformed
    }//GEN-LAST:event_btnTimDuongActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        // TODO add your handling code here:
         if(figureX > 18) return;
            figureX ++;
            if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
             figureX--;
                return;
            }
            repaint();
        btnRight.setFocusable(false);
        
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        // TODO add your handling code here:
         if(figureX < 2) return;
            figureX --;
            if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
             figureX++;
                return;
            }
        repaint();
        btnLeft.setFocusable(false);
    }//GEN-LAST:event_btnLeftActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        // TODO add your handling code here:
        if(figureY > 17) return;
            figureY ++;
            if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
             figureY--;
                return;
            }
        repaint();
        btnDown.setFocusable(false); 
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        // TODO add your handling code here:
        if(figureY < 2) return;
        figureY --;
        if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
        figureY++;
           return;
       }
        repaint();
        btnUp.setFocusable(false);
    }//GEN-LAST:event_btnUpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
     @Override
    public void paint(Graphics g){
        super.paint(g);
        g.translate(135, 120);
        for(int row =0; row< maze.length; row++){
            for(int col = 0; col < maze[0].length;col++ ){
                Color color;
                switch(maze[row][col]){
                    case 1: color = Color.BLACK; break;
                    case 9: color = Color.YELLOW; break;
                    case 2: color = Color.cyan;break;
                    default: color = Color.WHITE; break;
                }
                g.setColor(color);
                g.fillRect(30*col, 30*row, 30 , 30);
                g.setColor(Color.BLACK);               
                g.drawRect(30*col, 30*row, 30 , 30);
            }
        }
       if(td){
           for(int p =0; p < path.size(); p += 2){
             Color color = null;
            int pathX = path.get(p);
            int pathY = path.get(p+1);
            switch(maze[pathY][pathX]){
                    case 3: color = Color.YELLOW; break;
                    case 9: color = Color.gray; break;
                }
            g.setColor(color);
            g.fillRect(pathX*30, pathY * 30, 30, 30);
            g.setColor(Color.BLACK);  
            g.drawRect(pathX *30, pathY *30, 30, 30);
        }
       }
       
        int pathX = figureX;
        int pathY = figureY;
        g.setColor(Color.red);
        g.fillRect(pathX *30, pathY *30, 30, 30);
        g.setColor(Color.BLACK);  
        g.drawRect(pathX *30, pathY *30, 30, 30);
        if(maze[pathY][pathX]==9){
            JOptionPane.showMessageDialog(this, "Hoàn thành");
            figureX = 1;
            figureY = 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnTimDuong;
    private javax.swing.JButton btnUp;
    private javax.swing.JComboBox cbbLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void suKien() {
        jPanel3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyPressed(KeyEvent e) {
               if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                   if(figureX < 2) return;
                   figureX --;
                   if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
                    figureX++;
                       return;
                   }
                }
                else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                     if(figureX > 18) return;
                   figureX ++;
                   if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
                    figureX--;
                       return;
                   }
                  
                }
                else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if(figureY < 2) return;
                    figureY --;
                    if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
                    figureY++;
                       return;
                   }
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                   if(figureY > 17) return;
                   figureY ++;
                   if(maze[figureY][figureX] != 0 && maze[figureY][figureX] != 9 && maze[figureY][figureX] != 3){
                    figureY--;
                       return;
                   }
                }
                else if(e.getKeyCode() == KeyEvent.VK_ENTER){
                     if(td == false) td = true;
                     else td = false;
                }
              repaint();
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        btnTimDuong.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(td){
                    td = false;
                }
                else {
                    td = true;
                }
                //td bat tat tim duong di
                repaint(); //update lai
                jPanel3.setFocusable(true);
                btnTimDuong.setFocusable(false);
            }
        });
        cbbLevel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel3.setFocusable(true);
                cbbLevel.setFocusable(false);
                btnTimDuong.setFocusable(false);
               
                td = false;
                figureX = 1;
                figureY = 1;
                
                if(cbbLevel.getSelectedIndex() == 0){
                    maze = maze1;
                    path = path1;
                }
                else if(cbbLevel.getSelectedIndex() == 1){
                    maze = maze2;
                    path = path2;
                }
                else if(cbbLevel.getSelectedIndex() == 2){
                    maze = maze3;
                    path = path3;
                }
                repaint();
            }
        });
    }

}
