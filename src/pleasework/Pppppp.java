package pleasework;

public class Pppppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] scoreEnglish;
//		int[] scoreMath;
//		
//		String[] name;
//		String[] name2;
//		
//		double[] total;
//		double[] aver;
//		
//		char[] grade202301;
//		char[] grade202302;
//		
//		boolean[] score;
//		boolean[] score2;
		
		int[] scoreEnglish = {100,99,98,97,96};
		int[] scoreMath = {95,94,93,92,91};
		int[] scorePhysics = {90,89,88,87,86};
		
		scoreEnglish[5] = 84;
		//영어 점수에 새로운 점수 추가 안됨(6번째 추가 불가)
		
		//int[] scorePhysics;
		//scorePhysics = {90,89,88,87,86};
		//선언과 동시에 초기화 시 에러남
		
		String[] name = {"짱구", "철수", "유리", "훈이", "맹구"};
		String[] name2 = {"레드", "블루", "핑크", "그린", "옐로"};
		
		char[] grade = {'a', 'b', 'c', 'd', 'f'};
		
		
		int a = scoreEnglish.length;
//		System.out.println(a);
		
//		int[] total = {scoreEnglish[0]+scoreMath[0]+scorePhysics[0],
//				scoreEnglish[1]+scoreMath[1]+scorePhysics[1],
//				scoreEnglish[2]+scoreMath[2]+scorePhysics[2],
//				scoreEnglish[3]+scoreMath[3]+scorePhysics[3],
//				scoreEnglish[4]+scoreMath[4]+scorePhysics[4]};
		
//		for(int j = 0; j <a; j++) {
//			System.out.println(scoreEnglish[j]+scoreMath[j]+scorePhysics[j]);
//		}; 
//		int[] total = {
//		for(int i = 0; i <scoreEnglish.length; i++) {
//		 scoreEnglish[i] + scoreMath[i] + scorePhysics[i]
//		}
//		};
		
		int total[] = scoreEnglish+scoreMath+scorePhysics;
		
//		for(int i = 0; i <a; i++) {
//			System.out.println(scoreEnglish[i]);
//		};
		
		
		System.out.println();
		
		

//		int b = 0;
//		while(b<scoreEnglish.length) {
//			System.out.println(scoreEnglish[b]);
//			b++;
//		}
			
		
		System.out.println();
		
//		System.out.println(total);
		
//		for(int bb:scoreEnglish) {
//			System.out.println(bb);
//		}
		
		double[] aver = {};
		
		char[] grade202301 = {};
		char[] grade202302 = {};
		
		
		
	}

}
