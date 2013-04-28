
public class vlogToMaha {

	public static void main(String[] args) {
		MAHA build = new MAHA();
		//in = R2, a = R3, b = R4, c = R5, d = R6, e = R7, out = R8
		String[] test0 = {"DIV", "R3", "R2", "2"};
		System.out.print(build.makeMAHA(test0));
		String[] test1 = {"ADDI", "R4", "R3", "7"};
		System.out.print(build.makeMAHA(test1));
		String[] test2 = {"MUL", "R5", "3", "R3"};
		System.out.print(build.makeMAHA(test2));
		String[] test3 = {"SUBI", "R6", "R4", "3"};
		System.out.print(build.makeMAHA(test3));
		String[] test4 = {"ADD", "R5", "R5", "R6"};
		System.out.print(build.makeMAHA(test4));
		String[] test5 = {"AND", "R6", "R3", "R4"};
		System.out.print(build.makeMAHA(test5));
		System.out.println();
		String[] test6 = {"AND", "R5", "R3", "R6"};
		System.out.print(build.makeMAHA(test6));
		String[] test7 = {"XOR", "R5", "R5", "R4"};
		System.out.print(build.makeMAHA(test7));
		String[] test8 = {"ADDI", "R8", "R5", "0"};
		System.out.print(build.makeMAHA(test8));
		
	}

}
