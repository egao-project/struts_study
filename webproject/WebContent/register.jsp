<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html>
<head>
<title>ユーザ登録画面</title>
</head>
<body>
<html:errors/>
<html:form action="/register" method="post">
ユーザID : <html:text property="userId"/><br>
パスワード: <html:password property="password"/><br>
<html:submit value="登録"/>
</html:form>
</body>
</html:html>