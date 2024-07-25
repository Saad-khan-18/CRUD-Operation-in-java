public class GameRunner{
	public static void main(String args[]){
		
		System.out.println("CRUD operation using JAVA");
		Game game=new Game();
	    int length=game.getArrayLength();
		System.out.println("=====creation=======");
		System.out.println("the length of the array is : " + length);
		game.getArrayLength();

		
		System.out.println("======Insertion======");
		game.insertGameNames("pubg");
		game.insertGameNames("cricket");
		game.insertGameNames("free fire");
		game.insertGameNames("king kong");

		
		System.out.println("====reading====");
		game.readGameNames();
		
		System.out.println("====updating====");
		game.updateGameNames("pubg", "King Kong");
		game.readGameNames();
		
		
		
		System.out.println("====deleting===");
		game.deleteGameNames("");
		game.readGameNames();
		
		
		
		System.out.println("====searching===");
		String search = game.searchGameNames("free fire");
	System.out.println("Result :"+ search);
	}
}

		
		




		




		
		
	

