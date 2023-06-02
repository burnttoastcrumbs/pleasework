package pleasework;

public class ConcentrateBabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"짱구", "철수", "유리", "훈이", "맹구"};
//		int[] scoreEnglish = {100,99,98,97,96};
//		int[] scoreMath = {95,94,93,92,91};
//		int[] scorePhysics = {90,89,88,87,86};
		
		int score[][] = {{100,99,98,97,96},{95,94,93,92,91},{90,89,88,87,86}};
		//영어,수학,물리
		int sum=0;
		  for(int i=0;i<score.length;i++){
		   for(int j=0;j<score[i].length;j++){
		    sum+=score[i][j];
		   }
		   System.out.println("각 행 가로의 합은 : "+sum);
		   sum=0;
		  }
		  
		  System.out.println();
		  
		  for(int i=0;i<score.length;i++){
		   for(int j=0;j<score[i].length;j++){
		    sum+=score[j][i];
		   }
		   System.out.println("각 열 세로의 합은 : "+sum);
		   sum=0;
		  }
		
	}

}
