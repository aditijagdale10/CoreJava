import java.io.*;

class MirrorInverse{

		static boolean isMirrorInverse(int arr[]){

			for (int i = 0; i < arr.length; i++) {

				// If condition fails for any element
				if (arr[arr[i]] != i)
					return false;
		}

		// Given array is mirror-inverse
		return true;
	}

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of arr");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		for(int i = 0 ; i < arr.length ; i++){


			arr[i] = Integer.parseInt(br.readLine());

		}

		if (isMirrorInverse(arr))
			System.out.println("Yes Mirror Inverse");
		else
			System.out.println("No not a mirror Inverse");

	}
	



}


