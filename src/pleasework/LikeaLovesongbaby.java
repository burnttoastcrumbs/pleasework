package pleasework;

public class LikeaLovesongbaby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int size= 10;
//		for(int i = 0; i < size; i++) {
//        	for (int j = size - i; j >= 1; j--) {
//        		System.out.print(" *");
//        	}
//        	for(int k = 0; k <= i; k++) {
//        		System.out.print("l");
//        	}
//        	System.out.println();
//        }
	
	
		int size= 10;
		for(int i = 0; i < size; i++) {
        	for (int j = size - i; j >= 1; j--) {
        		System.out.print(" *");
        	}
        	for(int k = 0; k <= i; k++) {
        		System.out.print("");
        	}
        	System.out.println();
        }
		
		System.out.println();
		
		
        for(int i = 0; i < 6; i++) {
        	for(int j = 0; j < 11; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        
        for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 10; j++) {
        		if(i == 0 || i == 4) {
        			System.out.print("*");
        		}else {
        			if(j == 0 || j == 9) {
        				System.out.print("*");
        			}else {
        				System.out.print(" ");
        			}}
        		
        		}
        	System.out.println();
        }
	}

}
