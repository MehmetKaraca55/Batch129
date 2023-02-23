package buddy.devproje;

public enum PatientStatus {
    KIRMIZI_ALAN(1,"Kritik"),
    SARI_ALAN(2,"Acil"),
    YESIL_ALAN(3,"Ayakta tedavi");
    private final int val;
    private final String desc;
    PatientStatus(int val,String desc){
        this.val = val;
        this.desc = desc;
    }
    public int getVal(){
        return val;
    }
    public String getDesc(){
        return desc;
    }
}