/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.jugador;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorJugador {
    
    private ConexionDB4O c;

    public ControladorJugador(ConexionDB4O c) {
        this.c = c;
    }
    public ArrayList<jugador>consultarTodo(){
        ArrayList<jugador>juga=new ArrayList<>();
        Query consulta=c.getBd().query();//esto 
       consulta.constrain(jugador.class);//y esto es un select *
       ObjectSet<jugador> res=c.consultaInterfaz(consulta);
       
       while(res.hasNext()){
           juga.add(res.next());
       }
       return juga;
    }
    public ArrayList<jugador>consultarPnt(int pnt, int asis){
        ArrayList<jugador>juga=new ArrayList<>();
        Query consulta=c.getBd().query();//esto 
       consulta.constrain(jugador.class);//y esto es un select *
       consulta.descend("puntos").orderDescending().constrain(pnt).greater().and(consulta.descend ("asistencias").orderDescending().constrain (asis).greater()); //esto es un where
       ObjectSet<jugador> res=c.consultaInterfaz(consulta);
       
       while(res.hasNext()){
           juga.add(res.next());//asi lo añades a la tabla
       }
       return juga;
    }
    public ArrayList<jugador>EliminarDato(int punt, int reb, int asist){
        ArrayList<jugador>juga=new ArrayList<>();
        Query consulta=c.getBd().query();//esto 
       consulta.constrain(jugador.class);//y esto es un select *
       consulta.descend("puntos").constrain(punt).smaller().and(consulta.descend ("rebotes").constrain(reb).smaller().and(consulta.descend ("asistencias").constrain(asist).smaller()));
       ObjectSet<jugador> res=consulta.execute();
       
       while(res.hasNext()){
           juga.remove(res.next());
       }
       return juga;
    }
   
}
