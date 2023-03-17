import javax.swing.JOptionPane;

public class Objects {
	boolean canContinue = false;
	double valor = 0;

	public Objects() {

	}

	// Primer menu
	public String conversores() {
		return (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Conversor de Moneda", "Conversor de Temperatura", "Conversor de numero" },
				"Selecciona")).toString();
	}

	// Segundo menu - divisas
	public String tipoMoneda() {
		return (JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
						"De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
						"De Yen a Pesos", "De Won Coreano a Pesos" },
				"Selecciona")).toString();
	}

	// segundo menu - temperatura
	public String tipoTemperatura() {
		return (JOptionPane.showInputDialog(null, "Elija la temperatura que quiere convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius",
						"De Fahrenheit a Kelvin", "De Kelvin a Celsius", "De Kelvin a Fahrenheit" },
				"Selecciona")).toString();
	}

	// tercer menu - binario
	public String tipoNumero() {
		return (JOptionPane.showInputDialog(null, "Elija la opcion a convertir", "Numero", JOptionPane.PLAIN_MESSAGE,
				null, new Object[] { "De Decimal a Binario", "De Binario a Decimal" }, "Selecciona")).toString();
	}

	// continuar
	public int continuar() {
		return JOptionPane.showConfirmDialog(null, "Deseas Continuar?");
	}

	// finalizacion
	public String finalizar() {
		JOptionPane.showMessageDialog(null, "Programa Terminado.", "Programa ha Finalizado", 1);
		return null;

	}

	public double validacion1() {
		do {
			String userResponse = JOptionPane.showInputDialog(null,

					"Ingrese la cantidad de dinero que deseas convertir:", "Valor", JOptionPane.PLAIN_MESSAGE);

			try {
				valor = Integer.parseInt(userResponse);
				canContinue = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Numero o caracter invalido. Ingrese un numero", "Error",
						JOptionPane.ERROR_MESSAGE);
				canContinue = false;
			}

		} while (!canContinue);
		return valor;
	}

	public double validacion2() {

		do {
			String userResponse = JOptionPane.showInputDialog(null, "Ingrese los Grados a convertir:", "Valor",

					JOptionPane.PLAIN_MESSAGE);

			try {
				valor = Integer.parseInt(userResponse);
				canContinue = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Numero o caracter invalido. Ingrese un numero", "Error",
						JOptionPane.ERROR_MESSAGE);
				canContinue = false;
			}
		} while (!canContinue);
		return valor;
	}
	public double validacion3() {

		do {
			String userResponse = JOptionPane.showInputDialog(null, "Ingrese el Numero a convertir", "Valor",

					JOptionPane.PLAIN_MESSAGE);

			try {
				valor = Integer.parseInt(userResponse);
				canContinue = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Numero o caracter invalido. Ingrese un numero", "Error",
						JOptionPane.ERROR_MESSAGE);
				canContinue = false;
			}
		} while (!canContinue);
		return valor;
	}
	

}
