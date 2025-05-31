public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    protected Conta(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;   
    }
    
    @Override
    public String toString(){
        return """
                Nome do cliente: """ + nomeCliente + ".\n"
                + "Número da Conta: " + numero + ".\n"
                + "Agência: " + agencia + ".\n"
                + "Saldo Disponível: " + saldo + ".";
    }


    protected void addSaldo(float valor){
        saldo += valor;
    }

    protected void rmSaldo(float valor){
        if (valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente para a operação!!!!");
        } 
        saldo -= valor;
    }

    protected void setNome(String novoNome){
        nomeCliente = novoNome;
    }

    protected void setAgencia(String novaAgencia){
        agencia = novaAgencia;
    }

    protected void setNumeroConta(int novoNumero){
        numero = novoNumero;
    }

    protected double getSaldo(){
        return saldo;
    }

    protected String getAgencia(){
        return agencia;
    }

    protected int getNumeroConta(){
        return numero;
    }


}

