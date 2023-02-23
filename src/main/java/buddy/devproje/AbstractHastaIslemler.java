package buddy.devproje;

import java.util.List;

import java.util.List;
public abstract class AbstractHastaIslemler {
    public abstract void exitPatientMenu();
    public abstract void printPatientList(List<Hasta> hastaList);
    public abstract void addPatient(List<Hasta> hastaList);
    public abstract String findPatientById(List<Hasta> hastaList);
    public abstract void deletePatientById(List<Hasta> hastaList);
    public abstract void statusOfPatient(List<Hasta> hastaList);
}
