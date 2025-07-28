
package com.mycompany.peluqueriacanina2.logica;

import com.mycompany.peluqueriacanina2.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nomMasco, String raza, String color, 
            String observaciones, String alergico, String atenEsp, String 
            nomDuenio, String celDuenio) {
        // Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nomDuenio);
        duenio.setCelDuenio(celDuenio);
        
        // Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nomMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setDuenio(duenio);
        
        //Con esto llamamos a persistencia una vez tengamos los campos con la informacion
        controlPersis.guardar(duenio, masco);
    
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();       
        
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
        
    }

    public Mascota traerMascota(int num_cliente) {
       
        return controlPersis.traerMascota (num_cliente);
       
        
    }

    public void modificarMascota(Mascota masco, String nomMasco, String raza, String color, String observaciones, String alergico, 
            String atenEsp, String nomDuenio, String celDuenio) {      
        
        //usamos masco para setear los parametros de entrada 
        masco.setNombre(nomMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atenEsp);
        
        //modificamos la mascota
        controlPersis.modificarMasco(masco);
        
        //modificarmos al dueño
        Duenio dueno = this.buscarDuenio(masco.getDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nomDuenio);
        
        //llamar al modificador de Dueño
        this.modificarDuenio(dueno);
        
        


    }

    //Se usa para buscar un dueño mediante ID
    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
        
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
    
}
