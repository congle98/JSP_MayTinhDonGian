<%--
  Created by IntelliJ IDEA.
  User: CONG
  Date: 5/22/2021
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Máy tính đơn giản</title>
  </head>
  <body>
  <div>
    <h1>Simple Calculator</h1>
    <form method="get" action="/calculate">
      <fieldset>
        <legend>Calculator</legend>
        <table>
          <tr>
            <td>First operand: </td>
            <td><input name="first-operand" type="text"/></td>
          </tr>
          <tr>
            <td>Operator: </td>
            <td>
              <select name="operator">
                <option value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">Multiplication</option>
                <option value="/">Division</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>Second operand: </td>
            <td><input name="second-operand" type="text"/></td>
          </tr>
          <tr>
            <td></td>
            <td><input type="submit" value="Calculate"/></td>
          </tr>
        </table>
      </fieldset>
    </form>
  </div>
  </body>
</html>
