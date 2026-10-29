package inner_classes;

public class AnonymousInnerClassMain {
	public static void main(String[] args) {
		CurrencyConvertor cc;
//		cc=new CurrencyConvertor() {//anonymous inner class starrt
//
//			@Override
//			public float doConvert(float amountInReuppe) {
//				// TODO Auto-generated method stub
//				return amountInReuppe/8.75f;
//			}
//			
//		};//anonymous inner class end
		
		cc=new CurrencyConvertor() {
			
			@Override
			public float doConvert(float amount) {
				// TODO Auto-generated method stub
				return amount/8.75f;
			}
		};
		System.out.print(cc.doConvert(50000));
		
		
	}
}
