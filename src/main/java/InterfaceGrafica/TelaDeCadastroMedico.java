package InterfaceGrafica;

import DAO.CadastroDAO;
import DAO.EnderecoDAO;
import DAO.MedicoDAO;
import Model.Cadastro;
import Model.Endereco;
import Model.Medico;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaDeCadastroMedico extends javax.swing.JInternalFrame {
    private Cadastro a;
    private CadastroDAO dao;
    
    private Medico m;
    private MedicoDAO mDAO;
    
    private Endereco e;
    private EnderecoDAO eDAO;

    
    public TelaDeCadastroMedico() {
        a = new Cadastro();
        dao = new CadastroDAO();
        
        e = new Endereco();
        eDAO = new EnderecoDAO();
        
        m = new Medico();
        mDAO = new MedicoDAO();
        
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
                                          medico.getId_cadastro().getTelefone()});
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
        textoCRM.setText("");
        textoESP.setText("");
        
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
        m.setEspecialidade("");
        m.setCrm(0);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Numero = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        boxGenero = new javax.swing.JComboBox<>();
        textoNumero = new javax.swing.JTextField();
        textoGenero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        Nascimento = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textoCEP = new javax.swing.JTextField();
        textoEstado = new javax.swing.JTextField();
        textoNome = new javax.swing.JTextField();
        textoNascimento = new javax.swing.JTextField();
        textoEmail = new javax.swing.JTextField();
        textoCPF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textoTelefone = new javax.swing.JTextField();
        textoMunicipio = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textoBairro = new javax.swing.JTextField();
        textoRua = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        textoCRM = new javax.swing.JTextField();
        textoESP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Médico");

        jPanel1.setLayout(null);

        btnCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(859, 434, 116, 50);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Cfp", "E-mail", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setBounds(0, 491, 989, 191);

        Numero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Numero.setForeground(new java.awt.Color(255, 255, 255));
        Numero.setText("Número:");
        jPanel1.add(Numero);
        Numero.setBounds(460, 355, 63, 21);

        Estado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Estado.setForeground(new java.awt.Color(255, 255, 255));
        Estado.setText("Estado:");
        jPanel1.add(Estado);
        Estado.setBounds(460, 271, 53, 21);

        boxGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        boxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jPanel1.add(boxGenero);
        boxGenero.setBounds(535, 132, 120, 31);
        jPanel1.add(textoNumero);
        textoNumero.setBounds(529, 354, 130, 24);

        textoGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textoGenero.setForeground(new java.awt.Color(255, 255, 255));
        textoGenero.setText("Genero:");
        jPanel1.add(textoGenero);
        textoGenero.setBounds(460, 137, 57, 21);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nome:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 137, 48, 21);

        CEP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CEP.setForeground(new java.awt.Color(255, 255, 255));
        CEP.setText("CEP:");
        jPanel1.add(CEP);
        CEP.setBounds(460, 313, 38, 21);

        Nascimento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Nascimento.setForeground(new java.awt.Color(255, 255, 255));
        Nascimento.setText("Nascimento");
        jPanel1.add(Nascimento);
        Nascimento.setBounds(460, 187, 85, 21);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CPF:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(460, 229, 37, 21);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("E-mail:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 187, 51, 21);
        jPanel1.add(textoCEP);
        textoCEP.setBounds(519, 312, 140, 24);
        jPanel1.add(textoEstado);
        textoEstado.setBounds(519, 270, 101, 24);

        textoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(textoNome);
        textoNome.setBounds(129, 136, 297, 24);
        jPanel1.add(textoNascimento);
        textoNascimento.setBounds(551, 186, 104, 24);
        jPanel1.add(textoEmail);
        textoEmail.setBounds(129, 186, 297, 24);
        jPanel1.add(textoCPF);
        textoCPF.setBounds(515, 228, 140, 24);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefone:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 229, 68, 21);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Municipio:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(60, 271, 76, 21);
        jPanel1.add(textoTelefone);
        textoTelefone.setBounds(146, 228, 145, 24);
        jPanel1.add(textoMunicipio);
        textoMunicipio.setBounds(154, 270, 150, 24);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Bairro:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(60, 313, 49, 21);
        jPanel1.add(textoBairro);
        textoBairro.setBounds(127, 312, 245, 24);
        jPanel1.add(textoRua);
        textoRua.setBounds(127, 354, 239, 24);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Rua:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(60, 355, 33, 21);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro Médico");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(373, 6, 265, 43);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CRM:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(60, 397, 44, 21);
        jPanel1.add(textoCRM);
        textoCRM.setBounds(127, 396, 239, 24);
        jPanel1.add(textoESP);
        textoESP.setBounds(573, 396, 239, 24);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Especialidade:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(460, 397, 101, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Red.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        e.setBairro(textoBairro.getText());
        e.setCep(textoCEP.getText());
        e.setEstado(textoEstado.getText());
        e.setMunicipio(textoMunicipio.getText());
        
        String numero = textoNumero.getText();
        int valorNumero = Integer.parseInt(numero);
        e.setNumero(valorNumero);       
        e.setRua(textoRua.getText());
        
        a.setNome(textoNome.getText());
        a.setTelefone(textoTelefone.getText());
        a.setEmail(textoEmail.getText());
        
        Object box = (Object) boxGenero.getSelectedItem();
        String boxValor = box.toString();
        a.setGenero(boxValor);      
        a.setCpf(textoCPF.getText());
        a.setNascimento(textoNascimento.getText());
        a.setTipo_cadastro("Medico");
        a.setId_endereco(e);
        
        
        String crm = textoCRM.getText();
        int valorCRM = Integer.parseInt(crm);
        m.setCrm(valorCRM);
        m.setId_cadastro(a);
        m.setEspecialidade(textoESP.getText());
        
        
        eDAO.adicionarEndereco(e);
        dao.adicionarCadastro(a);
        mDAO.adicionarMedico(m);
        
        carregarDadosTable();
        limparInformacoes();
       
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked
       
    }//GEN-LAST:event_TabelaMouseClicked

    private void TabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabelaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabelaAncestorAdded

    private void textoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Nascimento;
    private javax.swing.JLabel Numero;
    private javax.swing.JTable Tabela;
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textoBairro;
    private javax.swing.JTextField textoCEP;
    private javax.swing.JTextField textoCPF;
    private javax.swing.JTextField textoCRM;
    private javax.swing.JTextField textoESP;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoEstado;
    private javax.swing.JLabel textoGenero;
    private javax.swing.JTextField textoMunicipio;
    private javax.swing.JTextField textoNascimento;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoNumero;
    private javax.swing.JTextField textoRua;
    private javax.swing.JTextField textoTelefone;
    // End of variables declaration//GEN-END:variables
}
