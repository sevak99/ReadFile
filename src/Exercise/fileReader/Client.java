package Exercise.fileReader;

import Exercise.Calculate.Calculate;
import Exercise.Calculate.actions.Actions1;
import Exercise.Calculate.actions.Actions2;
import Exercise.Calculate.actions.Actions3;
import Exercise.DataReader.DataReader;
import Exercise.DataReader.FilesType.CSVReader;
import Exercise.DataReader.FilesType.NLSVReader;
import Exercise.DataReader.FilesType.TSVReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ArmenianCodeAcademy on 3/25/2017.
 */
public class Client {

    private DataReader dataReader;
    private Calculate calculate;
    private String fileName;
    private int actionNumber;

    public void start() throws IOException {
        enterFileName();
        enterActionNumber();
        calculate.calc();
    }

    private void enterFileName() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = scanner.next();

        readFile(getExtention());
    }

    private void enterActionNumber() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter action number(1, 2 or 3): ");
        actionNumber = scanner.nextInt();

        action();
    }

    private String getExtention() {
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);

        return extension;
    }

    private void readFile(String extension) throws FileNotFoundException {
        switch (extension) {
            case "csv":
                dataReader = new CSVReader(fileName);
                break;
            case "tsv":
                dataReader = new TSVReader(fileName);
                break;
            case "nlsv":
                dataReader = new NLSVReader(fileName);
                break;
            default:
                System.out.println("Warning: There is no such file extention");
                System.out.println("Try again");
                enterFileName();
        }
    }

    private void action() throws IOException {
        switch (actionNumber) {
            case 1:
                calculate = new Actions1(dataReader.read());
                break;
            case 2:
                calculate = new Actions2(dataReader.read());
                break;
            case 3:
                calculate = new Actions3(dataReader.read());
                break;
            default:
                System.out.println("Warning: There is no such action");
                System.out.println("Try again");
                enterActionNumber();
        }
    }
}