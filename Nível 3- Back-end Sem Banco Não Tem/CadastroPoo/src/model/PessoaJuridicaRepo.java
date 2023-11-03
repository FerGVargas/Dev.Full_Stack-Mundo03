package model;
import java.io.*;
import java.util.ArrayList;
public class PessoaJuridicaRepo implements Serializable {
    private ArrayList<PessoaJuridica> pessoasJuridicas;

    public PessoaJuridicaRepo() {
        pessoasJuridicas = new ArrayList<>();
    }

    public void inserir (PessoaJuridica pessoaJuridica){
        pessoasJuridicas.add(pessoaJuridica);
    }
    public void alterar (PessoaJuridica pessoaJuridica){
    int index = obterIndicePessoaJuridica(pessoaJuridica.getId());
        if (index != -1){
            pessoasJuridicas.set(index, pessoaJuridica);
        }
    }
    public void excluir(int id){
        int index = obterIndicePessoaJuridica(id);
        if (index != -1){
            pessoasJuridicas.remove(index);
        }
    }
      public PessoaJuridica obter(int id) {
        for (PessoaJuridica pessoaJuridica : pessoasJuridicas) {
            if (pessoaJuridica.getId() == id) {
                return pessoaJuridica;
            }
        }
        return null;
    }
    public ArrayList<PessoaJuridica> obterTodos() {
        return pessoasJuridicas;
    }
    private int obterIndicePessoaJuridica(int id) {
        for (int i = 0; i < pessoasJuridicas.size(); i++) {
            if (pessoasJuridicas.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void persistir(String arquivo) throws IOException {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            outputStream.writeObject(pessoasJuridicas);
        }
    }
    public void recuperar(String arquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo))) {
            pessoasJuridicas = (ArrayList<PessoaJuridica>) inputStream.readObject();
        }
    }
}