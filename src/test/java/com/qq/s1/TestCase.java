package com.qq.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qq.notice.NoticeDAO;


public class TestCase extends TestAbstract{

	@Inject
	private NoticeDAO noticeDAO;
	
	
	@Test
	public void test() {
		
		assertNotNull(noticeDAO);
	}

}
