package springbootmvcshengji.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springbootmvcshengji.demo.pojo.Person;
import springbootmvcshengji.demo.service.PersonService;

public class PersonController {

    @Autowired
    PersonService ps;

    @RequestMapping("/show")
    public Page show(int index, int size) {
        Page page = ps.selectPage(index, size);
        return page;
    }

    @PostMapping("/add")
    public int add(Person person){
        return ps.add(person);
    }

    @PostMapping("/update")
    public int update(Person person){
        return ps.update(person);
    }

    @PostMapping("/delete")
    public int delete(int id){
        return ps.delete(id);
    }

    @GetMapping("/check")
    public Person check(int id) {
        return ps.showPerson(id);
    }
}
