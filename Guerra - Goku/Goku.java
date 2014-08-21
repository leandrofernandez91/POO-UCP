
public class Goku 
                extends Participante
{
     public String getNombreCompleto(){
        return getNombre()+" (Goku)";
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
                enemigo.danio(enemigo.danioParaGoku());
        }
        
        public double danioParaTanque(){
                return 10*usarEscudo();
            }
        public double danioParaSoldado(){
                return 5*usarEscudo();
            }        
        public double danioParaAvion(){
                return 20*usarEscudo();
            }        
        public double danioParaGoku(){
               return -100;
            }

        
    }
        
        
        