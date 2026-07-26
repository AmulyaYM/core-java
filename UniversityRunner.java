class UniversityRunner {

    public static void main(String[] college) {

        String[] courses = University.getCoursesByCollegeName("rvce");

        if (courses != null) {
            System.out.println("Courses offered:");

            for (String course : courses) {
                System.out.println(course);
            }
        } else {
            System.out.println("College not found");
        }
    }
}