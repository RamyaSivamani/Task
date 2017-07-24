package com.mycompany.task4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Student {
private String sName;
private Integer deptId;
//private Department department;
//private College c;
public Student() {
}
public Student(String name, int id) {
this.deptId = id;
this.sName = name;
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

@Override
public String toString() {
return "Student [sName=" + sName + ", deptId=" + deptId ;
}

}

