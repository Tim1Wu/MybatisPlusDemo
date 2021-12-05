package springbootmvcshengji.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import springbootmvcshengji.demo.pojo.Person;

import java.util.List;

public interface PersonService {
    int add(Person person);

    int delete(int id);

    int update(Person person);

    List<Person> showAll();

    Person showPerson(int id);

    Page selectPage(int pageIndex, int pageSize);
}
