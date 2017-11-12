<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.ResourceBundle"%>
<%@page import="java.util.Locale"%>
<%

String lang = request.getHeader("accept-language");

Locale locale = new Locale(lang);



ApplicationContext app =  new ClassPathXmlApplicationContext("resources/spring.xml");


String name = app.getMessage("lable", null, locale);
%>
<form action="./hello">
<%=name%> <input type="text" name="uname">
<input type="submit" value="submit">
</form>
