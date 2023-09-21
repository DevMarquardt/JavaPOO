public class Leao extends Animal {
    private int tamanhoDaJuba;

    public Leao(int id, String nome, String alimento, String habitat, int tamanhoDaJuba) {
        super(id, nome, alimento, habitat);
        this.tamanhoDaJuba = tamanhoDaJuba;
    }

    @Override
    String barulho() {
        return "MIAU";
    }

    @Override
    public String toString() {
        return "Leao{" +
                "tamanhoDaJuba=" + tamanhoDaJuba +
                "} " + super.toString();
    }
}