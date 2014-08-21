
public class Avion extends Participante
{
    public String getNombreCompleto(){
        return getNombre()+" (Avion)";
    }
    
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
//         //Ejemplo 2
//         if(enemigo instanceof Tanque){
//             enemigo.danio(600);
//         }else if(enemigo instanceof Avion){
//             enemigo.danio(500);
//         }else if(enemigo instanceof Soldado){
//             enemigo.danio(200);
        enemigo.danio(enemigo.danioParaAvion());
        }
        
        public double danioParaTanque(){
                return 700*usarEscudo();
            }
        public double danioParaSoldado(){
                return 350*usarEscudo();
            }        
        public double danioParaAvion(){
                return 700*usarEscudo();
            }        
        public double danioParaGoku(){
               return 900*usarEscudo();
            }    

        
        }
    
    

