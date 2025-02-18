package no.hvl.dat102.diversekoer;

import no.hvl.dat102.adter.KoeADT;

class SirkulaerKoeTest extends AbstractKoeADTTest {

	@Override
	KoeADT<Integer> opprettNyKoeOfInteger() {
		return new SirkulaerKoe<Integer>();
	}

	@Override
	KoeADT<String> opprettNyKoeOfString() {
		return new SirkulaerKoe<String>();
	}
}
