public class switch_case_nuevo {
    public static void main(String[] args) {
        int dia =5;

        String resultado=switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "No registra";

        };
        System.out.println("El dia es "+resultado);
    }
}
