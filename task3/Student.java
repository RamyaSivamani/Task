package com.kgfsl.Composition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Student {
private String sName;
private Integer deptId;
private Department department;
public Student() {
}
public Student(String name, int id, Department dept) {
this.deptId = id;
this.sName = name;
this.department = dept;
}
public String getsName() {
return sName;
}
public void setsName(String sName) {
this.sName = sName;
}
public Integer getDeptId() {
return deptId;
}
public void setDeptId(Integer deptId) {
this.deptId = deptId;
}
public Department getDepartment() {
return department;
}
public void setDepartment(Department department) {
this.department = department;
}
@Override
public String toString() {
return "Student [sName=" + sName + ", deptId=" + deptId + ", department=" + department.getDeptName() + "]";
}
public String getDepartmentName() {
return this.getDepartment().getDeptName();
}
}


