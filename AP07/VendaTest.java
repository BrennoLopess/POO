
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VendaTest {

    @Test
    public void testGetValorTotal() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto1", 10, 2);  // preço unitário 10, quantidade 2
        venda.vender("Produto2", 20, 3);  // preço unitário 20, quantidade 3
        assertEquals(80.0, venda.getValor(), "Valor total deve ser a soma dos valores dos produtos.");
    }

    @Test
    public void testAplicarDescontoNaVendaValido() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto", 10, 1);
        venda.vender("Produto", 20, 2);
        assertTrue(venda.aplicarDesconto(10), "Desconto de 10% deve ser aplicado corretamente quando a venda está em andamento.");
    }

    @Test
    public void testAplicarDescontoNaVendaInvalido() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto", 100, 1);
        venda.finalizar();
        assertFalse(venda.aplicarDesconto(10), "Desconto não deve ser aplicado se a venda está encerrada.");
    }

    @Test
    public void testFinalizarVenda() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto", 50, 1);
        venda.finalizar();
        assertThrows(RuntimeException.class, () -> venda.vender("Produto", 50, 1), "Não deve permitir adicionar itens a uma venda encerrada.");
    }
}
