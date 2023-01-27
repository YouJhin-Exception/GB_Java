package OOP.Project.repository;


import OOP.Project.data.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer> {
    @Override
    public StudentGroup save(StudentGroup students) {
        return null;
    }

    @Override
    public void delete(StudentGroup studentGroup) {
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }
}
