import java.util.*;
class Task1{
public static void main(String Args[]){
	Random r = new Random();
	int ran = r.nextInt(100);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Guess Number : ");
	int guessno = sc.nextInt();
	System.out.println("Guess Number is : " +guessno);
	//System.out.println("Random Number is : " +ran);
	
	if(guessno == ran){
		System.out.println("Guess Number is Correct");
	}else if(guessno > ran){
		System.out.println("Guess Number is Too High");
	}else{
		System.out.println("Guess Number is Too Low");
	}

	int score = 1;
	for(int i=0;i<100;i++){
		System.out.print("Enter Guess Number Again: ");
		guessno = sc.nextInt();
		score++;
		if(guessno == ran){
			System.out.println("Guess Number is Correct");
			break;
		}
	}
	System.out.println("Score : "+score);
}
}