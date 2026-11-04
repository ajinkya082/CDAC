package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperationMain {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Mango","Appple","Guava","Watermelon");
		Stream<String> fruitStream=fruits.stream();
		Consumer<String> myConsumer=(fr)->System.out.println(fr.toUpperCase());
		fruitStream.forEach(myConsumer);
		System.out.println("=====================================");
		List<Integer> allNumbers=Arrays.asList(2,6,73,87,88);
		/*Stream<Integer> numStream=allNumbers.stream();
		Predicate<Integer> evenPr=num->num%2==0;
		Stream<Integer> evenNumStream=numStream.filter(evenPr);
		evenNumStream.forEach(nm->System.out.println(nm));*/
		allNumbers.stream().filter(num->num%2==0).forEach(num->System.out.println(num));
		
	}

}
