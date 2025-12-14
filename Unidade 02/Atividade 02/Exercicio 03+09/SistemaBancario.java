import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {

    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente("12345-X", 1000.00, 1500.00, 0.15);

        cc.exibirInformacoes();
        cc.sacar(1500);
        if (cc.getSaldo() < 0) {
            cc.aplicarJuros();
        }

        ContaPoupanca cp = new ContaPoupanca("67890-Y", 500.00, 10, 0.065);

        cp.exibirInformacoes();
        cp.sacar(600);
        cp.aplicarJuros();
        
    }
    
}
