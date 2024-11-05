
/**
 * Representa uma conta de banco simplificada.
 * 
 * Os valores de dinheiro são expressos em centavos.
 * 
 * @author Daniel Conrado
 * @version 2023
 */
public class Conta
{
    // variáveis de instância / campos / atributos
    private int número;
    private String titular;
    private int saldo;
    private int cheque;
    
    /**
     * Construtor para objetos da classe Conta
     */
    public Conta(int númeroDaConta, int chequeEspecial, String titularDaConta)
    {
        // inicializa os campos
        número = númeroDaConta;
        titular = titularDaConta;
        saldo = 0;
    }

    /**
     * realiza um saque da quantia informada, diminuindo o saldo da conta.
     * 
     * @param  quantia   o tanto de dinheiro a sacar
     */
    public void sacar(int quantia)
    {
        if(quantia > saldo) { 
            saldo = saldo + cheque - quantia; 
            System.out.printf("Saldo: %d", saldo);
        }
        else { 
            saldo = saldo - quantia;
            System.out.printf("Saldo: %d", saldo);
        }
    }

    /**
     * Deposita a quantia informada, aumentando o saldo da conta.
     *
     * @param  quantia   o tanto de dinheiro a depositar
     */
    public void depositar(int quantia)
    {
        saldo = saldo + quantia;
    }

    /**
     * Retorna o saldo atual da conta."
     */
    public int getSaldo()
    {
        return saldo;
    }

    /**
     * Imprime na tela os detalhes da conta.
     */
    public void imprimirDetalhes()
    {
        System.out.println("--------------------");
        System.out.println("Conta Nº: " + número);
        System.out.println("Titular : " + titular);
        System.out.println("--------------------");
        System.out.println("Saldo   : " + saldo);
        System.out.println("--------------------");
    }

}
