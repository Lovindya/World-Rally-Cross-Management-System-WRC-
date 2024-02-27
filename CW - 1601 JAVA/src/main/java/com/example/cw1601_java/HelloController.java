package com.example.cw1601_java;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;


public class HelloController implements Initializable {

    @FXML
    private Button Backadd;

    @FXML
    private Button Backdelete;

    @FXML
    private Button Backupdate;

    @FXML
    private TextField TextCP;

    @FXML
    private TextField TextCar;

    @FXML
    private TextField TextupdateCP;

    @FXML
    private TextField TextupdateCar;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btnadd;

    @FXML
    private Button btnaddDetail;

    @FXML
    private Button btndelete;

    @FXML
    private Button btndeleteDetail;

    @FXML
    private Button btnload;

    @FXML
    private Button btnsave;

    @FXML
    private Button btnupdateDetails;

    @FXML
    private Button btnvstDetail;

    @FXML
    private TableColumn<DriverData, Integer> vstAge;

    @FXML
    private TableColumn<DriverData, Integer> vstCP;

    @FXML
    private TableColumn<DriverData, String> vstCar;

    @FXML
    private TableColumn<DriverData, String> vstName;

    @FXML
    private TableView<DriverData> vstTable;

    @FXML
    private TableColumn<DriverData, String> vstTeam;


    @FXML
    private TableColumn<DriverData, Integer> deleteAge;

    @FXML
    private TableColumn<DriverData, Integer> deleteCP;

    @FXML
    private TableColumn<DriverData,String> deleteCar;

    @FXML
    private TableColumn<DriverData, String> deleteName;

    @FXML
    private TableView<DriverData> deleteTable;

    @FXML
    private TableColumn<DriverData, String> deleteTeam;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btnupdateDetail;

    @FXML
    private TableColumn<DriverData, Integer> driverAge;

    @FXML
    private TableColumn<DriverData,Integer> driverCP;

    @FXML
    private TableColumn<DriverData,String> driverCar;

    @FXML
    private TableColumn<DriverData,String> driverName;

    @FXML
    private TableView<DriverData> driverTable;

    @FXML
    private TableColumn<DriverData,String> driverTeam;

    @FXML
    private Pane pane;

    @FXML
    private Pane paneadd;

    @FXML
    private Pane panedelete;

    @FXML
    private Pane panedm;

    @FXML
    private Pane panefm;

    @FXML
    private Pane panemanu;

    @FXML
    private Pane panesbd;

    @FXML
    private Pane panesrr;

    @FXML
    private Pane paneupdate;

    @FXML
    private Pane panevst;

    @FXML
    private Pane panevrl;

    @FXML
    private TextField textAge;

    @FXML
    private TextField textName;

    @FXML
    private TextField textTeam;

    @FXML
    private TextField textupdateAge;

    @FXML
    private TextField textupdateName;

    @FXML
    private TextField textupdateTeam;

    @FXML
    private Label label1;

    @FXML
    private Label label11;

    @FXML
    private Label labelFM;

    @FXML
    private Label labelSort;

    @FXML
    private TableColumn<DriverData,Integer> updateCP;

    @FXML
    private TableColumn<DriverData, String> updateCar;

    @FXML
    private TableColumn<DriverData,String> updateName;

    @FXML
    private TableView<DriverData> updateTable;

    @FXML
    private TableColumn<DriverData,String> updateTeam;

    @FXML
    private TableColumn<DriverData, Integer> updsteAge;

    @FXML
    private ComboBox<String> loc_Picker;

    @FXML
    private DatePicker date_picker;

    @FXML
    private Label srrlbl;

    @FXML
    private TableColumn<Race, Integer> srrCP;

    @FXML
    private TableColumn<Race, Integer> srrCP1;

    @FXML
    private TableColumn<Race, Date> srrDate;

    @FXML
    private TableColumn<Race, Date> srrDate1;

    @FXML
    private TableColumn<Race, String> srrLocation;

    @FXML
    private TableColumn<Race, String> srrLocation1;

    @FXML
    private TableColumn<Race, String> srrName;

