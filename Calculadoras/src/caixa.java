public class caixa {
    public static void main(String[] args) {
        double largura = 2.0;
        double altura = 3.0;
        double profundidade = 4.0;

        double area = 2 * ((largura * altura) + (largura * profundidade) + (altura * profundidade));

        System.out.println("Área da Caixa: " + area);
    }
}