public class Main {
    public static void main(String[] args) {


        estudiante e1 = new estudiante(" sofia ", 3.5 , 3.9 , 4.5);

        e1.mostarInformacion();
        System.out.println("EL PROMEDIO ES " + e1.calcularPromedio());
        System.out.println(e1.estaAprobado(3.0));


        //CALCULAR PROMEDIO



        estudiante  e2 = new estudiante(" laura ");

        e2.asignarNota(4.5,2.9,1.5);

        e2.mostarInformacion();
        System.out.println("EL PROMEDIO "  + e2.calcularPromedio());
        System.out.println(e2.estaAprobado(3.0));



        //CALCULAR PROMEDIO






    }
}
