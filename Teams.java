class Teams {

    String teamName;
    int teamId;
    String ownerName;
    String organizationName;

    Calendar calendar;

    public void displayTeamsDetails() {

        System.out.println("Team Name: " + this.teamName);
        System.out.println("Team ID: " + this.teamId);
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Organization Name: " + this.organizationName);

        calendar.displayCalendarDetails();
    }
}