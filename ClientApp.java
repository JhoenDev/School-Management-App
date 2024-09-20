public class ClientApp {

    public static void main(String[] args) {
        
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp asRc = new AttendanceSystemAdapter(attendanceSystem);
        
        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gsRc = new GradingSystemAdapter(gradingSystem);
        
        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp lsRc = new LibrarySystemAdapter(librarySystem);

        //test out all commands
        System.out.println(asRc.integrateSystem());
        System.out.println(gsRc.integrateSystem());
        System.out.println(lsRc.integrateSystem());

    }
}