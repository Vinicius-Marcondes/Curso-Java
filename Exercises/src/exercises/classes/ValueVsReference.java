package exercises.classes;

public class ValueVsReference {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + "  " + b);

        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; // Atribuição por referêcia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2025;
        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData());

        voltarDataparaValorPadrao(d1);

        System.out.println(d1.formatarData());
        System.out.println(d2.formatarData() );

        int c = 10;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataparaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a){
        a++;
    }
}
