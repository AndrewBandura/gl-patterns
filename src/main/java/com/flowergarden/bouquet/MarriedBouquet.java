package com.flowergarden.bouquet;


import java.util.*;

import com.flowergarden.flowers.GeneralFlower;
import com.flowergarden.pattern.iterator.CustomIterator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarriedBouquet implements Bouquet<GeneralFlower> {

	private float assemblePrice = 120;
	private List<GeneralFlower> flowerList = new ArrayList<>();

	@Override
	public float getPrice() {
		float price = assemblePrice;
		for (GeneralFlower flower : flowerList) {
			price += flower.getPrice();
		}
		return price;
	}

	@Override
	public void addFlower(GeneralFlower flower) {
			flowerList.add(flower);
	}

	@Override
	public Collection<GeneralFlower> searchFlowersByLenght(int start, int end) {
		List<GeneralFlower> searchResult = new ArrayList<GeneralFlower>();
		for (GeneralFlower flower : flowerList) {
			if (flower.getLenght() >= start && flower.getLenght() <= end) {
				searchResult.add(flower);
			}
		}
		return searchResult;
	}

	@Override
	public void sortByFreshness() {
		Collections.sort(flowerList);
	}

	@Override
	public Collection<GeneralFlower> getFlowers() {
		return flowerList;
	}

	public void setAssembledPrice(float price) {
		assemblePrice = price;
	}

	@Override
	public CustomIterator iterator(boolean direction) {
		return new GeneralFlowerIterator(direction);
	}

	private class GeneralFlowerIterator implements CustomIterator {

		int size = flowerList.size();
		private int cursor;

		public GeneralFlowerIterator(boolean direction) {
			cursor = direction ? 0 : size;
		}

		@Override
		public boolean hasNext() {
			return cursor < size;
		}

		@Override
		public GeneralFlower next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}

			return flowerList.get(cursor++);
		}

		@Override
		public boolean hasPrevious() {
			return cursor > 0;
		}

		@Override
		public GeneralFlower previous() {
			if (!hasPrevious()) {
				throw new NoSuchElementException();
			}
			int i = cursor-1;
			cursor = i;
			return flowerList.get(i);
		}
	}
}
