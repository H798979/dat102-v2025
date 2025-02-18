package no.hvl.dat102.diversekoer;

import no.hvl.dat102.adter.KoeADT;

class LenketKoeTest extends AbstractKoeADTTest {

	@Override
	KoeADT<Integer> opprettNyKoeOfInteger() {
		return new LenketKoe<Integer>();
	}

	@Override
	KoeADT<String> opprettNyKoeOfString() {
		return new LenketKoe<String>();
	}
}
