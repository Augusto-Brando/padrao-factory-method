package padroescriacao.factorymethod;

public class ServicoBancarioFactory {
    public static IServicoBancario obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServicoBancario)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServicoBancario) objeto;
    }
}