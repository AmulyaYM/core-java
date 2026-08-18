class TeamsRunner {

    public static void main(String[] amulya) {

        Teams teams = new Teams();

        teams.teamName = "Java Development Team";
        teams.teamId = 101;
        teams.ownerName = "Amulya";
        teams.organizationName = "Microsoft";

        Calendar calendar = new Calendar();

        calendar.calendarId = 201;
        calendar.calendarName = "Work Calendar";
        calendar.calendarType = "Meeting Calendar";

        Meeting meeting = new Meeting();

        meeting.meetingTitle = "Java Discussion";
        meeting.startDate = "18/08/2026";
        meeting.startTime = "9:00 PM";
        meeting.endDate = "18/08/2026";
        meeting.endTime = "9:30 PM";
        meeting.duration = "30 minutes";
        meeting.timeZone = "UTC+05:30";
        meeting.allDay = false;


        Invitee invitee = new Invitee();

        invitee.inviteeId = 301;
        invitee.inviteeName = "Ananya";
        invitee.inviteeEmail = "ananya@gmail.com";
        invitee.inviteeStatus = "Invited";

		teams.calendar = calendar;
		calendar.meeting = meeting;
		meeting.invitee = invitee;

        teams.displayTeamsDetails();
    }
}