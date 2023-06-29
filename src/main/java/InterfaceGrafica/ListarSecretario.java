package InterfaceGrafica;


import DAO.CadastroDAO;
import DAO.ConsultaDAO;
import DAO.EnderecoDAO;
import DAO.SecretarioDAO;
import Model.Cadastro;
import Model.Consulta;
import Model.Endereco;
import Model.Secretario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarSecretario extends javax.swing.JInternalFrame {
    private Cadastro a;
    private CadastroDAO dao;
    private Endereco e;
    private EnderecoDAO eDAO;
    private Secretario s;
    private SecretarioDAO sDAO;
    private Consulta c;
    private ConsultaDAO cDAO;
    
    
    public ListarSecretario() {
        a = new Cadastro();
        dao = new CadastroDAO();
        
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
        SecretarioDAO Secdao = new SecretarioDAO();
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        model.setRowCount(0);
        List<Secretario> secretarios = Secdao.buscarSecretarios();
        secretarios.forEach((secretario) -> {
            if("Secretario".equals(secretario.getId_cadastro().getTipo_cadastro())){
                model.addRow(new Object[]{secretario.getId_secretario(),
                                          secretario.getId_cadastro().getNome(),
                                          secretario.getId_cadastro().getCpf(),
                                          secretario.getId_cadastro().getEmail(),
                                          secretario.getId_cadastro().getTelefone()});
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
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Lista de Secretários");

        jPanel1.setLayout(null);

        submitBotao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitBotao.setText("Atualizar");
        submitBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(submitBotao);
        submitBotao.setBounds(983, 489, 104, 44);

        cleanBotao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cleanBotao.setText("Limpar");
        cleanBotao.setToolTipText("");
        cleanBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(cleanBotao);
        cleanBotao.setBounds(983, 412, 104, 45);

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
        jScrollPane1.setBounds(6, 412, 959, 256);

        deleteBotao.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteBotao.setText("Deletar");
        deleteBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBotao);
        deleteBotao.setBounds(983, 565, 104, 44);

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

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Listando Secretários");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(474, 6, 212, 29);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Purple.jpg"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1120, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
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

                s = sDAO.buscarSecretarioID(i + linha1);
                
                if(s != null){
                    
                    textoNome.setText(s.getId_cadastro().getNome());
                    textoTelefone.setText(s.getId_cadastro().getTelefone());
                    textoCPF.setText(s.getId_cadastro().getCpf());
                    textoNascimento.setText(s.getId_cadastro().getNascimento());
                    textoEmail.setText(s.getId_cadastro().getEmail());
                    textoGenero.setText(s.getId_cadastro().getGenero());
                    textoMunicipio.setText(s.getId_cadastro().getId_endereco().getMunicipio());
                    textoEstado.setText(s.getId_cadastro().getId_endereco().getEstado());
                    textoBairro.setText(s.getId_cadastro().getId_endereco().getBairro());
                    textoRua.setText(s.getId_cadastro().getId_endereco().getRua());
                    textoNumero.setText(String.valueOf(s.getId_cadastro().getId_endereco().getNumero()));
                    textoCEP.setText(s.getId_cadastro().getId_endereco().getCep());
                    break;
                }
            }
        }
    }//GEN-LAST:event_TabelaMouseClicked

    private void deleteBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBotaoActionPerformed
        
        if(s.getId_secretario() > 0 && s.getId_cadastro().getId_cadastro() > 0 && s.getId_cadastro().getId_endereco().getId_endereco() > 0){
            int retorno = JOptionPane.showConfirmDialog(this, 
                                                        "Deseja Excluir Este Cadastro?",
                                                        "Excluir",
                                                        JOptionPane.YES_NO_OPTION);
            
            if(retorno == JOptionPane.YES_OPTION){
                cDAO.excluirConsultasPorIdPaciente(s.getId_secretario());
                s = sDAO.buscarSecretarioID(s.getId_secretario());
                sDAO.removerSecretario(s);
                a = dao.buscarCadastroID(s.getId_cadastro().getId_cadastro());
                dao.removerCadastro(a);
                e = eDAO.buscarEnderecoID(s.getId_cadastro().getId_endereco().getId_endereco());
                eDAO.removerEndereco(e);
                JOptionPane.showMessageDialog(this, "Secretario removido com sucesso!");
                limparInformacoes();
                carregarDadosTable();
                
            }
        }
        
    }//GEN-LAST:event_deleteBotaoActionPerformed

    private void TabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAncestorAdded

    private void submitBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBotaoActionPerformed
           
        s.getId_cadastro().setNome(textoNome.getText());
        s.getId_cadastro().setTelefone(textoTelefone.getText());
        s.getId_cadastro().setEmail(textoEmail.getText());
        s.getId_cadastro().setCpf(textoCPF.getText());
        s.getId_cadastro().setNascimento(textoNascimento.getText());
        s.getId_cadastro().setGenero(textoGenero.getText());
        
        s.getId_cadastro().getId_endereco().setBairro(textoBairro.getText());
        s.getId_cadastro().getId_endereco().setEstado(textoEstado.getText());
        s.getId_cadastro().getId_endereco().setRua(textoRua.getText());
        s.getId_cadastro().getId_endereco().setMunicipio(textoMunicipio.getText());
        s.getId_cadastro().getId_endereco().setCep(textoCEP.getText());
        String num = textoNumero.getText();
        int valorNumero = Integer.parseInt(num);
        s.getId_cadastro().getId_endereco().setNumero(valorNumero);
        

        if(s.getId_secretario() > 0 && s.getId_cadastro().getId_cadastro() > 0 && s.getId_cadastro().getId_endereco().getId_endereco() > 0){
            sDAO.alterarSecretario(s);
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
    private javax.swing.JLabel jLabel15;
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
