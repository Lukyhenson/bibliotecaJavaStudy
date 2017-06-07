public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public void mostrarDetalhesAutor(){

        System.out.println("##### Dados do Autor: ##### \n");
        System.out.println("\nNome:" + getAutor().getNome());
        System.out.println("\nEmail:" + getAutor().getEmail());
        System.out.println("\nCPF:" + getAutor().getCpf());

    }

    public void mostrarDetalhes(){

        System.out.println("##### Os detalhes do livro sao: ##### \n");
        System.out.println("Titulo: " + getNome());
        System.out.println("\nDescricao: " + getDescricao());
        System.out.println("\nValor: " + getValor());
        System.out.println("\nISBN: " + getIsbn());
        System.out.println("--------------------------------------");
        if(this.temAutor()){
            mostrarDetalhesAutor();
        } else {
            System.out.println("\n*Atencao* Autor nao cadastrado!:");
          }
        System.out.println("-------------------------------------- \n");

    }

    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "0000-000-000-0";
        this.impresso = true;
        if(autor != null){
            System.out.println("    ##### Livro Cadastrado! #####");
        } else {
            System.out.println("    ##### Livro nao pode ser Cadastrado! #####");
          }
    }


    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    //Gets and Sets

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public double getValor(){
        return valor;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        //if(isbn == ""){
            //this.isbn = "0000-000-000-0";
        //} else {
            this.isbn = isbn;
       // }
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }


    public boolean temAutor() {
        return this.autor != null;
    }
}
