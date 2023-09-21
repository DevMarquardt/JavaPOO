import java.util.ArrayList;

public interface IGerenciador {

    void registrarAnimal(Animal animal);

    void removerAnimal(Animal animal);

    void alterarAlimento(int id);

    String geralRelatorioEspecifico(int id);

    ArrayList<Animal> gerarRelatorioGeral();
}