package Day3;

public class CurrencyConvertorMain {
	public static void main(String[] args) {
		System.out.println("Today's Exchange Rate:");
		System.out.println("USD to RS: " + CurrencyConvertor.DOLLAR_TO_RUPPE);
		
//		CurrencyConvertor.POUND_TO_RUPPE=5500;
		
		CurrencyConvertor convertor;
		convertor=new DollarToRupeeConverter();
		float rupees=convertor.doConvert(5000);
		System.out.println("$5000 = RS. "+rupees);
		System.out.println("========================================");
		convertor=new RuppeToPoundConvertor();
		float pounds=convertor.doConvert(150000);
		System.out.println("RS.150000 = GBP:. "+pounds);
	}
}
