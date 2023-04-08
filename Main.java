public class Main {
    public static void main(String args[]){

    // teste da classe Data
    Data data1 = new Data(30,9,1990);
    System.out.println(data1.toString());
    System.out.println(data1.verificaAnoBissexto());

    //teste da classe Loja
    Loja loja1 = new Loja("Adidas", 31, 500);
    System.out.println(loja1.toString());
    System.out.println(loja1.gastosComSalario());
    System.out.println(loja1.tamanhoDaLoja());

    //teste classe produto
    Produto produto1 = new Produto("Camisa", 45);
    System.out.println(produto1.toString());

    //teste classe endereço
    Endereco endereco1 = new Endereco("Rua Marechal Rondon", "Canoas", "RS", "Brasil", "92110-050", "45", "apto 203");
    System.out.println(endereco1.toString());


    }
}
