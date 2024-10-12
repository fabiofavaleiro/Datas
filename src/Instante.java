import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;


public class Instante {
    public static void main(String[] args) throws InterruptedException {
        Instant inicial = Instant.now();



        //Thread.sleep(2000);

        System.out.println(inicial);

        Matrix.minhaMatrix();

        Instant ifinal = Instant.now();

        Duration duracao = Duration.between(inicial,ifinal);

        System.out.println(duracao);

        System.out.println(duracao.toMillis());

        System.out.println(duracao.toNanos());

        System.out.println(duracao.toNanosPart());

        System.out.println(duracao.toSeconds());


    }
}
