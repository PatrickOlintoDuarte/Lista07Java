public class TesteImpressora {
    public static void main(String[] args) {
        Impressora  impressora = new Impressora();

        impressora.Exibir(2.54f);
        impressora.Exibir(2.32f,3f);
        impressora.Exibir(3.24f,"Wesley");
        impressora.Exibir("Thiago", 5.22f);
        impressora.Exibir("Zezinho","Huguinho","Luizinho");
        impressora.Exibir(1,2,"Boom!!");
    }
}
