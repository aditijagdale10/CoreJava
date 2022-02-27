import java.io.*;
class ReverseString{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the string");
		String str = br.readLine();

		char[] arr = str.toCharArray();
		char[] narr = new char[arr.length];

		for(int i = 0; i< narr.length; i++){
			narr[i] = arr[arr.length-1-i];


		}
		str = new String(narr);

		System.out.print(str);
	}	

}
