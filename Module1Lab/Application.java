package Module1Lab;

public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		System.out.println(npc.introduce());
		System.out.println(npc.exclaim());

	}//end main
}
