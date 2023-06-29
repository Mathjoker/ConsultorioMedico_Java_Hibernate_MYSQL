package DAO;

import Model.Endereco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnderecoDAO {
    
    private static EntityManagerFactory entityManagerFactory = null;
    
    private static EntityManager manager = null;
    
    public EnderecoDAO(){
        entityManagerFactory
            = Persistence.createEntityManagerFactory("gestao_de_consultorio");
        manager
            = entityManagerFactory.createEntityManager();
    }
    
    public void adicionarEndereco(Endereco a){
        manager.getTransaction().begin();
        manager.persist(a);
        manager.getTransaction().commit();
    }
    
    public Endereco buscarEnderecoID(int id_endereco){
        Endereco a = manager.find(Endereco.class, id_endereco);
        return a;
    }
    
    public void alterarEndereco(Endereco a){
        manager.getTransaction().begin();
        manager.merge(a);
        manager.getTransaction().commit();
    }
    
    public void removerEndereco(Endereco a){
        manager.getTransaction().begin();
        manager.remove(a);
        manager.getTransaction().commit();
    }
    
    public List<Endereco> buscarEnderecos(){
        List<Endereco> enderecos = manager.createQuery("from Endereco")
                .getResultList();
        return enderecos;
    }
    
}
