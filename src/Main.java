public class Main {
    public static void main(String[] args) {
        String nome  = "Joao";
        Double salario = 1000.0;
        Boolean isento = false;

        if(salario > 1000.0 && !isento) {
            Double irrf = salario * 0.1;
            System.out.println("IRRF: " + irrf);
        } else if (!isento){
            Double irrf = salario * 0.05;
            System.out.println("IRRF: " + irrf);
        } else {
            System.out.println("Isento de IRRF");
        }
    }
}
