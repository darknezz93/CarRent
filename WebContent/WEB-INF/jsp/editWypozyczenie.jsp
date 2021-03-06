    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
    <html>  
    <head>  
    <title>Edycja</title>  
    <style>
    
    header{
	text-align:center;
	background-color:rgba(252,252,232, 0.8);    #19A7FF
	height: 30px;
	padding:20px;
	margin: 0 auto;
	max-width:100%;
	font-family: Michroma;
	margin-top:-8px;
	margin-left:-8px;
	margin-right: -8px;
	
}

body{

	background-image:url("css/scena.jpg");
	background-size: cover;
}


#menu{
	background-color:##19A7FF;
    transition: background-color 0.4s ease;
    display:inline; 
    font-size:21px;
    padding:20px;
    margin-top:10px;

}

#rounded_box_1{
	background-color: rgba(252,252,232, 0.55);  rgba(252,252,232, 0.55)
	text-align: left;
	font-family: 'Patrick Hand SC', cursive;
	font-size:24px;
	color: #05011C;
	margin: 0 auto;
	width: 70%;
	height: 40%;
	margin-top: 100px;
	padding-top:7%;
	padding-bottom:7%;
	padding-left:30px;
	padding-right:30px;
	margin-bottom:50px;
	box-shadow: 6px 6px 10px gray;

}

#face_image{
	float: right;
	padding-left: 20px;
	padding-right: 10px;
	padding-top: 35px;
	padding-bottom:20px;
	margin-top:-90px;

}

a{
	text-decoration: none;
	color: black;
}

fieldset{
	font-family: Michroma;
	font-size: 24px;
	width: 500px;
	height: 50%;
	margin: 10% auto;	
	border-color: #FFFEC8;
	padding: 20px; 	
	background-color: rgba(252,252,232, 0.55) ;

}

label{
	margin: 6px;
	display: inline-block;
	vertical-align: top;
}

legend{
	font-weight: bold;
	color: rgb(255,255,255);
}

#email{
	margin-left:40px;
	width: 200px;
}

#message{
	width:350px;
	
}

textarea{
	height: 100px;
	margin-top:15px;
}

#send_button{
	margin-left:65%;
	height: 30px;
	font-family: Michroma;
}


.gallery img{
	margin: 5px;
	padding: 5px;
	width: 20%;
	border: solid 1px black;
	background: white;
	margin-left:9%;
	margin-bottom: 40px;
	margin-top: 60px;
	-moz-transition: all 0.7s;
	-webkit-transition: all 0.7s;
	-o-transition: all 0.7s;
}

.gallery img:hover{
	-webkit-transform: scale(1.5);
	-moz-transform: scale(1.5) ;
	-o-tranform: scale(1.5);
}




#rounded_box_2{
	background-color: rgba(252,252,232, 0.55);  rgba(252,252,232, 0.55)
	text-align: center;
	font-family: 'Patrick Hand SC', cursive;
	font-size:24px;
	color: #05011C;
	margin: 0 auto;
	width: 70%;
	height: 40%;
	margin-top: 50px;
	padding-top:4%;
	padding-bottom:7%;
	padding-left:30px;
	padding-right:30px;
	box-shadow: 6px 6px 10px gray;

}

#rounded_box_3{
	background-color: rgba(252,252,232, 0.55);  rgba(252,252,232, 0.55)
	text-align: center;
	font-family: 'Patrick Hand SC', cursive;
	font-size:24px;
	color: #05011C;
	margin: 0 auto;
	margin-bottom:50px;
	width: 40%;
	height: 40%;
	margin-top: 50px;
	padding-top:3%;
	padding-bottom:4%;
	padding-left:30px;
	padding-right:30px;
	box-shadow: 6px 6px 10px gray;

}


iframe{
	
	padding-top:100px;
	padding-bottom:50px;	
	padding-left:100px;
	margin-left:5%;
	text-align:center;
	width:640px;
	height:360px;
}


@media (max-width: 1366px){

	iframe{
	padding-top:100px;
	padding-left:100px;
	padding-bottom:50px;
	margin-left:5%;
	text-align:center;
	width:460px;
	height:280px;
}}


#resume_header{
	font-size: 28px;
	color: #F6FFB2;
	font-weight: bold;

}

