public class defaultValue {
    public static void main(String[] args) {
        // Java program to demonstrate default
// values of array elements
		System.out.println("String array default values:");
		String str[] = new String[2];
		for (String s : str)
			System.out.print(s + " ");

		System.out.println(
			"\n\nInteger array default values:");
		int num[] = new int[2];
		for (int val : num)
			System.out.print(val + " ");

		System.out.println(
			"\n\nDouble array default values:");
		double dnum[] = new double[2];
        int i=0;
		while(i<dnum.length)
        {
            System.out.print(dnum[i]+ " ");
            i++;
        }
			

		System.out.println(
			"\n\nBoolean array default values:");
		boolean b[] = new boolean[2];
		// for (boolean val : bnum)
		// 	System.out.print(val + " ");
        int j=0;
        do
        {
            System.out.print(b[j] + " ");
            j++;
        }while(j<b.length);

		System.out.println(
			"\n\nReference Array default values:");
		defaultValue ademo[] = new defaultValue[5];
		for (defaultValue val : ademo)
			System.out.print(val + " ");

        System.out.print("\n \n char array dafault value");
        char ch[]=new char[2];
        for(char c:ch)
        {
            System.out.print(c+ " ");
        }

    }
}
