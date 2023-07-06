package Aula36;

public class TesteContato {

    public static void main(String[] args){

        Contato contato = new Contato();

        contato.setNome("Welson");
        //contato.setEndereco("Mutuá");
        //contato.setTelefone("21 99999-9999");

        //Relacionamente tem-um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Beijo Gelado");
        end.setNumero("22");
        end.setComplemento("Casa 2");
        end.setCidade("São Gonçalo");
        end.setEstado("RJ");
        end.setCep("24445760");

        contato.setEndereco(end);

        //Relacionamente tem-um telefone
        Telefone tel1 = new Telefone();
        tel1.setTipo("Casa");
        tel1.setDdd("21");
        tel1.setNumero("2345-6789");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Celular");
        tel2.setDdd("21");
        tel2.setNumero("98765-4321");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel1;
        telefones[1] = tel2;

        //contato.setTelefone(tel1);
        contato.setTelefones(telefones);

        //Teste saida no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

       if (contato != null && contato.getEndereco() != null){
           System.out.println(contato.getEndereco().getCidade());
       }

       /*if (contato != null && contato.getTelefone() != null){
           System.out.println("(" + contato.getTelefone().getDdd() + ") " + contato.getTelefone().getNumero());
       }*/

        if (contato != null && contato.getTelefones() != null){
            for (Telefone t: contato.getTelefones()){
                System.out.println("(" + t.getDdd() + ") " + t.getNumero());
            }
        }
    }


}
