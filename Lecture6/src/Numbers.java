//package lesson03.sample1;

public class Sample1
{
    public static void main(String args[])
    {
	Node n1 = new Node("Line");
	n1.setNext(null);
	
	Node n2 = new Node("Two");
	n2.setNext(n1);

	Node n3 = new Node("Three");
    n3.setNext(n2);
    
	Node n4 = new Node("Four");
	n4.setNext(n3);

	for(Node n = n4; n != null; n = n.getNext()) {
	    System.out.println(n);
	}
    }
}
