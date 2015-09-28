import java.text.NumberFormat;

public final class NumberFormatUtil {

	public static String format(NumberFormat nf, double number,
			double defaultValue) {

		if ((Double.isNaN(number)) || (Double.isInfinite(number))) {
			return nf.format(defaultValue);
		} else {
			return nf.format(number);
		}
	}

	public static String format(NumberFormat nf, float number,
			float defaultValue) {

		if ((Float.isNaN(number)) || (Float.isInfinite(number))) {
			return nf.format(defaultValue);
		} else {
			return nf.format(number);
		}
	}

}