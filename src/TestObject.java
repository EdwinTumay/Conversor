import javax.swing.JOptionPane;

public class TestObject {
	public static void main(String[] args) {
		Objects objeto = new Objects();
		Operaciones moneda = new Operaciones();
		Operaciones temperatura = new Operaciones();
		Operaciones binario = new Operaciones(); 
		boolean comienzo = true;

		try {
			while (comienzo) {

				String inicio = objeto.conversores();
				System.out.println(inicio);

				if (inicio == "Conversor de Moneda") {
					String tipoDeMoneda = objeto.tipoMoneda();
					moneda.setDivisa(tipoDeMoneda);
					System.out.println(tipoDeMoneda);

					double validacion = objeto.validacion1();

					moneda.setValor(validacion);
					System.out.println(validacion);
					String resultado = moneda.convertirM();
					JOptionPane.showMessageDialog(null, resultado);

				} else if (inicio == "Conversor de Temperatura") {
					String tipoDeTemperatura = objeto.tipoTemperatura();
					temperatura.setTemperatura(tipoDeTemperatura);
					System.out.println(tipoDeTemperatura);

					double validacion = objeto.validacion2();

					temperatura.setValor(validacion);
					System.out.println(validacion);
					String resultado = temperatura.convertirT();
					JOptionPane.showMessageDialog(null, resultado);

				} else if (inicio == "Conversor de numero") {

					String tipoDeNumero = objeto.tipoNumero();
					binario.setBinario(tipoDeNumero);
					System.out.println(tipoDeNumero);

					double validacion = objeto.validacion3();

					binario.setValor(validacion);
					System.out.println(validacion);
					String resultado = binario.convertirB();
					JOptionPane.showMessageDialog(null, resultado);
					
				}

				int continuar = objeto.continuar();
				System.out.println(continuar);
				if (continuar == 0) {
					comienzo = true;
				} else {
					objeto.finalizar();
					comienzo = false;
				}

			}

		} catch (NullPointerException e) {
			System.out.println("ejecutando el try catch");
			objeto.finalizar();
			comienzo = false;
		}
	}

}
