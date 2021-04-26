package com.liuwen.Java框架.Spring;

import org.junit.Test;

/**
 * @description: IOC：控制反转
 * @author: Liu Wen
 * @create: 2020-03-20 10:33
 **/
/*
Spring框架- 通过 IoC 创建对象，在配置文件中添加需要管理的对象，XML 格式的配置文件，文件名可以自定义。
*/
/*
<beans>
    <bean id="student" class="com.liuwen.entity.Student">
        <property name="id" value="1"></property>
        <property name="name" value="张三"></property>
        <property name="age" value="22"></property>
    </bean>
</beans>
*/
/*
//加载配置文件
ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
Student student = (Student) applicationContext.getBean("student");
System.out.println(student);
 */
public class IOCTest {
    /**
     * @Description: IOC底层原理
     * @date 20.3.20 10:40
     */
    /*
    public class ClassPathXmlApplicationContext implements ApplicationContext {
    private Map<String,Object> ioc = new HashMap<String, Object>();
    public ClassPathXmlApplicationContext(String path){
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read("./src/main/resources/"+path);
            Element root = document.getRootElement();
            Iterator<Element> iterator = root.elementIterator();
            while(iterator.hasNext()){
                Element element = iterator.next();
                String id = element.attributeValue("id");
                String className = element.attributeValue("class");
                //通过反射机制创建对象
                Class clazz = Class.forName(className);
                //获取无参构造函数，创建目标对象
                Constructor constructor = clazz.getConstructor();
                Object object = constructor.newInstance();
                //给目标对象赋值
                Iterator<Element> beanIter = element.elementIterator();
                while(beanIter.hasNext()){
                    Element property = beanIter.next();
                    String name = property.attributeValue("name");
                    String valueStr = property.attributeValue("value");
                    String ref = property.attributeValue("ref");
                    if(ref == null){
                        String methodName = "set"+name.substring(0,1).toUpperCase()+name.substring(1);
                        Field field = clazz.getDeclaredField(name);
                        Method method = clazz.getDeclaredMethod(methodName,field.getType());
                        //根据成员变量的数据类型将 value 进行转换
                        Object value = null;
                        if(field.getType().getName() == "long"){
                            value = Long.parseLong(valueStr);
                        }
                        if(field.getType().getName() == "java.lang.String"){
                            value = valueStr;
                        }
                        if(field.getType().getName() == "int"){
                            value = Integer.parseInt(valueStr);
                        }
                        method.invoke(object,value);
                    }
                    ioc.put(id,object);
                }
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        } catch (InvocationTargetException e){
            e.printStackTrace();
        } catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }

    public Object getBean(String id) {
        return ioc.get(id);
    }
}
     */
}
