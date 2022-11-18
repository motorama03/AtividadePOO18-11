package Com.MateusB.aula18_11;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
	
	private List<Especialidade> especialidade = new ArrayList<Especialidade>();

	public List<Especialidade> getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(List<Especialidade> especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialidade=");
		builder.append(especialidade);
		builder.append("]");
		return builder.toString();
	}
	
}
