package InterfaceGrafica;


import DAO.CadastroDAO;
import DAO.ConsultaDAO;
import DAO.EnderecoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import DAO.SecretarioDAO;
import Model.Cadastro;
import Model.Consulta;
import Model.Endereco;
import Model.Medico;
import Model.Paciente;
import Model.Secretario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarConsulta extends javax.swing.JInternalFrame {
    private Cadastro a;
    private CadastroDAO dao;
    private Paciente p;
    private PacienteDAO pDAO;
    private Medico m;
    private MedicoDAO mDAO;
    private Endereco e;
    private EnderecoDAO eDAO;
    private Secretario s;
    private SecretarioDAO sDAO;
    private Consulta c;
    private ConsultaDAO cDAO;
    
    
    public ListarConsulta() {
        a = new Cadastro();
        dao = new CadastroDAO();
        
        p = new Paciente();
        pDAO = new PacienteDAO();
        
        m = new Medico();
        mDAO = new MedicoDAO();
        
        e = new Endereco();
        eDAO = new EnderecoDAO();
        
        s = new Secretario();
        sDAO = new SecretarioDAO();
        
        c = new Consulta();
        cDAO = new ConsultaDAO();
        
        initComponents();
        carregarDadosTable();
    }
    
    public void carregarDadosTable() {
        ConsultaDAO Condao = new ConsultaDAO();
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        model.setRowCount(0);
        List<Consulta> consultas = Condao.buscarConsultas();
        consultas.forEach((consulta) -> {
                model.addRow(new Object[]{consulta.getId_consulta(),
                                          consulta.getId_paciente().getId_cadastro().getNome(),
                                          consulta.getId_medico().getId_cadastro().getNome(),
                                          consulta.getId_secretario().getId_cadastro().getNome(),
                                          consulta.getTipo_consulta(),
                                          consulta.getData(),
                                          consulta.getHora()});
            
        });
    }
    
    
    private void limparInformacoes(){
    
    
        textoIDPaciente.setText("");
        textoIDMedico.setText("");
        textoIDSecretario.setText("");
        textoTipoConsulta.setText("");
        textoData.setText("");
        textoHora.setText("");
        textoMDC.setText("");
        
        c.getId_paciente().setId_paciente(0);
        c.getId_medico().setId_medico(0);
        c.getId_secretario().setId_secretario(0);
        c.setTipo_consulta("");
        c.setData("");
        c.setHora("");
        c.setMotivo_consulta("");
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Nascimento = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textoIDPaciente = new javax.swing.JTextField();
        textoTipoConsulta = new javax.swing.JTextField();
        textoIDMedico = new javax.swing.JTextField();
        textoData = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textoIDSecretario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        textoHora = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textoMDC = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Consultas");
        setToolTipText("");

        jPanel1.setLayout(null);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Paciente", "Médico", "Secretário", "Tipo", "Data", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabelaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 433, 956, 240);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Id do Paciente:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(104, 92, 108, 22);

        Nascimento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nascimento.setForeground(new java.awt.Color(255, 255, 255));
        Nascimento.setText("Tipo de Consulta: ");
        jPanel1.add(Nascimento);
        Nascimento.setBounds(514, 94, 133, 21);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Data:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(609, 143, 38, 21);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id do Médico:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(111, 143, 101, 21);

        textoIDPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoIDPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(textoIDPaciente);
        textoIDPaciente.setBounds(224, 94, 220, 22);
        jPanel1.add(textoTipoConsulta);
        textoTipoConsulta.setBounds(665, 93, 160, 24);
        jPanel1.add(textoIDMedico);
        textoIDMedico.setBounds(224, 142, 220, 24);
        jPanel1.add(textoData);
        textoData.setBounds(665, 142, 160, 24);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Id do Secretário: ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(95, 185, 124, 21);
        jPanel1.add(textoIDSecretario);
        textoIDSecretario.setBounds(225, 184, 219, 24);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listando Consultas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(479, 6, 301, 28);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hora:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(607, 185, 40, 21);
        jPanel1.add(textoHora);
        textoHora.setBounds(665, 184, 160, 24);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Motivo da Consulta:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(95, 232, 146, 21);
        jPanel1.add(textoMDC);
        textoMDC.setBounds(95, 265, 861, 77);

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(992, 433, 102, 45);

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(992, 505, 102, 44);

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(992, 578, 102, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Purple.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
       
        if(Tabela.getSelectedRow() >= 0 ){
            DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
            int linhaSelecionada = Tabela.getSelectedRow();
            int linha1 = (int) Tabela.getValueAt(0, 0);
            int numRows = model.getRowCount() - 1;
            
            for (int i = linhaSelecionada; i <= numRows + 1; i++){
                
                c = cDAO.buscarConsultaID(i + linha1);
                
                if(c != null){
                    
                    textoIDPaciente.setText(String.valueOf(c.getId_paciente().getId_paciente()));
                    textoIDMedico.setText(String.valueOf(c.getId_medico().getId_medico()));
                    textoIDSecretario.setText(String.valueOf(c.getId_secretario().getId_secretario()));
                    textoTipoConsulta.setText(c.getTipo_consulta());
                    textoHora.setText(c.getHora());
                    textoData.setText(c.getData());
                    textoMDC.setText(c.getMotivo_consulta());
                    break;
                    
                }
            }
        }
        
    }//GEN-LAST:event_TabelaMouseClicked

    private void TabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAncestorAdded

    private void textoIDPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoIDPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoIDPacienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(c.getId_consulta() > 0){
            int retorno = JOptionPane.showConfirmDialog(this, 
                                                        "Deseja Excluir Este Cadastro?",
                                                        "Excluir",
                                                        JOptionPane.YES_NO_OPTION);
            
            if(retorno == JOptionPane.YES_OPTION){
                c = cDAO.buscarConsultaID(c.getId_consulta());
                cDAO.removerConsulta(c);
                JOptionPane.showMessageDialog(this, "Consulta removida com sucesso!");
                limparInformacoes();
                carregarDadosTable();
                
            }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparInformacoes();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String numero = textoIDPaciente.getText();
        int idPaciente = Integer.parseInt(numero);
        p = pDAO.buscarPacienteID(idPaciente);

        c.setId_paciente(p);

        String numero1 = textoIDMedico.getText();
        int idMedico = Integer.parseInt(numero1);
        m = mDAO.buscarMedicoID(idMedico);

        c.setId_medico(m);

        String numero2 = textoIDSecretario.getText();
        int idSecretario = Integer.parseInt(numero2);
        s = sDAO.buscarSecretarioID(idSecretario);

        c.setId_secretario(s);

        c.setTipo_consulta(textoTipoConsulta.getText());
        c.setData(textoData.getText());
        c.setHora(textoHora.getText());
        c.setMotivo_consulta(textoMDC.getText());
        
        if(c.getId_consulta() > 0 && c.getId_paciente().getId_paciente() > 0 && c.getId_medico().getId_medico() > 0 && c.getId_secretario().getId_secretario() > 0){
            
            cDAO.alterarConsulta(c);
            
        }

        limparInformacoes();
        carregarDadosTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nascimento;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoData;
    private javax.swing.JTextField textoHora;
    private javax.swing.JTextField textoIDMedico;
    private javax.swing.JTextField textoIDPaciente;
    private javax.swing.JTextField textoIDSecretario;
    private javax.swing.JTextField textoMDC;
    private javax.swing.JTextField textoTipoConsulta;
    // End of variables declaration//GEN-END:variables
}