    @FXML
    private TableColumn<Race, String> srrName1;

    @FXML
    private TableColumn<Race, Integer> srrPosition;

    @FXML
    private TableColumn<Race, Integer> srrPosition1;

    @FXML
    private TableView<Race> srrTable;

    @FXML
    private TableView<Race> srrTable1;

    //https://stackoverflow.com/questions/29709608/how-do-i-add-objects-to-an-observable-array-backing-list
    final ObservableList<DriverData> driverDataList = FXCollections.observableArrayList();

    final ObservableList<Race> raceDetails = FXCollections.observableArrayList();

    private File file = new File("src\\main\\resources\\com\\example\\cw1601_java\\text_cw.txt");


//    Initializing the table view
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        driverName.setCellValueFactory(new PropertyValueFactory<DriverData, String>("name"));
        driverAge.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("age"));
        driverTeam.setCellValueFactory(new PropertyValueFactory<DriverData, String>("team"));
        driverCar.setCellValueFactory(new PropertyValueFactory<DriverData, String>("car"));
        driverCP.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("currentPoints"));

        updateName.setCellValueFactory(new PropertyValueFactory<DriverData, String>("name"));
        updsteAge.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("age"));
        updateTeam.setCellValueFactory(new PropertyValueFactory<DriverData, String>("team"));
        updateCar.setCellValueFactory(new PropertyValueFactory<DriverData, String>("car"));
        updateCP.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("currentPoints"));

        deleteName.setCellValueFactory(new PropertyValueFactory<DriverData, String>("name"));
        deleteAge.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("age"));
        deleteTeam.setCellValueFactory(new PropertyValueFactory<DriverData, String>("team"));
        deleteCar.setCellValueFactory(new PropertyValueFactory<DriverData, String>("car"));
        deleteCP.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("currentPoints"));

        vstName.setCellValueFactory(new PropertyValueFactory<DriverData, String>("name"));
        vstAge.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("age"));
        vstTeam.setCellValueFactory(new PropertyValueFactory<DriverData, String>("team"));
        vstCar.setCellValueFactory(new PropertyValueFactory<DriverData, String>("car"));
        vstCP.setCellValueFactory(new PropertyValueFactory<DriverData, Integer>("currentPoints"));

        srrName.setCellValueFactory(new PropertyValueFactory<Race, String>("name"));
        srrPosition.setCellValueFactory(new PropertyValueFactory<Race, Integer>("position"));
        srrCP.setCellValueFactory(new PropertyValueFactory<Race, Integer>("CP"));
        srrLocation.setCellValueFactory(new PropertyValueFactory<Race, String>("location"));
        srrDate.setCellValueFactory(new PropertyValueFactory<Race, Date>("date"));


        srrName1.setCellValueFactory(new PropertyValueFactory<Race, String>("name"));
        srrPosition1.setCellValueFactory(new PropertyValueFactory<Race, Integer>("position"));
        srrCP1.setCellValueFactory(new PropertyValueFactory<Race, Integer>("CP"));
        srrLocation1.setCellValueFactory(new PropertyValueFactory<Race, String>("location"));
        srrDate1.setCellValueFactory(new PropertyValueFactory<Race, Date>("date"));

        driverTable.setItems(driverDataList);
        updateTable.setItems(driverDataList);
        deleteTable.setItems(driverDataList);
        vstTable.setItems(driverDataList);
        srrTable.setItems(raceDetails);
        srrTable1.setItems(raceDetails);

        // Read data from a file
        try {
            // Create a new BufferedReader that reads data from a file
            BufferedReader in = new BufferedReader(new FileReader("src\\main\\resources\\com\\example\\cw1601_java\\cw_srr.txt"));

            String line;
            // Read each line of the file
            while ((line = in.readLine()) != null) {
                String[] split = line.split(",");
                if (split.length != 5) {
                    continue;
                }

                // Parse the elements and assign them to variables
                String name = split[0].trim();
                int position = Integer.parseInt(split[1].trim());
                int cp = Integer.parseInt(split[2].trim());
                String location = split[3].trim();
                LocalDate date = LocalDate.parse(split[4].trim());

                Race race = new Race(name,position,cp,location,date);
                raceDetails.add(race);
            }
            // Set the table's data to the list of Race objects
            srrTable.setItems(raceDetails);
        } catch (FileNotFoundException e) {
            srrlbl.setText("File not found.");

        }
        // If an IO exception happens, throw a runtime exception
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    public void mouseClicks(ActionEvent actionEvent){
        // Check which button was clicked and bring the corresponding pane to the front
        if (actionEvent.getSource() == btn1){
            panedm.toFront();
        }

        if (actionEvent.getSource() == btn2){
            panevst.toFront();
        }

        if (actionEvent.getSource() == btn3) {
            panesrr.toFront();
        }
        if (actionEvent.getSource() == btn4){
            panevrl.toFront();
        }
        if (actionEvent.getSource() == btn5){
            panefm.toFront();
        }
    }

    @FXML
    public void exit1(MouseEvent event){
        //Exit the program
        System.exit(0);
    }

    @FXML
    public void mouseClick2(ActionEvent actionEvent){
        // Check which button was clicked and bring the corresponding pane to the front
        if (actionEvent.getSource() == btnadd){
            paneadd.toFront();
        }

        if (actionEvent.getSource() == btnupdate){
            paneupdate.toFront();
        }

        if (actionEvent.getSource() == btndelete){
            panedelete.toFront();
        }
    }

    @FXML
    public void mouseClick3(ActionEvent actionEvent){
        // Check which button was clicked and bring the corresponding pane to the front
        if (actionEvent.getSource() == Backadd){
            panedm.toFront();
        }

        if (actionEvent.getSource() == Backupdate){
            panedm.toFront();
        }

        if (actionEvent.getSource() == Backdelete){
            panedm.toFront();
        }
    }

    //https://www.youtube.com/watch?v=jm_gVp12h0s&t=2727s
    //This method will call when add button is pressed
    @FXML
    public void addBtn(ActionEvent actionEvent){
        DriverData driver = null;
        try {
            // Read input data from text fields
            String name = textName.getText();
            int age = Integer.parseInt(textAge.getText());
            String team = textTeam.getText();
            String car = TextCar.getText();
            int currentPoints = Integer.parseInt(TextCP.getText());

            // Check if driver already exists in the list
            for(DriverData driver1: driverDataList){
                if (driver1.getName().equals(name)){
                    label11.setText("Driver already exists");
                    return;
                }
            }

            // Check if input data is valid
            if (age < 18 || age > 70) {
                label11.setText("Age must be between 18 and 70.");
                return;
            } if (team.isEmpty() || car.isEmpty() || currentPoints < 0 || name.isEmpty()){
                label11.setText("All the fields are required.");
                return;
            }
            // Create a new DriverData object with the input data
                driver = new DriverData(name, age, team, car, currentPoints);


        }catch (NumberFormatException d){
            label11.setText("Age and current points must be a number");
        }

        // Add the new DriverData object to the list and clear the text fields
        DriverData driverData= driver;

        if (driverData != null){
            driverDataList.add(new DriverData(driverData.getName(),driverData.getAge(),driverData.getTeam(),driverData.getCar(), driverData.getCurrentPoints()));
            textName.setText("");
            textAge.setText("");
            textTeam.setText("");
            TextCar.setText("");
            TextCP.setText("");
            label11.setText("Details added to the table successfully");
        }
    }



    //https://www.youtube.com/watch?v=jm_gVp12h0s&t=2727s
    @FXML
    public void updateDetails(ActionEvent actionEvent){
        DriverData driver = null;
        try {
            // Read updated data from text fields
            String name = textupdateName.getText();
            int age = Integer.parseInt(textupdateAge.getText());
            String team = textupdateTeam.getText();
            String car = TextupdateCar.getText();
            int currentPoints = Integer.parseInt(TextupdateCP.getText());

            //Check for driver data duplication
            for(DriverData driver1: driverDataList){
                if (driver1.getName().equals(name)){
                    label1.setText("Driver already exists");
                    return;
                }
            }
            // Check if input data is valid
            if (age < 18 || age > 70) {
                label1.setText("Age must be between 18 and 70.");
                return;
            }if (team.isEmpty() || car.isEmpty() || currentPoints < 0 || name.isEmpty()){
                label1.setText("All the fields are required.");
                return;
            }
            // Create a new DriverData object with the input data
            driver = new DriverData(name, age, team, car, currentPoints);

        }catch (NumberFormatException d){
            label1.setText("Age and current points must be a number");
        }

        //This code runs when upate button is clicked
        DriverData driverData = driver;
        if (driverData != null){
            int index1 = updateTable.getSelectionModel().getSelectedIndex();
            DriverData driverData1 = updateTable.getItems().get(index1);
            int index = driverDataList.indexOf(driverData1);
            driverDataList.set(index,driverData);

            //the text fields and label are reset.
            textupdateName.setText("");
            textupdateAge.setText("");
            textupdateTeam.setText("");
            TextupdateCar.setText("");
            TextupdateCP.setText("");
            label1.setText("Details are updated successfully.");
        }

    }


    @FXML
    public void updateFields(MouseEvent mouseEvent){
        DriverData driverData = updateTable.getSelectionModel().getSelectedItem();
        if (driverData!= null){

            // Sets the attributes of the driver data object to the relevant text field .
            textupdateName.setText(driverData.getName());
            textupdateAge.setText(String.format("%d",driverData.getAge()));
            textupdateTeam.setText(driverData.getTeam());
            TextupdateCar.setText(driverData.getCar());
            TextupdateCP.setText(String.format("%d",driverData.getCurrentPoints()));
        }
    }

    @FXML
    public void deleteData(ActionEvent mouseEvent){
        //Delete the selected driver data
        DriverData index = deleteTable.getSelectionModel().getSelectedItem();
        driverDataList.remove(index);

    }

    @FXML
    public void Sort(ActionEvent actionEvent){
        ObservableList<DriverData> list = FXCollections.observableArrayList();
        if (driverDataList == null ) {
            labelSort.setText("List is empty!");
        } else {
            list.clear();
            list.addAll(driverDataList);
            int n = list.size();
            for (int i = 1; i < n; ++i) {
                DriverData key = list.get(i);
                int j = i - 1;
                while (j >= 0 && list.get(j).getCurrentPoints() < key.getCurrentPoints()) {
                    list.set(j + 1, list.get(j));
                    j = j - 1;
                }
                list.set(j + 1, key);
            }
            vstTable.setItems(list);
        }
    }


    //https://stackoverflow.com/questions/11496700/how-to-use-printwriter-and-file-classes-in-java
    //https://stackoverflow.com/questions/55963792/using-printwriter-to-create-a-text-file-with-several-rows-from-a-list
    @FXML
    public void btnSave(ActionEvent actionEvent)  {
        //checking the driver list is empty
        if(driverDataList.isEmpty() ){
            labelFM.setText("List is empty!");
            return;
        }

        try{
            //save the driver data list in a text file
            PrintWriter writer = new PrintWriter(new PrintWriter(file));
            for (DriverData Data :driverDataList) {
                writer.write(Data.getName()+":" + Data.getAge()+":" + Data.getTeam()+":" + Data.getCar()+":" + Data.getCurrentPoints()+"\n");


            }

            writer.close();
        }
        //Displaying a message if file doesn't exist
        catch (FileNotFoundException e) {
            labelFM.setText("File not found");
        }


    }

    //https://www.w3schools.com/java/java_files_read.asp
    //https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
    //https://stackoverflow.com/questions/55963792/using-printwriter-to-create-a-text-file-with-several-rows-from-a-list
    @FXML
    public void loadFromFile(ActionEvent actionEvent) {
        try {
            //loading driver data from the text file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String team = parts[2];
                String car = parts[3];
                int currentPoints = Integer.parseInt(parts[4]);
                driverDataList.add(new DriverData(name, age, team, car, currentPoints));
            }
            scanner.close();
        }
        //Displaying a message if file doesn't exist
        catch (FileNotFoundException e) {
            labelFM.setText("File not found");
        }
    }



    @FXML
    public void srr(ActionEvent event){
        //checking if driver data list at least contains 3 driver data
        if(driverDataList.size()<3){
            srrlbl.setText("Please enter at least 3 driver data");
        }else {
            srr2();
        }
    }

    //https://stackoverflow.com/questions/11496700/how-to-use-printwriter-and-file-classes-in-java
    //https://stackoverflow.com/questions/55963792/using-printwriter-to-create-a-text-file-with-several-rows-from-a-list
    public void srr2(){
        //assigning locations to the location list
        ArrayList<String> locations = new ArrayList<>();
        locations.add("Nyirád");
        locations.add("Höljes");
        locations.add("Montalegre");
        locations.add("Barcelona");
        locations.add("Rīga");
        locations.add("Norway");

        // Create a Random object to generate a random index
        Random random = new Random();

        // Get a random location from the ArrayList
        String randomLocation = locations.get(random.nextInt(locations.size()));

        try {
            PrintWriter writer = new PrintWriter(new PrintWriter("src\\main\\resources\\com\\example\\cw1601_java\\cw_srr.txt"));
            LocalDate date = date_picker.getValue();
            Collections.shuffle(locations);
            if ( date == null) {
                srrlbl.setText("Please enter the date.");
                return;
            }

            // Check if the selected date has already been used
            for (Race r : raceDetails) {
                if (r.getDate().equals(date)) {
                    srrlbl.setText("The selected date has already been used.");
                    return;
                }
            }

            //assigning positions to all the drivers in the list
            List<Integer> positions = new ArrayList<>(driverDataList.size());
            for (int i = 1; i <= driverDataList.size(); i++) {
                positions.add(i);
            }

            List<DriverData> drivers = new ArrayList<>();
            drivers.addAll(driverDataList);
            Collections.shuffle(drivers);

            //Adding points to first 3 positions
            for (int i = 0; i < drivers.size(); i++) {
                DriverData driver = drivers.get(i);
                driver.setPosition(positions.get(i));
                switch (driver.getPosition()) {
                    case 1:
                        driver.setCurrentPoints(driver.getCurrentPoints() + 10);
                        break;
                    case 2:
                        driver.setCurrentPoints(driver.getCurrentPoints() + 7);
                        break;
                    case 3:
                        driver.setCurrentPoints(driver.getCurrentPoints() + 5);
                        break;
                    default:
                        // handle other cases if necessary
                        break;
                }
            }


            for (int b = 0; b < driverDataList.size(); b++){
                    String name = drivers.get(b).getName();
                    int CurrentPoints = drivers.get(b).getCurrentPoints();
                    raceDetails.add(new Race(name,positions.get(b),CurrentPoints, randomLocation,date));
                }

            //saving the data in a text file
            for (Race r : raceDetails) {
                writer.write(r.getName() + ","+ r.getPosition() + "," +r.getCP() + "," + r.getLocation() + "," + r.getDate()+"\n");
            }
            writer.close();
            }
        //Displaying a message if file doesn't exist
            catch (FileNotFoundException e){
            labelFM.setText("File not found");
        }

        //refreshing the tables after running the program
        driverTable.refresh();
        updateTable.refresh();
        deleteTable.refresh();


        }

    //https://www.javatpoint.com/bubble-sort-in-java
    @FXML
    void vrl(ActionEvent event){
        //creating an observable list
        ObservableList<Race> sortedRaces = FXCollections.observableArrayList();
        sortedRaces.addAll(raceDetails);
        int n = sortedRaces.size();
        Race temp;
        //sorting according to the data
        for(int i=0; i < n-1; i++){
            for(int j=0; j < n-i-1; j++){
                if(sortedRaces.get(j).getDate().isAfter(sortedRaces.get(j+1).getDate())){
                    temp = sortedRaces.get(j);
                    sortedRaces.set(j, sortedRaces.get(j+1));
                    sortedRaces.set(j+1, temp);
                }
            }
        }
        //setting the table with sorted data
        srrTable1.setItems(sortedRaces);
    }

}

