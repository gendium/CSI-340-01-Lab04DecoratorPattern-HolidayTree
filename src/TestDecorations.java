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
