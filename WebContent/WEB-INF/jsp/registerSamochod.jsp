    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    <%@page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
    <html>  
    <head>
    
    
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
    
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  
    <link href='http://fonts.googleapis.com/css?family=Michroma' rel='stylesheet' type='text/css'>
    <link rel = "stylesheet" type="text/css" href= href="<%=request.getContextPath()%>/src/main/css/style.css"/>
    
    <script type = "text/javascript"  src = "CarRent/js/jquery.js"></script>
	<script type = "text/javascript"  src = "CarRent/js/moja_strona.js"></script>
	
	<script type="text/javascript">
            function validate()
            {
                var cena = document.getElementById("cena");
                var marka = document.getElementById("marka");
                var rok = document.getElementById("rok");
                var kolor = document.getElementById("kolor");
                var przebieg = document.getElementById("przebieg");
                var silnik = document.getElementById("silnik");
                
                var cenaVal = document.getElementById("cena").value;
                var markaVal = document.getElementById("marka").value;
                var rokVal = document.getElementById("rok").value;
                var kolorVal = document.getElementById("kolor").value;
                var przebiegVal = document.getElementById("przebieg").value;
                var silnikVal = document.getElementById("silnik").value;

                var valid = true;
                if(cena.value.length<=0 || marka.value.length<=0 || rok.value.length<=0 || kolor.value.length<=0 || przebieg.value.length<=0 || silnik.value.length<=0)
                    {
                        alert("Nie zostawiaj pustych pól!");
                        valid = false;
                    }
                    else{
                        if(isNaN(cenaVal))
                        {
                            alert("Wprowadź poprawnie cenę.");
                    		valid = false;
                        }
                        else if(isNaN(rokVal))
                        	{
                        		alert("Podaj poprawną wartość Roku produkcji.")
                        		valid = false;
                        	}
                        else if(isNaN(przebiegVal))
                        	{
                        		alert("Podaj poprawną wartość Przebiegu.");
                        		valid = false;
                        	}
                        else if(isNaN(silnikVal))
                        	{
                        		alert("Podaj poprawną wartość Pojemności silnika.");
                        		valid = false;
                        	}
                        else if(!isNaN(markaVal))
                        	{
                        		alert("Podaj poprawną wartość Marki samochodu.");
                        		valid = false;
                        	}
                        else if(!isNaN(kolorVal))
                        	{
                        		alert("Podaj poprawną wartość Koloru samochodu.");
                        		valid = false;
                        	}
                        else if(rokVal.length != 4)
                        	{
                        		alert("Rok produkcji musi składac się z 4 cyfr.");
                        		valid = false;
                        	}
                }
                return valid;
            };

        </script>
	 
      
    <title>Dodawanie samochodu</title>  
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
     <b>Dodaj nowy samochód</b>   
         
      <div>  
       <form:form method="post" action="insertSamochod" modelAttribute="samochod" onsubmit="return validate()">  
        <table>  
         <tr>  
          <td>Cena za dobe :</td>  
          <td><form:input path="Cena_za_dobe" required="true" id="cena" type="number" /></td>  
         </tr>  
         <tr>  
          <td>Marka :</td>  
          <td><form:input path="marka" required="true" id="marka" /></td>  
         </tr>  
         <tr>  
          <td>Rok produkcji :</td>  
          <td><form:input path="rok_produkcji" required="true" id="rok" type="number" /></td>  
         </tr>   
         <tr>  
          <td>Kolor :</td>  
          <td><form:input path="kolor" required="true" id="kolor"  /></td>  
         </tr>
         <tr>  
          <td>Przebieg :</td>  
          <td><form:input path="przebieg" required="true" id="przebieg" type="number" /></td>  
         </tr>
         <tr>  
          <td>Pojemnosc silnika :</td>  
          <td><form:input path="pojemnosc_silnika" required="true" id="silnik"/></td>  
         </tr>
         <tr> 
          <td> </td>  
          <td><input type="submit" value="Zapisz" /></td>  
         </tr>  
         <tr>  
            
          <td colspan="10"><a href="getSamochod">Zobacz wszystkie samochody</a></td>  
         </tr>  
        </table>  
       </form:form>  
      </div>
      </center>
   
      
    
            
    
    </body>  
    </html>  