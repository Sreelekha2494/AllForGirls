
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body background color:black>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<br>
<br>
<br>
<br>
<div class="container" >
<br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel"  >
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox" style="width:600px;height:500px" >
      <div class="item active">
        <img src="<c:url value="/resources/images/beauty.jpg"/>" alt="Beauty"     align="center">
        <div class="carousel-caption">
          <h3>Beauty</h3>
        </div>
      </div>
      <div class="item">
        <img src="<c:url value="/resources/images/Clothing.jpg"/>" alt="clothing"  align="center">
        <div class="carousel-caption">
          <h3>Clothing</h3>
        </div>
      </div>    
      <div class="item">
        <img src="<c:url value="/resources/images/High-heels.jpg"/>" alt="Footwear"   align="center">
        <div class="carousel-caption">
          <h3>Footwear</h3>
        </div>
      </div>
      </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

  <br>

  <hr>
<div class="container-fluid">
<div class="row top-buffer"> </div> 
      <div class="container">
          <div class="row">
                  <div class="col-lg-4"><img src="<c:url value="/resources/images/Haircare.jpg"/>" class="img-circle" width="300" height="250" align="center" >
                  <h3 style="text-align:center;">Flat 20% off on Hair Care products</h3> 
                  </div>
                     
                  <div class="col-lg-4"><img src="<c:url value="/resources/images/Cosmetics.jpg"/>" class="img-circle"  width="300" height="250" align="center">
                  <h3 style="text-align:center;">Today's Deals on Cosmetics</h3> 
                  </div>         
                           
                  <div class="col-lg-4"><img src="<c:url value="/resources/images/heels.jpg"/>" class="img-circle"  width="300" height="250" align="center" >
                  <h3 style="text-align:center;">Upto 50% off Footwear</h3> 
                  </div>
                    
          </div>
      </div>    
      </div>

		<%@include file="/WEB-INF/views/template/footer.jsp" %>
</body>
</html>