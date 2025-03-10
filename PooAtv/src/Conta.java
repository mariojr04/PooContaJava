public class Conta{
    private String cpf;
    private int numBanco;
    private Double  saldo;
    private boolean clienteEspecial;

    public Conta(String cpf, int numBanco, Double saldo, boolean clienteEspecial){
        this.cpf = cpf;
        this.numBanco = numBanco;
        this.saldo = saldo;
    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    public String getcpf(){
        return this.cpf;
    }
    public void setnumBanco(int numBanco){
        this.numBanco = numBanco;
    }
    public int getnumBanco(){
        return this.numBanco;
    }
    public void setsaldo(Double saldo){
        this.saldo = saldo;
    }
    public Double getsaldo(){
        return this.saldo;
    }
    public void setclienteEspecial(boolean clienteEspecial){
        this.clienteEspecial = clienteEspecial;
    }
    public boolean getclienteEspecial(){
        return this.clienteEspecial;
    }
    public Double Bonificacao(){
        if (this.clienteEspecial == true){
            return this.saldo * 0.1;
        } else{
            return this.saldo * 0.05;
        }
    }
    public Double Depositar( Double valor){
        return this.saldo + valor;
    }
    public Double Sacar(Double valor){
        return this.saldo - valor;
    }
    //public boolean transferir(Conta destino, Double valor) {
    //if (this.Sacar(valor)) {
    //destino.Depositar(valor);
    //System.out.println("Transferência de R$ " + valor + " para a conta de CPF " + destino.getcpf());
    //return true;
    //} else {
    //System.out.println("Transferência não realizada! Verifique o saldo.");
    //return false;
    //}
    // }
}