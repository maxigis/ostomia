<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
	<h1>LOGIN</h1>

	<h2>
		Hello
		
		<s:form action="login">
			<s:textfield key="user" label="Usuario"/>
			<s:textfield key="password" label="Contraseña"/>
			<s:submit key="Ingresar" name="submit" />
		</s:form>
	</h2>

</body>
</html>