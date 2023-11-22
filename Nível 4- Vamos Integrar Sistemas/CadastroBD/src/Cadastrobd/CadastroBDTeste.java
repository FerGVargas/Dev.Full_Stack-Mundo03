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
        pf.setNome("Fernanda");
        pf.setLogradouro("Rua Pavao, Moema");
        pf.setCidade("São Paulo");
        pf.setEstado("SP");
        pf.setTelefone("02236-010");
        pf.setEmail("fernanda@hotmail.com.br");
        pf.setCpf("00000000000");

        pfDao.incluir(pf);
    }

    public void AlterarPessoaFisica() throws SQLException, ClassNotFoundException {
        PessoaFisica pessoa = pfDao.getPessoa(2);
        pessoa.setEmail("fernanda@hotmail.com.br");
        pessoa.setCpf("12345678910");
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
        pj.setNome("M&M Ltda");
        pj.setLogradouro("Av. Bandeirantes, 1010, Jd. Aeroporto");
        pj.setCidade("Centro");
        pj.setEstado("SP");
        pj.setTelefone("11 3901-5789");
        pj.setEmail("comercial@memltda.com");
        pj.setCnpj("12123456000101");

        pjDao.incluir(pj);
    }

    public void AlterarPessoaJuridica() throws SQLException, ClassNotFoundException {
        PessoaJuridica pessoa = pjDao.getPessoa(23);
        pessoa.setEmail("comercial@memltda.com");
        pessoa.setCnpj("12123456000101");
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