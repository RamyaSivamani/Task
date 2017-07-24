package com.kgfsl.Composition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class StreamsCheck {
public static void main(String[] args) {
List<Department> deps = new ArrayList<>();
List<Student>StudentList = new ArrayList<>();
Department dept = new Department("1", "CSE");
Student em1 = new Student("Mano", 1, dept);
StudentList.add(em1);
em1 = new Student("Mano1", 1, dept);
StudentList.add(em1);
em1 = new Student("Mano2", 1, dept);
StudentList.add(em1);
Department dept2 = new Department("2", "IT");
em1 = new Student("Mano3", 1, dept2);
StudentList.add(em1);
em1 = new Student("Mano4", 1, dept2);
StudentList.add(em1);
Department dept3 = new Department("3", "ECE");
em1 = new Student("Mano5", 1, dept3);
StudentList.add(em1);
em1 = new Student("Mano6", 1, dept3);
StudentList.add(em1);
deps.add(dept);
deps.add(dept2);
deps.add(dept3);
StudentList.stream().filter(st -> st.getDepartment().getDeptName().equals("ECE"))
.forEach(data -> System.out.println(data.toString()));
List<Student> StudentList2 = StudentList.stream()
.filter(st -> st.getDepartment().getDeptName().equals("CSE")).collect(Collectors.toList());
//long count = StudentList.stream().filter(st -> st.getDepartment().getDeptName().equals("CSE")).count();
System.out.println("================================================================================");
Map<String, List<Student>> empMap = StudentList.stream()
.collect(Collectors.groupingBy(Student::getDepartmentName));
empMap.entrySet().forEach(data -> {
System.out.println("Department --------> " + data.getKey());
data.getValue().forEach(emp -> {
System.out.println(emp.toString());
});
});
System.out.println("================================================================================");
//System.out.println("Count filtered " + count);
//StudentList.stream().map(t -> t.getDepartmentName()).distinct().collect(Collectors.toList()).forEach(System.out::println);
Map<String, List<Student>> c= StudentList.stream()
.collect(Collectors.groupingBy(Student::getDepartmentName));
c.entrySet().forEach(data -> {
System.out.println("Department --------> " + data.getKey()+"\tStudents Count ------------>"+data.getValue().size());
});
}
}


