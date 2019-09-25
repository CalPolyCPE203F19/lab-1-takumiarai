import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   //returns a list of strings containing the studentName of overenrolled
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */

      List<String> overEnrolledStudents = new LinkedList<>();


      for (Map.Entry<String,List<Course>> entry : courseListsByStudentName.entrySet())
      {
         String studentName = entry.getKey();
         List<Course> courseList = entry.getValue();

         int totalUnits = 0;
         for(Course course : courseList) {
            totalUnits += course.getNumUnits();
         }

         if (totalUnits > unitThreshold) { overEnrolledStudents.add(studentName); }

      }
      

      return overEnrolledStudents;      
   }
}
