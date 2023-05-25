package trabalho;

import java.util.Objects;

public abstract class Moeda {
	double valor;

	Moeda(double v){
		valor = v;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
//NESTA PARTE DO CÓDIGO É INSERIDO O METODO EQUALS QUE COMPARARA OS OBJETOS DA CLASSE.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}


	abstract public void info();
	

	abstract double converter();


	
}
