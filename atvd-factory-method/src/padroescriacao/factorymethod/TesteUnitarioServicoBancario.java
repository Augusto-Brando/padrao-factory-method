package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioServicoBancario {

    @Test
    public void testDepositoExecutar() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Deposito");
        assertEquals("Deposito efetivado", servico.executar());
    }

    @Test
    public void testDepositoCancelar() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Deposito");
        assertEquals("Deposito cancelado", servico.cancelar());
    }

    @Test
    public void testSaqueExecutar() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Saque");
        assertEquals("Saque efetivado", servico.executar());
    }

    @Test
    public void testSaqueCancelar() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Saque");
        assertEquals("Saque cancelado", servico.cancelar());
    }

    @Test
    public void testTransferenciaExecutar() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Transferencia");
        assertEquals("Transferencia efetivada", servico.executar());
    }

    @Test
    public void testTransferenciaCancelar() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Transferencia");
        assertEquals("Transferencia cancelada", servico.cancelar());
    }

    @Test
    public void testServicoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            ServicoBancarioFactory.obterServico("Inexistente");
        });
    }
}