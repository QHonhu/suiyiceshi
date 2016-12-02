package controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jenius.web.dao.MybatisDao;
import com.jenius.web.dao.impl.Dao;
import com.jenius.web.dao.impl.JdbctemplateDao;
import com.jenius.web.meta.Bylist;
import com.jenius.web.meta.Person;
import com.jenius.web.meta.Product;
import com.jenius.web.meta.ProductList;

import net.sf.json.JSONObject;


public class Login {
	
}