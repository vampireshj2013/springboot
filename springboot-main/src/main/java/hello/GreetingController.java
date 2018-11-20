package hello;

import hello.domain.user.User;
import hello.domain.user.UserMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    public static final Log log = LogFactory.getLog(GreetingController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }


    @RequestMapping("/jdbc")
    public List<Map<String, Object>> jdbc() {
        log.info(String.format("jdbc:%s",this.jdbcTemplate.getDataSource()));
        return this.jdbcTemplate.queryForList("select * from user");
    }

    @RequestMapping("/user/{id}")
    public User queryUserById(@PathVariable("id") long id) {
        return userMapper.queryUserById(id);
    }@RequestMapping("/users")

    public List<User> queryAllUser() {
        return userMapper.queryAll();
    }
}