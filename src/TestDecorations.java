/*
		Author: Sean Egger, Alev Ruvlev
		Class: CSI-340-01
		Assignment: Lab 4
		Date Assigned: October 4
		Due Date: October 12 11:59
		Description:
		A tree decorator program demonstrating the decorator pattern
		Certification of Authenticity:
		I certify that this is entirely my own work, except where I have given
		fully-documented references to the work of others. I understand the definition and
		consequences of plagiarism and acknowledge that the assessor of this assignment
		may, for the purpose of assessing this assignment:
		- Reproduce this assignment and provide a copy to another member of academic
		- staff; and/or Communicate a copy of this assignment to a plagiarism checking
		- service (which may then retain a copy of this assignment on its database for the
		- purpose of future plagiarism checking)
		● If the section number is not available, it may be
*/
import trees.*;
import decorations.*;
public class TestDecorations {
public static void main(String[] args) {
	Tree myTree = new FraserFir();
	myTree = new Ruffles(myTree);
	myTree = new Star(myTree);
	myTree = new Star(myTree);
	printTree(myTree);
}
public static void printTree(Tree myTree)
{
	System.out.println(myTree.getDecorations() + " for a total of " + myTree.getCost());
}
}
