/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroserver;

import java.net.Socket;

/**
 *
 * @author Fernanda
 */
public class ThreadTeste extends Thread {

    private final UsuariosJpaController ctrlUsu;
    private final Socket s1;

    public ThreadTeste(UsuariosJpaController ctrlUsu, Socket s1) {
        this.ctrlUsu = ctrlUsu;
        this.s1 = s1;
    }

    @Override
    public void run() {
        
    }

}
