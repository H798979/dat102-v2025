package no.hvl.dat102.javalist2liste;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat102.listeadt.ListeADT;

public class List2ListeAdapter<T> implements ListeADT<T> {
	
	/*
	 * NB! ListeADT-en sier at indekser er 1..n, mens for ArrayList 
	 *     er det jo 0..n-1.
	 *     
	 *     Kanskje vi kan sette inn en dummy-verdi i indeks 0 på
	 *     samme måte som i tabell-liste.
	 *     
	 *     Sjekke med enhetstesting at vi har gjort ting riktig!
	 */
	List<T> list;
	
	@SuppressWarnings("unchecked")
	public List2ListeAdapter() {
		list = new ArrayList<>();
		list.add((T) new Object()); //Triks. Setter inn dummy-objekt på plass 0.
	}

	@Override
	public void add(T newEntry) {
		list.add(newEntry);
	}

	@Override
	public void add(int newPosition, T newEntry) {
		if (newPosition < 1 || newPosition > getLength() + 1) {
			throw new IndexOutOfBoundsException();
		}
		list.add(newPosition, newEntry);
	}

	@Override
	public T remove(int givenPosition) {
		if (givenPosition < 1 || givenPosition > getLength()) {
			throw new IndexOutOfBoundsException();
		}
		return list.remove(givenPosition);
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		if (givenPosition < 1 || givenPosition > getLength()) {
			throw new IndexOutOfBoundsException();
		}
		return list.set(givenPosition, newEntry);
	}

	@Override
	public T getEntry(int givenPosition) {
		if (givenPosition < 1 || givenPosition > getLength()) {
			throw new IndexOutOfBoundsException();
		}
		return list.get(givenPosition);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T[] toArray() {
		return (T[]) list.toArray();
	}

	@Override
	public boolean contains(T anEntry) {
		return list.contains(anEntry);
	}

	@Override
	public int getLength() {
		return list.size() - 1; // Siden vi har et dummy-objekt på plass 0. 
	}

	@Override
	public boolean isEmpty() {
		return getLength() == 0; // evt. size == 1.
	}

	@Override
	public void clear() {
		list.clear();
	}

}
