package org.akash.mycglib;

class Superclass {

    private void interestingMethod() {
        System.out.println("Superclass's interesting method.");
    }

    /**
	 * If interestingMethod() of Superclass is private then it is => invokeSpecial			<br>
	 * If interestingMethod() of Superclass is not private then it is => invokeVirtual		<br>
	 * 
	 *   javap -c -private Superclass.class		<br>
	 *   javap -c -private Subclass.class		<br>
	 */
    void exampleMethod() {
        interestingMethod();
    }
}

public class Subclass extends Superclass {

    void interestingMethod() {
        System.out.println("Subclass's interesting method.");
    }

    public static void main(String args[]) {
        Subclass me = new Subclass();
        me.exampleMethod();
    }
}