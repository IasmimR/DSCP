/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Telas;

import dtoAtividades.Formula;
import dtoDocentes.Nivel;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persist.PersistenciaDao;
import persist.dao.FormulaDao;
import persist.dao.NivelDao;

/**
 *
 * @author GAOliveira
 */
public class CadNivel extends javax.swing.JFrame {

    /**
     * Creates new form Nivel
     */
    public CadNivel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNivel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNivel = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro Nivel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nivel:");

        jTableNivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id Nivel", "Nivel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNivel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableNivelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTableNivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNivelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNivel);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID:");

        jTextFieldID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNivel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCadastrar)
                        .addGap(3, 3, 3)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
         Nivel nivel = new Nivel();
        
        nivel.setDescricao(jTextFieldNivel.getText());

        NivelDao NivelDao = new NivelDao();
        try {
            NivelDao.recebeDto(nivel);
        } catch (Exception ex) {
        //    Logger.getLogger(TipoCreditoTela.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Problema ao inserir nivel", "Erro" + ex.getMessage(), WIDTH);
        }
        
        JOptionPane.showMessageDialog(rootPane, "Nivel inserida com sucesso!", "Sucesso", WIDTH);
        jTextFieldID.setText("");
        jTextFieldNivel.setText("");
        
        
        //Atualizar jtable
        
           try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();
            
            StringBuilder hql = new StringBuilder("");
            
            
            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);
            
            DefaultTableModel adm = (DefaultTableModel) jTableNivel.getModel();
            adm.setNumRows(0);
            
            for (Nivel nivell : niveis) {
                     adm.addRow(new Object[]{
                        nivell.getIdNivel(),
                        nivell.getDescricao(),
                            
                        });
            }
        } catch (Exception e) {
           
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();

            StringBuilder hql = new StringBuilder("");

            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);

            //  DefaultTableModel adm = (DefaultTableModel) jTable1.getModel();
            //  adm.setNumRows(0);

            int linha_selecionada = jTableNivel.getSelectedRow();

            //Object cod = (Object) jTable3.getValueAt(linha_selecionada, 0);
            int id;
            id =  Integer.parseInt(jTextFieldID.getText());
            

            for (Nivel nivel : niveis) {
                if (nivel.getIdNivel() == id) {
                    NivelDao.excluir(nivel);

                }
            
                jTextFieldID.setText("");
                jTextFieldNivel.setText("");
                
                
            }

            JOptionPane.showMessageDialog(null, "Nivel excluido com sucesso!");
        } catch (Exception e) {
            
        }
        
        //Atualizar jtable
        
           try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();
            
            StringBuilder hql = new StringBuilder("");
            
            
            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);
            
            DefaultTableModel adm = (DefaultTableModel) jTableNivel.getModel();
            adm.setNumRows(0);
            
            for (Nivel nivel : niveis) {
                     adm.addRow(new Object[]{
                        nivel.getIdNivel(),
                        nivel.getDescricao(),
                            
                        });
            }
        } catch (Exception e) {
          
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();

            StringBuilder hql = new StringBuilder("");

            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);

            /////////////////////////////////////// CAPTURA VALORES DAS CELULAS DA jTable CLIENTE /////////////////////////////////

            int linha_selecionada = jTableNivel.getSelectedRow();

            int id;
            
            id =  Integer.parseInt(jTextFieldID.getText());
           
            //Object teste = (Object) jTable3.getValueAt(linha_selecionada, 0);
            
            

            for (Nivel nivel : niveis) {
                if (nivel.getIdNivel() == id) {
                    String descricao = jTextFieldNivel.getText();
                   



                    //////////////////////////////////////// CELULAS ///////////////////////////////////////////////////////////////////////


                    ////////// EDITA descrição

                    if (!(nivel.getDescricao().equals(descricao))) {
                        nivel.setDescricao(descricao);
                        NivelDao nivelDao = new NivelDao();
                        try {
                            nivelDao.recebeDto(nivel);
                        } catch (Exception ex) {
                            Logger.getLogger(CadNivel.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(rootPane, "Problema ao alterar o registro", "Erro", WIDTH);
                        }
                    }



                    JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");

                }
            }
    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar registro!");
        }
       
       //Atualizar jtable
        
           try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();
            
            StringBuilder hql = new StringBuilder("");
            
            
            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);
            
            DefaultTableModel adm = (DefaultTableModel) jTableNivel.getModel();
            adm.setNumRows(0);
            
            for (Nivel nivel : niveis) {
                     adm.addRow(new Object[]{
                        nivel.getIdNivel(),
                        nivel.getDescricao(),
                            
                        });
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void jTableNivelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableNivelAncestorAdded
        //Atualizar jtable
        
           try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();
            
            StringBuilder hql = new StringBuilder("");
            
            
            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);
            
            DefaultTableModel adm = (DefaultTableModel) jTableNivel.getModel();
            adm.setNumRows(0);
            
            for (Nivel nivel : niveis) {
                     adm.addRow(new Object[]{
                        nivel.getIdNivel(),
                        nivel.getDescricao(),
                            
                        });
            }
        } catch (Exception e) {
          
        }
    }//GEN-LAST:event_jTableNivelAncestorAdded

    private void jTableNivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNivelMouseClicked
          
        try {
            PersistenciaDao persistenciaDao = new PersistenciaDao();
            Map<String, Object> params = new HashMap<String, Object>();
            
            StringBuilder hql = new StringBuilder("");
            
            
            List<Nivel> niveis = persistenciaDao.listarFiltroHql(Nivel.class, params, null, null, hql);
            
          //  DefaultTableModel adm = (DefaultTableModel) jTable3.getModel();
           // adm.setNumRows(0);
            
            for (Nivel nivel : niveis) {
               int linha_selecionada = jTableNivel.getSelectedRow();
  
        ///////// Pegar dados da Jtable
        jTextFieldID.setText(jTableNivel.getValueAt(linha_selecionada, 0).toString());
        jTextFieldNivel.setText(jTableNivel.getValueAt(linha_selecionada, 1).toString());
     
  
        Object id;
        id =  jTableNivel.getValueAt(linha_selecionada, 0);
        int resultado=Integer.parseInt(id.toString()); 
         
     
       ///////// Joga os dados da linha selecionada para os Jfield
       if(nivel.getIdNivel() == resultado){
            jTextFieldID.setText("");
            jTextFieldNivel.setText("");
       
       
            int num = nivel.getIdNivel();
        
       jTextFieldID.setText(String.valueOf(num));
       jTextFieldNivel.setText(nivel.getDescricao());

        }
       
            }
     }catch (Exception e) {
           
        }
                                           

    }//GEN-LAST:event_jTableNivelMouseClicked

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
            java.util.logging.Logger.getLogger(CadNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableNivel;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNivel;
    // End of variables declaration//GEN-END:variables
}
