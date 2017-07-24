package com.kgfsl.Composition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Department {
private String deptId;
private String deptName;
private List<Student> emp;
public Department() {
}
public Department(String id, String name) {
this.deptName = name;
this.deptId = id;
}
public String getDeptId() {
return deptId;
}
public void setDeptId(String deptId) {
this.deptId = deptId;
}
public String getDeptName() {
return deptName;
}
public void setDeptName(String deptName) {
this.deptName = deptName;
}
public List<Student> getSt() {
return emp;
}
public void setSt(List<Student> emp) {
this.emp = emp;
}
}
