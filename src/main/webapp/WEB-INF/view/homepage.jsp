<%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <body>
    <spring:message code="homePage.welcome"/>
    <br><br>
    <spring:message code="homePage.language"/> :
     <a href="?lang=en"><spring:message code="homePage.english"/> :</a> |
     <a href="?lang=pl"><spring:message code="homePage.polish"/> :</a>
    </body>
</html>


