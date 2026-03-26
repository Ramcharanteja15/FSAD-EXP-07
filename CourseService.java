import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

  
    public String addCourse(Course course) {
        repo.save(course);
        return "Course added successfully";
    }

    
    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    
    public Course getCourseById(int id) {
        return repo.findById(id).orElse(null);
    }

    
    public String deleteCourse(int id) {
        repo.deleteById(id);
        return "Course deleted successfully";
    }

    
    public String updateCourse(int id, Course course) {
        Course existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(course.getName());
            existing.setInstructor(course.getInstructor());
            existing.setFee(course.getFee());
            repo.save(existing);
            return "Course updated successfully";
        } else {
            return "Course not found";
        }
    }
}
