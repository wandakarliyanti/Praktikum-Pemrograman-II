package com.example.praktikum6;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 = new TableColumn<>("NIM");
        column1.setCellValueFactory(new PropertyValueFactory<>("nim"));
        TableColumn<Mahasiswa, String> column2 = new TableColumn<>("Nama");
        column2.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(new Mahasiswa(1, "Wanda", "22108"));
        tableView.getItems().add(new Mahasiswa(2, "Gina", "22103"));
        tableView.getItems().add(new Mahasiswa(3, "Lisa", "23645"));
        tableView.getItems().add(new Mahasiswa(4, "Septi", "22153"));
        tableView.getItems().add(new Mahasiswa(5, "Karlina", "22313"));
        tableView.getItems().add(new Mahasiswa(6, "Tami", "21353"));
        tableView.getItems().add(new Mahasiswa(7, "Viya", "22341"));
        tableView.getItems().add(new Mahasiswa(8, "Mahda", "23415"));
        tableView.getItems().add(new Mahasiswa(9, "Alya", "23156"));
        tableView.getItems().add(new Mahasiswa(10, "Yaumil", "21553"));

        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Tabel Mahasiswa");
        primaryStage.show();
    }
    public static class Mahasiswa {
        private int id;
        private String nama, nim;

        public Mahasiswa (int id, String nama, String nim) {
            this.id = id;
            this.nama = nama;
            this.nim = nim;
        }

        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id=id;
        }

        public String getNim(){
            return nim;
        }
        public void setNim(String nim){
            this.nim=nim;
        }

        public String getNama() {
            return nama;
        }
        public void setNama(){
            this.nama=nama;
        }
    }
}