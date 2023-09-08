/*
package seminars.seminar8.mvc.model;

public class Model {
    private final HashMap<Integer, Student> cache = new HashMap<>();

    public void insertCache(List<Student> studentList) {
        for (Student student : studentList) {
            cache.put( student.getId(), student );
        }
    }

    public void insertStudent(Student student) {
        cache.put( student.getId(), student );
    }

    public void updateCache(List<Student> studentList) {
        cache.clear();
        insertCache( studentList );
    }

    public void updateStudentById(int id, Student student) {
        cache.replace( id, student );
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>( cache.values() );
    }
}
 */