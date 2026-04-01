package padroescriacao.factorymethod;

public class ServicoDeposito implements IServicoBancario {
    public String executar() {
        return "Deposito efetivado";
    }
    public String cancelar() {
        return "Deposito cancelado";
    }
}