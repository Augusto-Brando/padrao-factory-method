package padroescriacao.factorymethod;

public class ServicoTransferencia implements IServicoBancario {
    public String executar() {
        return "Transferencia efetivada";
    }
    public String cancelar() {
        return "Transferencia cancelada";
    }
}