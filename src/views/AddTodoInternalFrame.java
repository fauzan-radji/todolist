/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import com.db4o.ObjectContainer;
import controllers.ContainerController;
import models.Container;

/**
 *
 * @author fauzan-radji
 */
public class AddTodoInternalFrame extends javax.swing.JInternalFrame {

  private ContainerController containerController;

  /**
   * Creates new form AddTodoInternalFrame
   */
  public AddTodoInternalFrame(
    ObjectContainer db,
    ContainerController containerController
  ) {
    initComponents();

    this.containerController = containerController;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    labelId = new javax.swing.JLabel();
    labelList = new javax.swing.JLabel();
    textTitle = new javax.swing.JTextField();
    textId = new javax.swing.JTextField();
    buttonTambah = new javax.swing.JButton();
    buttonBatal = new javax.swing.JButton();

    labelId.setText("ID");

    labelList.setText("List Title");

    buttonTambah.setText("Tambah");
    buttonTambah.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          buttonTambahActionPerformed(evt);
        }
      }
    );

    buttonBatal.setText("Batal");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(labelId)
                        .addComponent(
                          textId,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          75,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING
                        )
                        .addComponent(textTitle)
                        .addGroup(
                          layout
                            .createSequentialGroup()
                            .addComponent(labelList)
                            .addGap(0, 0, Short.MAX_VALUE)
                        )
                    )
                )
                .addGroup(
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  layout
                    .createSequentialGroup()
                    .addGap(0, 214, Short.MAX_VALUE)
                    .addComponent(buttonTambah)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                    )
                    .addComponent(buttonBatal)
                )
            )
            .addContainerGap()
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(labelId)
                .addComponent(labelList)
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  textTitle,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  textId,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonTambah)
                .addComponent(buttonBatal)
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_buttonTambahActionPerformed
    // TODO add your handling code here:
    System.out.println("Button Tambah Clicked");
    String id = textId.getText();
    String title = textTitle.getText();
    containerController.insert(new Container(id, title));
    this.setVisible(false);
  } //GEN-LAST:event_buttonTambahActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton buttonBatal;
  private javax.swing.JButton buttonTambah;
  private javax.swing.JLabel labelId;
  private javax.swing.JLabel labelList;
  private javax.swing.JTextField textId;
  private javax.swing.JTextField textTitle;
  // End of variables declaration//GEN-END:variables
}
