<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 30/06/2021
  Time: 1:35 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/calculator" method="post">
    <table>
      <tr>
        <td>First operand: </td>
        <td><input type="text" name="number1"/></td>
      </tr>
      <tr>
        <td>Operator</td>
        <td><select name="operator">
          <option value="+">Cộng</option>
          <option value="-">Trừ</option>
          <option value="*">Nhân</option>
          <option value="/">Chia</option>
        </select> </td>
      </tr>
      <tr>
        <td>Second operand</td>
        <td><input name="number2" type="text"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Calculate"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
