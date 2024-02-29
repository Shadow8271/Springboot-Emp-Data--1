package com.atharva.Emp11.services;

import com.atharva.Emp11.entities.Entities;
import com.atharva.Emp11.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Services {
  // @Autowired
 //  Repo repo;

   public void functionEntry(String name, Integer id, String Designation, Integer age, Integer salary){
      Entities Demoentity = new Entities();
      Demoentity.setEmpName(name);
      Demoentity.setAge(age);
      Demoentity.setDesignation(Designation);
      Demoentity.setEmpID(id);
      Demoentity.setSalary(salary);
    //  repo.save(Demoentity);


   }
}
