package log.ministerio.interfaces;

import java.util.List;

import log.ministerio.entidad.TipoBien;


public interface TipoBienInterfaceDAO {
	
	List<TipoBien> listAll();
	List<TipoBien> findById(int codBien);

}
