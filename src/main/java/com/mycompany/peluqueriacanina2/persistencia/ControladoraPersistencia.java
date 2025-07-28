package com.mycompany.peluqueriacanina2.persistencia;

import com.mycompany.peluqueriacanina2.logica.Duenio;
import com.mycompany.peluqueriacanina2.logica.Mascota;
import com.mycompany.peluqueriacanina2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        // Crear en la BD el dueño
        duenioJpa.create(duenio);
        
        // Crear en la DB mascota
        mascoJpa.create(masco);

    }

    public List<Mascota> traerMascotas() {
        
        //llamamos la JPA de mascota y busca todos los registros de la BD y lo debemos retornar
        return mascoJpa.findMascotaEntities();
        
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Mascota traerMascota(int num_cliente) {
        return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMasco(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
