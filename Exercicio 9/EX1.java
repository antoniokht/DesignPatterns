
public class EX1 {
	public int fib;
	
	public EX1(int n) {
		int penultimo=0, ultimo=1, aux;
		int i=0;
		
		if(n==0) {
			ultimo= 0;
		}
		for(i=1;i<n;i++) {
				aux= ultimo;
				ultimo= ultimo+penultimo;
				penultimo= aux;
		}
		
		this.fib= ultimo;
	}
}
