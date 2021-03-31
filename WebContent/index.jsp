
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="/struts-tags" prefix="html"%>

<h1>Calculation form</h1>
<html:form action="cal">
<html:textfield name="fn" lable="FirstNumber"/>
<html:textfield name="sn" lable="SecondNumber"/>
<html:submit value="add" action="addcal"/> 
<html:submit value="sub" action="subcal"/>
<html:submit value="mul" action="mulcal"/>
<html:submit value="div" action="divcal"/>
</html:form>

