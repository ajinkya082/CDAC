package Day3;

public class DollarToRupeeConverter implements CurrencyConvertor  {

	@Override
	public float doConvert(float amountInDollars) {
		// TODO Auto-generated method stub
		float amountInRupees=amountInDollars*DOLLAR_TO_RUPPE;
		return amountInRupees;
	}

}
