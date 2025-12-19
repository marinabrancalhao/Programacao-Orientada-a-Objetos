public class TransacaoInvalidaException extends Exception {
    
    TransacaoInvalidaException(String mensagem){
        super(mensagem); 
    }

    TransacaoInvalidaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}
