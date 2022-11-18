package Com.MateusB.Aula11_11;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Calendar;

public class exDataMain {
	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
//		calendario.set(2003, 8, 28);
//		System.out.println(calendario);
		calendario.set(Calendar.DAY_OF_MONTH, 27);
		calendario.set(Calendar.MONTH, 8);
		calendario.set(Calendar.YEAR, 2003);
//		System.out.println(calendario);
		Date hj = calendario.getTime();
		System.out.println(hj);
	
		//Calendar calendarioUm = Calendar.getInstance();
		
//		String mes = calendario.get(Calendar.MONTH);
		
		List<Date> lista = exData.diasDoMesAno(1, 2001);
		for(Iterator<Date> iter = lista.iterator(); iter.hasNext();) {
			Date element = (Date) iter.next();
			System.out.println(element);
		}
		
	}
}
	

	

