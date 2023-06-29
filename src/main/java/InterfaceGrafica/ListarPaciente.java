package InterfaceGrafica;


import DAO.CadastroDAO;
import DAO.ConsultaDAO;
import DAO.EnderecoDAO;
import DAO.PacienteDAO;
import Model.Cadastro;
import Model.Consulta;
import Model.Endereco;
import Model.Paciente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarPaciente extends javax.swing.JInternalFrame {
    private Cadastro a;
    private CadastroDAO dao;
    private Endereco e;
    private EnderecoDAO eDAO;
    private Paciente p;
    private PacienteDAO pDAO;
    private Consulta c;
    private ConsultaDAO cDAO;
    
    
    public ListarPaciente() {
        a = new Cadastro();
        dao = new CadastroDAO();
        
        e = new Endereco();
        eDAO = new EnderecoDAO();
        
        p = new Paciente();
        pDAO = new PacienteDAO();

        c = new Consulta();
        cDAO = new ConsultaDAO();
        
        initComponents();
        carregarDadosTable();
    }
    
    public void carregarDadosTable() {
        PacienteDAO Pacdao = new PacienteDAO();
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        model.setRowCount(0);
        List<Paciente> pacientes = Pacdao.buscarPacientes();
        pacientes.forEach((paciente) -> {
            if("Paciente".equals(paciente.getId_cadastro().getTipo_cadastro())){
                model.addRow(new Object[]{paciente.getId_cadastro().getId_cadastro(),
                                          paciente.getId_cadastro().getNome(),
                                          paciente.getId_cadastro().getCpf(),
                                          paciente.getId_cadastro().getEmail(),
                                          paciente.getId_cadastro().getTelefone(),
                                          paciente.getId_cadastro().getNascimento(),                                        
                                          paciente.getId_cadastro().getGenero()});
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
        textoAlergias.setText("");
        textoPDS.setText("");
        
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
        p.setId_paciente(0);
        p.setId_cadastro(a);
        p.setAlergias("");
        p.setPlano_saude("");
        
        
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
        textoAlergias = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textoPDS = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Pacientes");

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
                "Código", "Nome", "CPF", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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
        jLabel13.setText("Alergias:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(756, 94, 61, 21);
        jPanel1.add(textoAlergias);
        textoAlergias.setBounds(835, 93, 188, 24);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Plano de Saúde:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(701, 136, 116, 21);
        jPanel1.add(textoPDS);
        textoPDS.setBounds(835, 135, 188, 24);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Listando Pacientes");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(474, 6, 193, 29);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Purple.jpg"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 1160, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1147, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
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
            
                    p = pDAO.buscarPacienteID(i + linha1);
            
                    if(p != null){
            
                        textoNome.setText(p.getId_cadastro().getNome());
                        textoTelefone.setText(p.getId_cadastro().getTelefone());
                        textoCPF.setText(p.getId_cadastro().getCpf());
                        textoNascimento.setText(p.getId_cadastro().getNascimento());
                        textoEmail.setText(p.getId_cadastro().getEmail());
                        textoGenero.setText(p.getId_cadastro().getGenero());
                        textoMunicipio.setText(p.getId_cadastro().getId_endereco().getMunicipio());
                        textoEstado.setText(p.getId_cadastro().getId_endereco().getEstado());
                        textoBairro.setText(p.getId_cadastro().getId_endereco().getBairro());
                        textoRua.setText(p.getId_cadastro().getId_endereco().getRua());
                        textoNumero.setText(String.valueOf(p.getId_cadastro().getId_endereco().getNumero()));
                        textoCEP.setText(p.getId_cadastro().getId_endereco().getCep());
                        textoAlergias.setText(p.getAlergias());
                        textoPDS.setText(p.getPlano_saude());
                        break;
            
                    }
                }
        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void deleteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBotaoActionPerformed
        
        if(p.getId_paciente() > 0 && p.getId_cadastro().getId_cadastro() > 0 && p.getId_cadastro().getId_endereco().getId_endereco() > 0){
            int retorno = JOptionPane.showConfirmDialog(this, 
                                                        "Deseja Excluir Este Cadastro?",
                                                        "Excluir",
                                                        JOptionPane.YES_NO_OPTION);
            
            if(retorno == JOptionPane.YES_OPTION){

                cDAO.excluirConsultasPorIdPaciente(p.getId_paciente());
                p = pDAO.buscarPacienteID(p.getId_paciente());
                pDAO.removerPaciente(p);
                a = dao.buscarCadastroID(p.getId_cadastro().getId_cadastro());
                dao.removerCadastro(a);
                e = eDAO.buscarEnderecoID(p.getId_cadastro().getId_endereco().getId_endereco());
                eDAO.removerEndereco(e);
                
                JOptionPane.showMessageDialog(this, "Paciente removido com sucesso!");
                limparInformacoes();
                carregarDadosTable();
                
            }
        }
        
       
    }//GEN-LAST:event_deleteBotaoActionPerformed

    private void TabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAncestorAdded

    private void submitBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBotaoActionPerformed
          
        
        
        
        p.getId_cadastro().setNome(textoNome.getText());
        p.getId_cadastro().setTelefone(textoTelefone.getText());
        p.getId_cadastro().setEmail(textoEmail.getText());
        p.getId_cadastro().setCpf(textoCPF.getText());
        p.getId_cadastro().setNascimento(textoNascimento.getText());
        p.getId_cadastro().setGenero(textoGenero.getText());
        
        p.getId_cadastro().getId_endereco().setBairro(textoBairro.getText());
        p.getId_cadastro().getId_endereco().setEstado(textoEstado.getText());
        p.getId_cadastro().getId_endereco().setRua(textoRua.getText());
        p.getId_cadastro().getId_endereco().setMunicipio(textoMunicipio.getText());
        p.getId_cadastro().getId_endereco().setCep(textoCEP.getText());
        String num = textoNumero.getText();
        int valorNumero = Integer.parseInt(num);
        p.getId_cadastro().getId_endereco().setNumero(valorNumero);
        
        p.setAlergias(textoAlergias.getText());
        p.setPlano_saude(textoPDS.getText());



        if(p.getId_paciente() > 0 && p.getId_cadastro().getId_cadastro() > 0 && p.getId_cadastro().getId_endereco().getId_endereco() > 0){
            pDAO.alterarPaciente(p);
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
    private javax.swing.JTextField textoAlergias;
    private javax.swing.JTextField textoBairro;
    private javax.swing.JTextField textoCEP;
    private javax.swing.JTextField textoCPF;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoEstado;
    private javax.swing.JTextField textoGenero;
    private javax.swing.JTextField textoMunicipio;
    private javax.swing.JTextField textoNascimento;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoNumero;
    private javax.swing.JTextField textoPDS;
    private javax.swing.JTextField textoRua;
    private javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
