package com.Dao;

import com.Entidades.AlumnoAddCarrera;
import java.util.List;
import com.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProcesosDao {

    public List<AlumnoAddCarrera> Lista() {
        List<AlumnoAddCarrera> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        String hql = "FROM AlumnoAddCarrera";
        try {
            lista = session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (Exception e) {
            System.out.println("-------------------------------------------");
            System.out.println(e.getMessage());
            System.out.println("-------------------------------------------");
            t.rollback();
        }

        return lista;

    }
    public void AgrerarCarrera(Carreras carrera){};
    public void ModificarCarrera(Carreras carrera){};
    public void EliminarCarrera(Carreras carrera){};
    
    public void AgrerarEstudiante(AlumnoPreU al, Notas notas, CarrerasOpc opc){};
    public void ModificaEstudiante(AlumnoPreU al, Notas notas, CarrerasOpc opc){};
    public void EliminarEstudiante(AlumnoPreU al, Notas notas, CarrerasOpc opc){};
    
    public void ProcesarAlumnos(AlumnoPreU alumno){} 
}
