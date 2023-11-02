package com.example.demo2;

import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TareaDAO {
    private Connection conexion;

    public void conectar() throws ClassNotFoundException, SQLException, IOException {

       Class.forName("com.mysql.cj.jdbc.Driver");
       conexion = DriverManager.getConnection("jdbc:mysql://" + "localhost" + ":" + "3306" + "/" + "tareas" + "?serverTimezone=UTC",
                "root", "toor");


    }

    public void desconectar() throws SQLException {
        conexion.close();
    }

    public void agregarTarea(Tarea tarea) throws SQLException {
        String sql = "INSERT INTO tarea (Titulo, Descripcion, Dia, Hora) VALUES (?, ?, ?, ?)";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, tarea.getTitulo());
        sentencia.setString(2, tarea.getDescripcion());
        sentencia.setString(3, tarea.getDia());
        //sentencia.setTime(4, tarea.getHora());
        //sentencia.setTime(4, tarea.getHora().toString());
        sentencia.executeUpdate();
    }

    public void eliminarTarea(Tarea tarea) throws SQLException {
        String sql = "DELETE FROM tarea WHERE titulo = ?";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, tarea.getTitulo());
        sentencia.executeUpdate();
    }

    /*public void modificarCoche(Tarea tareaAntigua, Tarea tareaNueva) throws SQLException {
        String sql = "UPDATE tarea SET titulo = ?, descripcion = ?, dia = ?, hora = ? WHERE id = ?";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, tareaNueva.getTitulo());
        sentencia.setString(2, tareaNueva.getDescripcion());
        sentencia.setString(3, tareaNueva.getDia());
        sentencia.setTime(4, tareaNueva.getHora());
        sentencia.setInt(5, tareaAntigua.getId());
        sentencia.executeUpdate();
    }*/

    public List<Tarea> obtenerTareas() throws SQLException {
        List<Tarea> tareas = new ArrayList<>();
        String sql = "SELECT * FROM tareas";

        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();
        while (resultado.next()) {
            Tarea tarea = new Tarea();
            tarea.setId(resultado.getInt(1));
            tarea.setTitulo(resultado.getString(2));
            tarea.setDescripcion(resultado.getString(3));
            tarea.setDia(resultado.getString(4));

            tareas.add(tarea);
        }

        return tareas;
    }

    /*public boolean existeCoche(String matricula) throws SQLException {
        String sql = "SELECT * FROM coches WHERE matricula = ?";
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery();

        return resultado.next();
    }*/
}
