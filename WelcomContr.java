package com.offcn;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
public class WelcomContr {
   	
   @RequestMapping
   public String weluuu(Model model){
	   model.addAttribute("msg", "ͨ��ע��õ��Ŀ�������");
	   return "index";
   }
   
   
   @RequestMapping(value="/welcom1")	
   public String weluu1(Model model){
	   model.addAttribute("msg", "ͨ��ע��õ��Ŀ�����1��");
	   return "user/login";
   }
   
   //��ʽ��springmvc001/action2/1/3
   @RequestMapping("/action2/{p1}/{p2}")	
   public String wel2(Model model,@PathVariable int p1,@PathVariable int p2){
	   model.addAttribute("msg", "p1:"+p1+"---p2:"+p2);
	   return "index";
   }
   
   
   @RequestMapping(value="/action3/{id:\\d{3}}-{name:[a-z]{2}}")	
   public String wel3(Model model,@PathVariable int id,@PathVariable String name){
	   model.addAttribute("msg", "id:"+id+"---name:"+name);
	   return "index";
   }
   
   
   @RequestMapping(value="/action4?/**/*")	
   public String wel4(Model model){
	   model.addAttribute("msg", "ant���");
	   return "index";
   }
   
   //ν�ʣ�����ʽ
   @RequestMapping(value="/action5",method={RequestMethod.GET})	
   public String wel5(Model model){
	   model.addAttribute("msg", "ant���");
	   return "index";
   }
   
   @RequestMapping(path={"/myqction","/action6"})	
   public String wel6(Model model){
	   model.addAttribute("msg", "ant���");
	   return "index";
   }
   
   
   
   
   
   
   
   
   
   
   
   
}
