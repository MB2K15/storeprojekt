<%-- 
    Document   : Order
    Created on : 2015-08-31, 13:00:05
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>JSP Page</title>
    </head>
    <body>
      <center> 
          <h1>Thank for shopping.Your orders will completed at 24 hours.Regards</h1>
     
    <h2>Your shopping cost</h2>
    <table border="2" width="1000px" cellpadding="20px" style="border-collapse: collapse">
        <tr>
            <td colspan="5">
                <p> Total : $ <%=request.getSession().getAttribute("wszystko")%> </p>
            </td>
            </tr>
</table> 
      </center>
    </body>
</html>
