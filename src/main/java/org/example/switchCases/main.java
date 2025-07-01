public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero" + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
        }

    }
}