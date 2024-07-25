/* take 5 different classes and
 perform Create, Read, update, delete, and Search operation using an array*/
 
 class Game{
	 
	 String[] games= new String[4];
	 int index=0;
	 
	 public int getArrayLength(){
		 return games.length;
	 }
	public String insertGameNames(String gameName){
	if(this.index<this.getArrayLength()){
		games[index]=gameName;
		System.out.println(index+":" + games[index]);
		index++;
		return "Inserted SuccessFully";
	}	
	return "Not Inserted";
	
	}
  
     public void readGameNames(){
		for(String name:games){
		System.out.println("__"+ name);	
		} 
	 } 

    public String updateGameNames(String oldGameName, String newGameName){
		
		for(int i=0; i<getArrayLength(); i++){
		if(games[i]==oldGameName){
		games[i]=newGameName;
      return "Updated Succesfully";		
		}	
		}
	return "no Find";	
	}
   public String deleteGameNames(String gameName){
	  for(int i=0; i<getArrayLength(); i++){
		 if(games[i]==gameName){
			games[i]=null; 
			return "Delete Succesfully";
		 } 
	  }
	    return "Not Deleted";
   }
     public String searchGameNames(String gameName){
	 for(int i=0; i<getArrayLength(); i++){
		 if(games[i]==gameName){
			return "Search Game is Found"+gameName; 
		 }
	 }
	 return "Not Found";
	 }
 }