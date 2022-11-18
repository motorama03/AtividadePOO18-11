package Com.MateusB.Aula11_11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class exData {
	public static List<Date> diasDoMesAno(int mes, int ano){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, mes);
		cal.set(Calendar.YEAR, ano);
		int quantiadadeDias = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		List<Date> listaDias = new ArrayList<Date>();
		
		for(int x = 1; x <= quantiadadeDias; x++) {
			Calendar calendario = Calendar.getInstance();
			calendario.set(Calendar.DATE, x);
			calendario.set(Calendar.MONTH, mes);
			calendario.set(Calendar.YEAR, ano);
			Date hoje = calendario.getTime();
			listaDias.add(hoje);
		}
		return listaDias;
	}
	
	public static long segundosEntreDatas(Date inicio, Date fim){
		long secIn = inicio.getTime();
		long secFi = fim.getTime();
		long dif = (secFi - secIn) / 1000;
		
		return dif;
	}
}
	
	
