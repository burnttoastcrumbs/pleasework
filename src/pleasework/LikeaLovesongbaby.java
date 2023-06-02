package pleasework;

public class LikeaLovesongbaby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size= 5;
		for(int i = 0; i <= size; i++) {
        	for (int j = size - i; j > 1; j--) {
        		System.out.print(" *");
        	}
        	for(int k = 0; k <= i; k++) {
        	}
        	System.out.println();
        }
	
	
        for(int i = 0; i < 6; i++) {
        	for(int ii = 0; ii < 11; ii++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println();
        
        for(int i = 0; i < 6; i++) {
        	for(int ii = 0; ii < 11; ii++) {
        		if(i == 0 || i == 5) {
        			System.out.print("*");
        		}else {
        			if(ii == 0 || ii == 10) {
        				System.out.print("*");
        			}else {
        				System.out.print(" ");
        			}}
        		
        		}
        	System.out.println();
        }
	}

}
