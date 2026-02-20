public class estudiante {

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    public estudiante() {
    }

    public estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public estudiante(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    //METODOS PROPIOS
    public void mostarInformacion(){


        System.out.println("nombre" + this.getNombre());
        System.out.println("nota 1" + this.getNota1());
        System.out.println("nota 2" + this.getNota2());
        System.out.println("nota 3" + this.getNota3());




    }

    public void asignarNota(double n1,double n2,double n3 ){

        this.nota1= n1;
        this.nota2= n2;
        this.nota3= n3;




    }

    public double calcularPromedio(){

        return (this.nota1 + this.nota2 + this.nota3)/3;




    }

    public String estaAprobado(double notaMinima){
        double promedio = calcularPromedio();
        if (promedio>= notaMinima) {
            return("ESTUDIANTE APROBADO");

        }else{
            return("ESTUDIANTE REPROBADO");

        }



    }



}
