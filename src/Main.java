import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        Date data = new Date();

        //System.out.println(data.getDate());
        //System.out.println(data.getDay());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MMMM/dd");

        System.out.println(simpleDateFormat.format(data));

        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("y/M/d").parse("2024/10/11"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        /*System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.FRIDAY));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));*/


        calendar.add(Calendar.DAY_OF_MONTH,0);

        System.out.println(simpleDateFormat.format(calendar.getTime()));
        calendar.add(Calendar.MONTH,1);

        System.out.println(simpleDateFormat.format(calendar.getTime()));


        //Date dataPassada = new SimpleDateFormat("y/M/d").parse("2024/06/06");

        long diferencaData = ChronoUnit.DAYS.between(LocalDate.parse("2023-06-06"), LocalDate.now());

        System.out.println("Diferença de data até hoje: " + diferencaData);


        Date dateInicial = new SimpleDateFormat("y-M-d").parse("2021-06-07");

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(dateInicial);

        for (int parcela = 1; parcela < 12; parcela++) {
            calendar1.add(Calendar.MONTH , 1);

            System.out.println(String.format(String.format("Parcela numero " + parcela + " Vence: " +  new SimpleDateFormat("yyyy/MM/dd").format(calendar1.getTime()))));
        }
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(calendar1.getTime()));
        }
    }
