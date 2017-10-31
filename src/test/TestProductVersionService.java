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
import com.neuedu.ssmdemo.service.ProductVersionService;

public class TestProductVersionService {
	private Logger logger = Logger.getRootLogger();
	private ApplicationContext context;
	private ProductVersionService service = null;
	@Before
	public void init(){
	 String configLocation = "applicationContext.xml";
	  context = new ClassPathXmlApplicationContext(configLocation);	 
	}
	@Test
	public void testFindAll(){
		//得到service接口对象
		service = context.getBean(ProductVersionService.class);
		List<ProductVersion> list = service.findAll();
		for(ProductVersion version : list){
			logger.info(version.getVersionNo()+""+version.getProduceDate());
		}
	}//end findAll
}
