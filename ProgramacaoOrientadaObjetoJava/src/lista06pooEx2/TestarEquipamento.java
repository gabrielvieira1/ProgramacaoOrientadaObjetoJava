package lista06pooEx2;
public class TestarEquipamento {
    public static void main(String[]args){
        EquipamentoSonoro caxinha = new EquipamentoSonoro(true, true);
        System.out.println("ligado? " + caxinha.isLigado());
        System.out.println("volume? " + caxinha.getVolume());
        System.out.println("Stereo? " + caxinha.isStereo() + "\n");
        
        EquipamentoSonoro caxinha2 = new EquipamentoSonoro(true, (short) 9, true);
        System.out.println("ligado? " + caxinha2.isLigado());
        System.out.println("volume? " + caxinha2.getVolume());
        System.out.println("Stereo? " + caxinha2.isStereo() + "\n");
        
        EquipamentoSonoro caxinha3 = new EquipamentoSonoro(true, (short) 11, true);
        System.out.println("ligado? " + caxinha3.isLigado());
        System.out.println("volume? " + caxinha3.getVolume());
        System.out.println("Stereo? " + caxinha3.isStereo());
        
        
    }
}
