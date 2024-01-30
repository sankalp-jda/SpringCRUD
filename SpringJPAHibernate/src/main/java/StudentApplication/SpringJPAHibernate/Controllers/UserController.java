package StudentApplication.SpringJPAHibernate.Controllers;

import StudentApplication.SpringJPAHibernate.Model.User;
import StudentApplication.SpringJPAHibernate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepoObj;
    @PostMapping("/signup")
    public User save(@RequestBody User userObj){
        System.out.println("Entered Signup");
        User userResponse = userRepoObj.save(userObj);


        return userResponse;
    };

    @DeleteMapping("/deleteEmployee")
    public void delete(@RequestBody User userObj){
        userRepoObj.delete(userObj);
    };

    @GetMapping("/findEmployees")
    public List<User> findEmp(@RequestBody User userObj){


         return userRepoObj.findAll();

    }

};




