package com.qq.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class NoticeService {

	
	@Inject
	private NoticeDAO noticeDAO;
	
	
	public List<NoticeDTO> noticeList() throws Exception {
		
		List<NoticeDTO> ar = noticeDAO.noticeList();
		
		return ar;
	}
	
	public NoticeDTO selectOne(int num) throws Exception{
		
		NoticeDTO noticeDTO = noticeDAO.selectOne(num);
		
		return noticeDTO;
		
	}
	
}
