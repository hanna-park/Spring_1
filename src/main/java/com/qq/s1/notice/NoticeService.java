package com.qq.s1.notice;

import java.util.List;

public class NoticeService {

	private NoticeDAO noticeDAO;
	
	public NoticeService() {
		noticeDAO = new NoticeDAO();
	}
	
	public List<NoticeDTO> noticeList() throws Exception {
		
		List<NoticeDTO> ar = noticeDAO.noticeList();
		
		return ar;
	}
	
	public NoticeDTO selectOne(int num) throws Exception{
		
		NoticeDTO noticeDTO = noticeDAO.selectOne(num);
		
		return noticeDTO;
		
	}
	
}
