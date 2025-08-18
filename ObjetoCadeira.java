import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String cor, modelo;
        int tempoUso;
        Cadeira cadeira1 = new Cadeira();
        System.out.println("Informe a cor da primeira cadeira");
        cadeira1.setCor(ler.nextLine());
        System.out.println("Informe o modelo da primeira cadeira: ");
        cadeira1.setModelo(ler.nextLine());
        System.out.println("Informe o tempo de uso da primeira cadeira: ");
        cadeira1.setTempoUso(ler.nextInt());

        ler.nextLine();

        Cadeira cadeira2 = new Cadeira();
        System.out.println("Informe a cor da segunda cadeira");
        cadeira2.setCor(ler.nextLine());
        System.out.println("Informe o modelo da segunda cadeira: ");
        cadeira2.setModelo(ler.nextLine());
        System.out.println("Informe o tempo de uso da segunda cadeira: ");
        cadeira2.setTempoUso(ler.nextInt());

        ler.nextLine();

        Cadeira cadeira3 = new Cadeira();
        System.out.println("Informe a cor da terceira cadeira");
        cadeira3.setCor(ler.nextLine());
        System.out.println("Informe o modelo da terceira cadeira: ");
        cadeira3.setModelo(ler.nextLine());
        System.out.println("Informe o tempo de uso da terceira cadeira: ");
        cadeira3.setTempoUso(ler.nextInt());


        System.out.println("DADOS");
        System.out.println("COR DA PRIMEIRA CADEIRA :" + cadeira1.getCor());
        System.out.println("MODELO DA PRIMEIRA CADEIRA :" + cadeira1.getModelo());
        System.out.println("TEMPO DE USO DA PRIMEIRA CADEIRA: " + cadeira1.getTempoUso());

        System.out.println("DADOS");
        System.out.println("COR DA SEGUNDA CADEIRA :" + cadeira2.getCor());
        System.out.println("MODELO DA SEGUNDA CADEIRA :" + cadeira2.getModelo());
        System.out.println("TEMPO DE USO DA SEGUNDA CADEIRA: " + cadeira2.getTempoUso());

        System.out.println("DADOS");
        System.out.println("COR DA TERCEIRA CADEIRA :" + cadeira3.getCor());
        System.out.println("MODELO DA TERCEIRA CADEIRA :" + cadeira3.getModelo());
        System.out.println("TEMPO DE USO DA TERCEIRA CADEIRA: " + cadeira3.getTempoUso());

    }
}

