package accessTest2;

import accessTest.Parent;

// 14번 :

public class OuterClass {
	public void printAccess() {
		Parent p = new Parent();
		System.out.println(p.publicValue);
	}
}
