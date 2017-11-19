package ch8;

public class Chapter_08_E03_SortStudentsOnGrades {
	
	final static int STUDENT = 0;
	final static int GRADE = 1;
	
	public static void main(String[] args) {
		
		char[][] answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
				{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
			};
			
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
			
		
		int[][] scoreList = gradeStudents(answers, keys);
					
		System.out.println("Scores before sorting: ");
			for (int i = 0; i < answers.length; i++) 		
				System.out.println("Student nr " + scoreList[i][STUDENT] + " had " + scoreList[i][GRADE] + " answers");
			
			scoreList = selectionSort(scoreList);
			
		System.out.println("\nScores after sorting: ");
			for (int i = 0; i < answers.length; i++) 		
					System.out.println("Student nr " + scoreList[i][0] + " had " + scoreList[i][1] + " answers");
			
				

	}
	
	public static int[][] gradeStudents(char[][] answers, char[] keys) {
						
		int[][] scoreList = new int[answers.length][2];
		
		for (int i = 0; i < scoreList.length; i++) {
			int correctCount = 0;
			for (int j = i + 1; j < keys.length; j++) {
				
				if (keys[j] == answers[i][j])
					correctCount++;
			}
			scoreList[i][STUDENT] = i;
			scoreList[i][GRADE] = correctCount;
			
		}
		return scoreList;		
	}
	
	public static int[][] selectionSort(int[][] scoreList) {
		
		for (int i = 0; i < scoreList.length; i++) {
			
			int currentMaxIndex = i;
			int currentMaxScore = scoreList[i][GRADE];
			int currentMaxStudent = scoreList[i][STUDENT];
			
			
			for (int j = i + 1; j < scoreList.length; j++) {
				
				if (scoreList[j][1] > currentMaxScore) {
					currentMaxIndex = j;
					currentMaxScore = scoreList[j][GRADE];
					currentMaxStudent = scoreList[j][STUDENT];
				}	
			}
			
			if (currentMaxIndex != i) {
				scoreList[currentMaxIndex][GRADE] = scoreList[i][GRADE];
				scoreList[currentMaxIndex][STUDENT] = scoreList[i][STUDENT];
				scoreList[i][GRADE] = currentMaxScore;
				scoreList[i][STUDENT] = currentMaxStudent;
			}	
		}
		return scoreList;
	}

}
