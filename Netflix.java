class Netflix{

	public static String[] stream(String category){
	
	if(category=="horror"){
		String horrorMovies[]={"Scarecrow","Sumala","Janji Darah ","You’re Killing Me","Jurnal Risa by Risa Saraswati","The Deliverance ","Re/Member"};
		return horrorMovies;
	}else if(category=="romcom"){
	String romcomSeries[]={"Another Self","Voicemails for Isabelle","To All the Boys I've Loved Before","Set It Up","My Oxford Year","Holidate","The Princess Switch"};
	return romcomSeries;
	}else if(category=="action"){
		String actionMovies[]= {"Heroic Bloodshed","Military Action","Espionage","Wuxia Action","Disaster","Adventure","Superhero"};
		return actionMovies;
	}else if (category=="animation"){
		String animationMovies[] ={"Robin Hood ","The Flight of Dragons","The Nightmare Before Christmas","The fantastic Mr Fox","Early man","Chicken run"};
		return animationMovies;
	}else if(category=="comedy"){
		String comedyMovies[]={"Hot Fuzz "," Charlie’s Angels ","Very Bad Things "," Fargo"," Sleepless in Seattle"," How to Lose a Guy in 10 Days"," Rush Hour"};
		return comedyMovies;
	}else if(category=="crime"){
		String crimeMovies[]={"A Fish Called Wanda ","Ocean’s Eleven ","Heat","The score","Boys in the hood","End of the watch","A time to kill"};
		return crimeMovies;
	}else if(category=="drama"){
		String dramaMovies[]={"Beaches","The fault in our stars"," The Razor’s Edge"," I Heart Huckabees ","House","Bringing out the dead","The firm","The practice"};
		return dramaMovies;
	}else 
		System.out.println(category+ "not found");
	return null;
	}
}