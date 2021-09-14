package com.spring.wefit.placeboard.service;

import java.util.List;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.util.PageVO;

public interface IPlaceBoardService {

	//글 등록
	void regist(PlaceBoardVO vo);

	//글 목록
	List<PlaceBoardVO> getList(PageVO vo);

	//총 게시물 수
	int getTotal(PageVO vo);

	//상세보기
	PlaceBoardVO getContent(int pbNum);

	//수정
	void update(PlaceBoardVO vo);

	//삭제
	void delete(int pbNum);
}
