import java.util.Scanner;

public class UniversalBallotCounter{
	public static void main(String[] args) {
		//make an array
		int[] counter = new int[2548];
		//the voting process

		while(true){
			System.out.print("Enter candidate's ID number (1-2548, any negative number to exit):");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			if(a==0 || a>2548){
				System.out.println("Invalid ID number!");
				continue;
			
			}
			//condition to get out 
			if(a<0){
				break;
			}
			counter[a-1] ++;



		}
		System.out.println("Vote Countes: ");
		System.out.println("_____________ ");
//counting process
		for(int i =0; i<counter.length;i++){
			if(counter[i]>0){
				System.out.println("Candiadate " +(i+1)+ ": "+ counter[i]+" vote(s)");
			}
		}
		//find out who is the winner
		System.out.println("Election Winner(s): ");
		System.out.println("___________________");
		int max =counter[0];
		for(int i=0;i<counter.length;i++){
			if(counter[i]>=max){
				max= counter[i];
			}
		}
		for(int i=0;i<counter.length;i++){
			if(counter[i]>max){
				
				System.out.println("Candidate "+ (i+1));

			}
			if(counter[i]==max&&counter[i]!=0){
				System.out.println("Candidate "+ (i+1));
			}

		}
	}
		}
	

