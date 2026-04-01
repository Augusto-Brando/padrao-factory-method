package padroescriacao.factorymethod;

public class ServicoSaque implements IServicoBancario {
    public String executar() {
        return "Saque efetivado";
    }
    public String cancelar() {
        return "Saque cancelado";
    }
}