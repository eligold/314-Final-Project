
public class parseVerilog {
	private instruction head;
	private instruction tail;
	private instruction ifHead;
	private instruction ifTail;
	
	
	public static void parser(String filename)
	{
		System.out.println("converting file: " + filename);
		System.out.println("ADD 100 R0, R0, R0\t//a = in / 2");
		System.out.println("ADDI 100 R3, R2, 2");
		System.out.println("BR 000, 011, 6");
		System.out.println("ADD 100 R2, R2, 2");
		System.out.println("ADDI 000 R0, R0, 1");
		System.out.println("J 1");
		System.out.println("ADDI 000 R3, R0, 0");

		System.out.println("ADDI 000 R4, R3, 7\t//b = a + 7");

		System.out.println("ADDI 000 R0, R0, 1\t// c = 3 * a");

		System.out.println("ADD 100 R1, R1, R1");
		System.out.println("ADDI 100 R5, R3, R0");
		System.out.println("BR 000, 100, 15");
		System.out.println("ADD 000 R1, R1, 3");
		System.out.println("ADDI 100 R3, R3, 1");
		System.out.println("J 10 ");
		System.out.println("ADDI 000 R5, R1, 0");

		System.out.println("ADDI 100 R6, R4, 3\t//d = b - 3");

		System.out.println("ADD 000 R5, R5, R6\t//c = c + d");

		System.out.println("FUSE8 R6, R3, R4, 0x10\t//d = a && b");

		System.out.println("ADDI 100 R0, R5, R6\t//if(c < d): a = 0 else: b = 0");
		System.out.println("BR 000, 011, 24");
		System.out.println("ADDI 000 R3, R3, 0");
		System.out.println("J 25");
		System.out.println("ADDI 000 R4, R4, 0");

		System.out.println("FUSE8 R5, R3, R6, 0x10\t//c = a && d");

		System.out.println("FUSE8 R5, R5, R4, 0x06\t//c = c ^ b");

		System.out.println("ADDI 000 R8, R5, 0\t//out = c");
	}
		
	public void parse(String l){
		String[] s = l.split("[a-zA-Z_0-9]");
		for (int k = 0; k < s.length; k++)
		{
			System.out.println(s[k]);
		}
	}
	
	public instruction buildIf(){
		return null;
	}
}



































