package poo.banco;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends Conta {
    private final LocalDate DATA_ABERTURA;
    private LocalDate dataRendimento;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        DATA_ABERTURA = LocalDate.now();
        dataRendimento = DATA_ABERTURA.plusMonths(1);
    }

    public long tempoParaRendimento () {
        LocalDate data = LocalDate.now();
        return ChronoUnit.DAYS.between(data, this.dataRendimento);
    }
    public LocalDate getDATA_ABERTURA() {
        return DATA_ABERTURA;
    }
    public LocalDate getDataRendimento() {
        return dataRendimento;
    }

}
