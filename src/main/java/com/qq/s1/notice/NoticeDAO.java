package com.qq.s1.notice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.qq.util.DBConnector;

public class NoticeDAO {
	
	
	public void update() throws Exception{
		
		Connection con = DBConnector.getConnect();
		String sql = "update notice set title=?, contents=? where num=?";
		
		
	}
	
	
	public NoticeDTO selectOne(int num) throws Exception{
		NoticeDTO noticeDTO = null;
		
		Connection con = DBConnector.getConnect();
		
		String sql = "select * from notice where num=?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, num);
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			noticeDTO =new NoticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setHit(rs.getInt("hit"));
		
		}
		
		rs.close();
		st.close();
		con.close();
		
		return noticeDTO;
	}
	
	

	public List<NoticeDTO> noticeList() throws Exception{
		ArrayList<NoticeDTO> ar = new ArrayList<NoticeDTO>();
		Connection con = DBConnector.getConnect();
		
		String sql = "select * from notice order by num desc";
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNum(rs.getInt("num"));
			noticeDTO.setTitle(rs.getString("title"));
			noticeDTO.setWriter(rs.getString("writer"));
			noticeDTO.setContents(rs.getString("contents"));
			noticeDTO.setReg_date(rs.getDate("reg_date"));
			noticeDTO.setHit(rs.getInt("hit"));
			ar.add(noticeDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}
	
}
