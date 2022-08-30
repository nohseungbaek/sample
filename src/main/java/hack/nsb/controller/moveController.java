package hack.nsb.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class moveController {
private static final Logger logger = LoggerFactory.getLogger(moveController.class);
	
	/*사용자별 메인페이지*/
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String goMain(Locale locale, Model model) {
		logger.info("유저페이지 이동", locale);
		
		return "main";
	}

	@RequestMapping(value = "/adminMain.do", method = RequestMethod.GET)
	public String goAdminMain(Locale locale, Model model) {
		logger.info("관리자페이지 이동", locale);
		
		return "adminMain";
	}
	
	/*레저 예약*/
	@RequestMapping(value = "/reserve.do", method = RequestMethod.GET)
	public String doReserve(Locale locale, Model model) {
		logger.info("예약페이지 이동", locale);
		
		return "reserve";
	}
	
	@RequestMapping(value = "/reserveList.do", method = RequestMethod.GET)
	public String getReserveList(Locale locale, Model model) {
		logger.info("예약내역페이지 이동", locale);
		
		return "reserveList";
	}
	
	/*레저 지수*/
	@RequestMapping(value = "/chkWeather.do", method = RequestMethod.GET)
	public String chkWeather(Locale locale, Model model) {
		logger.info("날씨확인페이지 이동", locale);
		
		return "chkWeather";
	}
	@RequestMapping(value = "/getLeisureIndex.do", method = RequestMethod.GET)
	public String getLeisureIndex(Locale locale, Model model) {
		logger.info("레저지수페이지 이동", locale);
		
		return "getLeisureIndex";
	}

	/*레저 상품*/
	@RequestMapping(value = "/findLeisure.do", method = RequestMethod.GET)
	public String findLeisure(Locale locale, Model model) {
		logger.info("레저상품페이지 이동", locale);
		
		return "findLeisure";
	}
	@RequestMapping(value = "/recomandLeisure.do", method = RequestMethod.GET)
	public String recomandLeisure(Locale locale, Model model) {
		logger.info("추천상품페이지 이동", locale);
		
		return "recomandLeisure";
	}
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("MOVE3", locale);
		
		return "/login";
	}
}

