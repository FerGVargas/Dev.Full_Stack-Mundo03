/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package cadastroee.model;

import java.math.BigDecimal;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Fernanda
 */
public class MovimentoNGTest {
    
    public MovimentoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getIdMovimento method, of class Movimento.
     */
    @Test
    public void testGetIdMovimento() {
        System.out.println("getIdMovimento");
        Movimento instance = new Movimento();
        Integer expResult = null;
        Integer result = instance.getIdMovimento();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMovimento method, of class Movimento.
     */
    @Test
    public void testSetIdMovimento() {
        System.out.println("setIdMovimento");
        Integer idMovimento = null;
        Movimento instance = new Movimento();
        instance.setIdMovimento(idMovimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidadeProduto method, of class Movimento.
     */
    @Test
    public void testGetQuantidadeProduto() {
        System.out.println("getQuantidadeProduto");
        Movimento instance = new Movimento();
        int expResult = 0;
        int result = instance.getQuantidadeProduto();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidadeProduto method, of class Movimento.
     */
    @Test
    public void testSetQuantidadeProduto() {
        System.out.println("setQuantidadeProduto");
        int quantidadeProduto = 0;
        Movimento instance = new Movimento();
        instance.setQuantidadeProduto(quantidadeProduto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoUnitario method, of class Movimento.
     */
    @Test
    public void testGetPrecoUnitario() {
        System.out.println("getPrecoUnitario");
        Movimento instance = new Movimento();
        BigDecimal expResult = null;
        BigDecimal result = instance.getPrecoUnitario();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoUnitario method, of class Movimento.
     */
    @Test
    public void testSetPrecoUnitario() {
        System.out.println("setPrecoUnitario");
        BigDecimal precoUnitario = null;
        Movimento instance = new Movimento();
        instance.setPrecoUnitario(precoUnitario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Movimento.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Movimento instance = new Movimento();
        Character expResult = null;
        Character result = instance.getTipo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Movimento.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        Character tipo = null;
        Movimento instance = new Movimento();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPessoaidPessoa method, of class Movimento.
     */
    @Test
    public void testGetPessoaidPessoa() {
        System.out.println("getPessoaidPessoa");
        Movimento instance = new Movimento();
        Pessoa expResult = null;
        Pessoa result = instance.getPessoaidPessoa();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPessoaidPessoa method, of class Movimento.
     */
    @Test
    public void testSetPessoaidPessoa() {
        System.out.println("setPessoaidPessoa");
        Pessoa pessoaidPessoa = null;
        Movimento instance = new Movimento();
        instance.setPessoaidPessoa(pessoaidPessoa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProdutoidProduto method, of class Movimento.
     */
    @Test
    public void testGetProdutoidProduto() {
        System.out.println("getProdutoidProduto");
        Movimento instance = new Movimento();
        Produto expResult = null;
        Produto result = instance.getProdutoidProduto();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProdutoidProduto method, of class Movimento.
     */
    @Test
    public void testSetProdutoidProduto() {
        System.out.println("setProdutoidProduto");
        Produto produtoidProduto = null;
        Movimento instance = new Movimento();
        instance.setProdutoidProduto(produtoidProduto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioidUsuario method, of class Movimento.
     */
    @Test
    public void testGetUsuarioidUsuario() {
        System.out.println("getUsuarioidUsuario");
        Movimento instance = new Movimento();
        Usuario expResult = null;
        Usuario result = instance.getUsuarioidUsuario();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarioidUsuario method, of class Movimento.
     */
    @Test
    public void testSetUsuarioidUsuario() {
        System.out.println("setUsuarioidUsuario");
        Usuario usuarioidUsuario = null;
        Movimento instance = new Movimento();
        instance.setUsuarioidUsuario(usuarioidUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Movimento.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Movimento instance = new Movimento();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Movimento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Movimento instance = new Movimento();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Movimento.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Movimento instance = new Movimento();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
