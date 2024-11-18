/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo_sistemaestacionamentoifsul.estacionamentoifsul.dao;

import java.util.List;
import javax.persistence.*;
import model.*;

/**
 *
 * @author 20241PF.CC0029
 */
public class PersistenciaJPA implements InterfaceBD{
    EntityManager entity;
    EntityManagerFactory factory;
    
    public PersistenciaJPA(){
        factory = Persistence.createEntityManagerFactory("PU_LPOO_SISTEMAESTACIONAMENTO");
        entity = factory.createEntityManager();
        
    }
    
    @Override
    public Boolean conexaoAberta(){
        return entity.isOpen();
    }
    
    @Override
    public void fecharConexao(){
        entity.close();
    }
    
    public Object find(Class c, Object id) throws Exception{
        return null;
    }
    
    @Override
    public void persist(Object o) throws Exception{
        entity = getEntityManager();
        try{
            entity.getTransaction().begin();
            entity.persist(o);
            entity.getTransaction().commit();
        }
        catch (Exception e){
            entity.getTransaction().rollback();
        }
    }
    
    public EntityManager getEntityManager(){
        if(entity == null || !entity.isOpen()){
            entity = factory.createEntityManager();
        }
        return entity;
    }
    
    @Override
    public void remover(Object o) throws Exception{
        entity = getEntityManager();
        try {
            entity.getTransaction().begin();
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }
    
    //funções para listar dados
    public List<Pessoa> getPessoas(){
        entity = getEntityManager();
        try{
            TypedQuery<Pessoa> query = entity.createQuery("Select p from Pessoa p", Pessoa.class);
            return query.getResultList();
        }catch (Exception e){
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
        
    }
}
