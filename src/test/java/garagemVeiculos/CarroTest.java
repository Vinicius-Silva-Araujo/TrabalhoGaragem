package garagemVeiculos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    private Carro carros;
    private Carro car1;
    private Carro car2;
    private Carro car3;



    @BeforeEach
    public void iniciar() {
        carros = new Carro();


        car1 = new Carro(1, "Toyota", "Corola", 2023, "Prata", 55000.00, true);
        car2 = new Carro(2, "Toyota", "Hilux", 2022, "Axul", 250.000, false);
        car3 = new Carro(3, "Fiat", "FastBack", 2023, "Chumbo", 140.000, false);

    }

    @Test
    @DisplayName("Adicionar Carro")
    void adicionarCarro() {
       boolean add1 = carros.adicionarCarro(car1);
       boolean add2 =  carros.adicionarCarro(car2);
       boolean add3 = carros.adicionarCarro(car3);
        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);

        assertEquals(3, carros.quantidadeDeCarros());

    }

    @Test
    @DisplayName("Adicionar Carro Nulo")
    void adicionarCarroNulo() {
        boolean add1 = carros.adicionarCarro(car1);
        boolean add2 = carros.adicionarCarro(null);
        boolean add3 = carros.adicionarCarro(null);
        assertTrue(add1);
        assertFalse(add2);
        assertFalse(add3);

        assertEquals(1, carros.quantidadeDeCarros());

    }

    @Test
    @DisplayName("Buscar carro por ID")
    void buscarIdCarro() {
        boolean add1 = carros.adicionarCarro(car1);
        boolean add2 = carros.adicionarCarro(car2);
        boolean add3 = carros.adicionarCarro(car3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);
       assertNotNull(carros.buscarIdCarro(1));

    }
    @Test
    @DisplayName("Busca Carro ID invalido")
    void buscarIdCarroInavlido() {
        boolean add1 = carros.adicionarCarro(car1);
        boolean add2 = carros.adicionarCarro(car2);
        boolean add3 = carros.adicionarCarro(car3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);

        assertNull(carros.buscarIdCarro(8));

    }


    @Test
    @DisplayName("Remover carro")
    void removerCarro() {
        boolean add1 = carros.adicionarCarro(car1);
        boolean add2 = carros.adicionarCarro(car2);
        boolean add3 = carros.adicionarCarro(car3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);
        assertEquals(3, carros.quantidadeDeCarros());

        boolean carro = carros.removerCarro(1);
        assertTrue(carro);
        assertEquals(2, carros.quantidadeDeCarros());

    }

    @Test
    @DisplayName("Remover carro invalido")
    void removerCarroInvalido() {
        boolean add1 = carros.adicionarCarro(car1);
        boolean add2 = carros.adicionarCarro(car2);
        boolean add3 = carros.adicionarCarro(car3);

        assertTrue(add1);
        assertTrue(add2);
        assertTrue(add3);
        assertEquals(3, carros.quantidadeDeCarros());

        assertFalse(carros.removerCarro(4));

        assertEquals(3, carros.quantidadeDeCarros());

    }
}