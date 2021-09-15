package com.spring.wefit.placeboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.placeboard.mapper.IPlaceBoardMapper;
import com.spring.wefit.util.PageVO;


@Service
public class PlaceBoardService implements IPlaceBoardService{

	@Autowired
	private IPlaceBoardMapper mapper;

	@Override
	public void regist(PlaceBoardVO vo) {
		mapper.regist(vo);
	}

	@Override
	public List<PlaceBoardVO> getList(PageVO vo) {
		
		List<PlaceBoardVO> list = mapper.getList(vo);
		
		for(PlaceBoardVO article : list) {
			//현재 시간 읽어오기
			long now = System.currentTimeMillis();
			//각 게시물들의 작성시간 읽어오기 (밀리초)
			long regTime = article.getPbRegDate().getTime();
			
			/*이틀이 지나지 않았는지 비교해서 newMark를 true로 처리
			if(now - regTime < 60 * 60 * 24 * 2 * 1000) {
				article.setNewMark(true);
			}
			*/
		}	
		return list;
	}

	@Override
	public int getTotal(PageVO vo) {
		return mapper.getTotal(vo);
	}

	@Override
	public PlaceBoardVO getContent(int pbNum) {
		return mapper.getContent(pbNum);
	}

	@Override
	public void update(PlaceBoardVO vo) {
		mapper.update(vo);
		
	}

	@Override
	public void delete(int pbNum) {
		mapper.delete(pbNum);
		
	}


	
}
