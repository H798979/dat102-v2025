package no.hvl.dat102.diversekoer;

import no.hvl.dat102.adter.KoeADT;

class QueueToKoeAdapterTest extends AbstractKoeADTTest {

	@Override
	KoeADT<Integer> opprettNyKoeOfInteger() {
		return new QueueToKoeAdapter<Integer>();
	}

	@Override
	KoeADT<String> opprettNyKoeOfString() {
		return new QueueToKoeAdapter<String>();
	}
}
