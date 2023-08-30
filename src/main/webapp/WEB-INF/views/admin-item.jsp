<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>관리자-회원 관리</title>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" id="montserrat-css"
          href="https://fonts.googleapis.com/css?family=Montserrat:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <link rel="stylesheet" id="open-sans-css"
          href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i">

    <link rel="stylesheet" id="animate-css" href="<c:url value="/css/animate.min.css?ver=3.7.2"/>" type="text/css" media="all">
    <link rel="stylesheet" id="font-awesome-css" href="<c:url value="/css/font-awesome.min.css?ver=5.15.4"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="bootstrap-css" href="<c:url value="/css/bootstrap.min.css?ver =4.6.0"/>" type="text/css" media="all">
    <link rel="stylesheet" id="smartmenus-bootstrap-css" href="<c:url value="/css/smartmenus-bootstrap.min.css?ver=1.1.1"/>"
          type="text/css" media="all">
    <link rel="stylesheet" id="swiper-css" href="<c:url value="/css/swiper.min.css?ver=4.5.3"/>" type="text/css" media="all">
    <link rel="stylesheet" id="magnific-popup-css" href="<c:url value="/css/magnific-popup.min.css?ver=1.1.0"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-icon-css" href="<c:url value="/css/lana-pet-icon.min.css?ver=1.0.0"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-theme-css" href="<c:url value="/css/lana-pet-theme.min.css?ver=1.0.0"/>" type="text/css"
          media="all">
    <link rel="stylesheet" id="lana-pet-print-css" href="<c:url value="/css/lana-pet-print.min.css?ver=1.0.0"/>" type="text/css"
          media="print">
  
          

 
</head>
<style>
#button{
	display: flex;
	justify-content: center;
	align-items center;
	padding-bottom: 2em;
	
}

</style>
<body class="archive post-type-archive post-type-archive-lana_story">
<jsp:include page="header.jsp" />
<main class="main container">
    <div class="row">
        <div class="col-12 col-lg-8">
         <div class="widget">
        
           
                
            <div class="story-posts">
              
<section>
<!-- my-page style-->
<style>

h3 {
	font-size : 20px;
}

table {
  width: 680px;
  text-align: center;
  border: 1px solid #fff;
  border-spacing: 1px;
margin: auto;
}


table td {
  padding: 10px;
  background-color: #d9d6d6;
}

table th {
  background-color: #beb9b9bc;
  color: #fff;
  padding: 10px;
}


.delete {

  border: none;
  padding: 5px 10px;
  color: #000;
  font-weight: bold;
}



.delete {
  background-color: #ffffff;
  border-radius : 20px;
  border: 1px solid #ffb32f;
}
.tablefoot {
  padding: 0;
  border-bottom: 3px solid #d9d6d6;
}

.pagination {
	margin-top : 20px;
    display: flex;
    padding-left: 0;
    list-style: none;
    border-radius: 0.25rem;
    justify-content: space-around;
}

   .pagination a, .pagination span {
        margin: 0 5px;
        text-decoration: none;
        color: black;
    }
    .pagination .current {
        color: orange;
    }
    .pagination .disabled {
        color: gray;
    }

</style>
<!-- 스타일 태그 끝 -->

   <form name="itemForm" method="post" action="/admin/item">
      <label style = "color : #fdbb42; font-size : 24px; margin-bottom : 30px;">상품 관리</label>
        
         <table>
    
    <thead>
        <tr>
            <th>상품번호</th>
            <th>상품이름</th>
            <th>카테고리</th>
            <th>등록날짜</th>
            <th>관리</th>
        </tr>
    </thead>
    	
    				<c:forEach var="item" items="${itemList}">
		<tr>
			<td >${item.itemIdx}</td>
			
			
		  <td>
            <c:choose>
                <c:when test="${item.itemName.length() > 10}">
                    <c:set var="trimmedText" value="${fn:substring(item.itemName, 0, 15)}" />
                    <c:set var="lastSpaceIndex" value="${trimmedText.lastIndexOf(' ')}" />
                    ${fn:substring(item.itemName, 0, lastSpaceIndex)}
                </c:when>
                <c:otherwise>
                    ${item.itemName}
                </c:otherwise>
            </c:choose>
        </td>
			
			<td>${item.categoryIdx}</td>
			<td>
			<fmt:formatDate pattern="yyyy-MM-dd" value ="${item.itemDate}"/>
			</td>
			<td >
			<button class="delete" type="button" onclick="updateItemIdx('${item.itemIdx}');">삭제</button>
			</td>
			
		</tr>
		</c:forEach>
    		
    <tfoot>
        <td colspan="5" class="tablefoot"></td>
    </tfoot>
