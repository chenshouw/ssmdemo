package test;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neuedu.ssmdemo.bean.ProductVersion;
import com.neuedu.ssmdemo.mapper.ProductVersionMapper;

public class TestProductVersionMapper {
	private Logger logger = Logger.getRootLogger();
	private ApplicationContext context;
	private SqlSessionFactory sesssionFactory;
	private ProductVersionMapper mapper = null;
	@Before
	public void init(){
	 String configLocation = "applicationContext.xml";
	  context = new ClassPathXmlApplicationContext(configLocation);	 
	  sesssionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
	}
	@Test
	public void testFindAll(){
		//得到mapper接口对象
		mapper = sesssionFactory.openSession().getMapper(ProductVersionMapper.class);
		List<ProductVersion> list = mapper.findAll();
		for(ProductVersion version : list){
			logger.info(version.getVersionNo()+""+version.getProduceDate());
		}
	}//end findAll
}
