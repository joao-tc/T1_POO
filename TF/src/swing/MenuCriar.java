package swing;

import javax.swing.JOptionPane;

import main.Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joaop
 */
public class MenuCriar extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public MenuCriar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLocomotivas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaVagoes = new javax.swing.JTextArea();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jTextFieldVagoes = new javax.swing.JTextField();
        jButtonAddVagoes = new javax.swing.JButton();
        jButtonAddVagoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVagoesActionPerformed(evt);
            }
        });
        jButtonAddLocomotivas = new javax.swing.JButton();
        jButtonAddLocomotivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLocomotivasActionPerformed(evt);
            }
        });
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        jTextFieldLocomotivas = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaCompAtual = new javax.swing.JTextArea();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jButtonRemove = new javax.swing.JButton();
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 350));
        setSize(new java.awt.Dimension(600, 350));

        jPanel1.setBackground(new java.awt.Color(33, 164, 255));

        jButtonMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonMenu.setText("Voltar ao menu");
        jButtonMenu.setPreferredSize(new java.awt.Dimension(156, 23));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jButtonListar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonListar.setText("Listar Composições");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButtonListar)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTextAreaLocomotivas.setEditable(false);
        jTextAreaLocomotivas.setColumns(20);
        jTextAreaLocomotivas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLocomotivas);

        jTextAreaVagoes.setEditable(false);
        jTextAreaVagoes.setColumns(20);
        jTextAreaVagoes.setRows(5);
        jScrollPane2.setViewportView(jTextAreaVagoes);

        jLabel1.setText("Vagões:");

        jLabel2.setText("Locomotivas:");

        jLabel3.setText("ID:");

        jTextFieldVagoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVagoesActionPerformed(evt);
            }
        });

        jButtonAddVagoes.setText("Adicionar");
        jButtonAddVagoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVagoesActionPerformed(evt);
            }
        });

        jButtonAddLocomotivas.setText("Adicionar");

        jLabel4.setText("ID:");

        jTextFieldLocomotivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocomotivasActionPerformed(evt);
            }
        });

        jTextAreaCompAtual.setEditable(false);
        jTextAreaCompAtual.setColumns(21);
        jTextAreaCompAtual.setRows(5);
        jScrollPane3.setViewportView(jTextAreaCompAtual);

        jLabel5.setText("Composição atual:");

        jButtonRemove.setText("Remover");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldVagoes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddVagoes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLocomotivas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddLocomotivas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemove)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldVagoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddVagoes)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLocomotivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddLocomotivas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        setTitle("Trabalho Final POO");
        pack();
    }// </editor-fold>                        

    
    private void jTextFieldVagoesActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                
    
    private void jTextFieldLocomotivasActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }
    
    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Main.menu.setLocationRelativeTo(this);
        Main.menu.setVisible(true);
        this.setVisible(false);
    }                       
    
    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {
        if(Main.composicoes[Main.editIdComp].getLen() > 1)
            Main.composicoes[Main.editIdComp].pop();
        refresh();
    }

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Main.menuListar.setLocationRelativeTo(this);
        Main.menuListar.setVisible(true);
        Main.menuListar.refresh();
        this.setVisible(false);
    }                                                                                       

    private void jButtonAddLocomotivasActionPerformed(java.awt.event.ActionEvent evt) {
        int id;

        try {
            id = Integer.parseInt(jTextFieldLocomotivas.getText());
            jTextFieldLocomotivas.setText("");
            Main.editComp(Main.editIdComp, 0, id);
        } catch (Exception e) {
            // TODO: handle exception
        }

        refresh();
    }

    private void jButtonAddVagoesActionPerformed(java.awt.event.ActionEvent evt) {
        int id;

        try {
            id = Integer.parseInt(jTextFieldVagoes.getText());
            jTextFieldVagoes.setText("");
            Main.editComp(Main.editIdComp, 1, id);
        } catch (Exception e) {
            // TODO: handle exception
        }

        refresh();
    }

    public void newAlert(int tipo) {
        String sTipo;
        if(tipo == 0) {
            sTipo = "Vagão";
        } else {
            sTipo = "Locomotiva";
        }
        JOptionPane.showMessageDialog(null, "Não foi possivel adicionar " + sTipo, "", JOptionPane.INFORMATION_MESSAGE);
    }

    public void refresh() {
        jTextAreaLocomotivas.setText(Main.printLocomotivas());
        jTextAreaVagoes.setText(Main.printVagoes());
        try {
            jTextAreaCompAtual.setText(Main.composicoes[Main.editIdComp].toString() + "\n" +
                Main.composicoes[Main.editIdComp].totostring());
        } catch (Exception e) {

        }
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAddLocomotivas;
    private javax.swing.JButton jButtonAddVagoes;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaCompAtual;
    private javax.swing.JTextArea jTextAreaLocomotivas;
    private javax.swing.JTextArea jTextAreaVagoes;
    private javax.swing.JTextField jTextFieldLocomotivas;
    private javax.swing.JTextField jTextFieldVagoes;
    // End of variables declaration                   
}
