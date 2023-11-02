package com.example.demo2;

import com.example.demo2.util.AlertUtils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class InicioController {

    @FXML
    private TableColumn colTitulo;

    @FXML
    private TableColumn colDescripcion;

    @FXML
    private TableColumn colDia;


    @FXML
    private Button Agregar;

    @FXML
    private Button Editar;

    @FXML
    private Button Eliminar;

    @FXML
    private TableView<Tarea> lista;

    private ObservableList<Tarea> lvTareas;

    private final TareaDAO tareaDAO;

    public InicioController() {
        tareaDAO = new TareaDAO();
        try {
            tareaDAO.conectar();
        } catch (SQLException sqle) {
            AlertUtils.mostrarError("Error al conectar con la base de datos");
        } catch (ClassNotFoundException cnfe) {
            AlertUtils.mostrarError("Error al iniciar la aplicación");
        } catch (IOException ioe) {
            AlertUtils.mostrarError("Error al cargar la configuración");
        }

        System.out.println(System.getProperty("user.home"));
    }



    /*public void cargarDatos() {

        lvTareas = FXCollections.observableArrayList();

        this.colTitulo.setCellValueFactory(new PropertyValueFactory("titulo"));
        this.colDescripcion.setCellValueFactory(new PropertyValueFactory("descripcion"));
        this.colDia.setCellValueFactory(new PropertyValueFactory("dia"));
        try {
            lvTareas = (ObservableList<Tarea>) tareaDAO.obtenerTareas();
            while(lvTareas.nex)

        } catch (SQLException sqle) {
            AlertUtils.mostrarError("Error cargando los datos de la aplicación");
        }*/

        /*try {
            List<Tarea> tareas = tareaDAO.obtenerTareas();
            lvTarea.setItems(FXCollections.observableList(tareas));
        } catch (SQLException sqle) {
            AlertUtils.mostrarError("Error cargando los datos de la aplicación");
        }*/
    //}

    /*private void modoEdicion(boolean b) {
        btNuevo.setDisable(activar);
        btGuardar.setDisable(!activar);
        btModificar.setDisable(activar);
        btEliminar.setDisable(activar);

        tfMatricula.setEditable(activar);
        tfMarca.setEditable(activar);
        tfModelo.setEditable(activar);
        cbTipo.setDisable(!activar);

        lvCoches.setDisable(activar);
    }*/

    @FXML
    void agregar(ActionEvent event) {

    }

    @FXML
    void editar(ActionEvent event) {

    }

    @FXML
    void eliminar(ActionEvent event) {

    }

}
