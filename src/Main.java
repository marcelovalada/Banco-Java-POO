import poo.banco.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("mv");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("zzz");

        ContaPoupanca pp = new ContaPoupanca(cliente2);

        Conta cc = new ContaCorrente(cliente1);


    }
}
