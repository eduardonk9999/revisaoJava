
public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    String habilidades;

    @Override
    public void mostrarInfos() {
        System.out.println("Super ataque avançado");
    }

    @Override
    public void executaHabiidde() {
        System.out.println("Executa habilidade");
    }
}