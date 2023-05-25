package trabalho;

import java.util.Objects;

public class Real extends Moeda {
	
	double cotacao = valor;

	Real(double v) {
		super(v);
	}

	
	
	protected Real(double v, double cotacao) {
		super(v);
		this.cotacao = cotacao;
	}



	@Override
	public void info() {
		System.out.println(cotacao);
		
	}

	@Override
	public double converter() {
		double converter = valor;
		return converter;
	}
		
				

	@Override
	public String toString() {
		return "Real " + valor;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cotacao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		return Double.doubleToLongBits(cotacao) == Double.doubleToLongBits(other.cotacao);
	}
	

	
	}


