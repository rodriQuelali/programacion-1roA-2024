package operadoresLogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//and en java: &&, or en java: -->|| , not en java: --->!
		//tipo de boolean:
		int a=2, b=3,c=4;
		boolean or = (a>b)||(a<c);
					//f	or v
					// v
		System.out.println(or);
		boolean and = (a>b)&&(a<c);
		System.out.println(and);
	}

}
