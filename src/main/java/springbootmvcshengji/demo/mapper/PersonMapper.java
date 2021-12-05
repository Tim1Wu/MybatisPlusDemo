package springbootmvcshengji.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import springbootmvcshengji.demo.pojo.Person;
import springbootmvcshengji.demo.service.PersonService;

@Repository
public interface PersonMapper extends BaseMapper<Person> {
}
