/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import lpoo_sistemaestacionamentoifsul.estacionamentoifsul.dao.PersistenciaJPA;
import model.Marca;
import model.Modelo;
import model.TipoVeiculo;
import model.Veiculo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20241pf.cc0029
 */
public class TestePersistencia {
    PersistenciaJPA jpa = new PersistenciaJPA();
    public TestePersistencia() {
    }
    
    @Before
    public void setUp() {
        if(jpa.conexaoAberta()){
            System.out.println("Conexão aberta.");
        }
        else{
            System.out.println("Erro ao abrir conexão.");
        }
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Modelo m = new Modelo();
        m.setDescricao("Crossfox");
        m.setMarca(Marca.FORD);
        
        Veiculo t = new Veiculo();
        t.setCor("PRATA");
        t.setPlaca("ABC4E67");
        t.setTipo(TipoVeiculo.CARRO);
        
        try {
            jpa.persist(m);
            jpa.persist(t);
        } catch (Exception ex) {
            Logger.getLogger(TestePersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
