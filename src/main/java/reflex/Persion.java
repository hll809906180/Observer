package reflex;

import reflex.annotation.init.IntVal;
import reflex.annotation.init.LongVal;
import reflex.annotation.init.StrVal;
import reflex.annotation.validate.IsInteger;

/**
 * @description:
 * @author: he.l
 * @create: 2019-03-30 14:33
 **/

public class Persion {
    private Long id;
    private String name;
    private String phone;
    @IsInteger(max = 100,min = 1)
    private Integer age;
    private String email;


    public Long getId() {
        return id;
    }
    @LongVal(value = 123456)
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @StrVal(value = "小明")
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }
    @IntVal(value = 101)
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
