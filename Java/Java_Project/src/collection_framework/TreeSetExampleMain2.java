package collection_framework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExampleMain2 {
	public static void main(String[] args) {
		Comparator<SocialMedia> comp2=new PopularitdescendingComparator();
		Comparator<SocialMedia> comp1=new PopularityAscendingComparator();
		SortedSet<SocialMedia> socialMedia =new TreeSet<>(comp2);
		SocialMedia insta=new SocialMedia();
		SocialMedia fb=new SocialMedia("FaceBook" , 7);
		SocialMedia wa=new SocialMedia("Whatsapp" , 9);
		SocialMedia tl=new SocialMedia("Telegram" , 5);
		
		socialMedia.add(insta);
		socialMedia.add(fb);
		socialMedia.add(wa);
		socialMedia.add(tl);
		
		for(Object media:socialMedia) {
			System.out.println(media);
		}
		
		
	}
}
