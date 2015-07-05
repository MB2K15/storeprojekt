<%-- 
    Document   : product
    Created on : 2015-03-29, 16:15:32
    Author     : Matt
--%>

<%@page contentType="text/html" pageEncoding="windows-1250"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <title>Products</title>
        
        <style>
            #content{
                width:1000px;
                background-color:aqua;
                min-height: 600px;
                padding: 10px;
                margin-left: auto;
                margin-right: auto;
            }
            #add-product {
	width: 500px;
	padding: 50px;
	margin: 100px auto;
	background-color: blue;
        color: white;

	
        box-shadow:10px 10px 50px blue;
	
}   

#napis{

   margin:55px auto;
    width: 600px;
    padding:1px;
    min-height: 10px;
    text-align: center;
    color:white;
    background-color: blue;
    box-shadow:10px 10px 50px red;
}


            
            </style>
    </head>
    <body>
        
        <div id="content">
        
       <div id="napis">
           
            <h1>Adding the product:</h1>
       </div>
             <div id="add-product">
            
        <form action="save" method="post">
          <table> 
              <tr>
                  <td>Id:</td>
                  <td><input type='number' name='id'></td>
              </tr>
              <tr>
                  <td>Nazwa:</td>
            <td><input type = 'text' name = 'name'></td>
            </tr>
            <tr>
                  <td>Kategoria:</td>
           <td><select name='category'>
        <option>Telefony i akcesoria</option>
	<option>Sprzet RTV</option>
        <option>Sprzet AGD</option>
        <option>Odziez i obuwie</option>
        <option>Sport i Rozrywka</option>
</select></td>
           </tr>
           <tr>
                  <td>Cena:</td>
                  <td><input type =number name = 'price'></td>
            </tr>
            <tr>
                  <td>Ilość:</td>
            <td><input type = 'number' name = 'number'></td>
            </tr>
            <tr>
            <td><input name="submit" type="submit"
                       value="Zapisz"/></td>
            <td><input type='reset' value='clean data'/></td>
        </tr>
        </table>
        </form>
        
        <a href="http://google.com" target = "_blank">Click to help <b>Send message</b></a>
        </div>
        </div>
    </body>
</html>
