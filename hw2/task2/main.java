package hw2.task2;

import java.io.*;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void WriteFile(String lastName, String firstName, String secondName, Date birthDate, int phone, String sex) throws FileSystemException{
        String fileName = lastName.toLowerCase() + ".txt";
        File file = new File(fileName);
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        try (FileWriter fileWriter = new FileWriter(file, true)){
            if (file.length() > 0){
                fileWriter.write('\n');
        }
                fileWriter.write(String.format("%s %s %s %s %s %s", lastName, firstName, secondName, format.format(birthDate), phone, sex));
        }catch (IOException e){
            throw new FileSystemException("File error");
    }
}

    public static void InsertNewRecord() throws Exception {
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона (10 цифр без разделителей) и пол(символ латиницей f или m), разделенные пробелом");

        String userInput;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            userInput = bf.readLine();
        } catch (IOException e){
            throw new Exception("Console read error");
        }

        String[] array = userInput.split(" ");
        if (array.length != 6){
            throw new Exception("Incorrect input, invalid number of elements");
        }

        String lastName = array[0];
        String firstName = array[1];
        String secondName = array[2];

        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        Date birthDate;
        try {
            birthDate = format.parse(array[3]);
        }catch (ParseException e){
            throw new ParseException("Incorrect format of date", e.getErrorOffset());
        }

        int phone;
        if (array[4].length() != 10)
            throw new NumberFormatException("Incorrect format of phone number, invalid number of items");
        try {
            phone = Integer.parseInt(array[4]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Incorrect format of phone number, invalid items");
        }

        String sex = array[5];
        if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")){
            throw new RuntimeException("Wrong symbol of sex");
        }
        WriteFile(lastName, firstName, secondName, birthDate, phone, sex);

    }

    public static void main(String[] args) throws IOException {
        try {
            InsertNewRecord();
            System.out.println("Succes input");
        }catch (FileSystemException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
