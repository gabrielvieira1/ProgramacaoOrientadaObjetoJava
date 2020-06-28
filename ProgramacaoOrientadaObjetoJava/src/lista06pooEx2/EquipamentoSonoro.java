package lista06pooEx2;
public class EquipamentoSonoro extends Equipamentos{
    private short volume;
    private boolean stereo;
    
    public EquipamentoSonoro(){
        
    }
    
    public EquipamentoSonoro(boolean ligado, boolean stereo){
        super(ligado);
        setVolume((short) 5);
        setStereo(stereo);
    }
    
    public EquipamentoSonoro(boolean ligado, short volume, boolean stereo){
        super(ligado);
        setVolume(volume);
        setStereo(stereo);
    }

    public void mono(){
        //acredito firmamente que essa seja a forma correta de implementar os métodos mono e stereo
        //ja que por sua vez se um equipamento for "mono" ele não é stereo e se for "stereo" ... ele é stereo
        setStereo(false);
    }
    
    public void stereo(){
        //acredito firmamente que essa seja a forma correta de implementar os métodos mono e stereo
        //ja que por sua vez se um equipamento for "mono" ele não é stereo e se for "stereo" ... ele é stereo
        setStereo(true);
    }
    
    @Override
    public void liga(){
        setLigado(true);
        setVolume((short)5);
    }
    
    public short getVolume() {
        return volume;
    }

    public void setVolume(short volume) {
        if((volume > 10)||(volume < 0)){
            System.out.println("Volume inválido!!!");
        }else
        this.volume = volume;
    }

    public boolean isStereo() {
        return stereo;
    }

    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }
    
        
}
