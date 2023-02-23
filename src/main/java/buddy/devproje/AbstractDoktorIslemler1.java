package buddy.devproje;


import java.util.List;
public abstract class AbstractDoktorIslemler1 {
    public abstract   void exitDoctorMenu();
    public abstract void printDoctorList(List<Doktor> doktorList);
    public abstract void addDoctor(List<Doktor> doktorList);
    public abstract Doktor findDoctorTitle(List<Doktor> doktorList);
    public abstract void deleteDoctorId(List<Doktor> doktorList);
}
