/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fernanda
 */
public class CadastroServer {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("CadastroServerPU");	
	UsuariosJpaController ctrlUsu = new UsuariosJpaController(emf);	
	
	try (ServerSocket serverSocket = new ServerSocket(4321)) {
            System.out.println("Servidor aguardando conexoes na porta 4321...");
            while (true) {
                Socket socket = serverSocket.accept();
            
            
                ThreadTeste teste = new ThreadTeste( ctrlUsu, socket);
                teste.start();
                System.out.println("thread iniciado!");
            
            }
	}
    }

}
