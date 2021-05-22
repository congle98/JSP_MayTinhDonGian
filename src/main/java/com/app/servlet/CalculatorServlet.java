package com.app.servlet;

import com.app.model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(req.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(req.getParameter("second-operand"));
        char operator = req.getParameter("operator").charAt(0);
        String error = "Đầu vào lỗi";

        try {
            float result = Calculator.calculate(firstOperand,secondOperand,operator);
            req.setAttribute("firstOperand",firstOperand);
            req.setAttribute("secondOperand",secondOperand);
            req.setAttribute("operator",operator);
            req.setAttribute("result",result);
        }
        catch (Exception ex){
            req.setAttribute("result",error);
        }
        finally {
            RequestDispatcher rd = req.getRequestDispatcher("/result.jsp");
            rd.forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
