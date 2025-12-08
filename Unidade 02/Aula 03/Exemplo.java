public class Exemplo {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Léo", 5000, "Financeiro");
        Analista analista = new Analista("João", 3000, "Engenharia");

        System.out.println("\nBônus do gerente " + gerente.getNome() + ": " + gerente.calcularBonus());
        System.out.println("Departamento do gerente " + gerente.getNome() + ": " + gerente.getDepartamento());

        System.out.println("\nBônus do analista " + analista.getNome() + ": " + analista.calcularBonus());
        System.out.println("Projeto do analista " + analista.getNome() + ": " + analista.getProjeto());
    }
    
}
