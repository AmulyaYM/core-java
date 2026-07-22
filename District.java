class District{

public static void run(){
System.out.println("district running started");

taxing();

System.out.println("district running ended");
}

public static void taxing(){
System.out.println("tax started");

measure();

System.out.println("tax ended");
}

public static void measure(){
System.out.println("measure started");

collect();

System.out.println("measure ended");
}

public static void collect(){
System.out.println("collection started");

revenue();

System.out.println("collection ended");
}

public static void revenue(){
System.out.println("revenue started");

budget();

System.out.println("revenue ended");
}

public static void budget(){
System.out.println("budget started");

System.out.println("budget ended");
}
}

