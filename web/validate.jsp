<%-- 
    Document   : validate
    Created on : 2016-okt-04, 17:38:09
    Author     : Reimondo
--%>

<%@page import="Logic.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Logic.LookUser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Webshop</h1>
        <%
            Class c = Class.forName("com.mysql.jdbc.Driver");
            LookUser infoUser = new LookUser(); //this object needs to be closed
            ArrayList<User> users = new ArrayList<User>();
            boolean user = false;
            users = infoUser.getAllUsers();
            for (int index = 0; index < users.size(); index++) {
                if (users.get(index).getName().equals(request.getParameter("username"))) {
                    if (users.get(index).getPassword().equals(request.getParameter("password"))) {
                        out.println("rätt FKN lösen");
                        out.println("<br>");
                        infoUser.close();
                        user = true;
                    }
                }
            }

            if (user) {
                %>
                     
                <%
            } else if (!user) {
                out.print("Bad Username or password</b>");
                out.print("<a href='http://localhost:8080/distro1/inlog.jsp/inlog.jsp' > go back </a> ");
            }
        %>
    </body>
</html>
