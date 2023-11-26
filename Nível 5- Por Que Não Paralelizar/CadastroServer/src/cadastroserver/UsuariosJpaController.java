/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserver;

import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Fernanda
 */
public class UsuariosJpaController {

    private EntityManagerFactory emf;

    public UsuariosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
        // Não há operação não suportada ou não implementada aqui
    }

    // Outros métodos da classe

    List<Usuarios> findUsuariosEntities() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void create(Usuarios userTeste) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

