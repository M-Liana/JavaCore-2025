package homeworks.medicalCenter.util;

import homeworks.medicalCenter.storage.DoctorStorage;
import homeworks.medicalCenter.storage.PatientStorage;

import java.io.*;

public abstract class FileUtil {

    public static final String DOCTOR_DATA_FILE = "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\homeworks\\medicalCenter\\data\\doctorData.txt";

    public static final String PATIENT_DATA_FILE ="C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\homeworks\\medicalCenter\\data\\patientData.txt";


    public static void serializeDoctorData(DoctorStorage doctorStorage) {
        try (ObjectOutputStream outPutStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
            outPutStream.writeObject(doctorStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File  not found for Doctor Data " + e);
        } catch (IOException e) {
            System.out.println("failed to serialize Doctor data " + e);
        }

    }

    public static void serializePatientData(PatientStorage patientStorage) {
        try (ObjectOutputStream outPutStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
            outPutStream.writeObject(patientStorage);
        } catch (FileNotFoundException e) {
            System.out.println(" File not found for Patient Data " + e);
        } catch (IOException e) {
            System.out.println(" Failed to serialize Patient Data" + e);
        }
    }

    public static DoctorStorage deserializeDoctorStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof DoctorStorage doctorStorage )
                return doctorStorage;
        } catch (FileNotFoundException e) {
            System.out.println(" File not found for Doctor  Data " + e);
        } catch (IOException e) {
            System.out.println(" Failed to Deserialize Doctor Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

return new DoctorStorage();
    }

    public static  PatientStorage deserializePatientStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            Object obj = objectInputStream.readObject();
            if (obj instanceof PatientStorage patientStorage){
           return patientStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println(" File not found for Patient Data " + e);
        } catch (IOException e) {
            System.out.println(" Failed to Deserialize Patient Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PatientStorage();
    }

}

