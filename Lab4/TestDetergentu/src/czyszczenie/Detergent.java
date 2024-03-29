package czyszczenie;

//: c06:Detergent.java
//From 'Thinking in Java, 2nd ed.' by Bruce Eckel
//www.BruceEckel.com. See copyright notice in CopyRight.txt.
//Inheritance syntax & properties.

class Cleanser {
private String s = new String("Cleanser");

public void append(String a) {
 s += a;
}

public void dilute() {
 append(" dilute()");
}

public void apply() {
 append(" apply()");
}

public void scrub() {
 append(" scrub()");
}

public void print() {
 System.out.println(s);
}

public static void main(String[] args) {
 Cleanser x = new Cleanser();
 x.dilute();
 x.apply();
 x.scrub();
 x.print();
}
}

//=======================================

public class Detergent extends Cleanser {
// Change a method:
public void scrub() {
 append(" Detergent.scrub()");
 super.scrub(); // Call base-class version
}

//public void 

//public void apply() {
//	 Cleanser.append(" apply()");
//}

public void apply() {
	 append(" Detergent.apply()");
	 super.apply(); // Call base-class version
}

// Add methods to the interface:
public void foam() {
 append(" foam()");
}

// Test the new class:
public static void main(String[] args) {
 Detergent x = new Detergent();
 x.dilute();
 x.apply();
 x.scrub();
 x.foam();
 x.print();
 System.out.println("Testing base class:");
 Cleanser.main(args);
}
} /// :~