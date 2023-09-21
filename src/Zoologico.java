import java.util.ArrayList;

public class Zoologico implements IGerenciador {
    public static ArrayList<Animal> animais = new ArrayList<>();

    public Animal procurarAnimal(int id) {
        for (Animal animal : animais) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    @Override
    public void registrarAnimal(Animal animal) {
        animais.add(animal);
    }

    @Override
    public void removerAnimal(Animal animal) {
        animais.remove(animal);
    }

    @Override
    public void alterarAlimento(int id) {
        for (Animal animal : animais) {
            if (animal.getId() == (id)) {
                animal.setAlimento(Main.alterarAlimentoM());
            }
        }
    }

    @Override
    public String geralRelatorioEspecifico(int id) {
        for (Animal animal : animais) {
            if (animal.getId() == (id)) {
                return "Animal{" +
                        "nome='" + animal.getNome() + '\'' +
                        ", alimento='" + animal.getAlimento() + '\'' +
                        ", habitat='" + animal.getHabitat() + '\'' +
                        '}';
            }
        }
        return "Animal não encontrado";
    }

    @Override
    public ArrayList<Animal> gerarRelatorioGeral() {
        return animais;
    }
}