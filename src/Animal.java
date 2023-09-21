public abstract class Animal {
    private int id;
    private String nome;
    private String alimento;
    private String habitat;

    abstract String barulho();

    public Animal(int id, String nome, String alimento, String habitat) {
        this.id = id;
        this.nome = nome;
        this.alimento = alimento;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getAlimento() {
        return alimento;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                "nome='" + nome + '\'' +
                ", alimento='" + alimento + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}