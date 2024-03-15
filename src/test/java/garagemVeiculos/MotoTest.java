package garagemVeiculos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {
    private Moto motos;
    private Moto mot1;
    private Moto mot2;
    private Moto mot3;

    @BeforeEach
    public void iniciar() {
        motos = new Moto();
        mot1 = new Moto(1, "Honda", "Titan", 2005, "Azul", 150, 2, 4500.00, false);
        mot2 = new Moto(2, "Yamaha", "Lander", 2008, "preta", 250, 2, 16000.00, true);
        mot3 = new Moto(3, "Honda", "Transalp", 2011, "Branca com Rubro", 700, 2, 30000.00, true);

    }

    @Test
    @DisplayName("Adicionar Moto")
    void adicionarMoto() {
        boolean add1 = motos.adicionarMoto(mot1);
        boolean add2 = motos.adicionarMoto(mot2);
        boolean add3 = motos.adicionarMoto(mot3);
        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);

        assertEquals(3, motos.quantidadeMotosAdicionadas());

    }

    @Test
    @DisplayName("Adicionar Moto Nulo")
    void adicionarMotoNulo() {
        boolean add1 = motos.adicionarMoto(mot1);
        boolean add2 = motos.adicionarMoto(null);
        boolean add3 = motos.adicionarMoto(null);
        assertTrue(add1);
        assertFalse(add2);
        assertFalse(add3);

        assertEquals(1, motos.quantidadeMotosAdicionadas());

    }

    @Test
    @DisplayName("Buscar moto por id")
    void buscarMotoId() {
        boolean add1 = motos.adicionarMoto(mot1);
        boolean add2 = motos.adicionarMoto(mot2);
        boolean add3 = motos.adicionarMoto(mot3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);
        assertNotNull(motos.buscarMotoId(2));

    }

    @Test
    @DisplayName("Busca Carro ID invalido")
    void buscarMotoIdInvalido() {
        boolean add1 = motos.adicionarMoto(mot1);
        boolean add2 = motos.adicionarMoto(mot2);
        boolean add3 = motos.adicionarMoto(mot3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);

        assertNull(motos.buscarMotoId(50));

    }

    @Test
    @DisplayName("Remover carro id")
    void removerMoto() {
        boolean add1 = motos.adicionarMoto(mot1);
        boolean add2 = motos.adicionarMoto(mot2);
        boolean add3 = motos.adicionarMoto(mot3);
        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);
        assertEquals(3, motos.quantidadeMotosAdicionadas());

        boolean carro = motos.removerMoto(3);
        assertTrue(carro);
        assertEquals(2, motos.quantidadeMotosAdicionadas());

    }

    @Test
    @DisplayName("Remover moto por id")
    void removerMotoIdInvalid() {
        boolean add1 = motos.adicionarMoto(mot1);
        boolean add2 = motos.adicionarMoto(mot2);
        boolean add3 = motos.adicionarMoto(mot3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);
        assertEquals(3, motos.quantidadeMotosAdicionadas());

        assertFalse(motos.removerMoto(4));

        assertEquals(3, motos.quantidadeMotosAdicionadas());

    }

}