package com.assign2.students.Controllers;

import com.assign2.students.Models.Student;
import com.assign2.students.Models.StudentRepository;

import jakarta.servlet.http.HttpServletResponse;

//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Window;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

     @GetMapping("student/view")
    public String getAllStudent(Model model){
        System.out.println("Getting all students");
        List<Student> student = studentRepo.findAll();
        model.addAttribute("st", student);
        return "student/showStudent.html";
    }

    /**
     * @param updatestudent
     * @param response
     * @param model
     * @return
     */
    // @PostMapping("student/update")
    //     public String UpdateStudent(@RequestParam Map<String, String> updatestudent, HttpServletResponse response){
    //     // System.out.println("Update students");
    //     // Integer uid =  Integer.parseInt(updatestudent.get("sel_stud"));
    //     // Student sel_student = studentRepo.findByID(uid);
    //     // model.addAttribute("st", sel_student);
    //      return "student/updateStudent.html";
    // }
    @PostMapping("student/display")
            public String displayStudent(@RequestParam Map<String, String> newstudent, HttpServletResponse response, Model model){
            System.out.println("Update Student");
            Integer uid = Integer.parseInt(newstudent.get("sel_stud"));
            Student sel_student =  studentRepo.findByUid(uid);
            model.addAttribute("sel_student",sel_student);
            return "student/displayStudent.html";
        }

    @PostMapping("student/add")
        public String addStudent(@RequestParam Map<String, String> newstudent, HttpServletResponse response){
            System.out.println("Add Student");
            String newName = newstudent.get("name");
            Integer newHeight = Integer.parseInt(newstudent.get("height"));
            Integer newWeight = Integer.parseInt(newstudent.get("weight"));
            String newhaircolor = newstudent.get("haircolor");
            Double newGPA = Double.parseDouble(newstudent.get("gpa"));
            studentRepo.save(new Student(newName, newWeight, newHeight, newhaircolor, newGPA));
            response.setStatus(201);
            return "student/addedStudent.html";
        }

        @PostMapping("student/delete")
        public String deleteStudent(@RequestParam Map<String, String> selstudent, HttpServletResponse response){
            System.out.println("Delete Student");
            Integer uid = Integer.parseInt(selstudent.get("del_ID"));
            studentRepo.deleteById(uid);
            return "student/deletedStudent.html";
        }

        @PostMapping("student/update")
        public String updateStudent(@RequestParam Map<String, String> selstudent, HttpServletResponse response){
            System.out.println("Update Student");
            Integer uid = Integer.parseInt(selstudent.get("StudID"));
            String newName = selstudent.get("name");
            Integer newHeight = Integer.parseInt(selstudent.get("height"));
            Integer newWeight = Integer.parseInt(selstudent.get("weight"));
            String newhaircolor = selstudent.get("haircolor");
            Double newGPA = Double.parseDouble(selstudent.get("gpa"));
            Student sel_student =  studentRepo.findByUid(uid);
            sel_student.setName(newName);
            sel_student.setHeight(newHeight);
            sel_student.setWeight(newWeight);
            sel_student.setHaircolor(newhaircolor);
            sel_student.setGpa(newGPA);
                
            studentRepo.save(sel_student);
            return "student/updatedStudent.html";
        }
    
}


