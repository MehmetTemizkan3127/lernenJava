package j100projects.project06;

import java.util.List;

public interface IStudentService {



    List <Student> addStudent();


    boolean removeStudent(String id);


   Student searchStudent(String id);


    
}