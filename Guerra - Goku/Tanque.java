
public class Tanque 
            extends Participante
{
    public String getNombreCompleto(){
        return getNombre()+" (Tanque)";
    }
    
    public void disparar(Participante enemigo){
        
        //Ejemplo 1
        //enemigo.danio(400);
        
        //Ejemplo 2
//         if(enemigo instanceof Tanque){
//             enemigo.danio(500);
//         }else if(enemigo instanceof Avion){
//             enemigo.danio(200);
//         }else if(enemigo instanceof Soldado){
//             enemigo.danio(700);
//         }
        //Ejemplo 3
            enemigo.danio(enemigo.danioParaTanque());
        }
        
        public double danioParaTanque(){
                return 350*usarEscudo();
            }
        public double danioParaSoldado(){
                return 350*usarEscudo();
            }        
        public double danioParaAvion(){
                return 500*usarEscudo();
            }        
        public double danioParaGoku(){
               return 900*usarEscudo();
            }  

        
        
        
    
}
