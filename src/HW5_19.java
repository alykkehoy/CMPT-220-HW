
public class HW5_19 {

	public static void main(String[] args){
		String[] pyramid = new String[8];
		pyramid[0] = "                   1                 ";
		pyramid[1] = "               1   2  1              ";
		pyramid[2] = "            1  2   4  2  1           ";
		pyramid[3] = "         1  2  4   8  4  2  1        ";
		pyramid[4] = "      1  2  4  8  16  8  4  2 1      ";
		pyramid[5] = "    1 2  4  8 16  32 16  8  4 2 1    ";
		pyramid[6] = "  1 2 4  8 16 32  64 32 16  8 4 2 1  ";
		pyramid[7] = "1 2 4 8 16 32 64 128 64 32 16 8 4 2 1";
		
		
		for (int i = 0; i < pyramid.length; i++){
			System.out.println(pyramid[i]);
		}
	}
}