package DAO;

import Model.Cadastro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroDAO {
    
    private static EntityManagerFactory entityManagerFactory = null;
    
    private static EntityManager manager = null;
    
    public CadastroDAO(){
        entityManagerFactory
            = Persistence.createEntityManagerFactory("gestao_de_consultorio");
        manager
            = entityManagerFactory.createEntityManager();
    }
    
    public void adicionarCadastro(Cadastro a){
        manager.getTransaction().begin();
        manager.persist(a);
        manager.getTransaction().commit();
    }
    
    public Cadastro buscarCadastroID(int id_cadastro){
        Cadastro a = manager.find(Cadastro.class, id_cadastro);
        return a;
    }
    
    public void alterarCadastro(Cadastro a){
        manager.getTransaction().begin();
        manager.merge(a);
        manager.getTransaction().commit();
    }
    
    public void removerCadastro(Cadastro a){
        manager.getTransaction().begin();
        manager.remove(a);
        manager.getTransaction().commit();
    }
    
    public List<Cadastro> buscarCadastros(){
        List<Cadastro> cadastros = manager.createQuery("from Cadastro")
                .getResultList();
        return cadastros;
    }
    
}
