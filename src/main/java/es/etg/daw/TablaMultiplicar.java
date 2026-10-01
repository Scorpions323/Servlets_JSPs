package es.etg.daw;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/tablas")
public class TablaMultiplicar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Tablas de Multiplicar</title></head>");
            out.println("<body>");
            out.println("<h1>Tablas de Multiplicar</h1>");

            for (int tabla = 1; tabla <= 10; tabla++) {
                out.println("<h2>Tabla del " + tabla + "</h2>");

                for (int i = 1; i <= 10; i++) {
                    int resultado = tabla * i;
                    out.println(tabla + " x " + i + " = " + resultado + "<br>");
                }
            }

            out.println("</body>");
            out.println("</html>");
        }
    }
}