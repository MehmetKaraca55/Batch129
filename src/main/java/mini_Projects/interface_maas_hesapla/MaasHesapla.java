package mini_Projects.interface_maas_hesapla;

public class MaasHesapla implements Vergi, MaasArttır {


    @Override
    public double yıllıkExtra(int calısmaYılı) {
        return calısmaYılı*100;
    }

    @Override
    public double saatlikExtra(int calısmaSaati) {
        if(calısmaSaati>160){
            return (calısmaSaati-160)*10;
        }else{
            return 0;
        }

    }

    @Override
    public double vergi(double brütMaas, int calısmaYılı) {
        if(calısmaYılı>=10){
            return brütMaas*0.3;
        }else{
            return brütMaas*0.2 ;
        }

    }
    public double netMaas(double brutMaas, int calısmaYılı, int calısmaSaati ){

        return brutMaas+yıllıkExtra(calısmaYılı)+saatlikExtra(calısmaSaati)-vergi(brutMaas, calısmaYılı);

    }
}
