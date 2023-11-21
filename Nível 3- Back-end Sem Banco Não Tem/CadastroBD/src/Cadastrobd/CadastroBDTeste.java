package cadastrobd;

import cadastrobd.model.PessoaFisica;
import cadastrobd.model.PessoaJuridica;
import cadastrobd.model.dao.PessoaFisicaDAO;
import cadastrobd.model.dao.PessoaJuridicaDAO;
import cadastrobd.model.util.ConectorBD;
import java.sql.SQLException;
import java.util.List;

public class CadastroBDTeste {

    private final ConectorBD bd;
    private final PessoaFisicaDAO pfDao;
    private final PessoaJuridicaDAO pjDao;

    public CadastroBDTeste() {
        bd = new ConectorBD();
        pfDao = new PessoaFisicaDAO(bd);
        pjDao = new PessoaJuridicaDAO(bd);
    }

    public void CriarPessoaFisica() throws SQLException, ClassNotFoundException {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Sirius");
        pf.setLogradouro("Rua da Cerejeira, casa 3, Pão de Queijo");
        pf.setCidade("Riacho do Noroeste");
        pf.setEstado("MG");
        pf.setTelefone("4444-4444");
        pf.setEmail("sirius@riacho.com");
        pf.setCpf("00000000000");

        pfDao.incluir(pf);
    }

    public void AlterarPessoaFisica() throws SQLException, ClassNotFoundException {
        PessoaFisica pessoa = pfDao.getPessoa(2);
        pessoa.setEmail("sirius@riachosul.com");
        pessoa.setCpf("77777777777");
        pfDao.alterar(pessoa);
    }

    public void ListarPessoasFisicas() throws SQLException, ClassNotFoundException {
        List<PessoaFisica> arraypf = pfDao.getPessoas();
        for (PessoaFisica pessoaFisica : arraypf) {
            System.out.println(pessoaFisica.exibir());
        }
    }

    public void ExcluirPessoaFisica() throws SQLException, ClassNotFoundException {
        PessoaFisica pessoa = pfDao.getPessoa(22);
        pfDao.excluir(pessoa);
    }

    public void CriarPessoaJuridica() throws SQLException, ClassNotFoundException {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("KQO");
        pj.setLogradouro("Rua das Pitangas, n 60, Doce de Leite");
        pj.setCidade("Riacho do Sudeste");
        pj.setEstado("GO");
        pj.setTelefone("5656-5656");
        pj.setEmail("KQO@riacho.com");
        pj.setCnpj("11111111111111");

        pjDao.incluir(pj);
    }

    public void AlterarPessoaJuridica() throws SQLException, ClassNotFoundException {
        PessoaJuridica pessoa = pjDao.getPessoa(23);
        pessoa.setEmail("empresa@teste.com");
        pessoa.setCnpj("00000000000000");
        pjDao.alterar(pessoa);
    }

    public void ListarPessoasJuridicas() throws SQLException, ClassNotFoundException {
        List<PessoaJuridica> arraypj = pjDao.getPessoas();
        for (PessoaJuridica pessoaJuridica : arraypj) {
            System.out.println(pessoaJuridica.exibir());
        }
    }

    public void ExcluirPessoaJuridica() throws SQLException, ClassNotFoundException {
        PessoaJuridica pessoa = pjDao.getPessoa(23);
        pjDao.excluir(pessoa);
    }
}