</table>
    
<div class="pagination">
    <div class="prev">
        <c:choose>
            <c:when test="${pager.startPage > pager.blockSize}">
                <a href="<c:url value="/admin/item"/>?pageNum=${pager.prevPage}">PREV</a>
            </c:when>
            <c:when test="${pager.pageNum > 1}">
                <a href="<c:url value="/admin/item"/>?pageNum=${pager.pageNum - 1}">PREV</a>
            </c:when>
            <c:otherwise>
                <span class="disabled">PREV</span>
            </c:otherwise>
        </c:choose>
    </div>

    <div class="pages">
        <c:forEach var="i" begin="${pager.startPage}" end="${pager.endPage}" step="1">
            <c:choose>
                <c:when test="${pager.pageNum != i}">
                    <a href="<c:url value="/admin/item"/>?pageNum=${i}">${i}</a>
                </c:when>
                <c:otherwise>
                    <span class="current">${i}</span>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </div>

    <div class="next">
        <c:choose>
            <c:when test="${pager.endPage != pager.totalPage}">
                <a href="<c:url value="/admin/item"/>?pageNum=${pager.nextPage}">NEXT</a>
            </c:when>
            <c:when test="${pager.pageNum < pager.totalPage}">
                <a href="<c:url value="/admin/item"/>?pageNum=${pager.pageNum + 1}">NEXT</a>
            </c:when>
            <c:otherwise>
                <span class="disabled">NEXT</span>
            </c:otherwise>
        </c:choose>
    </div>
</div>	
    </form>
</section>
        
                  </div>
            
            </div>
        </div>
      
        <div class="col-12 col-lg-4 mt-4 mt-lg-0">
            <div class="widget-sidebar story-sidebar">
            
            <div id="button"><img src="<c:url value="/pictures/placeholder/250x250.svg"/>"
               class="img-fluid rounded-circle mr-1 w-auto" alt="Author"></div>
              
                  
                       <div id="button"><a href="#" class="tag-cloud-link" aria-label="idbutton">관리자</a>
                       
                  
               </div>
               <div class="widget widget_tag_cloud">
                  
                    <div class="tagcloud">
                  
            <div class="row" >
                <div class="widget">
               
                    <ul>
                    <li><a href="<c:url value="/admin/user"/>">회원 관리</a></li>
                        <li><a href="<c:url value="/admin/item"/>">상품 관리</a></li>
                      
                    </ul>
                </div>
               
                  </div>
                </div>
            </div>
        </div>
    </div>
</main>
	<jsp:include page="footer.jsp" />
<script type="text/javascript" src="<c:url value="/js/jquery.min.js?ver=3.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/popper.min.js?ver=1.16.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/bootstrap.min.js?ver=4.6.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/smartmenus-bootstrap.min.js?ver=1.1.1"/>"></script>
<script type="text/javascript" src="<c:url value="/js/swiper.min.js?ver=4.5.3"/>"></script>
<script type="text/javascript" src="<c:url value="/js/scrollmagic.min.js?ver=2.0.8"/>"></script>
<script type="text/javascript" src="<c:url value="/js/magnific-popup.min.js?ver=1.1.0"/>"></script>
<script type="text/javascript" src="<c:url value="/js/custom-theme.js?ver=1.0.0"/>"></script>

<script type="text/javascript">

	function updateItemIdx(itemIdx) {
		if(confirm("삭제 하시겠습니까?")){
			location.href='<c:url value="/admin/itemupdate"/>?itemIdx='+itemIdx;
	}
	}


</script>

</body>

</html>