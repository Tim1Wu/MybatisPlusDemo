package springbootmvcshengji.demo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class Person implements Serializable {
    private static final long serialVersionID = 1L;

    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;
    private String pname;
    private String sex;
    private Integer age;
    private Integer rank;
    private String department;
}
