
public class Soldado 
                extends Participante
{
     public String getNombreCompleto(){
        return getNombre()+" (Soldado)";
    }
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
        //Ejemplo 2
//         if(enemigo instanceof Tanque){
//             enemigo.danio(250);
//         }else if(enemigo instanceof Avion){
//             enemigo.danio(650);
//         }else if(enemigo instanceof Soldado){
//             enemigo.danio(450);
                enemigo.danio(enemigo.danioParaSoldado());
        }
        
        public int danioParaTanque(){
                return 700;
            }
        public int danioParaSoldado(){
                return 700;
            }        
        public int danioParaAvion(){
                return 1000;
            }        
  

        
    }
        
        
        

