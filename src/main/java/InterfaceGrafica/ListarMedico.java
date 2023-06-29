package InterfaceGrafica;


import DAO.CadastroDAO;
import DAO.ConsultaDAO;
import DAO.EnderecoDAO;
import DAO.MedicoDAO;
import Model.Cadastro;
import Model.Consulta;
import Model.Endereco;
import Model.Medico;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarMedico extends javax.swing.JInternalFrame {
    private Cadastro a;
    private CadastroDAO dao;
    private Endereco e;
    private EnderecoDAO eDAO;
    private Medico m;
    private MedicoDAO mDAO;
    private Consulta c;
    private ConsultaDAO cDAO;
    
    
    public ListarMedico() {
        a = new Cadastro();
        dao = new CadastroDAO();
        
        e = new Endereco();
        eDAO = new EnderecoDAO();
        
        m = new Medico();
        mDAO = new MedicoDAO();
        
        c = new Consulta();
        cDAO = new ConsultaDAO();
        
        initComponents();
        carregarDadosTable();
    }
    
    public void carregarDadosTable() {
        MedicoDAO Meddao = new MedicoDAO();
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        model.setRowCount(0);
        List<Medico> medicos = Meddao.buscarMedicos();
        medicos.forEach((medico) -> {
            if("Medico".equals(medico.getId_cadastro().getTipo_cadastro())){
                model.addRow(new Object[]{medico.getId_medico(),
                                          medico.getId_cadastro().getNome(),
                                          medico.getId_cadastro().getCpf(),
                                          medico.getId_cadastro().getEmail(),
                                          medico.getId_cadastro().getTelefone(),
                                          medico.getEspecialidade()});
            }
        });  
    }
    
    private void limparInformacoes(){
        textoNome.setText("");
        textoEmail.setText("");
        textoCPF.setText("");
        textoNascimento.setText("");
        textoTelefone.setText("");
        textoEmail.setText("");
        textoGenero.setText("");
        textoBairro.setText("");
        textoCEP.setText("");
        textoEstado.setText("");
        textoMunicipio.setText("");
        textoNumero.setText("");
        textoRua.setText("");
        textoESP.setText("");
        textoCRM.setText("");
        
        a.setId_cadastro(0);
        a.setNome("");
        a.setEmail("");
        a.setCpf("");
        a.setNascimento("");
        a.setTelefone("");
        a.setGenero("");
        e.setId_endereco(0);
        e.setBairro("");
        e.setEstado("");
        e.setMunicipio("");
        e.setNumero(0);
        e.setRua("");
        e.setCep("");
        m.setId_medico(0);
        m.setId_cadastro(a);
        m.setCrm(0);
        m.setEspecialidade("");
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submitBotao = new javax.swing.JButton();
        cleanBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        deleteBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textoCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textoGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textoTelefone = new javax.swing.JTextField();
        textoMunicipio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textoEstado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textoNascimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textoBairro = new javax.swing.JTextField();
        textoRua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textoNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textoCEP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textoCRM = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textoESP = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Médicos");

        jPanel1.setLayout(null);

        submitBotao.setText("Atualizar");
        submitBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(submitBotao);
        submitBotao.setBounds(1029, 489, 104, 44);

        cleanBotao.setText("Limpar");
        cleanBotao.setToolTipText("");
        cleanBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cleanBotao);
        cleanBotao.setBounds(1029, 412, 104, 45);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Email", "Telefone", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.getTableHeader().setReorderingAllowed(false);
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
        if (Tabela.getColumnModel().getColumnCount() > 0) {
            Tabela.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(6, 412, 1005, 256);

        deleteBotao.setText("Deletar");
        deleteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBotao);
        deleteBotao.setBounds(1029, 565, 104, 44);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(56, 94, 48, 21);
        jPanel1.add(textoNome);
        textoNome.setBounds(122, 93, 188, 24);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(59, 136, 45, 21);
        jPanel1.add(textoEmail);
        textoEmail.setBounds(122, 135, 188, 24);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(56, 178, 37, 21);
        jPanel1.add(textoCPF);
        textoCPF.setBounds(122, 177, 188, 24);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gênero:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(47, 220, 57, 21);
        jPanel1.add(textoGenero);
        textoGenero.setBounds(122, 219, 188, 24);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(36, 262, 68, 21);
        jPanel1.add(textoTelefone);
        textoTelefone.setBounds(122, 261, 188, 24);
        jPanel1.add(textoMunicipio);
        textoMunicipio.setBounds(453, 93, 188, 24);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Município:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(359, 94, 76, 21);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(382, 136, 53, 21);
        jPanel1.add(textoEstado);
        textoEstado.setBounds(453, 135, 188, 24);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nascimento:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(15, 304, 89, 21);
        jPanel1.add(textoNascimento);
        textoNascimento.setBounds(122, 303, 188, 24);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bairro:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(386, 178, 49, 21);
        jPanel1.add(textoBairro);
        textoBairro.setBounds(453, 177, 188, 24);
        jPanel1.add(textoRua);
        textoRua.setBounds(453, 219, 188, 24);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Rua:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(402, 220, 33, 21);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Número:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(372, 262, 63, 21);
        jPanel1.add(textoNumero);
        textoNumero.setBounds(453, 261, 188, 24);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CEP:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(397, 304, 38, 21);
        jPanel1.add(textoCEP);
        textoCEP.setBounds(453, 303, 188, 24);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CRM:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(758, 94, 44, 21);
        jPanel1.add(textoCRM);
        textoCRM.setBounds(820, 93, 188, 24);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Especialidade:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(701, 136, 101, 21);
        jPanel1.add(textoESP);
        textoESP.setBounds(820, 135, 188, 24);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Listando Médicos");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(474, 6, 182, 29);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Purple.jpg"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 1160, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
        // TODO add your handling code here:
        
        if(Tabela.getSelectedRow() >= 0 ){
            DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
            int linhaSelecionada = Tabela.getSelectedRow();
            int linha1 = (int) Tabela.getValueAt(0, 0);
            int numRows = model.getRowCount() - 1;
            
                for (int i = linhaSelecionada; i <= numRows + 1; i++){
                    
                    m = mDAO.buscarMedicoID(i + linha1);
                    
                    if(m != null){
                        
                        textoNome.setText(m.getId_cadastro().getNome());
                        textoTelefone.setText(m.getId_cadastro().getTelefone());
                        textoCPF.setText(m.getId_cadastro().getCpf());
                        textoNascimento.setText(m.getId_cadastro().getNascimento());
                        textoEmail.setText(m.getId_cadastro().getEmail());
                        textoGenero.setText(m.getId_cadastro().getGenero());
                        textoMunicipio.setText(m.getId_cadastro().getId_endereco().getMunicipio());
                        textoEstado.setText(m.getId_cadastro().getId_endereco().getEstado());
                        textoBairro.setText(m.getId_cadastro().getId_endereco().getBairro());
                        textoRua.setText(m.getId_cadastro().getId_endereco().getRua());
                        textoNumero.setText(String.valueOf(m.getId_cadastro().getId_endereco().getNumero()));
                        textoCEP.setText(m.getId_cadastro().getId_endereco().getCep());
                        textoCRM.setText(String.valueOf(m.getCrm()));
                        textoESP.setText(m.getEspecialidade());
                        break;
                    }
                }
        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void deleteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBotaoActionPerformed

        if(m.getId_medico() > 0 && m.getId_cadastro().getId_cadastro() > 0 && m.getId_cadastro().getId_endereco().getId_endereco() > 0){
            int retorno = JOptionPane.showConfirmDialog(this, 
                                                        "Deseja Excluir Este Cadastro?",
                                                        "Excluir",
                                                        JOptionPane.YES_NO_OPTION);
            
            if(retorno == JOptionPane.YES_OPTION){
                cDAO.excluirConsultasPorIdPaciente(m.getId_medico());
                m = mDAO.buscarMedicoID(m.getId_medico());
                mDAO.removerMedico(m);
                a = dao.buscarCadastroID(m.getId_cadastro().getId_cadastro());
                dao.removerCadastro(a);
                e = eDAO.buscarEnderecoID(m.getId_cadastro().getId_endereco().getId_endereco());
                eDAO.removerEndereco(e);
                JOptionPane.showMessageDialog(this, "Médico removido com sucesso!");
                limparInformacoes();
                carregarDadosTable();
                
            }
        }
        
    }//GEN-LAST:event_deleteBotaoActionPerformed

    private void TabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAncestorAdded

    private void submitBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBotaoActionPerformed

        m.getId_cadastro().setNome(textoNome.getText());
        m.getId_cadastro().setTelefone(textoTelefone.getText());
        m.getId_cadastro().setEmail(textoEmail.getText());
        m.getId_cadastro().setCpf(textoCPF.getText());
        m.getId_cadastro().setNascimento(textoNascimento.getText());
        m.getId_cadastro().setGenero(textoGenero.getText());
        
        m.getId_cadastro().getId_endereco().setBairro(textoBairro.getText());
        m.getId_cadastro().getId_endereco().setEstado(textoEstado.getText());
        m.getId_cadastro().getId_endereco().setRua(textoRua.getText());
        m.getId_cadastro().getId_endereco().setMunicipio(textoMunicipio.getText());
        m.getId_cadastro().getId_endereco().setCep(textoCEP.getText());
        String num = textoNumero.getText();
        int valorNumero = Integer.parseInt(num);
        m.getId_cadastro().getId_endereco().setNumero(valorNumero);
        
        String numCRM = textoCRM.getText();
        int valorNumeroCRM = Integer.parseInt(numCRM);
        m.setCrm(valorNumeroCRM);
        m.setEspecialidade(textoESP.getText());



        if(m.getId_medico() > 0 && m.getId_cadastro().getId_cadastro() > 0 && m.getId_cadastro().getId_endereco().getId_endereco() > 0){
            mDAO.alterarMedico(m);
        }
        
        
       
        limparInformacoes();
        carregarDadosTable();

    }//GEN-LAST:event_submitBotaoActionPerformed

    private void cleanBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanBotaoActionPerformed
        limparInformacoes();
       
    }//GEN-LAST:event_cleanBotaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton cleanBotao;
    private javax.swing.JButton deleteBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submitBotao;
    private javax.swing.JTextField textoBairro;
    private javax.swing.JTextField textoCEP;
    private javax.swing.JTextField textoCPF;
    private javax.swing.JTextField textoCRM;
    private javax.swing.JTextField textoESP;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoEstado;
    private javax.swing.JTextField textoGenero;
    private javax.swing.JTextField textoMunicipio;
    private javax.swing.JTextField textoNascimento;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoNumero;
    private javax.swing.JTextField textoRua;
    private javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
