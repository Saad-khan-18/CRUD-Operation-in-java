class Student {
    String[] students = new String[4];
    int index = 0;

    public int getArrayLength() {
        return students.length;
    }

    public String insertStudentNames(String studentName) {
        if (this.index < this.getArrayLength()) {
            students[index] = studentName;
            System.out.println(index + ":" + students[index]);
            index++;
            return "Inserted Successfully";
        }
        return "Not Inserted";
    }

    public void readStudentNames() {
        for (String name : students) {
            System.out.println("- " + name);
        }
    }

    public String updateStudentName(String oldStudentName, String newStudentName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (students[i].equals(oldStudentName)) {
                students[i] = newStudentName;
                return "Updated Successfully";
            }
        }
        return "Not Found";
    }

    public String deleteStudentName(String studentName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (students[i].equals(studentName)) {
                students[i] = null;
                return "Deleted Successfully";
            }
        }
        return "Not Deleted";
    }

    public String searchStudentName(String studentName) {
        for (int i = 0; i < getArrayLength(); i++) {
            if (students[i] != null && students[i].equals(studentName)) {
                return "Search Student Found: " + studentName;
            }
        }
        return "Not Found";
    }
}
