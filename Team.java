class Team {

    String name;
    int noOfMatches;
    int won;
    int lost;
    String nrr;
    int pts;
    int last5[];

    public void getTeamInfo() {


        System.out.print(name + "     " +noOfMatches + "    " +won + "    " +lost + "    " +nrr + "    " +pts + "     ");

        for (int value : last5) {
            System.out.print(value + " ");
        }

        System.out.println();
    }
}