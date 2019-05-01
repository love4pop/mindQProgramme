package com.java.exam;

public class Mesurment {
	int count;
	int accumulated;

	public void Measurement() {
	}

	public void record(int v) {
		count++;
		accumulated += v;
	}

	public int average() {
		return accumulated / count;
	}

	/*
	 * public boolean equals(Object other) { if (this == other) return true;
	 * 
	 * if (!(other instanceof Measurement)) return false;
	 * 
	 * 
	 * Measurement o = (Measurement) other; if (count != 0 && o.count != 0) return
	 * average() == o.average(); return count == o.count;
	 * 
	 * }
	 */
	public int hashCode() {

		return accumulated / count;

	}

}
