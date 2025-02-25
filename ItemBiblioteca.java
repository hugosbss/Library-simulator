public interface ItemBiblioteca {   
    int diasEmprestimo = 10;

    boolean estaEmprestado();
    void emprestar();
    void devolver();
    String localizacao();
}