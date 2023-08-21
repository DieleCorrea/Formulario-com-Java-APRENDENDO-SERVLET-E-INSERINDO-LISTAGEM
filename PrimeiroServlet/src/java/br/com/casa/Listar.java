/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.casa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author laboratorio
 */
public class Listar extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();      
        
        response.setContentType("text/html");
        
        //tr = table row
        //th = table head
        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">");
        out.println("<table class= 'table table-hover'>");
        out.println("<tr>");
        out.println("<th>Nome</th>");
        out.println("<th>Idade</th>");
        out.println("<th>Endereco</th>");
        out.println("<th>Cidade</th>");
        out.println("<th>Fone</th>");
        out.println("</tr>");
        
        for(Dados d:Dados.lista) {
        
        out.println("<tr>");
        out.println("<td>" +d.getNome() + "</td>");
        out.println("<td>" +d.getIdade() + "</td>");
        out.println("<td>" +d.getEndereco() + "</td>");
        out.println("<td>" +d.getCidade() + "</td>");
        out.println("<td>" +d.getFone() + "</td>");
        
        out.println("</tr>");   
        }
        
        out.println("</table>");
        out.close();
        
    }
    
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {
    doGet(request,response);
            
    }
    
    
}

