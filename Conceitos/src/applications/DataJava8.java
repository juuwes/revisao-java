package applications;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataJava8 {
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------");
		System.out.println("INSTANCIAÇÃO");
		System.out.println("--------------------------------------------------------");
		
		LocalDate d01 = LocalDate.now(); // instanciação de Data-hora local (sem horario)
		LocalDateTime d02 = LocalDateTime.now(); // instancia de Data-hora local (com horario) .(fração de segundos)
		System.out.println("Sem Horario: " + d01);
		System.out.println("Com Horario: " + d02);

		System.out.println("--------------------------------------------------------");

		Instant d03 = Instant.now(); // instanciação da Data-hora global GMT (Londres).
		System.out.println("Data-hora global: " + d03);

		System.out.println("--------------------------------------------------------");
		// implicitamente é chamado o toString() dos objetos criados.
		LocalDate d04 = LocalDate.parse("2022-07-20"); // texto ISO 8601 metodo estatico (parse) - texto representando
													   // uma data.
		System.out.println("Cria um objeto a partir do texto ISO: " + d04);
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("Objeto a partir do texto ISO - com horario: " + d05);

		System.out.println("--------------------------------------------------------");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Criar no padrão UTC (Londres)
		System.out.println("Objeto a partir do texto ISO - Zulu Time: " + d06);
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Criar no padrão São Paulo.
		System.out.println("Objeto a partir do texto ISO - SP: " + d07);
		
		System.out.println("--------------------------------------------------------");
		// documentação DateTimeFormatter
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //instanciar a data, formato ISO, com formato personalizado (sobrecarga)
		System.out.println("Objeto ISO a partir da data personalizada: " + d08);
		
		//chamada direta com o padrão de formatação
		LocalDate d09 = LocalDate.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println("Objeto ISO a partir da data personalizada (com horario): " + d09);
		
		System.out.println("--------------------------------------------------------");
		LocalDate d10 = LocalDate.of(2022, 7, 20); //data a partir de dados isolados
		System.out.println("Data com dados isolados: " + d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30); //data a partir de dados isolados (com horario)
		System.out.println("Data com dados isolados (com horario): " + d11);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("FORMATAÇÃO");
		System.out.println("--------------------------------------------------------");

		LocalDate f01 = LocalDate.parse("2022-07-20");
		LocalDateTime f02 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		// formato personalizado.
		DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// formas de chamar:
		System.out.println(f01.format(form1)); 
		// System.out.println(form1.format(f01));
		// System.out.println(f01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(f02.format(form2)); 

		//Data global, dependente do fuso horario (Instant)
		Instant f03 = Instant.parse("2022-07-20T01:30:26Z");
		DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); 
		// withZone = especifica qual fuso horario
		// metodo estatico ZoneId = systemDefault() : fuso horario do sistema local.
		
		System.out.println(form3.format(f03)); //chamar form, para utilizar .format.

		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("CONVERSÃO");
		System.out.println("--------------------------------------------------------");
		
		// for (String s: ZoneId.getAvailableZoneIds()); // nomes para especificar um timezone
		
		Instant d12 = Instant.parse("2022-07-20T01:30:26Z");
		LocalDate r1 = LocalDate.ofInstant(d12, ZoneId.systemDefault()); // conversão o instante global, para uma data local, do sistema local.
		System.out.println("Conversão global para local (sistema local): " + r1);
		LocalDate r2 = LocalDate.ofInstant(d12, ZoneId.of("Portugal"));
		System.out.println("Conversão global para local (PT-PT): " + r2);
		LocalDateTime r3 = LocalDateTime.ofInstant(d12, ZoneId.of("Portugal"));
		System.out.println("Conversão global para local (com horario): " + r3);
		
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("OBTER DADOS");
		System.out.println("--------------------------------------------------------");
		
		LocalDate d13 = LocalDate.parse("2022-07-20");
		System.out.println("Dia: " + d13.getDayOfMonth());
		System.out.println("Mês: " + d13.getMonthValue());
		System.out.println("Ano: " + d13.getYear());
		
		LocalDateTime d14 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("Hora: " + d14.getHour());
		System.out.println("Minutos: " + d14.getMinute());
		
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("CALCULO COM DATA HORA");
		System.out.println("--------------------------------------------------------");
		
		//DATA-HORA são objetos imutaveis
		LocalDate d15 = LocalDate.parse("2022-07-20");
		LocalDateTime d16 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d17 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastLocalDate = d15.minusDays(7); //diminuir dias de uma data local
		LocalDate nextLocalDate = d15.plusDays(7); //adicionar dias de uma data local
		System.out.println("past: " + pastLocalDate + " | next: " + nextLocalDate);
		
		LocalDateTime pastLocalDateTime = d16.minusHours(1); //diminuir hora de uma data local
		LocalDateTime nextLocalDateTime = d16.plusHours(1); //aumentar hora de uma data local
		System.out.println("past (horario): " + pastLocalDateTime);
		System.out.println("next (horario): " + nextLocalDateTime);

		Instant pastInstant = d17.minus(7, ChronoUnit.DAYS); //diminuir dia de uma data global
		Instant nextInstant = d17.plus(7, ChronoUnit.DAYS); //aumentar dia de uma data global
		System.out.println("past - global: " + pastInstant);
		System.out.println("next - global: " + nextInstant);
			
		// Calcular duração
		//atTime() : converter LocalDate para LocalDateTime | atStartOfDay
		Duration t1 = Duration.between(pastLocalDate.atTime(0, 0), d15.atTime(0, 0)); //calcular duração entre duas data-hora
		System.out.println("Duração entre duas data hora: " + t1.toDays());	
		
		Duration t2 = Duration.between(pastLocalDate.atStartOfDay(), d15.atStartOfDay()); //calcular duração entre duas data-hora
		System.out.println("Duração entre duas data hora: " + t2.toDays());
	
	}

}
