public class Main {
    public static void main(String[] args) {
        int numeroIf = 10;
        int numeroWhile = 0;
        int numeroFor;
        String estacion = "veraño";

        if (numeroIf > 0) {
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Negativo");
        } else
        System.out.println("0");

        while (numeroWhile < 3){
            System.out.println("El numero While es:" + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        do {
            System.out.println("El numero Do While es: "+ numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        while (numeroWhile < 1);

        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El numero For es:" + numeroFor);
        }

        switch (estacion){

            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "otoño":
                System.out.println("La estacion es otoño");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}