package garagemVeiculos;

import java.util.ArrayList;
import java.util.List;

public class Moto extends Veiculo{
    private int cilidrada;
    private int passageiro;
    private double preco;
    private boolean eletrica = false;
    private List<Moto> motos = new ArrayList<>();

    public Moto(int id,String marca, String modelo, int anoFabricacao, String cor, int cilidrada, int passageiro, double preco, boolean eletrica) {
        super(id,marca, modelo, anoFabricacao, cor);
        this.cilidrada = cilidrada;
        this.passageiro = passageiro;
        this.preco = preco;
        this.eletrica = eletrica;
    }
    public Moto() {
        super();
    }

    public int getCilidrada() {
        return cilidrada;
    }

    public void setCilidrada(int cilidrada) {
        this.cilidrada = cilidrada;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEletrica() {
        return eletrica;
    }

    public void motoEletrica(boolean eletrica) {
        this.eletrica = true;
    }


    public boolean adicionarMoto(Moto moto) {
        if (moto != null && !motos.contains(moto)) {
            motos.add(moto);

            return true;
        }
        return false;
    }
    public Moto buscarMotoId(int id) {
        for (Moto moto : motos) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        return null;

    }

    public boolean removerMoto(int id) {
        for (Moto moto : motos)
            if (moto.getId() == id) {
                motos.remove(moto);
                return true;
            }
        return false;

    }
    public int quantidadeMotosAdicionadas(){
        return motos.size();
    }




}
