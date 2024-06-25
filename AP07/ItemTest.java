
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ItemTest {

    @Test
    public void testGetValorUnitario() {
        Item item = new Item("Produto", 2, 50.0);
        assertEquals(100.0, item.getValorUnitario(), "Valor unitário deve ser quantidade * preço unitário.");
    }

    @Test
    public void testAplicarDescontoValido() {
        Item item = new Item("Produto", 1, 100.0);
        assertTrue(item.aplicarDesconto(50), "Desconto de 50% deve ser aplicado corretamente.");
        assertEquals(50.0, item.getPrecoUnitario(), "Preço unitário deve ser reduzido pela metade.");
    }

    @Test
    public void testAplicarDescontoInvalido() {
        Item item = new Item("Produto", 1, 100.0);
        assertFalse(item.aplicarDesconto(80), "Desconto acima do limite deve ser rejeitado.");
        assertEquals(100.0, item.getPrecoUnitario(), "Preço unitário não deve mudar quando desconto é rejeitado.");
    }
}
