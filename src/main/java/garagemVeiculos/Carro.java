package garagemVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Carro extends Veiculo {

    private double preco;
    private boolean eletrico = false;
   private List<Carro> carros = new ArrayList<>();

    public Carro(int id, String marca, String modelo, int anoFabricacao, String cor, double preco, boolean eletrico) {
        super(id, marca, modelo, anoFabricacao, cor);
        this.preco = preco;
        this.eletrico = eletrico;
    }

    public Carro() {
        super();
    }

    public Carro(int i, String toyota, String corolla, int i1, String prata) {
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEletrico() {
        return eletrico = false;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    public int quantidadeDeCarros() {
        return carros.size();
    }

    public boolean adicionarCarro(Carro carro) {
        if (carro != null && !carros.contains(carro)) {
            carros.add(carro);

            return true;
        }
        return false;
    }
    public Carro buscarIdCarro(int id) {
        for (Carro carro : carros) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        return null;

    }

    public boolean removerCarro(int id) {
        for (Carro carro : carros)
            if (carro.getId() == id) {
                carros.remove(carro);
                return true;
            }
        return false;

    }


}
