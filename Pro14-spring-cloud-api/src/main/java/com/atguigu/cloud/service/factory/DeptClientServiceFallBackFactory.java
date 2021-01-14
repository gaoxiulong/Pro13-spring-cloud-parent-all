package com.atguigu.cloud.service.factory;

import com.atguigu.cloud.entities.Dept;
import com.atguigu.cloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Hystrix降级处理工厂类，实现DeptClientService类型的FallbackFactory接口
//Component注解表示当前类的对象在被扫描到之后要加入IOC容器
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Integer deptNo) {
                return new Dept(deptNo,"Hystrix降级get","Hystrix降级机制get方法");
            }

            @Override
            public List<Dept> getAll() {
                List list = new ArrayList();
                Dept dept1 = new Dept(1,"error1","error1_vlaue");
                Dept dept2 = new Dept(2,"error2","error2_vlaue");
                list.add(dept1);
                list.add(dept2);
                return list;
            }
        };
    }
}
