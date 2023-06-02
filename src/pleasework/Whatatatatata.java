package pleasework;

public class Whatatatatata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
//		arr1 = {100,99,98};  에러!
		arr1[0]=100;
		arr1[1]=99;
		arr1[2]=98;
//		arr1[3]=97; 에러!
		System.out.println("arr1.length: " + arr1.length);
		
		System.out.println();
		
		int[] arr2;
		arr2 = new int[5];
		arr2[0]=11;
		arr2[1]=12;
		arr2[2]=13;
		arr2[3]=14;
		arr2[4]=15;
		
		for(int i = 0; i <arr1.length; i++) {
			System.out.println(arr1[i]);
		};
		
		System.out.println();
		
		for(int i = 0; i <arr2.length; i++) {
			System.out.println(arr2[i]);
		};
		
		System.out.println();
		
		for(int aa:arr1) {
			System.out.println(aa);
		}
		
		System.out.println();
		
		for(int bb:arr2) {
			System.out.println(bb);
		}
	}

}
