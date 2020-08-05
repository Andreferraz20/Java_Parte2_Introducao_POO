package padrao;

public class TestaGeteSet {
    public static void main(String[] args) {

        Conta conta = new Conta(1,1);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");


        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

        conta.getTitular().setCpf("111.111.111-11");
        System.out.println(conta.getTitular().getCpf());


    }
}
