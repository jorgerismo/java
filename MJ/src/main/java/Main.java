import java.awt.font.NumericShaper;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Main {

	public static void main(String[] args) {
		/*
		 * List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		 * listaPessoa.add(new Pessoa("jorge", 1, "AD")); listaPessoa.add(new
		 * Pessoa("jeferson", 2, "AE")); listaPessoa.add(new Pessoa("julho", 3,
		 * "A2")); listaPessoa.add(new Pessoa("jorge", 1, "AP"));
		 * listaPessoa.add(new Pessoa("monica", 4, "AD")); listaPessoa.add(new
		 * Pessoa("felipe", 5, "AD")); listaPessoa.add(new Pessoa("joao", 6,
		 * "AC")); listaPessoa.add(new Pessoa("alex", 7, "AS"));
		 * listaPessoa.sort(Comparator.comparing(Pessoa::getNome));
		 * listaPessoa.forEach(System.out::println);
		 */
		
		NumberFormat fr = new DecimalFormat("###.##########");
		fr.setMaximumFractionDigits(10);
		fr.setMinimumFractionDigits(2);
		fr.setRoundingMode(RoundingMode.DOWN);
		Double value = 12345678901.123456;
		System.out.println(fr.format(value));
		value = 12345678901.12345678910;
		System.out.println(fr.format(value));
		value = 123.12345678910;
		System.out.println(fr.format(value));
		value = 12.12;
		System.out.println(fr.format(value));
		value = 0.0;
		System.out.println(fr.format(value));
		
	}

}
