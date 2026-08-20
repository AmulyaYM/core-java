class IplRunner {

    public static void main(String amulya[]) {

        Ipl ipl = new Ipl();

        Table table = new Table();

        Season season = new Season();

        season.season = 2026;


        Team rcb = new Team();

        rcb.name = "RCB";
        rcb.noOfMatches = 8;
        rcb.won = 6;
        rcb.lost = 2;
        rcb.nrr = "+1.245";
        rcb.pts = 12;

        int rcbLast5[] = {1, 1, 0, 0, 1};

        rcb.last5 = rcbLast5;


        Team mi = new Team();

        mi.name = "MI";
        mi.noOfMatches = 8;
        mi.won = 5;
        mi.lost = 3;
        mi.nrr = "+0.850";
        mi.pts = 10;

        int miLast5[] = {1, 0, 1, 1, 0};

        mi.last5 = miLast5;


        Team dc = new Team();

        dc.name = "DC";
        dc.noOfMatches = 8;
        dc.won = 4;
        dc.lost = 4;
        dc.nrr = "+0.450";
        dc.pts = 8;

        int dcLast5[] = {0, 1, 1, 0, 1};

        dc.last5 = dcLast5;


        Team gg = new Team();

        gg.name = "GG";
        gg.noOfMatches = 8;
        gg.won = 3;
        gg.lost = 5;
        gg.nrr = "-0.350";
        gg.pts = 6;

        int ggLast5[] = {0, 0, 1, 1, 0};

        gg.last5 = ggLast5;

        Team upw = new Team();

        upw.name = "UPW";
        upw.noOfMatches = 8;
        upw.won = 2;
        upw.lost = 6;
        upw.nrr = "-0.950";
        upw.pts = 4;

        int upwLast5[] = {0, 1, 0, 0, 0};

        upw.last5 = upwLast5;


        Team teams[] = {rcb, mi, dc, gg, upw};

        season.teams = teams;

        table.season = season;

        ipl.table = table;


        ipl.getIplInfo();
    }
}