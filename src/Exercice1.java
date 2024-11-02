
public class Exercice1 {
	static{
		 System.out.println("Message");
		}
		public static void main(String[] args) {
		int a=10;
		int b=011;
		int c=-3;//~c=-(c+1)
		System.out.println("b0 = "+b);
		System.out.println("Opération sur c = "+~c);
		var result = switch (a > b ? "grand" : "petit") {
		 case "grand" -> ++a-++c+b++;
		 case "petit" -> {
		 int val = ++b*a--;
		 yield (val+c);
		 }
		 default -> ++b;
		};
		System.out.println("b0 = "+a);
		System.out.println("b0 = "+b);
		System.out.println("b0 = "+c);
		System.out.println("Résultat = "+result);
		System.out.println("b1 = "+b);
		var op = (b != 10) && (a/b < 1) ? 1 : 2;
		switch (op) {
		 case 0:
		System.out.println("Test 0");
		break;
		 case 1:
		System.out.println("Test 1");
		 case 2:
		System.out.println("Test 2");
		 default:
		System.out.println("Test");
		break;
		}
		}
		
}
