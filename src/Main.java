public class Main {
    public static void main(String[] args) {
        int dia= 3;
        String resultado;
                switch (dia){
                    case 1:
                        resultado= "lunes";
                        break;
                    case 2:
                        resultado= "martes";
                        break;
                    case 3:
                        resultado= "miercoles";
                        break;
                    case 4:
                        resultado= "jueves";
                        break;
                    case 5:
                        resultado= "viernes";
                        break;
                    case 6:
                        resultado= "sabado";
                    case 7:
                        resultado= "domingo";
                    default:
                        resultado= "no registra";

        }
        System.out.println("el dia es "+ resultado);
    }
}