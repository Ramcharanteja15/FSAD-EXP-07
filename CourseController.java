import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository repo;

   
    @PostMapping("/add")
    public String addCourse(@RequestBody Course course) {
        repo.save(course);
        return "Course added successfully";
    }

    
    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int id) {
        repo.deleteById(id);
        return "Course deleted successfully";
    }
}
