package Day3;

public class RuppeToPoundConvertor implements CurrencyConvertor {

	@Override
	public float doConvert(float amountInRupees) {
		float amountInPound=amountInRupees/POUND_TO_RUPPE;
		return amountInPound;
	}
}


