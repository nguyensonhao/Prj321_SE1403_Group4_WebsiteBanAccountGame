<%-- 
    Document   : AddAccount
    Created on : Jul 10, 2020, 8:00:37 PM
    Author     : Nhat Cuong
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.User"%>
<%@page import="ModelDao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //declare variables
    String fullname = "";
    String username = "";
    String password = "";
    int age= 0;
    int phone=0;
    String email = "";
    String address = "";
    String date = "";
        
    //get all information of new account
    if (request.getParameter("uFullName") != null) {
        username = request.getParameter("uFullName");
    }
    if (request.getParameter("userName") != null) {
        username = request.getParameter("userName");
    }
    if (request.getParameter("password") != null) {
        password = request.getParameter("password");
    }
    if (request.getParameter("age") != null) {
        age = Integer.getInteger(request.getParameter("age"));
    }
    if (request.getParameter("phone") != null) {
        phone = Integer.getInteger(request.getParameter("phone"));
    }
    if (request.getParameter("email") != null) {
        email = request.getParameter("email");
    }
    if (request.getParameter("address") != null) {
        address = request.getParameter("address");
    }
    if (request.getParameter("date") != null) {
        date = request.getParameter("date");
    }
    
    session.setAttribute("fullname", fullname);
    session.setAttribute("userName", username);
    session.setAttribute("age", age);
    session.setAttribute("phone", phone);
    session.setAttribute("email", email);
    session.setAttribute("address", address);

    //change password
    String md_password = ModelDao.PasswordUtilities.getEncryptPassword(password);

    UserDao um = new UserDao();
    ArrayList<User> listU = um.LoadAccount(); //get all acocunt
    boolean checkUser = true;
    boolean checkEmail = true;
    //check username exits or not
    for (User u : listU) {
        if (username.equals(u.getUserName())) {
            checkUser = false;
        }
        if (email.equals(u.getuEmail())) {
            checkEmail = false;
        }
    }
    //if not exist

    if (checkUser && checkEmail) {
        um.insertAccount(fullname,username, password,age,phone, email, address,date);
        session.removeAttribute("txtUser");
        session.removeAttribute("fname");
        session.removeAttribute("lname");
        session.removeAttribute("website");
        session.removeAttribute("email");
        response.sendRedirect("index.jsp");
    
    } else { // if exist
        if (!checkUser) { // if exist

            response.sendRedirect("CreateAccount.jsp?checkUser=false");
        } else if(!checkEmail){
            response.sendRedirect("CreateAccount.jsp?checkEmail=false");
        }
    }
%>
