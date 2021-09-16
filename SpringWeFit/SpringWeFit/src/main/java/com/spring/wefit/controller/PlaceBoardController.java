package com.spring.wefit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.wefit.command.PlaceBoardVO;
import com.spring.wefit.placeboard.service.IPlaceBoardService;
import com.spring.wefit.util.PageCreator;
import com.spring.wefit.util.PageVO;

@Controller
@RequestMapping("/location")
public class PlaceBoardController {

	@Autowired 
	private IPlaceBoardService service;
	
	//장소 목록 화면
	@GetMapping("/placeList")
	public String placeList(Model model) {
		System.out.println("/board/dietList: GET");
		model.addAttribute("placeList", service.getList());
		return "/board/location/loc_board";
	}
	
		
	//글쓰기 화면 처리
	@GetMapping("/placeWrite")
	public String placeWrite() {
		System.out.println("/loc_write 요청");
		return "/board/location/loc_write";
	}
	

	//글 등록 처리
	@PostMapping("/placeWrite")
	public String placeWrite(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/placeWrite: POST");
		service.regist(vo);
		ra.addFlashAttribute("msg", "정상 등록 처리되었습니다.");
			
		return "redirect:/board/location/loc_board"; //등록 후에 글 목록 요청으로 리다이렉트
	}

	
	//글 상세보기 처리
	@GetMapping("/loc_detail")
	public String placeContent(@RequestParam int pbNum, Model model) {
		System.out.println("/board/placeContent: GET");
		System.out.println("요청된 글 번호: " + pbNum);
		
		model.addAttribute("placeList", service.getContent(pbNum));
		return "";
	}
		
			
	//글 수정 페이지 이동
	@GetMapping("/loc_modify")
	public void modify(@RequestParam int pbNum, Model model) {
		System.out.println("/board/placeModify: GET");
		System.out.println("요청된 글 번호: " + pbNum);
		
		model.addAttribute("placeList", service.getContent(pbNum));
	}
		
	//글 수정 처리
	@PostMapping("/placeUpdate")
	public String placeUpdate(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/placeUpdate: POST");
		service.update(vo);
		ra.addFlashAttribute("msg", "정상 수정 처리되었습니다.");
			
		return "redirect:/location/loc_detail?pbNum=" + vo.getPbNum();
	}
	
	//글 삭제 처리
	@PostMapping("/placeDelete")
	public String placeDelete(PlaceBoardVO vo, RedirectAttributes ra) {
		System.out.println("/board/placeUpdate: POST");
		service.delete(vo.getPbNum());
		ra.addFlashAttribute("msg", "게시글이 정상 삭제되었습니다.");
			
		return "redirect:/board/location/loc_board";
	}	
		
	
	
	
}
