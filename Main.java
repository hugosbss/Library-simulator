public class Main {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        livroBiblioteca.setTitulo("'Java' como Programar");
        livroBiblioteca.setAutor("Storion");
        livroBiblioteca.setNumeroPaginas(1200);
        livroBiblioteca.setAnoEdicao(2010);
        livroBiblioteca.setEmprestado(false);
        livroBiblioteca.setLocal("estante A");

        System.out.println(livroBiblioteca);
    }
}