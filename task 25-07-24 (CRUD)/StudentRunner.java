class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        int length = student.getArrayLength();
        System.out.println("======== Creation ========");
        System.out.println("The Array is created of length: " + length);

        System.out.println("======== Insertion ========");
        student.insertStudentNames("Alice");
        student.insertStudentNames("Bob");
        student.insertStudentNames("Charlie");
        student.insertStudentNames("Dave");

        System.out.println("======== Reading ========");
        student.readStudentNames();

        System.out.println("======== Updating ========");
        student.updateStudentName("Charlie", "Eve");
        student.readStudentNames();

        System.out.println("======== Deleting ========");
        student.deleteStudentName("Eve");
        student.readStudentNames();

        System.out.println("======== Searching ========");
        String search = student.searchStudentName("Bob");
        System.out.println("Result: " + search);
    }
}
