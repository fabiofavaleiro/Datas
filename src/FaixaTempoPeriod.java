import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class FaixaTempoPeriod {

    public static void main(String[] args) {

        String dataDigitada = JOptionPane.showInputDialog(null,"digite a data inicial no formato: yyyy-MM-dd");


        LocalDate dataAntiga = LocalDate.of(2020,10,11);
        LocalDate dataAntigaDigitada = LocalDate.parse(dataDigitada);
        LocalDate dataAtual = LocalDate.now();

        System.out.println(dataAntiga.isBefore(dataAtual));

        Period periodo = Period.between(dataAntiga,dataAtual);

        Period periodo2 = Period.between(dataAntigaDigitada,dataAtual);

        System.out.println("ano " + periodo.getYears()+ " meses " + periodo.getMonths() + " dias "+ periodo.getDays());

        System.out.println(periodo.toTotalMonths());

        System.out.println("ano " + periodo2.getYears()+ " meses " + periodo2.getMonths() + " dias "+ periodo2.getDays());



    }
}
