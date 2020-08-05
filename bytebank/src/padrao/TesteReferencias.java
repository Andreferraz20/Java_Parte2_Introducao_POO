package padrao;

public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da primeira conta: R$"+primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta: R$"+segundaConta.saldo);
        System.out.println("________________________________");
        segundaConta.saldo +=100;
        System.out.println("Saldo da primeira conta: R$"+primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: R$"+segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("É a mesma conta");
        }

    }
}