#resume_content{
	font-size: 24px;
}
    
    </style> 
    </head>
    
    <center>
    <header>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getKlient">Klienci</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getSamochod">Samochody</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getMiejsce">Lokalizacje</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getPracownik">Pracownicy</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/getWypozyczenie">Wypożyczenia</a></div>
    <div id="menu"><a href = "http://localhost:8080/CarRent/registerWypozyczenie">Utwórz wypożyczenie</a></div>
	</header>
	</center>
	
	 <link href='http://fonts.googleapis.com/css?family=Michroma' rel='stylesheet' type='text/css'>
	 <link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
	 <script src="//code.jquery.com/jquery-1.10.2.js"></script>
	 <script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
	 <link rel="stylesheet" href="/resources/demos/style.css">
	 
	 
	  <script>
	  $(function() {
		$( "#data_wypozyczenia" ).datepicker({dateFormat: "yy-mm-dd"});
	  });
	 </script>
      
    <body>  
     <center>  
        
       
       
     <b>Edytowanie wypożyczenia</b>  
       
      
      <div>  
       <form:form method="post" action="updateWypozyczenie" modelAttribute="wypozyczenie">  
        <table> 
         <tr>  
          <td>Data wypozyczenia :</td>  
          <td><form:input path="data_wypozyczenia"  
            value="${map.wypozyczenie.data_wypozyczenia}" />  
          </td>  
         </tr> 
    
      <tr>   
      <td>Nazwisko klienta :</td>  
      <td><spring:bind path="nazwisko_klienta">  
        <select name="nazwisko_klienta">  
         <c:forEach items='${map.klient}' var='single_klient'>  
          <c:choose>  
           <c:when test="${single_klient.nazwisko eq map.wypozyczenie.nazwisko_klienta}">
            <option value="${single_klient.nazwisko}" selected="true">${single_klient.nazwisko}</option>
           </c:when>
           <c:otherwise>  
            <option value="${single_klient.nazwisko}">${single_klient.nazwisko}</option>  
           </c:otherwise>  
          </c:choose>  
         </c:forEach>  
        </select>  
       </spring:bind></td>  
     </tr>
     
     <tr>   
      <td>Nazwisko pracownika :</td>  
      <td><spring:bind path="nazwisko_pracownika">  
        <select name="nazwisko_pracownika">  
         <c:forEach items='${map.pracownik}' var='single_pracownik'>  
          <c:choose>  
           <c:when test="${single_pracownik.nazwisko eq map.wypozyczenie.nazwisko_pracownika}"> 
            <option value="${single_pracownik.nazwisko}" selected="true">${single_pracownik.nazwisko}</option>  
           </c:when>  
           <c:otherwise>  
            <option value="${single_pracownik.nazwisko}">${single_pracownik.nazwisko}</option>  
           </c:otherwise>  
          </c:choose>  
         </c:forEach>  
        </select>  
       </spring:bind></td>  
     </tr>
     
     <tr>   
      <td>Nazwa samochodu :</td>  
      <td><spring:bind path="nazwa_samochodu">  
        <select name="nazwa_samochodu">  
         <c:forEach items='${map.samochod}' var='single_samochod'>  
          <c:choose>  
           <c:when test="${single_samochod.marka eq map.wypozyczenie.nazwa_samochodu}">
            <option value="${single_samochod.marka}" selected="true">${single_samochod.marka}</option>  
           </c:when>  
           <c:otherwise>  
            <option value="${single_samochod.marka}">${single_samochod.marka}</option>  
           </c:otherwise>  
          </c:choose>  
         </c:forEach>  
        </select>  
       </spring:bind></td>  
     </tr>
     
     
     <tr>   
      <td>Miejsce odbioru :</td>  
      <td><spring:bind path="miejsce_ulica">  
        <select name="miejsce_ulica">  
         <c:forEach items='${map.miejsce}' var='single_miejsce'>  
          <c:choose>  
           <c:when test="${single_miejsce.ulica eq map.wypozyczenie.miejsce_ulica}"> 
            <option value="${single_miejsce.ulica}" selected="true">${single_miejsce.ulica}</option>  
           </c:when>  
           <c:otherwise>  
            <option value="${single_miejsce.ulica}">${single_miejsce.ulica}</option>  
           </c:otherwise>  
          </c:choose>  
         </c:forEach>  
        </select>  
       </spring:bind></td>  
     </tr>
   
 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Zapisz" />  
          </td>  
         </tr>  
        </table>  
        <form:hidden path="id_wypozyczenia" value="${map.wypozyczenie.id_wypozyczenia}" />  
      
       </form:form>  
      </div>  
     </center>  
    </body>  
    </html>  