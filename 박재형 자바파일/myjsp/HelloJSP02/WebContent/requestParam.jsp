<%@page import="mytest.myjava.Students"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="mytest.myjava.Customer" %>
    <%@page import="mytest.myjava.Student" %>
    
    <%@page import ="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%! String name, pw, major, protocol;
	String [] hobbys;
	%>
	

	
	<%! public String korHobby(String[] hobbys){
		
		String hobby = "";
		for(int i = 0; i<hobbys.length;i++){
			switch(hobbys[i]){
			case "cook":
				hobby+="요리";
				break;
			case "run":
				hobby+="달리기";
				break;
			case "swim":
				hobby+="수영";
				break;
			case "sleep":
				hobby+="잠자기";
				break;	
			}
			if(i!=hobbys.length-1)//마지막 인덱스 아닐때
				hobby+=",";	
		}
		return hobby;
	}

	%>
	
	<%!
		public String korMajor(String major){
		
		/* String majors = "";
			switch(major){
			case "math":
				majors+="수학";
				break;
			case "eng":
				majors+="영어";
				break;
			case "kor":
				majors+="국어";
				break;
			}
		return majors; */
		
		if(major.equals("eng"))
			return "영어";
		else if(major.equals("math"))
			return "수학";
		else if(major.equals("kor"))
			return "국어";
		else
			return major;
		
	}
	%>
	
		
	
	
	<%
		request.setCharacterEncoding("UTF-8");
	
		name = request.getParameter("name");
		pw = request.getParameter("pw");
		major = request.getParameter("major");
		protocol = request.getParameter("protocol");
		hobbys = request.getParameterValues("hobbys");//배열형태로 값줌
	//Arrays.toString(hobbys)		
	//major

	%>
	
	<%
		Student s = new Student();
		s.setName(name);
		s.setMajor(major);
		s.setPw(pw);
		s.setHobby(hobbys);
		s.setProtocol(protocol);
	%>
	
	
	이름: <%=s.getName() %><br>
	비번: <%=pw %><br>
	전공: <%=korMajor(major) %><br>
	규약: <%=protocol %><br>
	취미: <%=korHobby(hobbys) %><br>
	
	
	
	<hr>
	<%!Students s1 = new Students(); %>
	<%
		s1.setName(name);
	s1.setPw(pw);
	s1.setMajor(major);
	s1.setProtocol(protocol);
	s1.setHobby(hobbys);

	%>

	이름: <%=s1.getName() %><br>
	비번: <%=s1.getPw() %><br>
	전공: <%=s1.getMajor() %><br>
	규약: <%=s1.getProtocol() %><br>
	취미: <%=s1.getHobby() %><br>	
	

</body>
</html>