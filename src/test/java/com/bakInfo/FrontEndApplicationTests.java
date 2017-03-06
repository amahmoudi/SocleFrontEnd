package com.bakInfo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.bakInfo.configuration.AppConfig;
import com.bakInfo.configuration.ORMConfiguration;
import com.bakInfo.dao.daoJdbcSpring.GenericJdbcRepository;
import com.bakInfo.model.PersistentLogin;
import com.bakInfo.model.User;
import com.bakInfo.model.UserProfile;
import com.bakInfo.service.IGenericService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FrontEndApplication.class)
@WebAppConfiguration
public class FrontEndApplicationTests {

	@Test
	public void contextLoads() {}

}
