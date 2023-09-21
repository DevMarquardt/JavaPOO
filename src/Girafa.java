public class Girafa extends Animal {
    private int tamanhoDoPescoco;
    private int quantidadeDeManchas;

    public Girafa(int id, String nome, String alimento, String habitat, int tamanhoDoPescoco, int quantidadeDeManchas) {
        super(id, nome, alimento, habitat);
        this.tamanhoDoPescoco = tamanhoDoPescoco;
        this.quantidadeDeManchas = quantidadeDeManchas;
    }

    @Override
    String barulho() {
        return "AAAAAAAAAAAA";
    }

    @Override
    public String toString() {
        return "Girafa{" +
                "tamanhoDoPescoco=" + tamanhoDoPescoco +
                ", quantidadeDeManchas=" + quantidadeDeManchas +
                "} " + super.toString();
    }
}