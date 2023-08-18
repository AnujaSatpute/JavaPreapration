package com.oops;

import com.oops.*;


class Refregriator {
	Refregriator display() {
		System.out.println("This is Refregirator info :");
		return new Refregriator();
	}
}

class LG extends Refregriator {

	LG display() {
		super.display();
		System.out.println("This is LG Refregiretor.. ");
		return new LG();
	}
}

class Samsung extends Refregriator {

	Samsung display() {
		super.display();
		System.out.println("Samsung ");
		return new Samsung();
	}
}

class Double_Door extends Samsung {

	Double_Door display() {
		System.out.println("This is  Double door Refregirator");
		return new Double_Door();
	}
}
class Single_Door extends LG {

	Single_Door display() {
		System.out.println("This is  Single door Refregirator");
		return new Single_Door();
	}
}

public class CovarientReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Refregriator r1 = new LG();
		LG l1 = (LG) r1.display();
		r1.display();

		r1 = new Samsung();
		Samsung s1 = (Samsung) r1.display();
		r1.display();

		s1 = new Double_Door();
		Double_Door d1 = (Double_Door) s1.display();
		d1.display();
		l1 = new Single_Door();

		Single_Door s3 = (Single_Door) l1.display();
		s3.display();
	}

}
