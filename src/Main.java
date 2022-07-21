public class Main {
    public static void main(String[] args) {

        //---------------//
        //If
        int numeroIf = 10;

        if (numeroIf > 0) {
            System.out.println("La variable "+ numeroIf +" es Positivo");
        } else if (numeroIf < 0) {
            System.out.println("La variable "+ numeroIf +" es Negativo");
        } else{
            System.out.println("La variable "+ numeroIf +" es 0");
        }

        //---------------//
        //While
        int numeroWhile = 1;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("El numero While es:" + numeroWhile);
        }

        //---------------//
        //Do While
        int numeroDoWhile = 3;

        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println("El numero Do While es: "+ numeroDoWhile);
        }
        while (numeroDoWhile < 3);

        //---------------//
        //For
        int numeroFor;

        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El numero For es:" + numeroFor);
        }

        //---------------//
        //Switch
        String estacion = "veraño";

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