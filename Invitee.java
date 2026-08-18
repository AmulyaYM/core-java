class Invitee {

    int inviteeId;
    String inviteeName;
    String inviteeEmail;
    String inviteeStatus;

    public void displayInviteeDetails() {

        System.out.println("Invitee ID: " + this.inviteeId);
        System.out.println("Invitee Name: " + this.inviteeName);
        System.out.println("Invitee Email: " + this.inviteeEmail);
        System.out.println("Invitee Status: " + this.inviteeStatus);
    }
}