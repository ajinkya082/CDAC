package collection_framework;

import java.util.Comparator;

public class PopularitdescendingComparator implements Comparator<SocialMedia> {

	@Override
	public int compare(SocialMedia media1, SocialMedia media2) {
		Integer popularity1=media1.getPopularity();
		Integer popularity2=media2.getPopularity();
		int comparison=popularity2.compareTo(popularity1);//descending
		return comparison;
	}

}
