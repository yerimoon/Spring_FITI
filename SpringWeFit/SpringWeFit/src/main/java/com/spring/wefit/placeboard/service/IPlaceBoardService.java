package com.spring.wefit.placeboard.service;

import java.util.List;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.util.PageVO;

public interface IPlaceBoardService {

	//식단 글 등록
	void regist(PlaceBoardVO vo);

	//식단 글 목록
	List<PlaceBoardVO> getList(PageVO vo);

	//식단 총 게시물 수
	int getTotal(PageVO vo);

	//식단 글 상세보기
	PlaceBoardVO getContent(int pbNum);

	//식단 글 수정
	void update(PlaceBoardVO vo);

	//식단 글 삭제
	void delete(int pbNum);

	Object getList();
	
	

}
