
public class CadastroDeLivros {

    public static void main(String[] args){

        Autor autor = new Autor();
        autor.nome = "Tauan Tathiell";
        autor.cpf = "704.782.181-33";
        autor.email = "lukyhenson@live.com";

        Livro livro = new Livro();
        livro.nome = "Java POO";
        livro.descricao = "curso poo de Java";
        livro.valor = 60.50;
        livro.aplicaDescontoDe(0.3);
        livro.isbn = "7894-564-321-2";
        livro.autor = autor;

        livro.mostrarDetalhes();


        Autor autor2 = new Autor();
        autor2.nome = "Jean Flores";
        autor2.cpf = "704.782.181-32";
        autor2.email = "jean123@live.com";

        Livro livro2 = new Livro();
        livro2.nome = "JavaScript";
        livro2.descricao = "curso JavaScript Intermediario";
        livro2.valor = 80.50;
        livro2.aplicaDescontoDe(0.2);
        livro2.isbn = "7898-465-123-5";
        livro2.autor = autor2;

        livro2.mostrarDetalhes();


        //Teste sem autor

        Livro livro3 = new Livro();
        livro3.nome = "PHP";
        livro3.descricao = "curso PHP Intermediario";
        livro3.valor = 90.50;
        livro3.aplicaDescontoDe(0.3);
        livro3.isbn = "7875-587-521-9";

        //livro3.autor = autor3;

        livro3.mostrarDetalhes();

    }

}
