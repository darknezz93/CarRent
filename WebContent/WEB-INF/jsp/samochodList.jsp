     <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    <%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
    <html>  
    <head>  
    <title>Lista samochodów</title>  
    <style>  
    body {  
     font-size: 20px;  
     color: teal;  
     font-family: Calibri;  
    }  
      
    td {  
     font-size: 15px;  
     color: black;  
     width: 100px;  
     height: 22px;  
     text-align: center;  
    }  
    .heading {  
     font-size: 18px;  
     color: white;  
     font: bold;  
     background-color: green;  
     border: thick;  
    }
    
     .heading_1 {  
     font-size: 18px;  
     color: yellow;  
     font: bold;  
     background-color: green;  
     border: thick;  
    }
    
     .heading_2 {  
     font-size: 18px;  
     color: white;  
     font: bold;  
     background-color: #F1D568;  
     border: thick;  
    }
    
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

input {
  border:solid 1px #ccc;
  border-radius: 5px;
  padding:7px 14px;
  margin-bottom:10px
}   
    </style>
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<link href='http://fonts.googleapis.com/css?family=Michroma' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Patrick+Hand+SC' rel='stylesheet' type='text/css'>
    <link rel = "stylesheet" type="text/css" href= href="<%=request.getContextPath()%>/src/main/css/style.css"/>
    
    <script type = "text/javascript"  src = "CarRent/js/jquery.js"></script>
	<script type = "text/javascript"  src = "CarRent/js/moja_strona.js"></script>
	<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>  
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
    
     
    <body>  
     <center>  
             
     <b>Samochody<br></b>  
       
      <input id="search" placeholder="Marka..." />
      <table border="1">  
       <tr>  
        <td class="heading">Samochod Id</td>  
        <td class="heading">Cena za dobe</td>  
        <td class="heading">Marka</td>  
        <td class="heading">Rok produkcji</td>  
        <td class="heading">Kolor</td>  
        <td class="heading">Przebieg</td>  
        <td class="heading">Pojemność silnika</td> 
        <td class="heading_1">Edytuj</td>  
        <td class="heading_1">Usun</td>    
       </tr>  
       <c:forEach var="samochod" items="${samochodList}">  
        <tr>  
         <td>${samochod.id_samochodu}</td>  
         <td>${samochod.cena_za_dobe}</td>  
         <td id="marka">${samochod.marka}</td>  
         <td>${samochod.rok_produkcji}</td>  
         <td>${samochod.kolor}</td>
         <td>${samochod.przebieg}</td>
         <td>${samochod.pojemnosc_silnika}</td>  
         <td><a href="editSamochod?id=${samochod.id_samochodu}">Edytuj</a></td>  
         <td><a href="deleteSamochod?id=${samochod.id_samochodu}">Usun</a></td>  
        </tr> 
       </c:forEach>  
       <tr class="heading_2"><td colspan="10"><a href="registerSamochod">Dodaj nowy samochód</a></td></tr>  
      </table> 
      
      
      </br>
      <div>  
       <form:form method="post" action="getPrzebieg" modelAttribute="przebieg">  
      <tr> 
          <td> </td>  
          <td><input type="submit" value="Sprawdź łączny przebieg" /></td>  
       </tr> 
       </form:form>
       </div>
      
     </center>  
    </body>  
    </html>
    
   <script>
    $("#search").keyup(function() {
        var value = this.value;

        $("table").find("tr").each(function(index) {
            if (!index) return;
            var id = $(this).find("#marka").first().text();
            $(this).toggle(id.indexOf(value) !== -1);
        });
    });
    </script>   