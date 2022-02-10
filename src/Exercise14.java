public class Exercise14 {
    public static void main(String[] args) {
        int gradeLevel = 12;
        boolean isSenior = true;
        boolean result = (gradeLevel == 12);
        boolean isInterestedInVolunteering = true;
        boolean shouldSendVolunteerInfo = true;
        boolean eligibleToSend = shouldSendVolunteerInfo = true && (isInterestedInVolunteering = true && (result = true));
        System.out.println(eligibleToSend);
    }
}
