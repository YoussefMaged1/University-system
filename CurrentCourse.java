
public class CurrentCourse {
	int numOfCourses;
	String courseCode,courseName,courseCreditHours,numberOfTimes,semester,lecturer,GTA,labGTA,grade,percentage;
	String marks[] = new String [5];
	public CurrentCourse(int num) {
		marks[4] = marks[0]+marks[1]+marks[2]+marks[3];
		this.numOfCourses = num;
	  }
}
