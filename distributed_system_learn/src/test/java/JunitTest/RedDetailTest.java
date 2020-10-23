package JunitTest;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learn.Application;
import com.learn.red_rob.entity.RedDetailEntity;
import com.learn.red_rob.service.RedDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description: 红包明细测试
 * @author: Mr.O
 * @create: 2020-10-23 10:59
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class) // 指定spring-boot的启动类
public class RedDetailTest {
    @Autowired
    private RedDetailService redDetailService;

    @Test
    public void test1() {
        List<RedDetailEntity> list = redDetailService.list(new QueryWrapper<RedDetailEntity>());
        System.out.println(list);

    }
}
