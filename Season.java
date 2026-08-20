class Season {

    int season;
    Team teams[];

    public void getSeasonInfo() {

        System.out.println("The season is " + season);

        System.out.println("name    m    w    l    nrr       pts    last5");

        for (Team team : teams) {
            team.getTeamInfo();
        }
    }
}