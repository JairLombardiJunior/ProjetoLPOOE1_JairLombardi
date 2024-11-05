/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.edu.ifsul.cc.lpoo.projetolpooe1_locadora.dao.PersistenciaJPA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camargo
 */
public class TesteConexaoL {
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TesteConexaoL() {
    }
    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }*/
    
    @Before
    public void setUp() {
        if(jpa.conexaoAberta()){
            System.out.println("Conexão aberta");
        } else {
            System.out.println("Erro ao abrir conexao");
        }
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void testeConexaoL() {
        System.out.println("Conexão realizada com sucesso");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
