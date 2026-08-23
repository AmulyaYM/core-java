class IplRunner {

    public static void main(String amulya[]) {

        Ipl ipl = new Ipl();
        Table table = new Table();


        Season season2026 = new Season();
        season2026.season = 2026;

        Team rr2026 = new Team();
        rr2026.name = "RR";
        rr2026.noOfMatches = 3;
        rr2026.won = 3;
        rr2026.lost = 0;
        rr2026.nrr = "+2.403";
        rr2026.pts = 6;
        int rr2026Last5[] = {0, 1, 1, 1, 1};
        rr2026.last5 = rr2026Last5;

        Team pbks2026 = new Team();
        pbks2026.name = "PBKS";
        pbks2026.noOfMatches = 3;
        pbks2026.won = 2;
        pbks2026.lost = 0;
        pbks2026.nrr = "+0.637";
        pbks2026.pts = 5;
        int pbks2026Last5[] = {1, 1, 0, 1, 0};
        pbks2026.last5 = pbks2026Last5;

        Team rcb2026 = new Team();
        rcb2026.name = "RCB";
        rcb2026.noOfMatches = 2;
        rcb2026.won = 2;
        rcb2026.lost = 0;
        rcb2026.nrr = "+2.501";
        rcb2026.pts = 4;
        int rcb2026Last5[] = {1, 0, 1, 1, 0};
        rcb2026.last5 = rcb2026Last5;

        Team dc2026 = new Team();
        dc2026.name = "DC";
        dc2026.noOfMatches = 3;
        dc2026.won = 2;
        dc2026.lost = 1;
        dc2026.nrr = "+0.811";
        dc2026.pts = 4;
        int dc2026Last5[] = {1, 0, 0, 1, 1};
        dc2026.last5 = dc2026Last5;

        Team srh2026 = new Team();
        srh2026.name = "SRH";
        srh2026.noOfMatches = 3;
        srh2026.won = 1;
        srh2026.lost = 2;
        srh2026.nrr = "+0.275";
        srh2026.pts = 2;
        int srh2026Last5[] = {0, 1, 0, 0, 1};
        srh2026.last5 = srh2026Last5;

        Team gt2026 = new Team();
        gt2026.name = "GT";
        gt2026.noOfMatches = 3;
        gt2026.won = 1;
        gt2026.lost = 2;
        gt2026.nrr = "-0.270";
        gt2026.pts = 2;
        int gt2026Last5[] = {0, 1, 1, 0, 1};
        gt2026.last5 = gt2026Last5;

        Team lsg2026 = new Team();
        lsg2026.name = "LSG";
        lsg2026.noOfMatches = 2;
        lsg2026.won = 1;
        lsg2026.lost = 1;
        lsg2026.nrr = "-0.542";
        lsg2026.pts = 2;
        int lsg2026Last5[] = {1, 1, 0, 0, 0};
        lsg2026.last5 = lsg2026Last5;

        Team mi2026 = new Team();
        mi2026.name = "MI";
        mi2026.noOfMatches = 3;
        mi2026.won = 1;
        mi2026.lost = 2;
        mi2026.nrr = "-0.715";
        mi2026.pts = 2;
        int mi2026Last5[] = {0, 0, 1, 0, 1};
        mi2026.last5 = mi2026Last5;

        Team kkr2026 = new Team();
        kkr2026.name = "KKR";
        kkr2026.noOfMatches = 3;
        kkr2026.won = 0;
        kkr2026.lost = 2;
        kkr2026.nrr = "-1.964";
        kkr2026.pts = 1;
        int kkr2026Last5[] = {0, 0, 0, 0, 1};
        kkr2026.last5 = kkr2026Last5;

        Team csk2026 = new Team();
        csk2026.name = "CSK";
        csk2026.noOfMatches = 3;
        csk2026.won = 0;
        csk2026.lost = 3;
        csk2026.nrr = "-2.517";
        csk2026.pts = 0;
        int csk2026Last5[] = {1, 1, 0, 0, 0};
        csk2026.last5 = csk2026Last5;

        Team teams2026[] = {rr2026, pbks2026, rcb2026, dc2026, srh2026, gt2026, lsg2026, mi2026, kkr2026, csk2026};
        season2026.teams = teams2026;

        // ==================== IPL 2025 ====================

        Season season2025 = new Season();
        season2025.season = 2025;

        Team pbks2025 = new Team();
        pbks2025.name = "PBKS";
        pbks2025.noOfMatches = 14;
        pbks2025.won = 9;
        pbks2025.lost = 4;
        pbks2025.nrr = "+0.372";
        pbks2025.pts = 19;
        int pbks2025Last5[] = {1, 0, 1, 0, 1};
        pbks2025.last5 = pbks2025Last5;

        Team rcb2025 = new Team();
        rcb2025.name = "RCB";
        rcb2025.noOfMatches = 14;
        rcb2025.won = 9;
        rcb2025.lost = 4;
        rcb2025.nrr = "+0.301";
        rcb2025.pts = 19;
        int rcb2025Last5[] = {1, 1, 0, 1, 0};
        rcb2025.last5 = rcb2025Last5;

        Team gt2025 = new Team();
        gt2025.name = "GT";
        gt2025.noOfMatches = 14;
        gt2025.won = 9;
        gt2025.lost = 5;
        gt2025.nrr = "+0.254";
        gt2025.pts = 18;
        int gt2025Last5[] = {1, 0, 1, 1, 0};
        gt2025.last5 = gt2025Last5;

        Team mi2025 = new Team();
        mi2025.name = "MI";
        mi2025.noOfMatches = 14;
        mi2025.won = 8;
        mi2025.lost = 6;
        mi2025.nrr = "+1.142";
        mi2025.pts = 16;
        int mi2025Last5[] = {1, 0, 1, 1, 0};
        mi2025.last5 = mi2025Last5;

        Team dc2025 = new Team();
        dc2025.name = "DC";
        dc2025.noOfMatches = 14;
        dc2025.won = 7;
        dc2025.lost = 6;
        dc2025.nrr = "+0.011";
        dc2025.pts = 15;
        int dc2025Last5[] = {1, 0, 0, 1, 0};
        dc2025.last5 = dc2025Last5;

        Team srh2025 = new Team();
        srh2025.name = "SRH";
        srh2025.noOfMatches = 14;
        srh2025.won = 6;
        srh2025.lost = 7;
        srh2025.nrr = "-0.241";
        srh2025.pts = 13;
        int srh2025Last5[] = {0, 1, 0, 0, 1};
        srh2025.last5 = srh2025Last5;

        Team lsg2025 = new Team();
        lsg2025.name = "LSG";
        lsg2025.noOfMatches = 14;
        lsg2025.won = 6;
        lsg2025.lost = 8;
        lsg2025.nrr = "-0.376";
        lsg2025.pts = 12;
        int lsg2025Last5[] = {0, 1, 0, 1, 0};
        lsg2025.last5 = lsg2025Last5;

        Team kkr2025 = new Team();
        kkr2025.name = "KKR";
        kkr2025.noOfMatches = 14;
        kkr2025.won = 5;
        kkr2025.lost = 7;
        kkr2025.nrr = "-0.305";
        kkr2025.pts = 12;
        int kkr2025Last5[] = {0, 1, 0, 0, 1};
        kkr2025.last5 = kkr2025Last5;

        Team rr2025 = new Team();
        rr2025.name = "RR";
        rr2025.noOfMatches = 14;
        rr2025.won = 4;
        rr2025.lost = 10;
        rr2025.nrr = "-0.549";
        rr2025.pts = 8;
        int rr2025Last5[] = {0, 0, 0, 1, 0};
        rr2025.last5 = rr2025Last5;

        Team csk2025 = new Team();
        csk2025.name = "CSK";
        csk2025.noOfMatches = 14;
        csk2025.won = 4;
        csk2025.lost = 10;
        csk2025.nrr = "-0.647";
        csk2025.pts = 8;
        int csk2025Last5[] = {1, 0, 0, 0, 0};
        csk2025.last5 = csk2025Last5;

        Team teams2025[] = {pbks2025, rcb2025, gt2025, mi2025, dc2025, srh2025, lsg2025, kkr2025, rr2025, csk2025};
        season2025.teams = teams2025;

        // ==================== IPL 2024 ====================

        Season season2024 = new Season();
        season2024.season = 2024;

        Team kkr2024 = new Team();
        kkr2024.name = "KKR";
        kkr2024.noOfMatches = 14;
        kkr2024.won = 9;
        kkr2024.lost = 3;
        kkr2024.nrr = "+1.428";
        kkr2024.pts = 20;
        int kkr2024Last5[] = {1, 0, 1, 0, 1};
        kkr2024.last5 = kkr2024Last5;

        Team srh2024 = new Team();
        srh2024.name = "SRH";
        srh2024.noOfMatches = 14;
        srh2024.won = 8;
        srh2024.lost = 5;
        srh2024.nrr = "+0.414";
        srh2024.pts = 17;
        int srh2024Last5[] = {1, 0, 1, 0, 1};
        srh2024.last5 = srh2024Last5;

        Team rr2024 = new Team();
        rr2024.name = "RR";
        rr2024.noOfMatches = 14;
        rr2024.won = 8;
        rr2024.lost = 5;
        rr2024.nrr = "+0.273";
        rr2024.pts = 17;
        int rr2024Last5[] = {1, 0, 1, 0, 1};
        rr2024.last5 = rr2024Last5;

        Team rcb2024 = new Team();
        rcb2024.name = "RCB";
        rcb2024.noOfMatches = 14;
        rcb2024.won = 7;
        rcb2024.lost = 7;
        rcb2024.nrr = "+0.459";
        rcb2024.pts = 14;
        int rcb2024Last5[] = {0, 0, 1, 0, 1};
        rcb2024.last5 = rcb2024Last5;

        Team csk2024 = new Team();
        csk2024.name = "CSK";
        csk2024.noOfMatches = 14;
        csk2024.won = 7;
        csk2024.lost = 7;
        csk2024.nrr = "+0.392";
        csk2024.pts = 14;
        int csk2024Last5[] = {0, 0, 1, 0, 1};
        csk2024.last5 = csk2024Last5;

        Team dc2024 = new Team();
        dc2024.name = "DC";
        dc2024.noOfMatches = 14;
        dc2024.won = 7;
        dc2024.lost = 7;
        dc2024.nrr = "-0.377";
        dc2024.pts = 14;
        int dc2024Last5[] = {0, 1, 0, 0, 1};
        dc2024.last5 = dc2024Last5;

        Team lsg2024 = new Team();
        lsg2024.name = "LSG";
        lsg2024.noOfMatches = 14;
        lsg2024.won = 7;
        lsg2024.lost = 7;
        lsg2024.nrr = "-0.667";
        lsg2024.pts = 14;
        int lsg2024Last5[] = {0, 0, 1, 0, 1};
        lsg2024.last5 = lsg2024Last5;

        Team gt2024 = new Team();
        gt2024.name = "GT";
        gt2024.noOfMatches = 14;
        gt2024.won = 5;
        gt2024.lost = 7;
        gt2024.nrr = "-1.063";
        gt2024.pts = 12;
        int gt2024Last5[] = {0, 1, 0, 0, 1};
        gt2024.last5 = gt2024Last5;

        Team pbks2024 = new Team();
        pbks2024.name = "PBKS";
        pbks2024.noOfMatches = 14;
        pbks2024.won = 5;
        pbks2024.lost = 9;
        pbks2024.nrr = "-0.353";
        pbks2024.pts = 10;
        int pbks2024Last5[] = {0, 1, 0, 1, 0};
        pbks2024.last5 = pbks2024Last5;

        Team mi2024 = new Team();
        mi2024.name = "MI";
        mi2024.noOfMatches = 14;
        mi2024.won = 4;
        mi2024.lost = 10;
        mi2024.nrr = "-0.318";
        mi2024.pts = 8;
        int mi2024Last5[] = {0, 0, 0, 1, 0};
        mi2024.last5 = mi2024Last5;

        Team teams2024[] = {kkr2024, srh2024, rr2024, rcb2024, csk2024, dc2024, lsg2024, gt2024, pbks2024, mi2024};
        season2024.teams = teams2024;

        // ==================== IPL 2023 ====================

        Season season2023 = new Season();
        season2023.season = 2023;

        Team gt2023 = new Team();
        gt2023.name = "GT";
        gt2023.noOfMatches = 14;
        gt2023.won = 10;
        gt2023.lost = 4;
        gt2023.nrr = "+0.809";
        gt2023.pts = 20;
        int gt2023Last5[] = {1, 1, 1, 1, 0};
        gt2023.last5 = gt2023Last5;

        Team csk2023 = new Team();
        csk2023.name = "CSK";
        csk2023.noOfMatches = 14;
        csk2023.won = 8;
        csk2023.lost = 5;
        csk2023.nrr = "+0.652";
        csk2023.pts = 17;
        int csk2023Last5[] = {1, 0, 1, 1, 0};
        csk2023.last5 = csk2023Last5;

        Team lsg2023 = new Team();
        lsg2023.name = "LSG";
        lsg2023.noOfMatches = 14;
        lsg2023.won = 8;
        lsg2023.lost = 5;
        lsg2023.nrr = "+0.284";
        lsg2023.pts = 17;
        int lsg2023Last5[] = {1, 0, 1, 1, 0};
        lsg2023.last5 = lsg2023Last5;

        Team mi2023 = new Team();
        mi2023.name = "MI";
        mi2023.noOfMatches = 14;
        mi2023.won = 8;
        mi2023.lost = 6;
        mi2023.nrr = "-0.044";
        mi2023.pts = 16;
        int mi2023Last5[] = {1, 0, 1, 0, 1};
        mi2023.last5 = mi2023Last5;

        Team rr2023 = new Team();
        rr2023.name = "RR";
        rr2023.noOfMatches = 14;
        rr2023.won = 7;
        rr2023.lost = 7;
        rr2023.nrr = "+0.148";
        rr2023.pts = 14;
        int rr2023Last5[] = {0, 1, 0, 1, 0};
        rr2023.last5 = rr2023Last5;

        Team rcb2023 = new Team();
        rcb2023.name = "RCB";
        rcb2023.noOfMatches = 14;
        rcb2023.won = 7;
        rcb2023.lost = 7;
        rcb2023.nrr = "+0.135";
        rcb2023.pts = 14;
        int rcb2023Last5[] = {1, 0, 0, 1, 0};
        rcb2023.last5 = rcb2023Last5;

        Team kkr2023 = new Team();
        kkr2023.name = "KKR";
        kkr2023.noOfMatches = 14;
        kkr2023.won = 6;
        kkr2023.lost = 8;
        kkr2023.nrr = "-0.239";
        kkr2023.pts = 12;
        int kkr2023Last5[] = {0, 1, 0, 1, 0};
        kkr2023.last5 = kkr2023Last5;

        Team pbks2023 = new Team();
        pbks2023.name = "PBKS";
        pbks2023.noOfMatches = 14;
        pbks2023.won = 6;
        pbks2023.lost = 8;
        pbks2023.nrr = "-0.304";
        pbks2023.pts = 12;
        int pbks2023Last5[] = {0, 0, 1, 0, 1};
        pbks2023.last5 = pbks2023Last5;

        Team dc2023 = new Team();
        dc2023.name = "DC";
        dc2023.noOfMatches = 14;
        dc2023.won = 5;
        dc2023.lost = 9;
        dc2023.nrr = "-0.808";
        dc2023.pts = 10;
        int dc2023Last5[] = {1, 0, 1, 0, 0};
        dc2023.last5 = dc2023Last5;

        Team srh2023 = new Team();
        srh2023.name = "SRH";
        srh2023.noOfMatches = 14;
        srh2023.won = 4;
        srh2023.lost = 10;
        srh2023.nrr = "-0.590";
        srh2023.pts = 8;
        int srh2023Last5[] = {1, 0, 0, 0, 0};
        srh2023.last5 = srh2023Last5;

        Team teams2023[] = {gt2023, csk2023, lsg2023, mi2023, rr2023, rcb2023, kkr2023, pbks2023, dc2023, srh2023};
        season2023.teams = teams2023;

        // ==================== IPL 2022 ====================

        Season season2022 = new Season();
        season2022.season = 2022;

        Team gt2022 = new Team();
        gt2022.name = "GT";
        gt2022.noOfMatches = 14;
        gt2022.won = 10;
        gt2022.lost = 4;
        gt2022.nrr = "+0.316";
        gt2022.pts = 20;
        int gt2022Last5[] = {0, 1, 1, 1, 1};
        gt2022.last5 = gt2022Last5;

        Team rr2022 = new Team();
        rr2022.name = "RR";
        rr2022.noOfMatches = 14;
        rr2022.won = 9;
        rr2022.lost = 5;
        rr2022.nrr = "+0.298";
        rr2022.pts = 18;
        int rr2022Last5[] = {0, 1, 1, 0, 1};
        rr2022.last5 = rr2022Last5;

        Team lsg2022 = new Team();
        lsg2022.name = "LSG";
        lsg2022.noOfMatches = 14;
        lsg2022.won = 9;
        lsg2022.lost = 5;
        lsg2022.nrr = "+0.251";
        lsg2022.pts = 18;
        int lsg2022Last5[] = {0, 1, 0, 1, 1};
        lsg2022.last5 = lsg2022Last5;

        Team rcb2022 = new Team();
        rcb2022.name = "RCB";
        rcb2022.noOfMatches = 14;
        rcb2022.won = 8;
        rcb2022.lost = 6;
        rcb2022.nrr = "-0.253";
        rcb2022.pts = 16;
        int rcb2022Last5[] = {0, 1, 0, 1, 1};
        rcb2022.last5 = rcb2022Last5;

        Team dc2022 = new Team();
        dc2022.name = "DC";
        dc2022.noOfMatches = 14;
        dc2022.won = 7;
        dc2022.lost = 7;
        dc2022.nrr = "+0.204";
        dc2022.pts = 14;
        int dc2022Last5[] = {0, 1, 0, 1, 0};
        dc2022.last5 = dc2022Last5;

        Team pbks2022 = new Team();
        pbks2022.name = "PBKS";
        pbks2022.noOfMatches = 14;
        pbks2022.won = 7;
        pbks2022.lost = 7;
        pbks2022.nrr = "+0.126";
        pbks2022.pts = 14;
        int pbks2022Last5[] = {1, 0, 0, 1, 0};
        pbks2022.last5 = pbks2022Last5;

        Team kkr2022 = new Team();
        kkr2022.name = "KKR";
        kkr2022.noOfMatches = 14;
        kkr2022.won = 6;
        kkr2022.lost = 8;
        kkr2022.nrr = "+0.146";
        kkr2022.pts = 12;
        int kkr2022Last5[] = {0, 0, 1, 0, 1};
        kkr2022.last5 = kkr2022Last5;

        Team srh2022 = new Team();
        srh2022.name = "SRH";
        srh2022.noOfMatches = 14;
        srh2022.won = 6;
        srh2022.lost = 8;
        srh2022.nrr = "-0.379";
        srh2022.pts = 12;
        int srh2022Last5[] = {0, 0, 1, 0, 1};
        srh2022.last5 = srh2022Last5;

        Team csk2022 = new Team();
        csk2022.name = "CSK";
        csk2022.noOfMatches = 14;
        csk2022.won = 4;
        csk2022.lost = 10;
        csk2022.nrr = "-0.203";
        csk2022.pts = 8;
        int csk2022Last5[] = {0, 0, 0, 1, 0};
        csk2022.last5 = csk2022Last5;

        Team mi2022 = new Team();
        mi2022.name = "MI";
        mi2022.noOfMatches = 14;
        mi2022.won = 4;
        mi2022.lost = 10;
        mi2022.nrr = "-0.506";
        mi2022.pts = 8;
        int mi2022Last5[] = {1, 0, 0, 0, 0};
        mi2022.last5 = mi2022Last5;

        Team teams2022[] = {gt2022, rr2022, lsg2022, rcb2022, dc2022, pbks2022, kkr2022, srh2022, csk2022, mi2022};
        season2022.teams = teams2022;

        // ==================== IPL 2021 ====================

        Season season2021 = new Season();
        season2021.season = 2021;

        Team dc2021 = new Team();
        dc2021.name = "DC";
        dc2021.noOfMatches = 14;
        dc2021.won = 10;
        dc2021.lost = 4;
        dc2021.nrr = "+0.481";
        dc2021.pts = 20;
        int dc2021Last5[] = {1, 0, 1, 1, 1};
        dc2021.last5 = dc2021Last5;

        Team csk2021 = new Team();
        csk2021.name = "CSK";
        csk2021.noOfMatches = 14;
        csk2021.won = 9;
        csk2021.lost = 5;
        csk2021.nrr = "+0.455";
        csk2021.pts = 18;
        int csk2021Last5[] = {1, 0, 1, 0, 1};
        csk2021.last5 = csk2021Last5;

        Team rcb2021 = new Team();
        rcb2021.name = "RCB";
        rcb2021.noOfMatches = 14;
        rcb2021.won = 9;
        rcb2021.lost = 5;
        rcb2021.nrr = "-0.140";
        rcb2021.pts = 18;
        int rcb2021Last5[] = {1, 0, 1, 0, 1};
        rcb2021.last5 = rcb2021Last5;

        Team kkr2021 = new Team();
        kkr2021.name = "KKR";
        kkr2021.noOfMatches = 14;
        kkr2021.won = 7;
        kkr2021.lost = 7;
        kkr2021.nrr = "+0.587";
        kkr2021.pts = 14;
        int kkr2021Last5[] = {1, 0, 0, 1, 0};
        kkr2021.last5 = kkr2021Last5;

        Team mi2021 = new Team();
        mi2021.name = "MI";
        mi2021.noOfMatches = 14;
        mi2021.won = 7;
        mi2021.lost = 7;
        mi2021.nrr = "+0.116";
        mi2021.pts = 14;
        int mi2021Last5[] = {0, 0, 1, 0, 1};
        mi2021.last5 = mi2021Last5;

        Team pbks2021 = new Team();
        pbks2021.name = "PBKS";
        pbks2021.noOfMatches = 14;
        pbks2021.won = 6;
        pbks2021.lost = 8;
        pbks2021.nrr = "-0.001";
        pbks2021.pts = 12;
        int pbks2021Last5[] = {0, 1, 0, 0, 1};
        pbks2021.last5 = pbks2021Last5;

        Team rr2021 = new Team();
        rr2021.name = "RR";
        rr2021.noOfMatches = 14;
        rr2021.won = 5;
        rr2021.lost = 9;
        rr2021.nrr = "-0.993";
        rr2021.pts = 10;
        int rr2021Last5[] = {1, 0, 0, 1, 0};
        rr2021.last5 = rr2021Last5;

        Team srh2021 = new Team();
        srh2021.name = "SRH";
        srh2021.noOfMatches = 14;
        srh2021.won = 3;
        srh2021.lost = 11;
        srh2021.nrr = "-0.545";
        srh2021.pts = 6;
        int srh2021Last5[] = {0, 0, 1, 0, 0};
        srh2021.last5 = srh2021Last5;

        Team teams2021[] = {dc2021, csk2021, rcb2021, kkr2021, mi2021, pbks2021, rr2021, srh2021};
        season2021.teams = teams2021;

        // ==================== IPL 2020 ====================

        Season season2020 = new Season();
        season2020.season = 2020;

        Team mi2020 = new Team();
        mi2020.name = "MI";
        mi2020.noOfMatches = 14;
        mi2020.won = 9;
        mi2020.lost = 5;
        mi2020.nrr = "+1.107";
        mi2020.pts = 18;
        int mi2020Last5[] = {1, 0, 1, 1, 0};
        mi2020.last5 = mi2020Last5;

        Team dc2020 = new Team();
        dc2020.name = "DC";
        dc2020.noOfMatches = 14;
        dc2020.won = 8;
        dc2020.lost = 6;
        dc2020.nrr = "-0.109";
        dc2020.pts = 16;
        int dc2020Last5[] = {1, 0, 1, 1, 0};
        dc2020.last5 = dc2020Last5;

        Team srh2020 = new Team();
        srh2020.name = "SRH";
        srh2020.noOfMatches = 14;
        srh2020.won = 7;
        srh2020.lost = 7;
        srh2020.nrr = "+0.608";
        srh2020.pts = 14;
        int srh2020Last5[] = {0, 1, 0, 0, 1};
        srh2020.last5 = srh2020Last5;

        Team rcb2020 = new Team();
        rcb2020.name = "RCB";
        rcb2020.noOfMatches = 14;
        rcb2020.won = 7;
        rcb2020.lost = 7;
        rcb2020.nrr = "-0.172";
        rcb2020.pts = 14;
        int rcb2020Last5[] = {0, 1, 0, 1, 0};
        rcb2020.last5 = rcb2020Last5;

        Team kkr2020 = new Team();
        kkr2020.name = "KKR";
        kkr2020.noOfMatches = 14;
        kkr2020.won = 7;
        kkr2020.lost = 7;
        kkr2020.nrr = "-0.214";
        kkr2020.pts = 14;
        int kkr2020Last5[] = {0, 1, 0, 0, 1};
        kkr2020.last5 = kkr2020Last5;

        Team kxip2020 = new Team();
        kxip2020.name = "KXIP";
        kxip2020.noOfMatches = 14;
        kxip2020.won = 6;
        kxip2020.lost = 8;
        kxip2020.nrr = "-0.162";
        kxip2020.pts = 12;
        int kxip2020Last5[] = {1, 0, 0, 1, 0};
        kxip2020.last5 = kxip2020Last5;

        Team csk2020 = new Team();
        csk2020.name = "CSK";
        csk2020.noOfMatches = 14;
        csk2020.won = 6;
        csk2020.lost = 8;
        csk2020.nrr = "-0.455";
        csk2020.pts = 12;
        int csk2020Last5[] = {0, 1, 0, 1, 0};
        csk2020.last5 = csk2020Last5;

        Team rr2020 = new Team();
        rr2020.name = "RR";
        rr2020.noOfMatches = 14;
        rr2020.won = 6;
        rr2020.lost = 8;
        rr2020.nrr = "-0.569";
        rr2020.pts = 12;
        int rr2020Last5[] = {0, 1, 0, 0, 1};
        rr2020.last5 = rr2020Last5;

        Team teams2020[] = {mi2020, dc2020, srh2020, rcb2020, kkr2020, kxip2020, csk2020, rr2020};
        season2020.teams = teams2020;

        // ==================== IPL 2019 ====================

        Season season2019 = new Season();
        season2019.season = 2019;

        Team mi2019 = new Team();
        mi2019.name = "MI";
        mi2019.noOfMatches = 14;
        mi2019.won = 9;
        mi2019.lost = 5;
        mi2019.nrr = "+0.421";
        mi2019.pts = 18;
        int mi2019Last5[] = {1, 0, 1, 0, 1};
        mi2019.last5 = mi2019Last5;

        Team csk2019 = new Team();
        csk2019.name = "CSK";
        csk2019.noOfMatches = 14;
        csk2019.won = 9;
        csk2019.lost = 5;
        csk2019.nrr = "+0.131";
        csk2019.pts = 18;
        int csk2019Last5[] = {1, 0, 1, 1, 0};
        csk2019.last5 = csk2019Last5;

        Team dc2019 = new Team();
        dc2019.name = "DC";
        dc2019.noOfMatches = 14;
        dc2019.won = 9;
        dc2019.lost = 5;
        dc2019.nrr = "+0.044";
        dc2019.pts = 18;
        int dc2019Last5[] = {1, 0, 1, 0, 1};
        dc2019.last5 = dc2019Last5;

        Team srh2019 = new Team();
        srh2019.name = "SRH";
        srh2019.noOfMatches = 14;
        srh2019.won = 6;
        srh2019.lost = 8;
        srh2019.nrr = "+0.577";
        srh2019.pts = 12;
        int srh2019Last5[] = {0, 1, 0, 1, 0};
        srh2019.last5 = srh2019Last5;

        Team kkr2019 = new Team();
        kkr2019.name = "KKR";
        kkr2019.noOfMatches = 14;
        kkr2019.won = 6;
        kkr2019.lost = 8;
        kkr2019.nrr = "+0.028";
        kkr2019.pts = 12;
        int kkr2019Last5[] = {0, 1, 0, 1, 0};
        kkr2019.last5 = kkr2019Last5;

        Team kxip2019 = new Team();
        kxip2019.name = "KXIP";
        kxip2019.noOfMatches = 14;
        kxip2019.won = 6;
        kxip2019.lost = 8;
        kxip2019.nrr = "-0.251";
        kxip2019.pts = 12;
        int kxip2019Last5[] = {1, 0, 1, 0, 0};
        kxip2019.last5 = kxip2019Last5;

        Team rr2019 = new Team();
        rr2019.name = "RR";
        rr2019.noOfMatches = 14;
        rr2019.won = 5;
        rr2019.lost = 8;
        rr2019.nrr = "-0.449";
        rr2019.pts = 11;
        int rr2019Last5[] = {0, 1, 0, 1, 0};
        rr2019.last5 = rr2019Last5;

        Team rcb2019 = new Team();
        rcb2019.name = "RCB";
        rcb2019.noOfMatches = 14;
        rcb2019.won = 5;
        rcb2019.lost = 8;
        rcb2019.nrr = "-0.607";
        rcb2019.pts = 11;
        int rcb2019Last5[] = {1, 0, 0, 1, 0};
        rcb2019.last5 = rcb2019Last5;

        Team teams2019[] = {mi2019, csk2019, dc2019, srh2019, kkr2019, kxip2019, rr2019, rcb2019};
        season2019.teams = teams2019;

        // ==================== IPL 2018 ====================

        Season season2018 = new Season();
        season2018.season = 2018;

        Team srh2018 = new Team();
        srh2018.name = "SRH";
        srh2018.noOfMatches = 14;
        srh2018.won = 9;
        srh2018.lost = 5;
        srh2018.nrr = "+0.284";
        srh2018.pts = 18;
        int srh2018Last5[] = {0, 1, 1, 0, 1};
        srh2018.last5 = srh2018Last5;

        Team csk2018 = new Team();
        csk2018.name = "CSK";
        csk2018.noOfMatches = 14;
        csk2018.won = 9;
        csk2018.lost = 5;
        csk2018.nrr = "+0.253";
        csk2018.pts = 18;
        int csk2018Last5[] = {0, 1, 0, 1, 1};
        csk2018.last5 = csk2018Last5;

        Team kkr2018 = new Team();
        kkr2018.name = "KKR";
        kkr2018.noOfMatches = 14;
        kkr2018.won = 8;
        kkr2018.lost = 6;
        kkr2018.nrr = "-0.070";
        kkr2018.pts = 16;
        int kkr2018Last5[] = {0, 1, 1, 0, 1};
        kkr2018.last5 = kkr2018Last5;

        Team rr2018 = new Team();
        rr2018.name = "RR";
        rr2018.noOfMatches = 14;
        rr2018.won = 7;
        rr2018.lost = 7;
        rr2018.nrr = "-0.250";
        rr2018.pts = 14;
        int rr2018Last5[] = {0, 0, 1, 0, 1};
        rr2018.last5 = rr2018Last5;

        Team mi2018 = new Team();
        mi2018.name = "MI";
        mi2018.noOfMatches = 14;
        mi2018.won = 6;
        mi2018.lost = 8;
        mi2018.nrr = "+0.317";
        mi2018.pts = 12;
        int mi2018Last5[] = {0, 1, 0, 1, 0};
        mi2018.last5 = mi2018Last5;

        Team rcb2018 = new Team();
        rcb2018.name = "RCB";
        rcb2018.noOfMatches = 14;
        rcb2018.won = 6;
        rcb2018.lost = 8;
        rcb2018.nrr = "+0.129";
        rcb2018.pts = 12;
        int rcb2018Last5[] = {0, 1, 0, 0, 1};
        rcb2018.last5 = rcb2018Last5;

        Team kxip2018 = new Team();
        kxip2018.name = "KXIP";
        kxip2018.noOfMatches = 14;
        kxip2018.won = 6;
        kxip2018.lost = 8;
        kxip2018.nrr = "-0.502";
        kxip2018.pts = 12;
        int kxip2018Last5[] = {0, 1, 0, 1, 0};
        kxip2018.last5 = kxip2018Last5;

        Team dd2018 = new Team();
        dd2018.name = "DD";
        dd2018.noOfMatches = 14;
        dd2018.won = 5;
        dd2018.lost = 9;
        dd2018.nrr = "-0.222";
        dd2018.pts = 10;
        int dd2018Last5[] = {1, 0, 1, 0, 0};
        dd2018.last5 = dd2018Last5;

        Team teams2018[] = {srh2018, csk2018, kkr2018, rr2018, mi2018, rcb2018, kxip2018, dd2018};
        season2018.teams = teams2018;

        // ==================== IPL 2017 ====================

        Season season2017 = new Season();
        season2017.season = 2017;

        Team mi2017 = new Team();
        mi2017.name = "MI";
        mi2017.noOfMatches = 14;
        mi2017.won = 10;
        mi2017.lost = 4;
        mi2017.nrr = "+0.784";
        mi2017.pts = 20;
        int mi2017Last5[] = {1, 0, 1, 1, 1};
        mi2017.last5 = mi2017Last5;

        Team rps2017 = new Team();
        rps2017.name = "RPS";
        rps2017.noOfMatches = 14;
        rps2017.won = 9;
        rps2017.lost = 5;
        rps2017.nrr = "+0.176";
        rps2017.pts = 18;
        int rps2017Last5[] = {1, 0, 1, 0, 1};
        rps2017.last5 = rps2017Last5;

        Team srh2017 = new Team();
        srh2017.name = "SRH";
        srh2017.noOfMatches = 14;
        srh2017.won = 8;
        srh2017.lost = 5;
        srh2017.nrr = "+0.599";
        srh2017.pts = 17;
        int srh2017Last5[] = {1, 0, 1, 1, 0};
        srh2017.last5 = srh2017Last5;

        Team kkr2017 = new Team();
        kkr2017.name = "KKR";
        kkr2017.noOfMatches = 14;
        kkr2017.won = 8;
        kkr2017.lost = 6;
        kkr2017.nrr = "+0.641";
        kkr2017.pts = 16;
        int kkr2017Last5[] = {1, 0, 1, 1, 0};
        kkr2017.last5 = kkr2017Last5;

        Team kxip2017 = new Team();
        kxip2017.name = "KXIP";
        kxip2017.noOfMatches = 14;
        kxip2017.won = 7;
        kxip2017.lost = 7;
        kxip2017.nrr = "-0.009";
        kxip2017.pts = 14;
        int kxip2017Last5[] = {0, 0, 1, 0, 1};
        kxip2017.last5 = kxip2017Last5;

        Team dd2017 = new Team();
        dd2017.name = "DD";
        dd2017.noOfMatches = 14;
        dd2017.won = 6;
        dd2017.lost = 8;
        dd2017.nrr = "-0.512";
        dd2017.pts = 12;
        int dd2017Last5[] = {0, 1, 0, 1, 0};
        dd2017.last5 = dd2017Last5;

        Team gl2017 = new Team();
        gl2017.name = "GL";
        gl2017.noOfMatches = 14;
        gl2017.won = 4;
        gl2017.lost = 10;
        gl2017.nrr = "-0.412";
        gl2017.pts = 8;
        int gl2017Last5[] = {0, 0, 0, 0, 1};
        gl2017.last5 = gl2017Last5;

        Team rcb2017 = new Team();
        rcb2017.name = "RCB";
        rcb2017.noOfMatches = 14;
        rcb2017.won = 3;
        rcb2017.lost = 10;
        rcb2017.nrr = "-1.299";
        rcb2017.pts = 7;
        int rcb2017Last5[] = {0, 0, 0, 0, 1};
        rcb2017.last5 = rcb2017Last5;

        Team teams2017[] = {mi2017, rps2017, srh2017, kkr2017, kxip2017, dd2017, gl2017, rcb2017};
        season2017.teams = teams2017;

        // ==================== IPL 2016 ====================

        Season season2016 = new Season();
        season2016.season = 2016;

        Team gl2016 = new Team();
        gl2016.name = "GL";
        gl2016.noOfMatches = 14;
        gl2016.won = 9;
        gl2016.lost = 5;
        gl2016.nrr = "-0.374";
        gl2016.pts = 18;
        int gl2016Last5[] = {1, 1, 0, 1, 0};
        gl2016.last5 = gl2016Last5;

        Team rcb2016 = new Team();
        rcb2016.name = "RCB";
        rcb2016.noOfMatches = 14;
        rcb2016.won = 8;
        rcb2016.lost = 6;
        rcb2016.nrr = "+0.932";
        rcb2016.pts = 16;
        int rcb2016Last5[] = {1, 1, 0, 1, 0};
        rcb2016.last5 = rcb2016Last5;

        Team srh2016 = new Team();
        srh2016.name = "SRH";
        srh2016.noOfMatches = 14;
        srh2016.won = 8;
        srh2016.lost = 6;
        srh2016.nrr = "+0.245";
        srh2016.pts = 16;
        int srh2016Last5[] = {0, 1, 0, 1, 1};
        srh2016.last5 = srh2016Last5;

        Team kkr2016 = new Team();
        kkr2016.name = "KKR";
        kkr2016.noOfMatches = 14;
        kkr2016.won = 8;
        kkr2016.lost = 6;
        kkr2016.nrr = "+0.106";
        kkr2016.pts = 16;
        int kkr2016Last5[] = {0, 1, 0, 1, 1};
        kkr2016.last5 = kkr2016Last5;

        Team mi2016 = new Team();
        mi2016.name = "MI";
        mi2016.noOfMatches = 14;
        mi2016.won = 7;
        mi2016.lost = 7;
        mi2016.nrr = "-0.146";
        mi2016.pts = 14;
        int mi2016Last5[] = {1, 0, 0, 1, 0};
        mi2016.last5 = mi2016Last5;

        Team dd2016 = new Team();
        dd2016.name = "DD";
        dd2016.noOfMatches = 14;
        dd2016.won = 7;
        dd2016.lost = 7;
        dd2016.nrr = "-0.155";
        dd2016.pts = 14;
        int dd2016Last5[] = {0, 0, 1, 0, 1};
        dd2016.last5 = dd2016Last5;

        Team rps2016 = new Team();
        rps2016.name = "RPS";
        rps2016.noOfMatches = 14;
        rps2016.won = 5;
        rps2016.lost = 9;
        rps2016.nrr = "+0.015";
        rps2016.pts = 10;
        int rps2016Last5[] = {0, 1, 0, 1, 0};
        rps2016.last5 = rps2016Last5;

        Team kxip2016 = new Team();
        kxip2016.name = "KXIP";
        kxip2016.noOfMatches = 14;
        kxip2016.won = 4;
        kxip2016.lost = 10;
        kxip2016.nrr = "-0.646";
        kxip2016.pts = 8;
        int kxip2016Last5[] = {0, 0, 1, 0, 0};
        kxip2016.last5 = kxip2016Last5;

        Team teams2016[] = {gl2016, rcb2016, srh2016, kkr2016, mi2016, dd2016, rps2016, kxip2016};
        season2016.teams = teams2016;

        // ==================== IPL 2015 ====================

        Season season2015 = new Season();
        season2015.season = 2015;

        Team csk2015 = new Team();
        csk2015.name = "CSK";
        csk2015.noOfMatches = 14;
        csk2015.won = 9;
        csk2015.lost = 5;
        csk2015.nrr = "+0.709";
        csk2015.pts = 18;
        int csk2015Last5[] = {0, 1, 1, 0, 1};
        csk2015.last5 = csk2015Last5;

        Team mi2015 = new Team();
        mi2015.name = "MI";
        mi2015.noOfMatches = 14;
        mi2015.won = 8;
        mi2015.lost = 6;
        mi2015.nrr = "-0.043";
        mi2015.pts = 16;
        int mi2015Last5[] = {0, 1, 0, 1, 1};
        mi2015.last5 = mi2015Last5;

        Team rcb2015 = new Team();
        rcb2015.name = "RCB";
        rcb2015.noOfMatches = 14;
        rcb2015.won = 7;
        rcb2015.lost = 5;
        rcb2015.nrr = "+1.037";
        rcb2015.pts = 16;
        int rcb2015Last5[] = {0, 0, 1, 0, 1};
        rcb2015.last5 = rcb2015Last5;

        Team rr2015 = new Team();
        rr2015.name = "RR";
        rr2015.noOfMatches = 14;
        rr2015.won = 7;
        rr2015.lost = 5;
        rr2015.nrr = "+0.062";
        rr2015.pts = 16;
        int rr2015Last5[] = {1, 0, 1, 0, 0};
        rr2015.last5 = rr2015Last5;

        Team kkr2015 = new Team();
        kkr2015.name = "KKR";
        kkr2015.noOfMatches = 14;
        kkr2015.won = 7;
        kkr2015.lost = 6;
        kkr2015.nrr = "+0.253";
        kkr2015.pts = 15;
        int kkr2015Last5[] = {1, 0, 1, 0, 0};
        kkr2015.last5 = kkr2015Last5;

        Team srh2015 = new Team();
        srh2015.name = "SRH";
        srh2015.noOfMatches = 14;
        srh2015.won = 7;
        srh2015.lost = 7;
        srh2015.nrr = "-0.239";
        srh2015.pts = 14;
        int srh2015Last5[] = {1, 0, 1, 0, 0};
        srh2015.last5 = srh2015Last5;

        Team dd2015 = new Team();
        dd2015.name = "DD";
        dd2015.noOfMatches = 14;
        dd2015.won = 5;
        dd2015.lost = 8;
        dd2015.nrr = "-0.049";
        dd2015.pts = 11;
        int dd2015Last5[] = {1, 0, 0, 1, 0};
        dd2015.last5 = dd2015Last5;

        Team kxip2015 = new Team();
        kxip2015.name = "KXIP";
        kxip2015.noOfMatches = 14;
        kxip2015.won = 3;
        kxip2015.lost = 11;
        kxip2015.nrr = "-1.436";
        kxip2015.pts = 6;
        int kxip2015Last5[] = {0, 0, 0, 1, 0};
        kxip2015.last5 = kxip2015Last5;

        Team teams2015[] = {csk2015, mi2015, rcb2015, rr2015, kkr2015, srh2015, dd2015, kxip2015};
        season2015.teams = teams2015;

        // ==================== IPL 2014 ====================

        Season season2014 = new Season();
        season2014.season = 2014;

        Team kxip2014 = new Team();
        kxip2014.name = "KXIP";
        kxip2014.noOfMatches = 14;
        kxip2014.won = 11;
        kxip2014.lost = 3;
        kxip2014.nrr = "+0.968";
        kxip2014.pts = 22;
        int kxip2014Last5[] = {1, 1, 1, 1, 0};
        kxip2014.last5 = kxip2014Last5;

        Team kkr2014 = new Team();
        kkr2014.name = "KKR";
        kkr2014.noOfMatches = 14;
        kkr2014.won = 9;
        kkr2014.lost = 5;
        kkr2014.nrr = "+0.418";
        kkr2014.pts = 18;
        int kkr2014Last5[] = {1, 1, 0, 1, 0};
        kkr2014.last5 = kkr2014Last5;

        Team csk2014 = new Team();
        csk2014.name = "CSK";
        csk2014.noOfMatches = 14;
        csk2014.won = 9;
        csk2014.lost = 5;
        csk2014.nrr = "+0.385";
        csk2014.pts = 18;
        int csk2014Last5[] = {1, 0, 1, 1, 0};
        csk2014.last5 = csk2014Last5;

        Team mi2014 = new Team();
        mi2014.name = "MI";
        mi2014.noOfMatches = 14;
        mi2014.won = 7;
        mi2014.lost = 7;
        mi2014.nrr = "+0.095";
        mi2014.pts = 14;
        int mi2014Last5[] = {1, 0, 1, 0, 0};
        mi2014.last5 = mi2014Last5;

        Team rr2014 = new Team();
        rr2014.name = "RR";
        rr2014.noOfMatches = 14;
        rr2014.won = 7;
        rr2014.lost = 7;
        rr2014.nrr = "+0.060";
        rr2014.pts = 14;
        int rr2014Last5[] = {0, 1, 0, 1, 0};
        rr2014.last5 = rr2014Last5;

        Team srh2014 = new Team();
        srh2014.name = "SRH";
        srh2014.noOfMatches = 14;
        srh2014.won = 6;
        srh2014.lost = 8;
        srh2014.nrr = "-0.399";
        srh2014.pts = 12;
        int srh2014Last5[] = {0, 1, 0, 1, 0};
        srh2014.last5 = srh2014Last5;

        Team rcb2014 = new Team();
        rcb2014.name = "RCB";
        rcb2014.noOfMatches = 14;
        rcb2014.won = 5;
        rcb2014.lost = 9;
        rcb2014.nrr = "-0.428";
        rcb2014.pts = 10;
        int rcb2014Last5[] = {1, 0, 0, 1, 0};
        rcb2014.last5 = rcb2014Last5;

        Team dd2014 = new Team();
        dd2014.name = "DD";
        dd2014.noOfMatches = 14;
        dd2014.won = 2;
        dd2014.lost = 12;
        dd2014.nrr = "-1.182";
        dd2014.pts = 4;
        int dd2014Last5[] = {0, 0, 0, 1, 0};
        dd2014.last5 = dd2014Last5;

        Team teams2014[] = {kxip2014, kkr2014, csk2014, mi2014, rr2014, srh2014, rcb2014, dd2014};
        season2014.teams = teams2014;

        // ==================== IPL 2013 ====================

        Season season2013 = new Season();
        season2013.season = 2013;

        Team csk2013 = new Team();
        csk2013.name = "CSK";
        csk2013.noOfMatches = 16;
        csk2013.won = 11;
        csk2013.lost = 5;
        csk2013.nrr = "+0.530";
        csk2013.pts = 22;
        int csk2013Last5[] = {0, 1, 0, 1, 1};
        csk2013.last5 = csk2013Last5;

        Team mi2013 = new Team();
        mi2013.name = "MI";
        mi2013.noOfMatches = 16;
        mi2013.won = 11;
        mi2013.lost = 5;
        mi2013.nrr = "+0.441";
        mi2013.pts = 22;
        int mi2013Last5[] = {1, 1, 0, 1, 0};
        mi2013.last5 = mi2013Last5;

        Team rr2013 = new Team();
        rr2013.name = "RR";
        rr2013.noOfMatches = 16;
        rr2013.won = 10;
        rr2013.lost = 6;
        rr2013.nrr = "+0.322";
        rr2013.pts = 20;
        int rr2013Last5[] = {0, 1, 1, 0, 1};
        rr2013.last5 = rr2013Last5;

        Team srh2013 = new Team();
        srh2013.name = "SRH";
        srh2013.noOfMatches = 16;
        srh2013.won = 10;
        srh2013.lost = 6;
        srh2013.nrr = "+0.003";
        srh2013.pts = 20;
        int srh2013Last5[] = {0, 1, 1, 0, 1};
        srh2013.last5 = srh2013Last5;

        Team rcb2013 = new Team();
        rcb2013.name = "RCB";
        rcb2013.noOfMatches = 16;
        rcb2013.won = 9;
        rcb2013.lost = 7;
        rcb2013.nrr = "+0.457";
        rcb2013.pts = 18;
        int rcb2013Last5[] = {0, 1, 0, 1, 1};
        rcb2013.last5 = rcb2013Last5;

        Team kxip2013 = new Team();
        kxip2013.name = "KXIP";
        kxip2013.noOfMatches = 16;
        kxip2013.won = 8;
        kxip2013.lost = 8;
        kxip2013.nrr = "+0.226";
        kxip2013.pts = 16;
        int kxip2013Last5[] = {0, 1, 0, 1, 0};
        kxip2013.last5 = kxip2013Last5;

        Team kkr2013 = new Team();
        kkr2013.name = "KKR";
        kkr2013.noOfMatches = 16;
        kkr2013.won = 6;
        kkr2013.lost = 10;
        kkr2013.nrr = "-0.095";
        kkr2013.pts = 12;
        int kkr2013Last5[] = {0, 0, 1, 0, 1};
        kkr2013.last5 = kkr2013Last5;

        Team pwi2013 = new Team();
        pwi2013.name = "PWI";
        pwi2013.noOfMatches = 16;
        pwi2013.won = 4;
        pwi2013.lost = 12;
        pwi2013.nrr = "-1.006";
        pwi2013.pts = 8;
        int pwi2013Last5[] = {0, 0, 0, 1, 0};
        pwi2013.last5 = pwi2013Last5;

        Team dd2013 = new Team();
        dd2013.name = "DD";
        dd2013.noOfMatches = 16;
        dd2013.won = 3;
        dd2013.lost = 13;
        dd2013.nrr = "-0.848";
        dd2013.pts = 6;
        int dd2013Last5[] = {0, 0, 0, 0, 1};
        dd2013.last5 = dd2013Last5;

        Team teams2013[] = {csk2013, mi2013, rr2013, srh2013, rcb2013, kxip2013, kkr2013, pwi2013, dd2013};
        season2013.teams = teams2013;

        // ==================== IPL 2012 ====================

        Season season2012 = new Season();
        season2012.season = 2012;

        Team dd2012 = new Team();
        dd2012.name = "DD";
        dd2012.noOfMatches = 16;
        dd2012.won = 11;
        dd2012.lost = 5;
        dd2012.nrr = "+0.617";
        dd2012.pts = 22;
        int dd2012Last5[] = {1, 1, 0, 1, 0};
        dd2012.last5 = dd2012Last5;

        Team kkr2012 = new Team();
        kkr2012.name = "KKR";
        kkr2012.noOfMatches = 16;
        kkr2012.won = 10;
        kkr2012.lost = 5;
        kkr2012.nrr = "+0.561";
        kkr2012.pts = 21;
        int kkr2012Last5[] = {1, 0, 1, 1, 0};
        kkr2012.last5 = kkr2012Last5;

        Team mi2012 = new Team();
        mi2012.name = "MI";
        mi2012.noOfMatches = 16;
        mi2012.won = 10;
        mi2012.lost = 6;
        mi2012.nrr = "-0.100";
        mi2012.pts = 20;
        int mi2012Last5[] = {0, 1, 1, 0, 1};
        mi2012.last5 = mi2012Last5;

        Team csk2012 = new Team();
        csk2012.name = "CSK";
        csk2012.noOfMatches = 16;
        csk2012.won = 8;
        csk2012.lost = 7;
        csk2012.nrr = "+0.100";
        csk2012.pts = 17;
        int csk2012Last5[] = {1, 0, 1, 0, 0};
        csk2012.last5 = csk2012Last5;

        Team rcb2012 = new Team();
        rcb2012.name = "RCB";
        rcb2012.noOfMatches = 16;
        rcb2012.won = 8;
        rcb2012.lost = 7;
        rcb2012.nrr = "-0.022";
        rcb2012.pts = 17;
        int rcb2012Last5[] = {1, 0, 1, 0, 0};
        rcb2012.last5 = rcb2012Last5;

        Team kxip2012 = new Team();
        kxip2012.name = "KXIP";
        kxip2012.noOfMatches = 16;
        kxip2012.won = 8;
        kxip2012.lost = 8;
        kxip2012.nrr = "-0.216";
        kxip2012.pts = 16;
        int kxip2012Last5[] = {0, 0, 1, 0, 1};
        kxip2012.last5 = kxip2012Last5;

        Team rr2012 = new Team();
        rr2012.name = "RR";
        rr2012.noOfMatches = 16;
        rr2012.won = 7;
        rr2012.lost = 9;
        rr2012.nrr = "+0.201";
        rr2012.pts = 14;
        int rr2012Last5[] = {1, 0, 0, 1, 0};
        rr2012.last5 = rr2012Last5;

        Team dch2012 = new Team();
        dch2012.name = "DCH";
        dch2012.noOfMatches = 16;
        dch2012.won = 4;
        dch2012.lost = 11;
        dch2012.nrr = "-0.509";
        dch2012.pts = 9;
        int dch2012Last5[] = {0, 0, 1, 0, 0};
        dch2012.last5 = dch2012Last5;

        Team pwi2012 = new Team();
        pwi2012.name = "PWI";
        pwi2012.noOfMatches = 16;
        pwi2012.won = 4;
        pwi2012.lost = 12;
        pwi2012.nrr = "-0.551";
        pwi2012.pts = 8;
        int pwi2012Last5[] = {0, 0, 0, 0, 1};
        pwi2012.last5 = pwi2012Last5;

        Team teams2012[] = {dd2012, kkr2012, mi2012, csk2012, rcb2012, kxip2012, rr2012, dch2012, pwi2012};
        season2012.teams = teams2012;

        // ==================== IPL 2011 ====================

        Season season2011 = new Season();
        season2011.season = 2011;

        Team rcb2011 = new Team();
        rcb2011.name = "RCB";
        rcb2011.noOfMatches = 14;
        rcb2011.won = 9;
        rcb2011.lost = 4;
        rcb2011.nrr = "+0.326";
        rcb2011.pts = 19;
        int rcb2011Last5[] = {1, 1, 0, 1, 0};
        rcb2011.last5 = rcb2011Last5;

        Team csk2011 = new Team();
        csk2011.name = "CSK";
        csk2011.noOfMatches = 14;
        csk2011.won = 9;
        csk2011.lost = 5;
        csk2011.nrr = "+0.443";
        csk2011.pts = 18;
        int csk2011Last5[] = {1, 1, 0, 1, 0};
        csk2011.last5 = csk2011Last5;

        Team mi2011 = new Team();
        mi2011.name = "MI";
        mi2011.noOfMatches = 14;
        mi2011.won = 9;
        mi2011.lost = 5;
        mi2011.nrr = "+0.040";
        mi2011.pts = 18;
        int mi2011Last5[] = {1, 0, 1, 1, 0};
        mi2011.last5 = mi2011Last5;

        Team kkr2011 = new Team();
        kkr2011.name = "KKR";
        kkr2011.noOfMatches = 14;
        kkr2011.won = 8;
        kkr2011.lost = 6;
        kkr2011.nrr = "+0.433";
        kkr2011.pts = 16;
        int kkr2011Last5[] = {0, 1, 0, 1, 1};
        kkr2011.last5 = kkr2011Last5;

        Team kxip2011 = new Team();
        kxip2011.name = "KXIP";
        kxip2011.noOfMatches = 14;
        kxip2011.won = 7;
        kxip2011.lost = 7;
        kxip2011.nrr = "-0.051";
        kxip2011.pts = 14;
        int kxip2011Last5[] = {1, 0, 0, 1, 0};
        kxip2011.last5 = kxip2011Last5;

        Team rr2011 = new Team();
        rr2011.name = "RR";
        rr2011.noOfMatches = 14;
        rr2011.won = 6;
        rr2011.lost = 7;
        rr2011.nrr = "-0.691";
        rr2011.pts = 13;
        int rr2011Last5[] = {0, 1, 0, 0, 1};
        rr2011.last5 = rr2011Last5;

        Team dch2011 = new Team();
        dch2011.name = "DCH";
        dch2011.noOfMatches = 14;
        dch2011.won = 6;
        dch2011.lost = 8;
        dch2011.nrr = "+0.222";
        dch2011.pts = 12;
        int dch2011Last5[] = {0, 1, 0, 0, 1};
        dch2011.last5 = dch2011Last5;

        Team ktk2011 = new Team();
        ktk2011.name = "KTK";
        ktk2011.noOfMatches = 14;
        ktk2011.won = 6;
        ktk2011.lost = 8;
        ktk2011.nrr = "-0.214";
        ktk2011.pts = 12;
        int ktk2011Last5[] = {0, 0, 1, 0, 1};
        ktk2011.last5 = ktk2011Last5;

        Team pwi2011 = new Team();
        pwi2011.name = "PWI";
        pwi2011.noOfMatches = 14;
        pwi2011.won = 4;
        pwi2011.lost = 9;
        pwi2011.nrr = "-0.134";
        pwi2011.pts = 9;
        int pwi2011Last5[] = {1, 0, 0, 0, 0};
        pwi2011.last5 = pwi2011Last5;

        Team dd2011 = new Team();
        dd2011.name = "DD";
        dd2011.noOfMatches = 14;
        dd2011.won = 4;
        dd2011.lost = 9;
        dd2011.nrr = "-0.448";
        dd2011.pts = 9;
        int dd2011Last5[] = {0, 1, 0, 0, 0};
        dd2011.last5 = dd2011Last5;

        Team teams2011[] = {rcb2011, csk2011, mi2011, kkr2011, kxip2011, rr2011, dch2011, ktk2011, pwi2011, dd2011};
        season2011.teams = teams2011;

        // ==================== IPL 2010 ====================

        Season season2010 = new Season();
        season2010.season = 2010;

        Team mi2010 = new Team();
        mi2010.name = "MI";
        mi2010.noOfMatches = 14;
        mi2010.won = 10;
        mi2010.lost = 4;
        mi2010.nrr = "+1.084";
        mi2010.pts = 20;
        int mi2010Last5[] = {1, 1, 1, 0, 1};
        mi2010.last5 = mi2010Last5;

        Team dch2010 = new Team();
        dch2010.name = "DCH";
        dch2010.noOfMatches = 14;
        dch2010.won = 8;
        dch2010.lost = 6;
        dch2010.nrr = "-0.297";
        dch2010.pts = 16;
        int dch2010Last5[] = {1, 0, 1, 0, 1};
        dch2010.last5 = dch2010Last5;

        Team csk2010 = new Team();
        csk2010.name = "CSK";
        csk2010.noOfMatches = 14;
        csk2010.won = 7;
        csk2010.lost = 7;
        csk2010.nrr = "+0.274";
        csk2010.pts = 14;
        int csk2010Last5[] = {0, 0, 1, 0, 1};
        csk2010.last5 = csk2010Last5;

        Team rcb2010 = new Team();
        rcb2010.name = "RCB";
        rcb2010.noOfMatches = 14;
        rcb2010.won = 7;
        rcb2010.lost = 7;
        rcb2010.nrr = "+0.219";
        rcb2010.pts = 14;
        int rcb2010Last5[] = {0, 0, 1, 0, 1};
        rcb2010.last5 = rcb2010Last5;

        Team dd2010 = new Team();
        dd2010.name = "DD";
        dd2010.noOfMatches = 14;
        dd2010.won = 7;
        dd2010.lost = 7;
        dd2010.nrr = "+0.021";
        dd2010.pts = 14;
        int dd2010Last5[] = {1, 0, 0, 1, 0};
        dd2010.last5 = dd2010Last5;

        Team kkr2010 = new Team();
        kkr2010.name = "KKR";
        kkr2010.noOfMatches = 14;
        kkr2010.won = 7;
        kkr2010.lost = 7;
        kkr2010.nrr = "-0.341";
        kkr2010.pts = 14;
        int kkr2010Last5[] = {1, 0, 1, 0, 0};
        kkr2010.last5 = kkr2010Last5;

        Team rr2010 = new Team();
        rr2010.name = "RR";
        rr2010.noOfMatches = 14;
        rr2010.won = 6;
        rr2010.lost = 8;
        rr2010.nrr = "-0.514";
        rr2010.pts = 12;
        int rr2010Last5[] = {1, 0, 1, 0, 0};
        rr2010.last5 = rr2010Last5;

        Team kxip2010 = new Team();
        kxip2010.name = "KXIP";
        kxip2010.noOfMatches = 14;
        kxip2010.won = 4;
        kxip2010.lost = 10;
        kxip2010.nrr = "-0.478";
        kxip2010.pts = 8;
        int kxip2010Last5[] = {0, 0, 0, 1, 0};
        kxip2010.last5 = kxip2010Last5;

        Team teams2010[] = {mi2010, dch2010, csk2010, rcb2010, dd2010, kkr2010, rr2010, kxip2010};
        season2010.teams = teams2010;

        // ==================== IPL 2009 ====================

        Season season2009 = new Season();
        season2009.season = 2009;

        Team dd2009 = new Team();
        dd2009.name = "DD";
        dd2009.noOfMatches = 14;
        dd2009.won = 10;
        dd2009.lost = 4;
        dd2009.nrr = "+0.311";
        dd2009.pts = 20;
        int dd2009Last5[] = {1, 1, 1, 1, 0};
        dd2009.last5 = dd2009Last5;

        Team csk2009 = new Team();
        csk2009.name = "CSK";
        csk2009.noOfMatches = 14;
        csk2009.won = 8;
        csk2009.lost = 5;
        csk2009.nrr = "+0.951";
        csk2009.pts = 17;
        int csk2009Last5[] = {0, 1, 0, 1, 1};
        csk2009.last5 = csk2009Last5;

        Team rcb2009 = new Team();
        rcb2009.name = "RCB";
        rcb2009.noOfMatches = 14;
        rcb2009.won = 8;
        rcb2009.lost = 6;
        rcb2009.nrr = "-0.191";
        rcb2009.pts = 16;
        int rcb2009Last5[] = {0, 1, 0, 1, 1};
        rcb2009.last5 = rcb2009Last5;

        Team dch2009 = new Team();
        dch2009.name = "DCH";
        dch2009.noOfMatches = 14;
        dch2009.won = 7;
        dch2009.lost = 7;
        dch2009.nrr = "+0.203";
        dch2009.pts = 14;
        int dch2009Last5[] = {0, 0, 1, 0, 1};
        dch2009.last5 = dch2009Last5;

        Team kxip2009 = new Team();
        kxip2009.name = "KXIP";
        kxip2009.noOfMatches = 14;
        kxip2009.won = 7;
        kxip2009.lost = 7;
        kxip2009.nrr = "-0.483";
        kxip2009.pts = 14;
        int kxip2009Last5[] = {0, 1, 0, 1, 0};
        kxip2009.last5 = kxip2009Last5;

        Team rr2009 = new Team();
        rr2009.name = "RR";
        rr2009.noOfMatches = 14;
        rr2009.won = 6;
        rr2009.lost = 7;
        rr2009.nrr = "-0.352";
        rr2009.pts = 13;
        int rr2009Last5[] = {0, 0, 1, 0, 1};
        rr2009.last5 = rr2009Last5;

        Team mi2009 = new Team();
        mi2009.name = "MI";
        mi2009.noOfMatches = 14;
        mi2009.won = 5;
        mi2009.lost = 8;
        mi2009.nrr = "+0.297";
        mi2009.pts = 11;
        int mi2009Last5[] = {0, 1, 0, 1, 0};
        mi2009.last5 = mi2009Last5;

        Team kkr2009 = new Team();
        kkr2009.name = "KKR";
        kkr2009.noOfMatches = 14;
        kkr2009.won = 3;
        kkr2009.lost = 10;
        kkr2009.nrr = "-0.789";
        kkr2009.pts = 7;
        int kkr2009Last5[] = {0, 1, 0, 0, 0};
        kkr2009.last5 = kkr2009Last5;

        Team teams2009[] = {dd2009, csk2009, rcb2009, dch2009, kxip2009, rr2009, mi2009, kkr2009};
        season2009.teams = teams2009;

        // ==================== IPL 2008 ====================

        Season season2008 = new Season();
        season2008.season = 2008;

        Team rr2008 = new Team();
        rr2008.name = "RR";
        rr2008.noOfMatches = 14;
        rr2008.won = 11;
        rr2008.lost = 3;
        rr2008.nrr = "+0.632";
        rr2008.pts = 22;
        int rr2008Last5[] = {1, 1, 0, 1, 1};
        rr2008.last5 = rr2008Last5;

        Team kxip2008 = new Team();
        kxip2008.name = "KXIP";
        kxip2008.noOfMatches = 14;
        kxip2008.won = 10;
        kxip2008.lost = 4;
        kxip2008.nrr = "+0.509";
        kxip2008.pts = 20;
        int kxip2008Last5[] = {1, 0, 1, 1, 1};
        kxip2008.last5 = kxip2008Last5;

        Team csk2008 = new Team();
        csk2008.name = "CSK";
        csk2008.noOfMatches = 14;
        csk2008.won = 8;
        csk2008.lost = 6;
        csk2008.nrr = "-0.192";
        csk2008.pts = 16;
        int csk2008Last5[] = {1, 0, 1, 0, 1};
        csk2008.last5 = csk2008Last5;

        Team dd2008 = new Team();
        dd2008.name = "DD";
        dd2008.noOfMatches = 14;
        dd2008.won = 7;
        dd2008.lost = 6;
        dd2008.nrr = "+0.342";
        dd2008.pts = 15;
        int dd2008Last5[] = {0, 1, 0, 1, 0};
        dd2008.last5 = dd2008Last5;

        Team mi2008 = new Team();
        mi2008.name = "MI";
        mi2008.noOfMatches = 14;
        mi2008.won = 7;
        mi2008.lost = 7;
        mi2008.nrr = "+0.570";
        mi2008.pts = 14;
        int mi2008Last5[] = {0, 0, 1, 0, 1};
        mi2008.last5 = mi2008Last5;

        Team kkr2008 = new Team();
        kkr2008.name = "KKR";
        kkr2008.noOfMatches = 14;
        kkr2008.won = 6;
        kkr2008.lost = 7;
        kkr2008.nrr = "-0.147";
        kkr2008.pts = 13;
        int kkr2008Last5[] = {1, 0, 0, 1, 0};
        kkr2008.last5 = kkr2008Last5;

        Team rcb2008 = new Team();
        rcb2008.name = "RCB";
        rcb2008.noOfMatches = 14;
        rcb2008.won = 4;
        rcb2008.lost = 10;
        rcb2008.nrr = "-1.160";
        rcb2008.pts = 8;
        int rcb2008Last5[] = {0, 0, 0, 0, 1};
        rcb2008.last5 = rcb2008Last5;

        Team dch2008 = new Team();
        dch2008.name = "DCH";
        dch2008.noOfMatches = 14;
        dch2008.won = 2;
        dch2008.lost = 12;
        dch2008.nrr = "-0.467";
        dch2008.pts = 4;
        int dch2008Last5[] = {0, 0, 1, 0, 0};
        dch2008.last5 = dch2008Last5;

        Team teams2008[] = {rr2008, kxip2008, csk2008, dd2008, mi2008, kkr2008, rcb2008, dch2008};
        season2008.teams = teams2008;

        Season seasons[] = {
                season2026,
                season2025,
                season2024,
                season2023,
                season2022,
                season2021,
                season2020,
                season2019,
                season2018,
                season2017,
                season2016,
                season2015,
                season2014,
                season2013,
                season2012,
                season2011,
                season2010,
                season2009,
                season2008
        };

        table.seasons = seasons;
        ipl.table = table;
        ipl.getIplInfo();
    }
}