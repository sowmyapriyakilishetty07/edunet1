import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class CollectionTask {
    public static void main(String[] args) {
        // TASK 1
        ArrayList<Student> students = new ArrayList<>();
        Random rand = new Random();

        // 1. Initialization with 1000 records
        for (int i = 0; i < 1000; i++) {
            students.add(new Student(i, "Student" + i, rand.nextDouble() * 100));
        }
         System.out.println(students);

        // 2. Add 500 records to end and middle
        for (int i = 1000; i < 1500; i++) {
            students.add(new Student(i, "Student" + i, rand.nextDouble() * 100));
        }

       
        for (int i = 1500; i < 2000; i++) {
            students.add(students.size() / 2, new Student(i, "Student" + i, rand.nextDouble() * 100));
        }
                // 3. Delete 200 from start, middle, end
        
        for (int i = 0; i < 200; i++) students.remove(0);
        

        
        for (int i = 0; i < 200; i++) students.remove(students.size() / 2);
        

        
        for (int i = 0; i < 200; i++) students.remove(students.size() - 1);
        
        // 4. Update 100 random student marks
        
        for (int i = 0; i < 100; i++) {
            int index = rand.nextInt(students.size());
            Student s = students.get(index);
            s.marks += s.marks * 0.1;
        }
        
        // 5. Search 50 students by ID
        
        for (int i = 0; i < 50; i++) {
            int targetId = rand.nextInt(2000);
            for (Student s : students) {
                if (s.id == targetId) {
                    break;
                }
   }
        }
       
        // 6. Sorting by marks
        
        students.sort(Comparator.comparingDouble(s -> s.marks));
        

        students.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));
                // 7. Iteration
        
        for (Student s : students) {}
                
        ListIterator<Student> it = students.listIterator();
        while (it.hasNext()) it.next();
        }

}