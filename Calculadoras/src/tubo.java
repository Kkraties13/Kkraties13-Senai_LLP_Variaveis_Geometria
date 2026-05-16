public class tubo {
    public static void main(String[] args) {
        double raio = 3.0;
        double altura = 7.0;

        double areaBase = Math.PI * raio * raio;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = (2 * areaBase) + areaLateral;

        System.out.println("Área do Tubo: " + areaTotal);
    }
}