package padrao;

public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);


        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50.0;
        System.out.println("Primeira conta tem R$"+ primeiraConta.saldo);
        System.out.println("Segunda conta tem R$"+segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);
        segundaConta.agencia = 146;
        System.out.println("Agorar a segunda conta esta na agencia: "+ segundaConta.agencia);
    }
}
