public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;


        public void mostrarDetalhesAutor(){

                System.out.println("##### Dados do Autor: ##### \n");
                System.out.println("\nNome:" + autor.nome);
                System.out.println("\nEmail:" + autor.email);
                System.out.println("\nCPF:" + autor.cpf);

        }

        public void mostrarDetalhes(){

                System.out.println("##### Os detalhes do livro sao: ##### \n");
                System.out.println("Titulo: " + nome);
                System.out.println("\nDescricao: " + descricao);
                System.out.println("\nValor: " + valor);
                System.out.println("\nISBN: " + isbn);
                System.out.println("--------------------------------------");
                if(this.temAutor()){
                    mostrarDetalhesAutor();
                }else{
                    System.out.println("\n*Atencao* Autor nao cadastrado!:");
                }
                System.out.println("-------------------------------------- \n");

        }

        public Livro(){
            System.out.println("### Livro Cadastrado!");
        }

        public void aplicaDescontoDe(double porcentagem){
            this.valor -= this.valor * porcentagem;
        }

        public boolean temAutor() {
            return this.autor != null;
        }
    }



