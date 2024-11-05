
import br.edu.ifsul.cc.lpoo.projetolpooe1_locadora.dao.PersistenciaJPA;
import model.Cd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camargo
 */
public class TestePersistenciaLocadora {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestePersistenciaLocadora(){
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testePersistencia() {
        Cd cd = new Cd();
        cd.setNome("Red Dead Redemption");
        //cd.setDataDeLancamento("31/12/2025");
        
        /*
        Veiculo t = new Veiculo();
        t.setModelo(m);
        t.setCor("PRATA");
        t.setPlaca("ABC4T67");
        t.setTipoVeiculo(TipoVeiculo.CARRO);
        */
        
        try{
            jpa.persist(cd);
            
            
        } catch(Exception e){
            System.err.println("Erro ao persistir entidades: "+cd);
        }
        
    }
}
