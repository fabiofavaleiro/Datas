import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NovaAPIData {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println(dataHoraAtual.format(DateTimeFormatter.ofPattern("y/M/d H:m:s")));
    }
}
