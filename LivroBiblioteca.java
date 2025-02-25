public class LivroBiblioteca extends Livro implements ItemBiblioteca {
    private boolean emprestado;
    private String local;

    public LivroBiblioteca() {}

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public void emprestar() {
        emprestado = true;
    }

    @Override
    public void devolver() {
        emprestado = false;
    }

    @Override
    public String localizacao() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "LivroBiblioteca [titulo=" + getTitulo() + " , autor=" + getAutor() + " , numeroPaginas=" + getNumeroPaginas() + " , anoEdicao=" +
                getAnoEdicao() + ", emprestado=" + emprestado + " , local=" + local + "]";
    }
}