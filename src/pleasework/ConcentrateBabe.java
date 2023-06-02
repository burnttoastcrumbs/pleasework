package pleasework;

public class ConcentrateBabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"짱구", "철수", "유리", "훈이", "맹구"};
		String[] subject = {"영어", "수학", "물리"};
		
		int score[][] = {{100,99,98},{95,94,93},{90,89,88},{85,84,83},{80,79,78}};
		//영어,수학,물리
		
		int sum=0;
			  for(int i=0;i<score.length;i++){
			   for(int j=0;j<score[i].length;j++){
			    sum+=score[i][j];
			   }
//			   System.out.println(name[i] + "의 점수 합은 " + sum + "이고 평균은 " + sum/score[i].length + "입니다.");
			   System.out.println(name[i] + "의 점수 합은 " + sum + "이고 평균은 " + sum/subject.length + "입니다.");
			   sum=0;
			  }
			  
			  System.out.println();
			  
			  int sum2=0;
			  for(int i=0;i<score[i].length;i++){
			   for(int j=0;j<score.length;j++){
			    sum2+=score[j][i];
			   }
			   System.out.println("학생들의 " + subject[i] + " 점수 합은 " + sum2 + "이고 평균은 " + sum2/score.length + "입니다.");
			   sum2=0;
			  }
			  
			  System.out.println();
			  
			  
		
		
	}

}
