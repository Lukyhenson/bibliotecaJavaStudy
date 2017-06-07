public class CadastroDeLivros {

    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Tauan Tathiell");
        autor.setCpf("704.782.181-33");
        autor.setEmail("lukyhenson@live.com");

        Livro livro = new Livro(autor);
        livro.setNome("Java POO");
        livro.setDescricao("curso poo de Java");
        livro.setValor(60.50);
        livro.aplicaDescontoDe(0.3);
        livro.getIsbn();
        livro.setAutor(autor);

        livro.mostrarDetalhes();


        Autor autor2 = new Autor();
        autor2.setNome("Jean Flores");
        autor2.setCpf("704.782.181-32");
        autor2.setEmail("jean123@live.com");

        Livro livro2 = new Livro(autor2);
        livro2.setNome("JavaScript");
        livro2.setDescricao("curso JavaScript Intermediario");
        livro2.setValor(70.50);
        livro2.aplicaDescontoDe(0.2);
        livro2.setIsbn("7898-465-123-5");
        livro2.setAutor(autor2);

        livro2.mostrarDetalhes();


        Ebook ebook = new Ebook(autor);
        ebook.setNome("PHP 7");

    }

}