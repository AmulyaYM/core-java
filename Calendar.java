class Calendar {

    int calendarId;
    String calendarName;
    String calendarType;
    

    Meeting meeting; 
    public void displayCalendarDetails() {

        System.out.println("Calendar ID: " + this.calendarId);
        System.out.println("Calendar Name: " + this.calendarName);
        System.out.println("Calendar Type: " + this.calendarType);
       

        meeting.displayMeetingDetails();
    }
}