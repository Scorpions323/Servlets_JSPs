<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page import="java.time.LocalDate, java.time.format.DateTimeFormatter" %>
        <!DOCTYPE html>
        <html lang="es">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Fecha Actual del Sistema</title>
        </head>

        <body>
            <% LocalDate hoy=LocalDate.now(); %>
                <h1>La Fecha Actual del Sistema es:
                    <strong>
                        <%= hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) %>
                    </strong>
                </h1>
        </body>

        </html>