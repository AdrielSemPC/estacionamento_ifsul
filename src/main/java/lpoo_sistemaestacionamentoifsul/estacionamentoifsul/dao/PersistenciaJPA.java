/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lpoo_sistemaestacionamentoifsul.estacionamentoifsul.dao;

import java.util.Collection;
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
            if(!entity.contains(o)){
                o = entity.merge(o);
            }
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
            if(!entity.contains(o)){
                o = entity.merge(o);
            }
            entity.remove(o);
            entity.getTransaction().commit();
        } catch (Exception e) {
            if (entity.getTransaction().isActive()) {
                entity.getTransaction().rollback();
            }
        }
    }
    
    //funções para listar dados
    
    public List<Veiculo> getVeiculos(){
        entity = getEntityManager();
        try{
            TypedQuery<Veiculo> query = entity.createQuery("Select v from Veiculo v", Veiculo.class);
            return query.getResultList();
        }catch(Exception e){
           System.err.println("Erro ao buscar Veiculos: " + e);
           return null;
        }
    }
    
    public List<Veiculo> getVeiculosPlaca(String placa){
        entity = getEntityManager();
        if(placa.length() == 0){
            return null;
        }
        try{
            TypedQuery<Veiculo> query = entity.createQuery("Select v from Veiculo v where lower(v.placa) like :placa", Veiculo.class);
            query.setParameter("placa", "%"+placa.toUpperCase()+"%");
            return query.getResultList();
        }catch (Exception e){
            System.err.println("Erro ao buscar Veiculos: " + e);
            return null;
        }
    }
    
     public List<VeiculoOficial> getVeiculosOficial(){
        entity = getEntityManager();
        try{
            TypedQuery<VeiculoOficial> query = entity.createQuery("Select v from VeiculoOficial v", VeiculoOficial.class);
            return query.getResultList();
        }catch (Exception e){
            System.err.println("Erro ao buscar Veiculos Oficiais: " + e);
            return null;
        }
    }
        
    
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
    
    public List<Pessoa> getPessoasVinculo(VinculoPessoa vinculo){
        entity = getEntityManager();
        try{
            TypedQuery<Pessoa> query = entity.createQuery("Select p from Pessoa p where p.vinculoPessoa = :vinculo", Pessoa.class);
            query.setParameter("vinculo", vinculo);
            return query.getResultList();
        }catch (Exception e){
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }
    
        public List<Pessoa> getPessoasNome(String nome){
        entity = getEntityManager();
        if(nome.length() == 0){
            return null;
        }
        try{
            TypedQuery<Pessoa> query = entity.createQuery("Select p from Pessoa p where lower(p.nome) like :nome", Pessoa.class);
            query.setParameter("nome", "%"+nome.toLowerCase()+"%");
            return query.getResultList();
        }catch (Exception e){
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }

    public List<Modelo> getModelos(){
        entity = getEntityManager();
        try{
            TypedQuery<Modelo> query = entity.createQuery("Select m from Modelo m", Modelo.class);
            return query.getResultList();
        }catch (Exception e){
            System.err.println("Erro ao buscar Pessoas: " + e);
            return null;
        }
    }
}
