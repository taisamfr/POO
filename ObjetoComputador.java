import java.util.Scanner;
public class ObjetoComputador {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
            String marca, modelo;
            int anoFabricado;
            double preco;

            Computador computador1 = new Computador();
            System.out.println("Informe a marca do primeiro computador: ");
            computador1.setMarca(ler.nextLine());
            System.out.println("Informe o modelo do primeiro computador: ");
            computador1.setModelo(ler.nextLine());
            System.out.println("Informe o ano em que o primeiro computador foi fabricado: ");
            computador1.setAnoFabricado(ler.nextInt());
            System.out.println("Informe o preço do primeiro computador: ");
            computador1.setPreco(ler.nextDouble());

            ler.nextLine();

        Computador computador2 = new Computador();
        System.out.println("Informe a marca do segundo computador: ");
        computador2.setMarca(ler.nextLine());
        System.out.println("Informe o modelo do segundo computador: ");
        computador2.setModelo(ler.nextLine());
        System.out.println("Informe o ano em que o segundo computador foi fabricado: ");
        computador2.setAnoFabricado(ler.nextInt());
        System.out.println("Informe o preço do segundo computador: ");
        computador2.setPreco(ler.nextDouble());

        ler.nextLine();

        Computador computador3 = new Computador();
        System.out.println("Informe a marca do terceiro computador: ");
        computador3.setMarca(ler.nextLine());
        System.out.println("Informe o modelo do terceiro computador: ");
        computador3.setModelo(ler.nextLine());
        System.out.println("Informe o ano em que o terceiro computador foi fabricado: ");
        computador3.setAnoFabricado(ler.nextInt());
        System.out.println("Informe o preço do terceiro computador: ");
        computador3.setPreco(ler.nextDouble());

        ler.nextLine();

        System.out.println("DADOS");
        System.out.println("MARCA DO PRIMEIRO COMPUTADOR:" + computador1.getMarca());
        System.out.println("MODELO DO PRIMEIRO COMPUTADOR :" + computador1.getModelo());
        System.out.println("ANO DE FABRICAÇÃO DO PRIMEIRO COMPUTADOR: " + computador1.getAnoFabricado());
        System.out.println("PREÇO DO PRIMEIRO COMPUTADOR: " + computador1.getPreco());

        ler.nextLine();
        System.out.println("DADOS");
        System.out.println("MARCA DO SEGUNDO COMPUTADOR:" + computador2.getMarca());
        System.out.println("MODELO DO SEGUNDO COMPUTADOR :" + computador2.getModelo());
        System.out.println("ANO DE FABRICAÇÃO DO SEGUNDO COMPUTADOR: " + computador2.getAnoFabricado());
        System.out.println("PREÇO DO SEGUNDO COMPUTADOR: " + computador2.getPreco());

        ler.nextLine();
        System.out.println("DADOS");
        System.out.println("MARCA DO TERCEIRO COMPUTADOR:" + computador3.getMarca());
        System.out.println("MODELO DO TERCEIRO COMPUTADOR :" + computador3.getModelo());
        System.out.println("ANO DE FABRICAÇÃO DO TERCEIRO COMPUTADOR: " + computador3.getAnoFabricado());
        System.out.println("PREÇO DO TERCEIRO COMPUTADOR: " + computador3.getPreco());






    }
}
