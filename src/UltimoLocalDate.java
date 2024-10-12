import java.time.LocalDate;

public class UltimoLocalDate {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2024-02-03");
        System.out.println(data);

        data = data.plusDays(5);

        System.out.println(data);

        data = data.plusDays(-5);
        data = data.plusMonths(2);
        System.out.println(data);

        System.out.println(data.plusMonths(-2));
        System.out.println(data.minusMonths(2));

        for (int i = 1; i < 12; i++) {
            data = data.plusMonths(1);

            System.out.println("Parcela: " + i + " dia: " + data);

        }

    }
}
