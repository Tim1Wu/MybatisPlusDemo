package springbootmvcshengji.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import springbootmvcshengji.demo.service.PersonService;

public class PersonController {

    @Autowired
    PersonService ps;

    @RequestMapping("/show")
    public Page show(int index, int size) {
        Page page = ps.selectPage(index, size);
    }
}
