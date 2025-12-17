// Class to divede pens equally among 3 people and also display remaining pens
public class DividePens {
    public static void main(String[] args) {
        // variable to store total number of pens
        int totalPens = 14;

        // variable to store total number of students
        int totalStudents = 3;

        // calculate and store pen per each students
        int pensPerStudent = totalPens / totalStudents;

        // calculate and store total pens distributed
        int totalDistributedPens = totalStudents * pensPerStudent;

        // calculate and store undistributed pens
        int totalUndistributedPens = totalPens - totalDistributedPens;

        // display the results
        System.out.println("The pen per student is "+ pensPerStudent + " and the remaining pen not distributed is " + totalUndistributedPens);
        
    }
}
