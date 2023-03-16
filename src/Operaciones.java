
public class Operaciones {

	private String divisa, temperatura, binario, mensaje, resultado2;
	private double valor, resultado;

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getBinario() {
		return binario;
	}

	public void setBinario(String binario) {
		this.binario = binario;
	}

	public String getResultado2() {
		return resultado2;
	}

	public void setResultado2(String resultado2) {
		this.resultado2 = resultado2;
	}

	// constructor

	public Operaciones() {
		// TODO Auto-generated constructor stub
	}

	// metodo

	public String convertirM() {

		switch (divisa) {
		case "De Pesos a Dolar":
			resultado = valor / 4874.00;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Dolares";
			break;
		case "De Pesos a Euro":
			resultado = valor / 5174.57;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Euros";
			break;
		case "De Pesos a Libras":
			resultado = valor / 5898.95;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Libras";
			break;
		case "De Pesos a Yen":
			resultado = valor / 36.67;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Yenes";
			break;
		case "De Pesos a Won Coreano":
			resultado = valor / 3.73;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Wones";
			break;
		case "De Dolar a Pesos":
			resultado = valor * 4874.00;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Pesos";
			break;
		case "De Euro a Pesos":
			resultado = valor * 5174.57;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Pesos";
			break;
		case "De Libras a Pesos":
			resultado = valor * 5898.95;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Pesos";
			break;
		case "De Yen a Pesos":
			resultado = valor * 36.67;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Pesos";
			break;
		default:
			resultado = valor * 3.73;
			mensaje = "Tienes $" + (double) Math.round(resultado * 100d) / 100 + " Pesos";

		}
		return mensaje;

	}

	public String convertirT() {
		switch (temperatura) {
		case "De Celsius a Fahrenheit":
			resultado = (valor * 9 / 5) + 32;
			mensaje = valor + "°C " + " son " + (double) Math.round(resultado * 100d) / 100 + "°F";
			break;
		case "De Celsius a Kelvin":
			resultado = valor + 273.15;
			mensaje = valor + "°C " + " son " + (double) Math.round(resultado * 100d) / 100 + "°K";
			break;
		case "De Fahrenheit a Celsius":
			resultado = (valor - 32) * 5 / 9;
			mensaje = valor + "°F " + " son " + (double) Math.round(resultado * 100d) / 100 + "°C";
			break;
		case "De Fahrenheit a Kelvin":
			resultado = (valor - 32) * 5 / 9 + 273.15;
			mensaje = valor + "°F " + " son " + (double) Math.round(resultado * 100d) / 100 + "°K";
			break;
		case "De Kelvin a Celsius":
			resultado = valor - 273.15;
			mensaje = valor + "°K " + " son " + (double) Math.round(resultado * 100d) / 100 + "°C";
			break;
		default:
			resultado = (valor - 273.15) * 9 / 5 + 32;
			mensaje = valor + "°K " + " son " + (double) Math.round(resultado * 100d) / 100 + "°F";

		}
		return mensaje;

	}

	public String convertirB() {
		switch (binario) {
		case "De Decimal a Binario":
			resultado2 = Integer.toBinaryString((int) valor);
			mensaje = "El Decimal " + (int) valor + " en Binario es: " + resultado2;
			break;
		default:
			resultado = Integer.parseInt(String.valueOf((int) valor), 2);
			mensaje = "El Binario " + String.valueOf((int) valor) + " en decimal es: " + (int) resultado;

		}

		return mensaje;
	}

}
