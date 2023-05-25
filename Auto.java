public class Auto extends Thread{
    private String nomep;
    private int numero;
    private String scuderia;
/**
 * 
 * @param nomep
 * @param numero
 * @param scuderia
 */
    public Auto(String nomep, int numero, String scuderia) {
        this.nomep = nomep;
        this.numero = numero;
        this.scuderia = scuderia;
    }
/**
 * 
 * @return
 */
    public String getNomep() {
        return nomep;
    }
/**
 * 
 */
    public int getNumero() {
        return numero;
    }
/**
 * 
 * @return
 */
    public String getScuderia() {
        return scuderia;
    }

    
/**
 * 
 */
    @Override
    public void run() {
        int giri=0;
            
        for(int i=0;i<10;i++){
           if(giri!=3||giri!=6||giri!=9){
            giri++;
            try{
                Thread.sleep(1000*(int)((Math.random()*5)+1));
            }catch(Exception e){
                System.out.println("nooo");
            }
            System.out.println("il pilota "+ nomep+" ha finito il giro "+giri);

            }
        }
        System.out.println(nomep +" È ARRIVATO AL TRAGUARDO");
    }

    
}
