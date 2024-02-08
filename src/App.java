import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String r = "[A-Z]{3}-\\d{4}";
        String[] arr = new String[a];

        for (int i = 0; i < a; i++) {
            String placa = sc.nextLine();
            if (!placa.matches(r)) {
                arr[i] = "FAILURE";
            } else {
                char ultimo = placa.charAt(placa.length() - 1);
                String ultimoS = Character.toString(ultimo);
                int digito = Integer.parseInt(ultimoS);

                if (digito == 1 || digito == 2) {
                    arr[i] = "MONDAY";
                } else if (digito == 3 || digito == 4) {
                    arr[i] = "TUESDAY";
                } else if (digito == 5 || digito == 6) {
                    arr[i] = "WEDNESDAY";
                } else if (digito == 7 || digito == 8) {
                    arr[i] = "THURSDAY";
                } else if (digito == 9 || digito == 0) {
                    arr[i] = "FRIDAY";
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}