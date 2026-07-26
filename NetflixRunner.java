class NetflixRunner{

	public static void main(String[] netflix){
	String[] series = Netflix.stream("comedy");
	System.out.println("The list of comedy are:");
	for(String comedyMovies:series){
	System.out.println(comedyMovies);
	}
	}
}