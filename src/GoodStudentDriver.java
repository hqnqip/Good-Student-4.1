public class GoodStudentDriver
{
    public static void main(String[] args)
    {
        GoodStudent alanTuring = new GoodStudent("Alan", "Turing", 191254, 3.98, "Yes");
        GoodStudent florenceNight = new GoodStudent("Nightingale", 182010, "Florence", 3.89, "No");
        GoodStudent graceHopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, "Yes");

        //Alan
        System.out.println(alanTuring.toString());
        System.out.println("\tDigital ID: " + alanTuring.CreateID());
        System.out.println("\tUpdated GPA: " + alanTuring.CSGPA());


        //Florence
        System.out.println();
        florenceNight.setIdNumber(95336);
        florenceNight.setGpa(3.92);
        System.out.println("Name: " + florenceNight.getFirstName() + " " + florenceNight.getLastName());
        System.out.println("\tUpdated ID: " + florenceNight.getIdNumber() +
                           "\n\tDigital ID: " + florenceNight.CreateID() +
                           "\n\tUpdated GPA: " + florenceNight.CSGPA());


        //Grace
        System.out.println();
        System.out.println("First Name: " + graceHopper.getFirstName() +
                           "\n\tCS Student: " + graceHopper.getCsStudent() +
                           "\n\tDigital ID: " + graceHopper.CreateID() +
                           "\n\tUpdated GPA: " + graceHopper.CSGPA());
    }
}