public class Ebook extends Livro {

    private String nome;
    private String descricao;
    protected double valor;
    private String isbn;
    private Autor autor;
    private String waterMark;


    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15){
            return false;
        }
        return super.aplicaDescontoDe(porcentagem);
    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public double getValor() {
//        return valor;
//    }
//
//    public void setValor(double valor) {
//        this.valor = valor;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public Autor getAutor() {
//        return autor;
//    }
//
//    public void setAutor(Autor autor) {
//        this.autor = autor;
//    }

    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }

    public String getWaterMark(){
        return waterMark;
    }

}
