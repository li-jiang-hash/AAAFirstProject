package com.aaa.project.servlet.module;

import com.aaa.project.entity.User;
import com.aaa.project.service.api.UserService;
import com.aaa.project.service.impl.UserServiceImpl;
import com.aaa.project.servlet.base.ModelBaseServlet;
import com.aaa.project.util.ImperialCourtConst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:江Sir
 * @Date:22 2022/08/22 21:03
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/auth")
public class LoginServlet extends ModelBaseServlet {

    private UserService userService = new UserServiceImpl();
    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginAccount =request.getParameter("loginAccount");
        String loginPassword =request.getParameter("loginPassword");

        User user = userService.getUidByLoginAccount(loginAccount,loginPassword);
        HttpSession session = request.getSession();
        session.setAttribute(ImperialCourtConst.LOGIN_EMP_ATTR_NAME, user);
        response.sendRedirect(request.getContextPath()+"inde");
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doPost(request, response);
//    }
}
