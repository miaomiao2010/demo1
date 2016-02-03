package com.demo.module.store.control.front;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.module.store.repository.front.StoreMapper;
import com.demo.module.store.repository.front.StoreWithBLOBs;

@Controller
@RequestMapping("/store")
public class StoreController {

	@Resource(name ="storeMapper")
	private StoreMapper storeMapper;
	
	@RequestMapping(value = "/showStore",method=RequestMethod.GET)
	public String toIndex(HttpServletRequest request,Model model){
		Integer storeId = Integer.parseInt(request.getParameter("id"));
		StoreWithBLOBs store = storeMapper.selectByPrimaryKey(storeId);
		model.addAttribute("store", store);
		return "store/showStore";
	}
	
	@RequestMapping("/showStore/{id}")
	public String toStoreByid(HttpServletRequest request,Model model,@PathVariable("id") int id){
		//Integer storeId = Integer.parseInt(request.getParameter("id"));
		StoreWithBLOBs store = storeMapper.selectByPrimaryKey(id);
		model.addAttribute("store", store);
		return "store/showStore";
	}
	
	@RequestMapping("/store")
	public String NoShowStoreByid(HttpServletRequest request,Model model,@RequestParam("id") int id){
		//Integer storeId = Integer.parseInt(request.getParameter("id"));
		StoreWithBLOBs store = storeMapper.selectByPrimaryKey(id);
		model.addAttribute("store", store);
		return "store/showStore";
	}
}
