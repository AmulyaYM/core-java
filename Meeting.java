class Meeting {

    String meetingTitle;
    String startDate;
    String startTime;
    String endDate;
    String endTime;
    String duration;
    String timeZone;
    boolean allDay;

    Invitee invitee;

    public void displayMeetingDetails() {

        System.out.println("Meeting Title: " + this.meetingTitle);
        System.out.println("Start Date: " + this.startDate);
        System.out.println("Start Time: " + this.startTime);
        System.out.println("End Date: " + this.endDate);
        System.out.println("End Time: " + this.endTime);
        System.out.println("Duration: " + this.duration);
        System.out.println("Time Zone: " + this.timeZone);
        System.out.println("All Day: " + this.allDay);

        invitee.displayInviteeDetails();
    }
}