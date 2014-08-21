

public abstract class Participante
{
    //Variables internas
    private String nombre;
    private double vida;
    private boolean tienescudo = true;
    private boolean aviso = false;
    //GEtters/Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    
   
    public double getVida(){
        return vida;
    }
    public void setVida(double valor){
        vida = valor;
    }
    
    
    //Comportamiento (Metodos)
    //Disparar, metodo asbtracto (de clase) 
    //para ser implementado en cada subclase
    public abstract void disparar(Participante enemigo);
       
    
    public double danio(double valor){
        setVida(getVida() - valor);
        return getVida();
    }
    
    //Retorna si el participante se encuentra vivo
    //es decir si tiene vida
    public boolean estaVivo(){
        return (getVida()>0);
    }
    public boolean getAviso(){
        return aviso;
    }
    //Metodo "abstracto"
    public abstract String getNombreCompleto();
    
     public abstract double danioParaTanque();
     public abstract double danioParaAvion();
     public abstract double danioParaSoldado();
     
     public double usarEscudo(){
         if (tienescudo) {
            tienescudo = false;
            aviso = true;
            return 0.8;
            } 
         else{
            aviso = false;
            return 1;
            }
        
        }
}
