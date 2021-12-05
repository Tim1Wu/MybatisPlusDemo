package springbootmvcshengji.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootmvcshengji.demo.mapper.PersonMapper;
import springbootmvcshengji.demo.pojo.Person;
import springbootmvcshengji.demo.service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper pm;

    @Override
    public int add(Person person) {
        return pm.insert(person);
    }

    @Override
    public int delete(int id) {
        return pm.deleteById(id);
    }

    @Override
    public int update(Person person) {
        return pm.updateById(person);
    }

    @Override
    public List<Person> showAll() {
        return pm.selectList(null);
    }

    @Override
    public Person showPerson(int id) {
        return pm.selectById(id);
    }

    @Override
    public Page selectPage(int pageIndex, int pageSize) {
        Page pageOne = new Page(pageIndex, pageSize);
        Page pageTwo = pm.selectPage(pageOne, null);
       if(!pageTwo.hasPrevious())
           pageTwo.setCurrent(1);
        if (!pageTwo.hasNext()) {
            pageTwo.setCurrent(pageTwo.getPages());
        }
        return pageTwo;
    }
}
