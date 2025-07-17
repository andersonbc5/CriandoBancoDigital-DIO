package aplicacao;

import model.entities.Conta;
import model.entities.ContaCorrente;
import model.entities.ContaPoupanca;

public class Programa {
    
    public static void main(String[] args) {
        
        Conta contac = new ContaCorrente();
        
        
        Conta contap = new ContaPoupanca();
        contac.depositar(100);

        contac.transferir(100, contap);

        contac.imprimirExtrato();
        contap.imprimirExtrato();


    }
}
